public class Car extends Vehicle {
    private String mark;
    private Type_drive t_drive;



    //konstruktor
    public Car() {

    }
    public Car(String mark, Integer y_production, Type_drive t_drive, Integer speed, Color_Vehicle color_vehicle){
        super(speed, color_vehicle, y_production);
        this.mark = mark;
        this.t_drive = t_drive;
    }
    public String toString() {
        return "Car " +
                " marka pojazdu " + getMark() +
                " kolor pojazdu " + getColor_vehicle() +
                " prędkość pojazdu " + getSpeed() +
                " typ napędu " + getT_drive();
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getMark() {
        return mark;
    }

    public Integer getY_production() {
        return y_production;
    }

    public void setY_production(Integer y_production) {
        this.y_production = y_production;
    }

    public Type_drive getT_drive() {
        return t_drive;
    }

    public void setT_drive(Type_drive t_drive) {
        this.t_drive = t_drive;
    }
    public void setSpeed(Integer speed) {
        super.setSpeed(speed);
    }
    public Integer getSpeed() {
        return super.getSpeed();
    }
}