/********************************************************************************/
/*                                                                              */
/*              BugMath75.java                                                  */
/*                                                                              */
/*      Defects4J bug Math_75                                                   */
/*                                                                              */
/********************************************************************************/
/*      Copyright 2011 Brown University --                     */



package xx.d4jxxx;

import org.apache.commons.math.stat.Frequency;

public class BugMath75 implements BugConstants
{

private static long oneL = 1;
private static long twoL = 2;
private static long threeL = 3;
private static int oneI = 1;
private static int twoI = 2;
private static int threeI=3;
private static double tolerance = 10E-15;


public static void main(String [] args)
{
   testMath59();
}


public static void testMath59()
{
   Frequency f = new Frequency();
   f.addValue(oneL);
   f.addValue(twoL);
   f.addValue(oneI);
   f.addValue(twoI);
   f.addValue(threeL);
   f.addValue(threeL);
   f.addValue(3);
   f.addValue(threeI);
   double r = f.getPct((Object) (Integer.valueOf(3)));
   assert r == 0.5;
}



}       // end of class BugMath75




/* end of BugMath75.java */

