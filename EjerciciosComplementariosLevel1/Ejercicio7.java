import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = scan.nextLine();
        scan.close();

        System.out.println(toUpper(nombre));
    }
    public static String toUpper(String str) {
        String palabra = "";
        for (int i = 0; i < str.length(); i++) {
            int v = str.charAt(i);
            if (v > 96 && v < 123) {
                v -= 32;
            }
            palabra+=(char)v;        
        }
        return palabra;
    }
}

/*
    Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. 
    Sin uso de métodos o librerías que realicen toUppercase().
    Input (Entrada):
    informatorio

    Output (Salida):
    INFORMATORIO
*/