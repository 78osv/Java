package HomeWork5;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }

    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000,41);
        empCorp[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313",20000,33);
        empCorp[2] = new Employee("Sidorov Sidor", "Manager", "sidorov@mailbox.com", "892312314",15000,44);
        empCorp[3] = new Employee("Semenov Semen", "Manager", "semenov@mailbox.com", "892312315",18000,20);
        empCorp[4] = new Employee("Popov Pavel", "Manager", "popov@mailbox.com", "892312316",10000,22);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}


