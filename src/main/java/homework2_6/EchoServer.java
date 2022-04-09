package homework2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    ServerSocket serverSocket;
    DataInputStream in;
    DataOutputStream out;

    public static void main(String[] args) {
        EchoServer server = new EchoServer();
        server.send();
    }

    private void send() {
        try {
            start();
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String msg = scanner.nextLine();
                out.writeUTF(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void start() throws IOException {
        serverSocket = new ServerSocket(8189);
        System.out.println("Сервер запущен, ожидаем подключения...");
        Socket socket = serverSocket.accept();
        System.out.println("Клиент подключился");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String message = in.readUTF();
                        System.out.println("Сообщение от клиента: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
