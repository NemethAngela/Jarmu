public class Car implements IVehicle {

    @Override
    public void start() {
        System.out.println("Elindul az autó.");
    }

    @Override
    public void racing() {
        System.out.println("Száguld az autó.");
    }

    @Override
    public void stop() {
        System.out.println("Megáll az autó.");
    }
    
}
