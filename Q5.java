import java.util.Scanner;
import java.lang.Math;
public class Q5 {
    public static void main(String []args){
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       for(int i=0;i<=a;i++){
        if(i==0){ System.out.println("n"+"   "+"n^2"+"   "+"n^3"+"   "+"n^4"); i++; }
        for(int j=1;j<5;j++){
                System.out.print((int)Math.pow(i,j)+"   ");
        }
        System.out.println("");
       }

       sc.close();
    }
}