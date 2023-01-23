import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        Float x,y,suma,resta,multiplicacion,division;
        System.out.print("Dime el primer numero");
        x = escaner.nextFloat();

        System.out.print("\nDime el segundo numero numero");
        y = escaner.nextFloat();

        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = x/y;
        System.out.print("\nEl valor de la suma es: " + suma);
        System.out.print("\nEl valor de la resta es: " + resta);
        System.out.print("\nEl valor de la multiplicacion es: " + multiplicacion);
        System.out.print("\nEl valor de la division es: " + division);
    }
}