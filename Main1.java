public class Main1 {
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1, 1, 0);

        System.out.println(ps.addCar(1)); // true
        System.out.println(ps.addCar(2)); // true
        System.out.println(ps.addCar(3)); // false
        System.out.println(ps.addCar(1)); // false
    }
}
