import java.time.LocalDate;

public class Driver {

    private String fullName;
    private boolean isDriverLicense;
    private Integer drivingExperience;


    public Driver(String fullName, boolean isDriverLicense, Integer startDriving) {
        this.fullName = fullName;
        this.isDriverLicense = isDriverLicense;
        this.drivingExperience = LocalDate.now().getYear() - startDriving;
    }

    public void startMoving() {
        System.out.println(this.fullName + " начинает движение");
    }

    public void finishMoving() {
        System.out.println(this.fullName + " останавливается");
    }

    public void fuelAuto() {
        System.out.println(this.fullName + " заправил машину");
    }

//    Метод начать движение
//    Метод остановиться
//    Метод заправить авто

    public void setFullName(String fullName) {
        if (this.fullName == null) {
            this.fullName = fullName;
        }
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return isDriverLicense;
    }

    public Integer getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        if (isDriverLicense == true) {
            return "Имя - " + fullName + ". Водительские права есть. Стаж вождения - " + drivingExperience;

        }else {
            return "Имя - " + fullName + ". Водительских прав нет.";
        }
    }
}
