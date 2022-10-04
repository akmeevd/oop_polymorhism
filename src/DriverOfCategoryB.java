import transport.Competing;
import transport.PassengerCar;

public class DriverOfCategoryB<T extends PassengerCar & Competing> extends Driver {

    private String category;

    public DriverOfCategoryB(String fullName, boolean isDriverLicense, Integer startDriving) {
        super(fullName, isDriverLicense, startDriving);
        if (isDriverLicense == false) {
            category = null;
        } else {
            category = "B";
        }
    }

    public void AutoOfDriverOfCategoryB(T passengerCar) {
        System.out.println("водитель " + getFullName() + " управляет автомобилем " +
                 passengerCar.getBrand() + " " + passengerCar.getModel() +
                " и будет участвовать в заезде");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (this.category == null) {
            this.category = category;
        }
    }

}
