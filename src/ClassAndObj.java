
class Car {
    String color;
    int speed;


    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class ClassAndObj {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.color = "Red";
        myCar.speed = 120;

        myCar.displayInfo();
    }
}

