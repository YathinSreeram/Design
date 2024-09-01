package Car_Design;

public class CarManager {

    Car car;

    public CarManager(Car car) {
        this.car = car;
    }

    public Car turnEngineOn()
    {
        if(car.getCarStatus() == CarStatus.ENGINE_OFF)
        {
            car.setCarStatus(CarStatus.ENGINE_ON);
        }
        return car;
    }

    public Car turnEngineOff()
    {
        if(car.getCarStatus() == CarStatus.ENGINE_ON || car.getCarStatus() == CarStatus.DRIVE || car.getCarStatus() == CarStatus.REVERSE)
        {
            car.setCarStatus(CarStatus.ENGINE_OFF);
        }
        return car;
    }

    public Car driveCar()
    {
        if(car.getCarStatus() == CarStatus.ENGINE_ON)
        {
            car.setCarStatus(CarStatus.DRIVE);
            car.setGearStatus(car.getGearStatus() + 1);
        }
        return car;
    }

    public Car stopCar()
    {
        if(car.getCarStatus() == CarStatus.DRIVE)
        {
            car.setCarStatus(CarStatus.STOP);
            car.setGearStatus(0);
        }
        return car;
    }


    public Car increaseGear()
    {
        if(car.getCarStatus() == CarStatus.DRIVE)
        {
            car.setGearStatus(car.getGearStatus() + 1);
        }
        return car;
    }

    public Car decreaseGear()
    {
        if(car.getCarStatus() == CarStatus.DRIVE && car.getGearStatus() > 0)
        {
            car.setGearStatus(car.getGearStatus() - 1);
        }
        return car;

    }


}
