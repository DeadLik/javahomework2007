package homework6;

public class Cat extends Animal {

    private int catDistRun = 200;
    private String type = "Кот";

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > catDistRun) {
            System.out.println(name + " не может пробежать " + obstacleLength + "м. " + name + " может пробежать не больше " + catDistRun + "м");
        } else {
            super.run(obstacleLength);
        }
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println(name + " кот, коты не умеют плавать");
    }

    @Override
    public void info() {
        System.out.println("Вы Бог, вы создали животное типа: " + type + ", Которого зовут: " + name + ", цвета: " + color);
    }

}
