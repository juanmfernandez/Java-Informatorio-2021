import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2lv2{
    public static void main(String[] args) {
        List<Integer> losEnteros = new ArrayList<>();
        cargarLista(losEnteros);
        
        for(Integer entero: losEnteros){
            System.out.println(entero);
        }
        System.out.println("Tamaño de la lista: "+losEnteros.size()
        );
        losEnteros.add(0, 5855);        
        losEnteros.add(losEnteros.size(), 88545);
        for(Integer entero: losEnteros){
            System.out.println(entero);
        }
        System.out.println("Tamaño de la lista luego de add: "+losEnteros.size());
    }
    public static void cargarLista(List<Integer> losEnteros) {
        System.out.println("Ingrese 5 enteros: ");   
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {         
            losEnteros.add(scan.nextInt());
        }
        scan.close();
    }
}