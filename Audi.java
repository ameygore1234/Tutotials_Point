package tutorials_point;

public class Audi {

    public static void main(String[] args) {

        Car audi = new Car();

        audi.setName("AUDI R8");
        audi.setColour("Black");
        audi.setPrice(241335);

        System.out.println(audi.getColour());
        System.out.println(audi.getName());

        audi.startCar();

    }
}
