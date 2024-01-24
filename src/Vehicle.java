public class Vehicle {
    public void drive(){
        System.out.println("Vehicle is driving!");
    }
}

class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Car is driving!");
    }

    public void breakCar(){
        System.out.println("Car is breaking!");
    }
}

class Test1{
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        Car c = (Car) v;
        c.drive();
        c.breakCar();
    }
}