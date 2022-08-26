package solidprinciple.oneexample.notfollowsolidrule;


// interface have more than one responsibility
//unfollow interface segregate principle
interface Vehicle {

    public void drive();
    public void stop();
    public void refuel();
    public int getAvgValue();
    public void openDoor();
}
class VehicleSecurityFeature{

    // it may un follows Liskov substitution because two-wheeler not have seat-belt;
   public void wearSeatBelt(){
       System.out.println("wear Seat Belt");
   }
    // it may un follows Liskov substitution because four-wheeler not have helmet functionality;
    public void wearHelmet(){
        System.out.println("wear Helmet");
    }

}
class Engine{
    public void start(){
        System.out.println("start engine");
    }
}

class Bike extends VehicleSecurityFeature implements Vehicle {

    public void drive() {
        System.out.println("drive Bike");
    }
    public void stop() {
        System.out.println("Use Break");
    }
    public void refuel() {
        System.out.println("fill fuel");
    }

    @Override
    public int getAvgValue() {
        return 4;
    }

    //can not implement bike does not have openDoor functionality, but it has to implement
    @Override
    public void openDoor() {
        System.out.println("open Door");
    }


}

class Car extends VehicleSecurityFeature implements Vehicle{

    private Engine engine; // this un follow dependency inversion principle because it is highly depend on lower class

    public  Car(){

    }
    public Car(Engine engine){
        this.engine = engine;
    }
    @Override
    public void drive() {
        System.out.println("drive car");
    }

    @Override
    public void stop() {
        System.out.println("Use Break");
    }

    @Override
    public void refuel() {
        System.out.println("fill fuel");
    }

    @Override
    public int getAvgValue() {
        return 6;
    }

    @Override
    public void openDoor() {
        System.out.println("open Door");
    }

}

class VehicleCalculations {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car)
            return v.getAvgValue() * 0.8;
        if (v instanceof Bike)
            return v.getAvgValue() * 0.5;


        return 0;

        //in future if we add truck vehicle then we have to change existing code that unfollow open/close principle
    }
}
