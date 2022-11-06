public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Land","Yellow", 1000,170);
        System.out.println(vehicle.getVehicleCurrentSpeed());
        vehicle.accelerate(100);
        System.out.println(vehicle.getVehicleCurrentSpeed());
        Car car = new Car("land","blue",10000,180, "Ford","Sedan",
                "FWD","Manual",6,"Diesel",2014,140);
        System.out.println(car.getVehicleCurrentSpeed());
        car.accelerate(10);
        System.out.println(car.getVehicleCurrentSpeed());
        car.accelerate(170);
        System.out.println(car.getVehicleCurrentSpeed());
        HybridCar hybridCar = new HybridCar("land","blue",10000,180, "Ford","Sedan",
                "FWD","Manual",6,"Diesel",2014,140,"Plug-in",250);
        System.out.println(hybridCar.getVehicleCurrentSpeed());
        hybridCar.accelerate(30);
        System.out.println(hybridCar.getVehicleCurrentSpeed());
        hybridCar.accelerate(200);
        car.gearUp(3);
        car.gearDown(2);
        car.refuel();
        hybridCar.refuel();
    }
}