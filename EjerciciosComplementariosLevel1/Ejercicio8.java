import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre y apellido: ");
        String nombreApellido = scan.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese dirección: ");
        String direccion = scan.nextLine();
        direccion = scan.nextLine();
        System.out.println("Ingrese ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        String salida = String.format("%s - %s - %d - %s -", ciudad, direccion, edad, nombreApellido);
        System.out.println((salida));
    }
}

/**
    Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */