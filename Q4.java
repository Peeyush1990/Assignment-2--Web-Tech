public class Q4 {
    public static void main(String[] args){
      double population=80000;
      double rate=0.05;
      int years=0;
      while(population<150000){
        years++;
        population+=population*rate;
      } 
      System.out.print("The population will exceeed 150000 after "+years+" years"); 
    }
}
