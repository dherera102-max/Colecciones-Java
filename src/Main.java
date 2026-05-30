import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList <Alumno> listaAlumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Diego",6);
        Alumno alumno2 = new Alumno("Maria",3);
        Alumno alumno3 = new Alumno("Jose",6);
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);


        System.out.println(listaAlumnos);
        System.out.println("Nombre en el indice 2:" + listaAlumnos.get(1).getNombre());


        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("el tamanio de la lista es: " + listaAlumnos.size());
        for(int i=0; i<=5; i++){
            System.out.println(i);
        }

    }
}