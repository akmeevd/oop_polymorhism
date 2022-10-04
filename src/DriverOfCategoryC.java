import transport.Competing;

public class DriverOfCategoryC<Truck extends Competing> extends Driver {

    private String category;
    public DriverOfCategoryC(String fullName, boolean isDriverLicense, Integer startDriving) {
        super(fullName, isDriverLicense, startDriving);
        if (isDriverLicense == false) {
            category = null;
        } else {
            category = "C";
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
}
