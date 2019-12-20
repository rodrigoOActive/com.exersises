public class DataTypeExample {

    /**
     * This is an example class
     */

    public static void main(String[] args) {

        Car car = new Car(4, 2, 4, "b", false, "abc", "test"); //estamos instanciando una clase.

        car.setDoors(2);
        car.setFulldomain("DEFEFE");

        car.getBrand();
        car.getDoors();
        car.getCHASIS_NUM();

    }
}
