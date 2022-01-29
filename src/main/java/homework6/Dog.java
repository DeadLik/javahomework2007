package homework6;

public class Dog extends Animal {

    private int dogDistRun = 500;
    private int dogDistSwim = 10;
    private String type = "Собака";

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > dogDistRun) {
            System.out.println(name + " не может пробежать " + obstacleLength + "м. " + name + " может пробежать не больше " + dogDistRun + "м");
        } else {
            super.run(obstacleLength);
        }
    }


    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength > dogDistSwim) {
            System.out.println(name + " не может проплыть больше " + obstacleLength + "м. " + name + " может проплыть не больше " + dogDistSwim + "м");
        } else {
            super.swim(obstacleLength);
        }
    }

    @Override
    public void info() {
        System.out.println("Вы Бог, вы создали животное типа: " + type + ", Которого зовут: " + name + ", цвета: " + color);
    }
}
