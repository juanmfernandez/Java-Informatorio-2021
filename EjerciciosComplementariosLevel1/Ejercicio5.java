import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        System.out.println("Ingrese dos enteros:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int sumaSucesiva = 0;
        for (int j = 1; j <= b; j++) {
            sumaSucesiva = sumaSucesiva+a;
        }

        System.out.println(a+"*"+b+": "+ sumaSucesiva);
    }
}