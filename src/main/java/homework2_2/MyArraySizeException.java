package homework2_2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException() {
        super("Ошибка: массив больше 4");
    }
}
