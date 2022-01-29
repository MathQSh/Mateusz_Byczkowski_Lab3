public class Main {
    public static void main(String[] args) {

        Punkt punktA = new Punkt(1);
        System.out.println(punktA.toString());
        punktA = new Punkt(1,2,3);
        System.out.println(punktA.toString());
        punktA.setpX(4);
        punktA.setpY(5);
        punktA.setpZ(6);
        System.out.println("Kordynaty X - " + punktA.getpX() + " Y - "+ punktA.getpY() + " Z - " + punktA.getpZ());
        System.out.println("Dodawanie kordynatów   X + Z = " +punktA.DodXZ());
        System.out.println("Odejmowanie kordynatów Z - X = " + punktA.SubtractionZX());
    }
}