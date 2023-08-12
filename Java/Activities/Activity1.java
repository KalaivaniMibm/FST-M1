package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2023;
        toyota.color = "Blue";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }
}
