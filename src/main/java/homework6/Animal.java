package homework6;

public class Animal {

    protected String name;
    protected String color;
    protected int obstacleLength;


    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void run (int obstacleLength) {

        System.out.println(name + " Пробежал: " + obstacleLength + "м");
    }

    public void swim (int obstacleLength) {
        System.out.println(name + " Проплыл: " + obstacleLength + "м");
    }

    public void info() {
        System.out.println("Вы Бог, вы создали животное: " + name + ", цвета: " + color);
    }
}
