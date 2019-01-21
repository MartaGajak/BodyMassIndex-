import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();

//        System.out.println("Podaj swój wiek");
//        int age = scanner.nextInt();

        System.out.println("Podaj swój wzrost w cm");
        double height = scanner.nextDouble();

        System.out.println("Podaj swoją wagę w kg");
        double weight = scanner.nextDouble();

        height = height / 100; //bo wzrost ma byc w m
        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Jesteś zbyt szczupły");
        }

        else if  (bmi > 25) {
            System.out.println("Czas na odchudzanie");
        }
        else {
            System.out.println("Idealnie");
        }

        System.out.println("Twój indeks bmi wynosi " + bmi);

    }
}
