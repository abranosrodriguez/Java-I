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

        if(x < y && x < z){
            if(z < y){
                System.out.println("\n"+x +"\n"+ z +"\n"+ y);
            }else if (y < z){
                System.out.println("\n"+x +"\n"+ y +"\n"+ z);
            }
        }else if (y < x && y < z){
            if(x < z){
                System.out.println("\n"+y +"\n"+ x +"\n"+ z);
            }else if (z < x){
                System.out.println("\n"+y +"\n"+ z +"\n"+ x);
            }
        }else if (z < x && z < y){
            if(x < y){
                System.out.println("\n"+z +"\n"+ x +"\n"+ y);
            }else if (y < x){
                System.out.println("\n"+z +"\n"+ y +"\n"+ x);
            }

        }
    }
}