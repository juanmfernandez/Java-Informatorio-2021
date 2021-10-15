import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        /*"suma, resta, multiplicación, división y módulo (resto de la división) de ambos números."
            5 + 4 = 9
            5 - 4 = 1
            5 * 4 = 20
            5 / 4 = 1
            5 % 4 = 1
        */
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        int modulo = a%b;
        System.out.println(a+"+"+b+": "+ suma);
        System.out.println(a+"-"+b+": "+ resta);
        System.out.println(a+"*"+b+": "+ multiplicacion);
        System.out.println(a+"/"+b+": "+ division);
        System.out.println(a+"%"+b+": "+ modulo);

    }
}