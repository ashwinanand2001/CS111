/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Ashwin Anand aa2041  aa2041@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class RunLengthEncoding
{
  
    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */

   public static String encode(String original)
   {
       //Initialize the variables
       int c = 0;
       int countNumChars = 1;
       //Create a StringBuilder class's object
       StringBuilder enStr = new StringBuilder();
       //Store string data character by character
       //in the variable 'x'
       char[] x = original.toCharArray();
       //Find the number of characters in
       //the sequence followed by the
       //repeating character
       while (true)
       {
           if (c == x.length - 1)
           {
               if (countNumChars == 1)
               {
                   enStr.append(x[c]);
               }
               else
               {
                   enStr.append(Integer.toString(countNumChars) + x[c]);
               }
               break;
           }
           if (x[c] == x[c + 1])
           {
               countNumChars++;
           }
           else
           {
               if (countNumChars == 1)
               {
                   enStr.append(x[c]);
               } else
               {
                   enStr.append(Integer.toString(countNumChars) + x[c]);
                   countNumChars = 1;
               }
           }
           c++;
       }
       //return the encoded string
       return (enStr.toString());
   }
   /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */

   public static String decode(String original)
   {
       //Create a StringBuilder class's object
       StringBuilder deStr = new StringBuilder();
       //Store string data character by character
       //in the variable 'y'
       char[] y = original.toCharArray();
       //Call the method
       decoder(y, 0, deStr);
      
       //return the decoded string
       return deStr.toString();
   }
   public static void decoder(char[] strData, int c, StringBuilder deStr)
   {
       // base case
       if (c >= strData.length)
           return;
       if (strData[c] == '0')
       {
           c += 2;
           if (c >= strData.length)
               return;
       }
       if (!Character.isDigit(strData[c]))
       {
           if (c >= strData.length)
               return;
           deStr.append(strData[c]);
           c++;
           // call recursion
           decoder(strData, c, deStr);
       } else
       {
           if (c >= strData.length)
               return;
           deStr.append(strData[c + 1]);
           strData[c]--;
           // call recursion
           decoder(strData, c, deStr);
       }
   }
   
   public static void main(String args[])
   {
       //Initialize the variable for input
       String test = "qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT";
       //Display the original string
       System.out.println("Original string: " + test);
       //Call the encode method and display the encoded string
       System.out.println("Encoded string : " + encode(test));
       //Call the decode method and display the decode string
       System.out.println("Decoded string : " + decode(encode(test)));
   }
}
