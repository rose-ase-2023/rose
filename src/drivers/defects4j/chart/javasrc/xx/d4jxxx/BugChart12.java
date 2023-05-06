/********************************************************************************/
/*                                                                              */
/*              BugChart12.java                                                 */
/*                                                                              */
/*      Defects4J bug Chart_12                                                  */
/*                                                                              */
/********************************************************************************/
/*      Copyright 2011  --                     */


package xx.d4jxxx;

import java.text.NumberFormat;

import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;

public class BugChart12 implements BugConstants
{


public static void main(String [] args)
{
   testChart12();
}



public static void testChart12()
{
   // the following checks that the plot registers itself as a listener
   // with the dataset passed to the constructor - see patch 1943021
   DefaultCategoryDataset dataset = new DefaultCategoryDataset();
   MultiplePiePlot plot = new MultiplePiePlot(dataset);
   assert dataset.hasListener(plot);
}




}       // end of class BugChart12




/* end of BugChart12.java */

