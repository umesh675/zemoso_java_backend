package solidprinciple.oneexample.followsolidrule;

interface BasicVehicle {
    public void drive();
    public void stop();
    public void speed();
}
interface FuelVehicle{
    public void refuel();

}
interface VehicleCalculation{
    public int getAvgValue();
    public double calculateAvgValue();
}
interface FourWheeler{
    public void openDoor();
}

interface IEngine{
    public void start();

}
interface TwoWheelerSecurity{
    public void wearHelmet();
}
interface FourWheelerSecurity{
    public void wearSitBelt();
}
class Engine implements IEngine{

    @Override
    public void start() {
        System.out.println("start engine");
    }


}
class Bike implements BasicVehicle,IEngine{

    private IEngine engine; //not highly dependent on Engine class

   public Bike(IEngine engine){
       this.engine = engine;
   }

    @Override
    public void drive() {
        System.out.println("Drive bike");
    }

    @Override
    public void stop() {
        System.out.println("apply break");
    }

    @Override
    public void speed() {
        System.out.println("Bike Speed");
    }


    @Override
    public void start() {
        System.out.println("start engine");
    }

}
class BikeFuelInfo implements FuelVehicle{

    @Override
    public void refuel() {
        System.out.println("fill the fuel");
    }

}
class BikeVehicleCalculation implements VehicleCalculation{

    @Override
    public int getAvgValue() {
        return 0;
    }

    @Override
    public double calculateAvgValue() {
        return this.getAvgValue()*(0.8);
    }
}
class BikeSecurity implements TwoWheelerSecurity{

    @Override
    public void wearHelmet() {
        System.out.println("wear Helmet");
    }
}


