import transport.Bus;
import transport.Competing;

public class DriverOfCategoryD<Bus extends Competing> extends Driver {


    private String category;

    public DriverOfCategoryD(String fullName, boolean isDriverLicense, Integer startDriving) {
        super(fullName, isDriverLicense, startDriving);
        if (isDriverLicense == false) {
            category = null;
        } else {
            category = "D";
        }

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (this.category == null) {
            this.category = category;
        }
    }

    //водитель А управляет автомобилем Б и будет участвовать в заезде"

}
