public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car();
        Motorway motorway01 = new Motorway(car);
        motorway01.startvehicle();
        motorway01.racingvehicle();
        motorway01.stopvehicle();

        System.out.println(); 

        Bicycle bicycle = new Bicycle();
        Motorway motorway02 = new Motorway(bicycle);
        motorway02.startvehicle();
        motorway02.racingvehicle();
        motorway02.stopvehicle();
    }
}
