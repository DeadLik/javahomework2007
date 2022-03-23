package homework2_2;

public class MyArrayDataException extends Exception{
    int a;
    int b;

    public MyArrayDataException(int a, int b) {
        super("Неправильное значение");
    }


}
