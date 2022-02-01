package homework7;

public class Plate {
    private int food;
    private int returnValue;


    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (n > food) {
            returnValue = 0;
        } else {
            food -= n;
            returnValue = n;
        }
    }

    public void eatFull(Cat u) {
        u.setSatiety(returnValue);
    }


    public void info() {
        System.out.println("Кол-во оставшейся еды в миски: " + food);
    }
}
