package homework2_1;

public class App {

    public static void main(String[] args) {

        TreadmillInterf interf = new TreadmilI();
        WallInterf wInter = new Wall();

        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Мурзик");
        Robot robot = new Robot("RG12");
        Robot robot1 = new Robot("FT15");
        Human human = new Human("Энди");
        Human human1 = new Human("Тедди");

        Cat[] cats = {cat, cat1};
        Robot[] robots = {robot, robot1};
        Human[] humans = {human, human1};

        for (int i = 0; i < cats.length; i++) {
            cats[i].infoRun(interf);
            cats[i].infoJump(wInter);
        }

        for (int i = 0; i < robots.length; i++) {
            robots[i].infoRun(interf);
            robots[i].infoJump(wInter);
        }

        for (int i = 0; i < humans.length; i++) {
            humans[i].infoRun(interf);
            humans[i].infoJump(wInter);
        }

    }

}
