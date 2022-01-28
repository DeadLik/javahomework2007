package homework5;

public class Person {
    private String name;
    private String position;
    private String email;
    private long phone;
    private long pay;
    private int age;

    public Person(String name, String position, String email, long phone, long pay, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Неверно указан возраст у " + name);
            System.out.println();
        }
    }

    public void info() {
        System.out.println("ФИО: " + name + 
                           "\nДолжность: " + position + 
                           "\nE-mail: " + email + 
                           "\nНомер телефона: " + phone + 
                           "\nЗарплата: " + pay + " RUB" + 
                           "\nВозраст: " + age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }


}
