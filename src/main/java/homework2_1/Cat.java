package homework2_1;

public class Cat{
    private String name;
    private TreadmillInterf trea;
    private WallInterf wall;

    public Cat(String name) {
        this.name = name;
    }

    public void infoRun(TreadmillInterf trea) {
        String resul = trea.result();
        System.out.println("Кот по кличке " + name + " " + resul);
    }

    public void infoJump(WallInterf wall) {
        String resul = wall.resul();
        System.out.println("Кот по кличке " + name + " " + resul);
    }

}
