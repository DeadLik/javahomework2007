package homework8;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Вы создали кота по имени " + name + " в возрасте " + age + " годиков";
    }

    public void info() {
        System.out.println(this);
    }
}
