import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        Float x,y;
        System.out.print("Dime el primer numero");
        x = escaner.nextFloat();

        System.out.print("\nDime el segundo numero numero");
        y = escaner.nextFloat();

        if(x < y){
            System.out.print("\nEl x=" + x + " es menor que la y=" + y );
        }else if (x > y){
            System.out.print("\nEl x=" + x + " es mayor que la y=" + y );
        }else {
            System.out.print("\nLos numeros son iguales");
        }
    }
}