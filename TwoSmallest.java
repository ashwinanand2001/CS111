/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {
        
            double min1=Double.MAX_VALUE;  
            double min2=Double.MAX_VALUE;; 
            
            for(int i=0;i<args.length;i++){
                double val = Double.parseDouble(args[i]);
                
                if(val<min2){
                    
                    min2=val;
                    
                    if(min1>min2){
                        
                        double temp;
                        
                        temp=min1;
                        
                        min1=min2;
                        
                        min2=temp;
                        
                    }
                }
            }
            System.out.println(min1);
            System.out.println(min2);
    }
    }

