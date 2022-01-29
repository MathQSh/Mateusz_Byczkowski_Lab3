import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW" , 2020 , Type_drive.COMBUSTION , 300 , Color_Vehicle.YELLOW);
        Car car1 = new Car("MERCEDES" , 2022 , Type_drive.ELECTRIC , 450 , Color_Vehicle.BLACK);
        Car car2 = new Car("VW" , 1988 , Type_drive.COMBUSTION , 50 , Color_Vehicle.GREEN);
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car1);
        carList.add(car2);

        for (Car c : carList ){
            System.out.println(c);
        }

    }
}
