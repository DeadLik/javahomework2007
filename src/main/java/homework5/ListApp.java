package homework5;

public class ListApp {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Горболев Иван Анатольевич", "Бухгалтер", "ivan@mail.ru", 89653256896L, 18056L, 25);
        persArray[1] = new Person("Струдничев Александр Белов", "Программист", "alecks@mail.ru", 89654563258L, 95286L, 40);
        persArray[2] = new Person("Кабалев Сергей Михайлович", "Технический специалист", "sergo@mail.ru", 89652985632L, 72379L, 33);
        persArray[3] = new Person("Джаулев Иврам Бихтерович", "Телефонист", "djaluv@mail.ru", 89654932785L, 45023L, 43);
        persArray[4] = new Person("Федров Андрей Евгеневич", "Логист", "ander@mail.ru", 89659348237L, 51448L, 38);

        for (Person person : persArray) {
            if (person.getAge() >= 40) {
                person.info();
            }
        }



    }

}
