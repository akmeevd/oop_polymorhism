import transport.Bus;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        PassengerCar passengerCar1 = new PassengerCar("BMW", "X5", 3.0);
        PassengerCar passengerCar2 = new PassengerCar("Mini", "Couper Countryman", 2.4);
        PassengerCar passengerCar3 = new PassengerCar("Volkswagen", "Beetle", 1.8);
        PassengerCar passengerCar4 = new PassengerCar("KIA", "RIO", 1.6);

        Truck truck1 = new Truck("Ford", "Transit", 3.0);
        Truck truck2 = new Truck("Hyundai", "H-1", null);
        Truck truck3 = new Truck("Volkswagen", "Transporter", 3.2);
        Truck truck4 = new Truck("Mercedez-Benz", "Sprinter", 3.2);

        Bus bus1 = new Bus("KIA", "GranBird", null);
        Bus bus2 = new Bus("Toyota", "Coaster", 4.0);
        Bus bus3 = new Bus("Mercedez-Benz", "Travego", null);
        Bus bus4 = new Bus("Volvo", "B10-M", 9.0);

        bus1.bestTimeOfCircleInSeconds(60);
        bus2.maxSpeed(180);
        truck1.bestTimeOfCircleInSeconds(70);
        passengerCar1.maxSpeed(240);

        DriverOfCategoryB<PassengerCar> driverB = new DriverOfCategoryB<>("Max", true, 2000);
        System.out.println(driverB);
        System.out.println(driverB.getCategory());
        driverB.AutoOfDriverOfCategoryB(passengerCar1);










    }
}