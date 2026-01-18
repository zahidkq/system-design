package designPatterns.creational.builder;

public class Car {
    private String engine;
    private int wheels;
    private boolean hasGPS;
    private boolean hasSunroof;
    private boolean isEV;
    private boolean hasAutoPilot;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
        this.isEV = builder.isEV;
        this.hasAutoPilot = builder.hasAutoPilot;
    }

    @Override
    public String toString(){
        return "Car [engine=" + engine + ", wheels=" + wheels +
                ", GPS=" + hasGPS + ", Sunroof=" + hasSunroof +
                ", Autopilot=" + hasAutoPilot + ", isEV=" + isEV + "]";
    }

    public static class CarBuilder{
        private String engine;
        private int wheels;
        private boolean hasGPS;
        private boolean hasSunroof;
        private boolean isEV;
        private boolean hasAutoPilot;

        public CarBuilder(String engine, int wheels){
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder addGPS(boolean hasGPS){
            this.hasGPS = hasGPS;
            return this;
        }
        public CarBuilder addSunRoof(boolean hasSunroof){
            this.hasSunroof = hasSunroof;
            return this;
        }
        public CarBuilder addEV(boolean isEV){
            this.isEV = isEV;
            return this;
        }
        public CarBuilder addAutoPilot(boolean hasAutoPilot){
            this.hasAutoPilot = hasAutoPilot;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}
