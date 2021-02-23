package HomeWork5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        /*System.out.println("ФИО: " + name + "; Должность: " + position + "; Электронная почта: " + email +
                "; Телефон: " + telephone + "; Зарплата: " + salary + "; Возраст: " + age);*/
        System.out.printf("ФИО: %30s; Должность: %s; Электронная почта: %15s; Телефон: %d; Зарплата: %d; Возраст: %d.%n",
                name, position, email, telephone, salary, age);
    }

}
