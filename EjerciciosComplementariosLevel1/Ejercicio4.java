import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        System.out.println("Ingrese un entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();

        int factorial = 1;
        for (int j = 1; j <= a ; j++) {
            factorial = factorial*j;
        }

        System.out.println("El factorial de "+a+" es: "+ factorial);
    }
}