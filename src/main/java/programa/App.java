
package programa;

import Modelo.Alumno;
import Modelo.AlumnoArreglo;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAl;
        
        System.out.print("Digite el numero de alumnos:");
        numAl = entrada.nextInt();
        
        AlumnoArreglo alumnos = new AlumnoArreglo(5);
        
        //Leemos los datos del arreglo
        
        Alumno alumno = new Alumno("1900200", "Juan Perez");
        if (alumno.calcularPromedio(12.5f, 14.7f)){
            System.out.println(alumno);
        }else{
            System.out.println("No se han ingresado notas validas");
        }
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println("Imprimiendo los alumnos del arreglo");
        System.out.println(alumnos);
        
    }
}
