package homework2_3;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Телефонная книга. Добавляем и ищем по фамилии:");
        Phonebook phonebook = new Phonebook();

        phonebook.putInfo("Popov", "+79999999991");
        phonebook.putInfo("Svetlov", "+79999999992");
        phonebook.putInfo("Kononenko", "+79999999993");
        phonebook.putInfo("Popov", "+7911111111111");
        phonebook.putInfo("Chernichev", "+791111222222");
        phonebook.putInfo("Popov", "+7922222222");

        phonebook.getInfo("Popov");
        phonebook.getInfo("Chernichev");

        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("Собака");
        list.add("Кошка");
        list.add("Человек");
        list.add("Огонь");
        list.add("Собака");
        list.add("Вода");
        list.add("Деньги");
        list.add("Собака");
        list.add("Слово");
        list.add("Карта");

        Set<String> array = new TreeSet<>(list);
        System.out.println(array);

        System.out.println();

        ArrayList<String> listcount = new ArrayList<>(array);

        for (int i = 0; i < listcount.size(); i++) {
            System.out.println("Количество " + listcount.get(i) + ": " + Collections.frequency(list, listcount.get(i)));
        }




    }
}
