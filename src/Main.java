import Figuras.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Figura_3D FIGURA1 = new Figura_3D(3, "cilindro",3,3,100,20 );
        Figura_3D FIGURA2 = new Figura_3D(1,"cono",1,1 ,80,30);
        Figura_3D FIGURA3 = new Figura_3D(1,"esfera",1,0,25,26);
        Cuadrilatero FIGURA4 = new Cuadrilatero(4,"Cuadrado",0,0,15,15,15);
        Cuadrilatero FIGURA5 = new Cuadrilatero(3,"Triangulo",0,0,11,15,10);
        Cuadrilatero FIGURA6 = new Cuadrilatero(4,"Rectangulo",0,0,15,25,20);
        Triangulo    FIGURA7 = new Triangulo(3,"Triangulo",0,0,"ISoceles",10,20);







        int op;
        int opcion2;
        System.out.println("-----------------------------------------------\n");
        System.out.println("                Menu         \n");
        System.out.println("Elija una de las siguientes opciones: \n");
        System.out.println("1. Calculo del are y perimetro de una figura en 2d \n");
        System.out.println("2. Calculo del volumen en figuras 3d \n");
        System.out.println("3. Salir \n");
        op = scanner.nextInt();
        if (op==1 ){

           FIGURA1.mostrarInf();
            FIGURA2.mostrarInf();
            FIGURA3.mostrarInf();
        } else if (op==2){





        }


    }
}