import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj pierwszą wartość:");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Podaj drugą wartość:");
        int b = sc.nextInt();
        System.out.println("Wynik to : ");
        System.out.println( a + b);

    }
}
