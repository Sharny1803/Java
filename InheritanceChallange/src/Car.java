public class Car extends Vehicle {
    private String carBrand;
    private String carType;
    private String carDriveTrain;
    private String carTransmission;
    private int carNumberOfGears;
    private String carFuelType;
    private int carProductionYear;
    private int carHorsePower;

    public Car(String vehicleType, String vehicleColour, int vehiclePrice, int vehicleMaxSpeed,
               String carBrand, String carType, String carDriveTrain, String carTransmission,
               int carNumberOfGears, String carFuelType, int carProductionYear, int carHorsePower) {
        super(vehicleType, vehicleColour, vehiclePrice, vehicleMaxSpeed);
        this.carBrand = carBrand;
        this.carType = carType;
        this.carDriveTrain = carDriveTrain;
        this.carTransmission = carTransmission;
        this.carNumberOfGears = carNumberOfGears;
        this.carFuelType = carFuelType;
        this.carProductionYear = carProductionYear;
        this.carHorsePower = carHorsePower;
    }

    public void gearUp(int gear) {
        if (gear > 0 && gear < 7) {
            System.out.println("Gear up! Current gear: " + gear);
        } else {
            System.out.println("Invalid gear!");
        }
    }

    public void gearDown(int gear) {
        if (gear > 0 && gear < 7) {
            System.out.println("Gear down! Current gear: " + gear);
        } else {
            System.out.println("Invalid gear!");
        }
    }

    public void refuel() {
        System.out.println("Refueling...");
    }

}
