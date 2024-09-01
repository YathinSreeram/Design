package Tests;

import Car_Design.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarDesignTests {

    public Car car1;
    public Car car2;

    CarManager carManager ;

    @BeforeEach
    public void setUp()
    {
        car1 = new Audi("Audi", "Audi q3", FuelType.PETROL);
        car2 = new Nano("Tata", "Nano", FuelType.DIESEL);
        carManager = new CarManager(car1);
    }

    @Test
    public void turnEngineOnTest()
    {
        assertEquals(CarStatus.ENGINE_ON, carManager.turnEngineOn().carStatus);
    }

    @Test
    public void turnEngineOffTest()
    {
        car1.setCarStatus(CarStatus.ENGINE_ON);
        assertEquals(CarStatus.ENGINE_OFF, carManager.turnEngineOff().carStatus);
    }

    @Test
    public void driveCarTest()
    {
        car1.setCarStatus(CarStatus.ENGINE_ON);
        assertEquals(CarStatus.DRIVE, carManager.driveCar().carStatus);
    }

    @Test
    public void stopCarTest()
    {
        car1.setCarStatus(CarStatus.DRIVE);
        assertEquals(CarStatus.STOP, carManager.stopCar().carStatus);
    }

    @Test
    public void increaseGearTest()
    {
        car1.setCarStatus(CarStatus.DRIVE);
        car1.setGearStatus(2);
        assertEquals(3, carManager.increaseGear().gearStatus);
    }

    @Test
    public void decreaseGearTest()
    {
        car1.setCarStatus(CarStatus.DRIVE);
        car1.setGearStatus(2);
        assertEquals(1, carManager.decreaseGear().gearStatus);
    }

}
