import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String frase = scan.nextLine();
        System.out.println("Ingrese letra: ");
        String letra = scan.nextLine();
        scan.close();

        System.out.println("La letra '"+letra+"' aparece "+contarLetra(frase, letra)+" veces.");
    }
    public static int contarLetra(String frase, String letra) {
        int cantidad = 0;
        for (int i = 0; i < frase.length(); i++) {            
            if (frase.charAt(i) == letra.charAt(0)) {
                cantidad++;
            }
        }
        return cantidad;
    }
}