import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int number1 = data.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int number2 = data.nextInt();
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 = total2 + i;
            }
        }
        if (number1 == total2 && number2 == total1) {
            System.out.print("sayılar arkadaş sayıdır");
        } else {
            System.out.print("sayılar arkadaş sayı değilidir");
        }
    }
}