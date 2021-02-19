package HomeWork5;

public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Иванов Федор Иванович", "Директор",
                "ivanovFI@mail.ru", 335060, 120000, 37 );
        employeeArray[1] = new Employee("Степанов Евгений Борисович", "Инженер",
               "stepanovEB@mail.ru", 335070, 80000, 29 );
        employeeArray[2] = new Employee("Урусов Андрей Николаевич", "Начальник цеха",
               "urusovAN@mail.ru", 337010, 100000, 57 );
        employeeArray[3] = new Employee("Мельников Иван Аркадьевич", "Кладовщик",
               "melnikovIA@mail.ru", 331057, 45000, 43 );
        employeeArray[4] = new Employee("Селиванова Мария Александровна", "Бухгалтер",
               "selivanovaMA@mail.ru", 331515, 85000, 53 );


        System.out.println("  Сотрудники предприятия");
        for (int i = 0; i < employeeArray.length ; i++) {
            employeeArray[i].info();
        }
        System.out.println();

        System.out.println("  Сотрудники, старше 40 лет  ");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age >= 40) employeeArray[i].info();
        }
        
    }
}
