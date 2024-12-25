package tutorials_point;

public class Car {

    private String name;
    private String colour;
    private double price;



    public Car(String name, String colour, double price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public Car() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void startCar()
    {
        System.out.println("Car is started");
    }

    public static void stopCar()
    {
        System.out.println("Car is Stopped");
    }
}
