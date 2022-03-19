package homework2_1;

public class Human {
    private String name;
    private TreadmillInterf trea;
    private WallInterf wall;

    public Human(String name) {
        this.name = name;
    }

    public void infoRun(TreadmillInterf trea) {
        String resul = trea.result();
        System.out.println("Человек по имени " + name + " " + resul);
    }

    public void infoJump(WallInterf wall) {
        String resul = wall.resul();
        System.out.println("Человек по имени " + name + " " + resul);
    }
}
