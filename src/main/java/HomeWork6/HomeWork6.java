package HomeWork6;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] animal = {new Cat(200,0), new Dog(500,10)};
        for (Animal an : animal)
            System.out.println(
                    an.getClass().getName() +
                            "\nrun: " + an.run(200) +
                            "\nswim: " + an.swim(5));
    }
}
class Cat extends Animal {
    Cat(int run_limit,int swim_limit) {
        super(run_limit, swim_limit);
    }
    @Override
    protected boolean swim(int distance) {
        return false;
    }
}
class Dog extends Animal {
    Dog(int run_limit, int swim_limit) {
        super(run_limit, swim_limit);
    }
}
abstract class Animal {
    private int run_limit;
    private int swim_limit;
    Animal(int run_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
    }
    protected boolean run(int distance) {
        return distance <= run_limit;
    }

    protected boolean swim(int distance) {
        return distance <= swim_limit;
    }
}
