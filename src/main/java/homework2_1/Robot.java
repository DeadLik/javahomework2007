package homework2_1;

public class Robot {
    private String name;
    private TreadmillInterf trea;
    private WallInterf wall;

    public Robot(String name) {
        this.name = name;
    }

    public void infoRun(TreadmillInterf trea) {
        String resul = trea.result();
        System.out.println("Робот по имени " + name + " " + resul);
    }

    public void infoJump(WallInterf wall) {
        String resul = wall.resul();
        System.out.println("Робот по имени " + name + " " + resul);
    }

}
