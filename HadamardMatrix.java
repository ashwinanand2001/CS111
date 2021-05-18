/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author:Ashwin Anand aa2041 aa2041@scarletmail.rutgers.edu
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix { 
    public static void main(String[] args) { 
        int number = Integer.parseInt(args[0]);
        boolean[][] hadamard = new boolean[number][number];
        hadamard[0][0] = true;
        for (int a = 1; a < number; a += a) {
            for (int b = 0; b < a; b++) {
                for (int c = 0; c < a; c++) {
                    hadamard[b+a][c]   =  hadamard[b][c];
                    hadamard[b][c+a]   =  hadamard[b][c];
                    hadamard[b+a][c+a] = !hadamard[b][c];
                }
            }
        }
        for (int d = 0; d < number; d++) {
            for (int e = 0; e < number; e++) {
                if (hadamard[d][e]) System.out.print("T ");
                else                System.out.print("F ");
            }
            System.out.println();
        }
    }

}
