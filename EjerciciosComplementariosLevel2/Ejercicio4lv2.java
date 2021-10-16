import java.util.ArrayList;
import java.util.List;

public class Ejercicio4lv2{
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>();
        cargarLista(estudiantes);

        System.out.println("Tamaño de la lista: "+estudiantes.size());
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        System.out.println("Curso 1: ");
        for(String estudiante: curso1){
            System.out.println(estudiante);
        }
        System.out.println("Curso 2: ");
        for(String estudiante: curso2){
            System.out.println(estudiante);
        }
        System.out.println("Curso 3: ");
        for(String estudiante: curso3){
            System.out.println(estudiante);
        }
    }
    public static void cargarLista(List<String> estudiantes) {
        estudiantes.add("Juan Gonzalez");
        estudiantes.add("Jose Campero");
        estudiantes.add("Ceferina Gutierrez");
        estudiantes.add("Adolfo Ponchito");
        estudiantes.add("Tomasa Segovia");
        estudiantes.add("Julio Sosa");
        estudiantes.add("Ines Piedrabuena");
        estudiantes.add("Gonzalo Soto");
        estudiantes.add("Gaston Altamirano");
        estudiantes.add("Javier Kantor");
        estudiantes.add("Lolo Sanchez");
        estudiantes.add("Italo Maidana");
    }
}