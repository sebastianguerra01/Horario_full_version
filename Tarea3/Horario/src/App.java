import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pkEstudiantes.Estudiante1;
import pkEstudiantes.Estudiante2;
import pkEstudiantes.Estudiante3;


public class App {
    public static void main(String[] args) throws Exception {

        int eleccion;

        Scanner sc = new Scanner(System.in);

        List<Estudiante1> est_1 = new ArrayList<>();
        List<Estudiante2> est_2 = new ArrayList<>();
        List<Estudiante3> est_3 = new ArrayList<>();

        Estudiante1 first_student = new Estudiante1 ("Jose", "Natalia Jarrin",'H', 16, 22092003 );
        Estudiante2 second_student = new Estudiante2 ("Maria", "Nelson Torres",'M', 17, 90619630 );
        Estudiante3 third_student = new Estudiante3 ("Gustavo", "Domingo Savio",'H', 15, 19932503 );

            System.out.print("\nLos estudiantes disponibles para el proceso son los siguientes: \n");
            System.out.print("\n1. Jose           2. Maria        3. Gustavo\n");
            System.out.print("\nIngrese el numero del estudiante que desea modificar su horario: ");
                eleccion = sc.nextInt();

            switch(eleccion){

                case 1:
                        first_student.Show_Information1();
                        break;
                case 2:
                        second_student.Show_Information2();
                        break;
                case 3:
                        third_student.Show_Information3();
                        break;
            }
        sc.close();    
    } 
 }
