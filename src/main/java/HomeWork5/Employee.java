package HomeWork5;

public class Employee {
    public String name;
    public String position;
    public String email;
    public int telephone;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        /*System.out.println("ФИО: " + name + "; Должность: " + position + "; Электронная почта: " + email +
                "; Телефон: " + telephone + "; Зарплата: " + salary + "; Возраст: " + age);*/
        System.out.printf("ФИО: %30s; Должность: %s; Электронная почта: %15s; Телефон: %d; Зарплата: %d; Возраст: %d.%n",
                name, position, email, telephone, salary, age);
    }

}
