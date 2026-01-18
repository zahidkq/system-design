package designPatterns.creational.builder;

// Handle the creation of complex objects step-by-step without ending up with long, unreadable constructors
// (aka Telescoping Constructor Problem).

public class BuilderApp {
    public static void main(String[] args){
        Car car = new Car.CarBuilder("V6", 4)
                .addEV(false)
                .addGPS(true)
                .build();
        Car car1 = new Car.CarBuilder("V8", 4)
                .addEV(true)
                .addGPS(true)
                .addSunRoof(true)
                .addAutoPilot(true)
                .build();
        System.out.println(car);
        System.out.println(car1);
    }
}
