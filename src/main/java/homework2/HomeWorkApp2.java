package homework2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        CheckPositNegBoolValue(5);
        CheckPositNegValue(5);
        CheckValue(6, 6);
        TextAndNumber("Test", 5);
        CheckYear(2009);

    }

    // Задание №1
    public static boolean checkValue(int v1, int v2) {

        int result = v1 + v2;

        if (result >= 10 && result <= 20) {
            return true;
        } else return false;
    }

    // Задание №2
    public static void checkPositNegValue(int x1) {
        if (x1 < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    // Задание №3
    public static boolean checkPositNegBoolValue(int a1) {
        return a1 < 0;
    }

    // Задание №4
    public static void textAndNumber(String Text, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(Text);
        }
    }

    //Задание со *, Долго пытался понять в чем загвоздка, вроде победил

    public static boolean checkYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year != 100) {
            return true;
        } else return false;
    }
}
