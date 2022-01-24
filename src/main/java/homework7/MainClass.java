package homework7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Cat cat1 = new Cat("Rombik");
        Cat cat2 = new Cat("Bublik");
        Cat cat3 = new Cat("Marsik");
        Cat cat4 = new Cat("Tymbik");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько кошачьего корма насыпать в миску?");
        int value = scanner.nextInt();
        scanner.close();

        Plate plate = new Plate(value);

        Cat[] cats = {cat, cat1, cat2, cat3, cat4};

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.eatFull(cats[i]);
            cats[i].satietFull();

        }
        System.out.println();
        plate.info();


    }
}
