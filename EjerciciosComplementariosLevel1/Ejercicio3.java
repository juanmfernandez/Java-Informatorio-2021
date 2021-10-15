import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
                
        int i=1;

        while (i<=a){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }
}

/*
    Confeccionar un programa que dado un número entero como dato de entrada
    imprima la secuencia de números (incrementos de 1) de la siguiente forma:

    Input (Entrada):
    5

    Output (Salida):
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/