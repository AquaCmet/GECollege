package kensyu_20230518;

class Car{
    private int speed;
    private int distance;
    Car(){
        this.speed = 0;
        this.distance = 0;
    }
    void setSpeed(int jisoku){
        this.speed = jisoku * 1000 / 60;
    }
    void run(int minutes){
        this.distance += minutes * this.speed;
    }
    int getDistance(){
        return this.distance;
    }
}
	
class Driver{
    private Car car;
    Driver(Car car){
        this.car = car;
    }
    void pushPedal(int speed){
        this.car.setSpeed(speed);
    }
    void drive(int minutes){
        this.car.run(minutes);
    }
}

class DrivingSimulator{
    public void simulate(){
        Car c    = new Car();
        Driver d = new Driver(c);
        d.pushPedal(42);
        d.drive(30);
        d.pushPedal(45);
        d.drive(20);
        System.out.println("The travel distance is " + c.getDistance() + " m.");
    }
}

public class FacadeTest{
    public static void main(String[] argv){
        new DrivingSimulator().simulate();
    }
}