package transport;

import java.util.Objects;

public class Bus implements Competing   {
    private String brand;
    private String model;
    private Double engineVolume;

    public void startMoving() {
        System.out.println("Я начинаю движение на автобусе");
    }

    public void finishMoving() {
        System.out.println("Я остановился на автобусе");
    }

    public Bus(String brand, String model, Double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "Инфо нет");
        this.model = Objects.requireNonNullElse(model, "Инфо нет");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 0.0);
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


    //    public Bus(String brand, String model, Integer productionYear, String productionCountry, String colour, Double speed) {
//        super(brand, model, productionYear, productionCountry, colour, speed);
//    }



}

