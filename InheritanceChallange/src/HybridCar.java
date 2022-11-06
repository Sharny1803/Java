public class HybridCar extends Car {
    private String hybridType;
    private int powerUsage;

    public HybridCar(String vehicleType, String vehicleColour, int vehiclePrice, int vehicleMaxSpeed,
                     String carBrand, String carType, String carDriveTrain, String carTransmission, int carNumberOfGears,
                     String carFuelType, int carProductionYear, int carHorsePower, String hybridType, int powerUsage) {
        super(vehicleType, vehicleColour, vehiclePrice, vehicleMaxSpeed, carBrand, carType, carDriveTrain,
                carTransmission, carNumberOfGears, carFuelType, carProductionYear, carHorsePower);
        this.hybridType = hybridType;
        this.powerUsage = powerUsage;
    }

    @Override
    public void refuel() {
        System.out.println("Charging...");
    }
}
