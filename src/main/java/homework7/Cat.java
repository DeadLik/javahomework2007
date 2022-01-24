package homework7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name) {
        this.name = name;
        this.appetite = 100;
        this.satiety = 0;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }


    public void satietFull() {
        if (satiety == 100) {
            System.out.println("Кот " + name + " сыт ");
        } else {
            System.out.println("Кот " + name + " даже не притронулся к миски так как там не хватает еды");
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void info() {
        System.out.println(this);
    }
}
