public class Vehicle {
    private Integer speed;
    private Color_Vehicle color_vehicle;
    protected Integer y_production;
    public Vehicle(Integer speed, Color_Vehicle color_vehicle, Integer y_production) {
        this.speed = speed;
        this.color_vehicle = color_vehicle;
        this.y_production = y_production;
    }

    public Vehicle() {

    }
    public String toString() {
        return "Pojazd " +
                "kolor pojazdu " + Color_Vehicle.BLACK +
                "prędkość pojazdu " + getSpeed() +
                ".";
    }
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer getSpeed() {
        return speed;
    }

    public void setColor_Vehicle(Color_Vehicle color_vehicle) {
        this.color_vehicle = color_vehicle;
    }
    public Color_Vehicle getColor_vehicle(){
        return color_vehicle;
    }

    public Integer getY_production() {
        return y_production;
    }

    public void setY_production(Integer y_production) {
        this.y_production = y_production;
    }
}