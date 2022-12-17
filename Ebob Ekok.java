import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, EKOK = 0;

        Scanner input = new Scanner(System.in);
        System.out.println(" a sayısını giriniz: ");
        a = input.nextInt();
        System.out.println(" b sayısını giriniz:");
        b = input.nextInt();
        int ebob = 1;
        int i = 1;

        // EBOB ALMA //
        if (a < b) {
            while (i <= a) {

                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    EKOK = (a * b) / ebob;
                }
                i++;
            }
            System.out.println("A ve B'nin EBOB'u :" + ebob);
            System.out.println("A ve B'nin EKOK'u :" + EKOK);
        } else {
            while (i <= b) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    EKOK = (a * b) / ebob;
                }
                i++;
            }
            System.out.println("A ve B'nin EBOB'u :" + ebob);
            System.out.println("A ve B'nin EBOB'u:" + EKOK);
        }
    }
}