package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HomeWorkApp8 extends JFrame {

    String nameCat[] = {"Тубик", "Бромбик", "Кабрик", "Стимпак", "БонусКот", "Арнольд", "Джони", "Тай", "Гербин", "Луи"};
    Cat cats[] = new Cat[10];

    Random random = new Random();
    int randomName;

    public HomeWorkApp8(int x, int y) {

        setTitle("Create cats");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(x, y, 1100, 700);

        Font font = new Font("Times New Roman", Font.BOLD, 32);

        JLabel label = new JLabel();
        label.setFont(font);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton button = new JButton("Создаем котов");
        button.setFont(font);
        add(button, BorderLayout.NORTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomName = random.nextInt(nameCat.length);
                for (int i = 0; i < cats.length; i++) {
                    cats[i] = new Cat(nameCat[randomName], i + 1);
                }
                int randomIndex = random.nextInt(cats.length);
                label.setText(cats[randomIndex].toString());
            }
        });

        JButton exitbutton = new JButton("Выход");
        exitbutton.setFont(font);
        add(exitbutton, BorderLayout.SOUTH);
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        new HomeWorkApp8(500, 100);
    }

}
