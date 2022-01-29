import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Podaj cyfre");
            int number = input.nextInt();
            if (number==0)
            {
                System.out.println(StatusEnum.KONIEC);
                break;
            }
            else if(number<7){
                System.out.println(StatusEnum.KONTYNUUJEMY);
            }
            switch (number) {
                case 1:
                    System.out.println(LiczbyEnum.JEDEN);
                    break;
                case 2:
                    System.out.println(LiczbyEnum.DWA);
                    break;
                case 3:
                    System.out.println(LiczbyEnum.TRZY);
                    break;
                case 4:
                    System.out.println(LiczbyEnum.CZTERY);
                    break;
                case 5:
                    System.out.println(LiczbyEnum.PIEC);
                    break;
                case 6:
                    System.out.println(LiczbyEnum.SZESC);
                default:
                    System.out.println(StatusEnum.KONTYNUUJEMY);
            }
        }
    }
}