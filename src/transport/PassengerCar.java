package transport;

import java.util.Objects;

public class PassengerCar implements Competing {
    private String brand;
    private String model;
    private Double engineVolume;

    public PassengerCar(String brand, String model, Double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "Инфо нет");
        this.model = Objects.requireNonNullElse(model, "Инфо нет");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 0.0);

    }

    public void startMoving() {
        System.out.println("Я начинаю движение на легковом авто");
    }

    public void finishMoving() {
        System.out.println("Я остановился на легковом авто");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestTimeOfCircleInSeconds(Integer bestTimeOfCircleInSeconds) {
        System.out.println("На " + this.getBrand() + this.getModel() + " круг пройден за " + bestTimeOfCircleInSeconds
                + " секунд");

    }

    @Override
    public void maxSpeed(Integer maxSpeed) {
        System.out.println("Максимальная скорость на " + this.getBrand() + this.getModel() + " - " + maxSpeed + " км/ч");

    }




}
