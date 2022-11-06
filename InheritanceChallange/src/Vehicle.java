public class Vehicle {
    private String vehicleType;
    private String vehicleColour;
    private int vehiclePrice;
    private int vehicleMaxSpeed;
    private int vehicleCurrentSpeed;


    public int getVehicleCurrentSpeed() {
        return vehicleCurrentSpeed;
    }

    public void setVehicleCurrentSpeed(int vehicleCurrentSpeed) {
        if (vehicleCurrentSpeed <= vehicleMaxSpeed) {
            this.vehicleCurrentSpeed = vehicleCurrentSpeed;
            vehicleCurrentSpeed = 0;
        }
        System.out.println("You can't go faster than max speed!");
    }

    public Vehicle(String vehicleType, String vehicleColour, int vehiclePrice, int vehicleMaxSpeed) {
        this.vehicleType = vehicleType;
        this.vehicleColour = vehicleColour;
        this.vehiclePrice = vehiclePrice;
        this.vehicleMaxSpeed = vehicleMaxSpeed;
    }

    public void accelerate(int speed) {
        if (vehicleCurrentSpeed + speed <= vehicleMaxSpeed) {
            vehicleCurrentSpeed += speed;
        } else {
            System.out.println("You can't accelerate faster than max speed!");
        }
    }

    public void decelerate(int speed) {
        vehicleCurrentSpeed -= speed;
    }

    public void mount() {
    }

    public void dismount() {
    }


}
