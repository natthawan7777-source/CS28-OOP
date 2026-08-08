package week2;

public class Car {
    String Brand;
    int speed;

    public Car(String Brand, int speed){
        this.Brand = Brand;
        this.speed = speed;
    }


    public static void main(String[] args){
        String Brand = "...BMW...";
        int speed = 120;
        Car car = new Car(Brand, speed);
        System.out.println("test ");
        car.carBrand();
        car.carEngineStart();
        car.carDriver();
        car.carEngineStop();
    }

    void carBrand(){
        System.out.println("Brand: " + Brand);
    }

    void carEngineStart(){
        System.out.println("Car Engine Start ......");
    }

    void carDriver(){
        System.out.println("Car Driver at speed is : " + speed + " km/h");
    }

    void carEngineStop(){
        System.out.println("Car Engine Stop");
    }

    
}