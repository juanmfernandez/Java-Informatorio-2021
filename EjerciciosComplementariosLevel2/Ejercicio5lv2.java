/** * 2 ArrayList contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
 * Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5lv2{
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totalCobrar = new ArrayList<>();
        Integer total = 0;
        cargarHoras(horasTrabajadas);
        cargarValor(valorPorHora);
        
        System.out.println("Lista de horas: "+horasTrabajadas.size());
        for(Integer hs: horasTrabajadas){
            System.out.println(hs);
        }
        
        System.out.println("Lista valores: "+valorPorHora.size());
        for(Integer valor: valorPorHora){
            System.out.println(valor);
        }

        cargarSubTotal(horasTrabajadas, valorPorHora, totalCobrar);
        System.out.println("Sub Totales: ");
        for(Integer subtotal: totalCobrar){
            System.out.println(subtotal);
            total += subtotal;
        }
        System.out.println("Total al cobrar: "+total);


    }

    public static Scanner scan = new Scanner(System.in);
    public static void cargarHoras(List<Integer> horasTrabajadas) {
        System.out.println("Ingrese hs trabajadas por dia: ");
        for (int i = 0; i < 5; i++) {
            horasTrabajadas.add(scan.nextInt());
        }
    }

    public static void cargarValor(List<Integer> valorPorHora) {
        System.out.println("Ingrese valor de hs trabajadas por dia: ");
        for (int i = 0; i < 5; i++) { 
            valorPorHora.add(scan.nextInt());
        }
        scan.close();
    }
    public static void cargarSubTotal(List<Integer> horasTrabajadas, List<Integer> valorPorHora, List<Integer> totalCobrar) {
        for (Integer i= 0; i<horasTrabajadas.size(); i++) {
            totalCobrar.add(horasTrabajadas.get(i)*valorPorHora.get(i));
        }
    }
}