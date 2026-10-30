package week6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        dog.eat();
        dog.makeSound();
        dog.run();

        Cat cat = new Cat("Cola");
        cat.eat();
        cat.makeSound();
        cat.scratch();

        Bird bird = new Bird("eang");
        bird.eat();
        bird.makeSound();
        bird.fly();
    }
    
}
