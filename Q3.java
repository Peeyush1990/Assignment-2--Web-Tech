import java.util.Scanner;
public class Q3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index: ");
        int a=sc.nextInt();
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December" };
        int []days={31,28,31,30,31,30,31,31,30,31,30,31};
        
        switch(a){
            case 1:
            System.out.print("Month name: "+months[0]+",  Number of days: "+days[0]);
            break;

            case 2:
            System.out.print("Month name: "+months[1]+",  Number of days: "+days[1]);
            break;
            
            case 3:
            System.out.print("Month name: "+months[2]+",  Number of days: "+days[2]);
            break;
            
            case 4:
            System.out.print("Month name: "+months[3]+",  Number of days: "+days[3]);
            break;
            
            case 5:
            System.out.print("Month name: "+months[4]+",  Number of days: "+days[4]);
            break;
            
            case 6:
            System.out.print("Month name: "+months[5]+",  Number of days: "+days[5]);
            break;
            
            case 7:
            System.out.print("Month name: "+months[6]+",  Number of days: "+days[6]);
            break;
            
            case 8:
            System.out.print("Month name: "+months[7]+",  Number of days: "+days[7]);
            break;
            
            case 9:
            System.out.print("Month name: "+months[8]+",  Number of days: "+days[8]);
            break;
            
            case 10:
            System.out.print("Month name: "+months[9]+",  Number of days: "+days[9]);
            break;

            case 11:
            System.out.print("Month name: "+months[10]+",  Number of days: "+days[10]);
            break;
            
            case 12:
            System.out.print("Month name: "+months[11]+",  Number of days: "+days[11]);
            break;

            default:
            System.out.print("Enter valid index");
        }

        sc.close();
    }
}