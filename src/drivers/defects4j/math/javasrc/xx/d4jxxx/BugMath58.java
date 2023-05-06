/********************************************************************************/
/*                                                                              */
/*              BugMath58.java                                                  */
/*                                                                              */
/*      Defects4J bug Math_58                                                   */
/*                                                                              */
/********************************************************************************/
/*      Copyright 2011 Brown University --                     */



package xx.d4jxxx;

import org.apache.commons.math.optimization.fitting.GaussianFitter;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;

public class BugMath58 implements BugConstants
{



public static void main(String [] args)
{
   testMath58();
}


public static void testMath58()
{
   final double[] data = {
         1.1143831578403364E-29,
         4.95281403484594E-28,
         1.1171347211930288E-26,
         1.7044813962636277E-25,
         1.9784716574832164E-24,
         1.8630236407866774E-23,
         1.4820532905097742E-22,
         1.0241963854632831E-21,
         6.275077366673128E-21,
         3.461808994532493E-20,
         1.7407124684715706E-19,
         8.056687953553974E-19,
         3.460193945992071E-18,
         1.3883326374011525E-17,
         5.233894983671116E-17,
         1.8630791465263745E-16,
         6.288759227922111E-16,
         2.0204433920597856E-15,
         6.198768938576155E-15,
         1.821419346860626E-14,
         5.139176445538471E-14,
         1.3956427429045787E-13,
         3.655705706448139E-13,
         9.253753324779779E-13,
         2.267636001476696E-12,
         5.3880460095836855E-12,
         1.2431632654852931E-11
    };
   
   GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
   for (int i = 0; i < data.length; i++) {
      fitter.addObservedPoint(i, data[i]);
    }
   final double[] p = fitter.fit();
   
   assert Math.abs(p[1] - 53.1572792) < 1e-7;
   assert Math.abs(p[2] - 5.75214622) < 1e-8;
}

}       // end of class BugMath58




/* end of BugMath58.java */

