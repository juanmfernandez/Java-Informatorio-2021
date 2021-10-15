import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1lv2{
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        cargarLista(ciudades);
        
        for(String ciudad: ciudades){
            System.out.println("#"+(ciudades.indexOf(ciudad)+1) +" - "+ ciudad);
        }
    }
    public static void cargarLista(List<String> ciudades) {
        System.out.println("Ingrese sus 3 cuidades favoritas: ");   
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {         
            ciudades.add(scan.nextLine());
        }
        scan.close();
    }
}