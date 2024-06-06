package Figuras;

public class Figura_3D extends Figuras_Geometricas {
    public  int Ncaras;
    public double aristas;


    public Figura_3D( int Nlados, String nombre, int Ncaras, double aristas){
        super( Nlados, nombre);
        this.Ncaras = Ncaras;
        this.aristas = aristas;



    }



    public double Calcular_Volumen(double radio , int altura ){
         double volumen = 0;

        mostrar_datos();
        System.out.println("Medida de la arista:"+aristas+ "\n");
        System.out.println("Numero de  aristas:"+Nlados+ "\n");
        System.out.println("Numero de caras: "+Ncaras +"\n");

        if ( nombre.equals("Cilindro") ){
            volumen =(3.1415*(radio*radio)*altura);

            System.out.println("------------------------------\n");
            System.out.println("El volumen de la figura es de: \n");
            System.out.println("Volumen: "+volumen +"\n");
            System.out.println("------------------------------\n");

        } else if (nombre.equals("cono")){
            volumen = (3.1415*(radio*radio)*altura)/3;
            System.out.println("------------------------------\n");
            System.out.println("El volumen de la figura es de: \n");
            System.out.println("Volumen: "+volumen +"\n");
            System.out.println("------------------------------\n");


        } else if (nombre.equals("Esfera")){
            volumen = ((4/3)*3.1415*(radio*radio*radio));
            System.out.println("------------------------------\n");
            System.out.println("El volumen de la figura es de: \n");
            System.out.println("Volumen: "+volumen +"\n");
            System.out.println("------------------------------\n");


        }

        return volumen;
    }
}
