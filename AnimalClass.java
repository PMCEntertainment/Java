/*
interface là một tập hợp các phương thức trừ tượng
java ko hỗ trợ đa kế thừa từ 1 lớp,nhưng hỗ trợ đa kế thừa 
từ interface
abstract là lớp trừu tượng sử dụng các phương thức từ interface
*/
// Giao diện Animal (Động vật)

interface Animal {
    void eat(); // Phương thức ăn
    void sleep(); // Phương thức ngủ
}

// Lớp cha abstract AnimalClass (Lớp động vật)
abstract class AnimalClass implements Animal {
    // Thuộc tính protected (truy cập được từ lớp con)
    protected String name;

    // Constructor
    public AnimalClass(String name) {
        this.name = name;
    }

    // Phương thức từ interface Animal
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Phương thức từ interface Animal
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Phương thức trừu tượng riêng của lớp AnimalClass
    public abstract void makeSound();
}

// Lớp con Cat (Mèo) kế thừa từ lớp AnimalClass
class Cat extends AnimalClass {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Phương thức implement từ lớp AnimalClass
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }
}

// Lớp con Dog (Chó) kế thừa từ lớp AnimalClass
class Dog extends AnimalClass {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Phương thức implement từ lớp AnimalClass
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

// Lớp chính (Main)
public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Cat
        Cat cat = new Cat("Tom");
        cat.eat();
        cat.sleep();
        cat.makeSound();

        // Khởi tạo đối tượng Dog
        Dog dog = new Dog("Max");
        dog.eat();
        dog.sleep();
        dog.makeSound();
    }
}
