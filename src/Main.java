public class Main {

public static void main(String[] args) {
        int num1=5, num2=3, num3=10;
        System.out.println(suma(num1, num2, num3));
        Coche miCoche= new Coche();
        miCoche.SumarPuerta();
        System.out.println("El coche tiene: "+miCoche.numP + " Puertas");
    }
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}
//Segunda parte

class Coche{
    int numP;
    public void SumarPuerta() {
        this.numP ++;
    }
}
