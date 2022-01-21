package homework6;

public class AnimalsApp {
    public static void main(String[] args) {

        int anima = 0;
        int cats = 0;
        int dogs = 0;

        allCreateAnimals(anima, cats, dogs);

    }

    //Создал отдельный метод под создание, действие и подсчет животных чтобы не захломлять main

    public static void allCreateAnimals(int a, int b, int c) {

        System.out.println();

        //Массив животных на случай если захочу добавить ещё живность в массив и считать их

        Animal[] animals = new Animal[100];

        animals[0] = new Animal("Животное", "Белый");
        animals[1] = new Cat("Барсик", "Рыжий");
        animals[2] = new Cat("Добик", "Черный");
        animals[3] = new Cat("Грей", "Серый");
        animals[4] = new Dog("Тузик", "Белый");
        animals[5] = new Dog("Бобик", "Черный");
        animals[6] = new Dog("Вальдемар", "Коричневый");

        //Коты бегают

        animals[1].run(150);
        animals[1].run(250);
        animals[2].run(180);
        animals[2].run(500);
        animals[3].run(100);
        animals[3].run(245);

        System.out.println();

        //Коты пытаются плыть

        animals[1].swim(235);
        animals[2].swim(5);
        animals[3].swim(1);

        System.out.println();

        //Собаки бегают

        animals[4].run(300);
        animals[4].run(600);
        animals[5].run(500);
        animals[5].run(856);
        animals[6].run(249);
        animals[6].run(1200);

        System.out.println();

        //Собаки плывут

        animals[4].swim(8);
        animals[4].swim(12);
        animals[5].swim(3);
        animals[5].swim(25);
        animals[6].swim(10);
        animals[6].swim(30);

        //Вывести на экран всю живность
        System.out.println();

        animals[1].info();
        animals[2].info();
        animals[3].info();
        animals[4].info();
        animals[5].info();
        animals[6].info();

        System.out.println();


        // * Добавить подсчет созданных котов, собак и животных.

        //Подсчет животных

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat) {
                a++;
            }
            if (animals[i] instanceof Dog) {
                b++;
            }
            c = a + b;
        }
        System.out.println("Подсчет животных:" + "\n\tКоличество котов: " + a + " \n\tКоличество собак: " + b + " \n\tОбщее количество животных: " + c);
    }
}
