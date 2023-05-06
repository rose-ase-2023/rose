/********************************************************************************/
/*                                                                              */
/*              Subsequences.java                                               */
/*                                                                              */
/*      QuixBugs SUBSEQUENCES                                                   */
/*                                                                              */
/********************************************************************************/
/**
 *
 * @author derricklin
 */

package cs.quixbugs;

import java.util.ArrayList;

public class Subsequences
{

public static ArrayList<ArrayList> subsequences(int a, int b, int k) {
   if (k == 0) {
      // should be empty_set = new ArrayList<>(); empty.set.add(new ArrayList<>(); return empty_set
      return new ArrayList();
    }
   
   ArrayList ret = new ArrayList(50);
   for (int i=a; i<b+1-k; i++) {
      ArrayList base = new ArrayList(50);
      for (ArrayList rest : subsequences(i+1, b, k-1)) {
         rest.add(0,i);
         base.add(rest);
       }
      ret.addAll(base);
      
    }
   
   return ret;
}


public static void main(String [] args)
{
   ArrayList<ArrayList> result = subsequences(1,5,3);
   String fmt = result.toString();
   assert fmt.equals("[[1, 2, 3], [1, 2, 4], [1, 3, 4], [2, 3, 4]]");
}



}       // end of class Subsequences




/* end of Subsequences.java */

