public class Bike extends Vehicle{
    private String mark;
    private Steering_wheel s_wheel;
    private Types_wheels t_wheel;
    private Integer y_production;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Steering_wheel getS_wheel() {
        return s_wheel;
    }

    public void setS_wheel(Steering_wheel s_wheel) {
        this.s_wheel = s_wheel;
    }

    public Types_wheels getT_wheel() {
        return t_wheel;
    }

    public void setT_wheel(Types_wheels t_wheel) {
        this.t_wheel = t_wheel;
    }

    public Integer getY_production() {
        return y_production;
    }

    public void setY_production(Integer y_production) {
        this.y_production = y_production;
    }
}