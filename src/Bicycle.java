public class Bicycle implements IVehicle {

    @Override
    public void start() {
        System.out.println("Elindul a bicikli.");    
    }

    @Override
    public void racing() {
         System.out.println("Teker a bicikli.");
    }

    @Override
    public void stop() {
         System.out.println("Megáll a bicikli.");
    }
    
}
