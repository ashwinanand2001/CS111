/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author: aa2041 Ashwin Anand aa2041@scarletmail.rutgers.edu
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/
public class LuckySevens{
     public static void main(String[] args) {
         int number=Integer.parseInt(args[0]);
         int counter=0;
         if(number<0){
             number=number/-1;
         }
         while(number>0){
             int lastdigit=number%10;
             if(lastdigit==7){
                 counter++;
             }
             number /=10;
         }
         System.out.println(counter);
     }
}