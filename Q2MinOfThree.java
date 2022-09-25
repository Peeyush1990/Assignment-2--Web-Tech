public class Q2MinOfThree {
    public static void main(String args[] ){
     int a,b,c;
     a=10;
     b=20;
     c=3;
     if(a<b&&a<c) System.out.print("Smallest number is: "+a);
     else if(b<a&&b<c) System.out.print("Smallest number is: "+b);
     else System.out.print("Smallest number is: "+c); 
    }
}