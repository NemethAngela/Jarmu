public class Motorway {
    
    IVehicle vehicle;

    public  Motorway(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startvehicle() {
        vehicle.start();
    }

    public void racingvehicle() {
        vehicle.racing();
    }

    public void stopvehicle() {
        vehicle.stop();
    }
}
