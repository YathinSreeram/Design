package Car_Design;

public abstract class Car {
    public String brand;
    public String modelName;
    public FuelType fuelType;
    public CarStatus carStatus;
    public int gearStatus;

    public Car(String brand, String modelName, FuelType fuelType) {
        this.brand = brand;
        this.modelName = modelName;
        this.fuelType = fuelType;
        this.carStatus = CarStatus.ENGINE_OFF;
        gearStatus = 0;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public int getGearStatus() {
        return gearStatus;
    }

    public void setGearStatus(int gearStatus) {
        this.gearStatus = gearStatus;
    }
}
