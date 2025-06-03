public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 15.1);
        Truck truck = new Truck("Ford", "F-150", 2021, 1.5);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nTruck Details:");
        truck.displayDetails();
    }
}
