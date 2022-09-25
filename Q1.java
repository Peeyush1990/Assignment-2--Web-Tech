import java.util.Scanner; 
public class Q1{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the score: ");
      double a=sc.nextDouble();
      if(a>80&&a<90) a+=5;
      System.out.print("The new score is: "+a);
     sc.close();
    }
}