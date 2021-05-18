/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Ashwin Anand 
 *           aa2041@scarletmail.rutgers.edu
 *           192007894
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        // WRITE YOUR CODE HERE
	double [] sAr = new double[array.length];
        for(int i=0;i<array.length;i++){
            sAr[i]=array[i];
        }
        return sAr;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
        for(int i=0;i<x.length;i++){
            x[i]*=alpha;
        }
        for(int j=0;j<y.length;j++){
            y[j]*=alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
        for(int i=0;i<x.length;i++){
            x[i]+=dx;
        }
        for(int j=0;j<y.length;j++){
            y[j]+=dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
        theta=Math.toRadians(theta);
        double[] newArr=copy(x);
        double[] newArr2=copy(y);
        for(int i=0;i<x.length;i++){
            x[i]=((newArr[i]*Math.cos(theta))-(newArr2[i]*Math.sin(theta)));
            y[i]=((newArr2[i]*Math.cos(theta))+(newArr[i]*Math.sin(theta)));
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
        
    }
}

