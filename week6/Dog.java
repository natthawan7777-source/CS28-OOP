package week6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Say : hong hong");
    }

    public void run() {
        System.out.println(name + " is running"); 
    }
}