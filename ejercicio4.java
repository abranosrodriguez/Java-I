import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        Float x,y,z;
        System.out.print("Dime el primer numero");
        x = escaner.nextFloat();

        System.out.print("\nDime el segundo numero numero");
        y = escaner.nextFloat();

        System.out.print("\nDime el tercer numero numero");
        z = escaner.nextFloat();

        for (int i =0;i<z;i++){
            System.out.print(x+y+"\n");
        }
    }
}