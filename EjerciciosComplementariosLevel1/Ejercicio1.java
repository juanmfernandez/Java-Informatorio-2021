import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = scan.nextLine();
        scan.close();

        System.out.println("HOLA "+ nombre);
    }
}