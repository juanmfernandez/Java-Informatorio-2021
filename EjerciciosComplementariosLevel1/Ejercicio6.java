import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        System.out.println("Ingrese dos enteros:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int potencia = a;
        for (int j = 1; j < b; j++) {
            potencia = potencia*a;
        }

        System.out.println(a+" elevado a "+b+": "+ potencia);
    }
}