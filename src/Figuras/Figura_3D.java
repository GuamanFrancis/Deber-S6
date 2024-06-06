package Figuras;

public class Figura_3D extends Figuras_Geometricas {
    public  int Ncaras;
    public double aristas;
    public double radio;
    public int altura;


    public Figura_3D( int Nlados, String nombre, int Ncaras, double aristas, double radio , int altura ){
        super( Nlados, nombre );
        this.Ncaras = Ncaras;
        this.aristas = aristas;
        this.radio = radio;
        this.altura = altura;



    }



    public double Calcular_Volumen(){
         double volumen ;
        if ( nombre.equals("Cilindro") ){
            volumen =(3.1415*(radio*radio)*altura);


        } else if (nombre.equals("cono")){
            volumen = (3.1415*(radio*radio)*altura)/3;

        } else if (nombre.equals("Esfera")){
            volumen = ((4/3)*3.1415*(radio*radio*radio));


        }

        return volumen;

    }
        @Override

       public void  mostrarInf(){
        super.mostrarInf();
           System.out.println("Medida de la arista:"+aristas+ "\n");
           System.out.println("Numero de  aristas:"+Nlados+ "\n");
           System.out.println("Numero de caras: "+Ncaras +"\n");
           System.out.println("El volumen de la figura es de: \n");
           System.out.println("Volumen: "+Calcular_Volumen() +"\n");

       }

}
