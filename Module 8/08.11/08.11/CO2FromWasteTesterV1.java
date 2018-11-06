/**
 * @purpose: To test CO2FromWasteV1
 *
 * @author Ryan A. Rodriguez
 * @version 11/5/2018
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTesterV1
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
           households.add(new CO2FromWasteV1(3, true, true, true, true));
           households.add(new CO2FromWasteV1(4, false, true, true, true));
           households.add(new CO2FromWasteV1(5, true, false, true, true));
           households.add(new CO2FromWasteV1(6, true, true, false, true));
           households.add(new CO2FromWasteV1(6, true, true, true, false));
           households.add(new CO2FromWasteV1(5, true, true, true, false));
           households.add(new CO2FromWasteV1(4, true, true, false, true));
           households.add(new CO2FromWasteV1(3, true, false, true, true));
           households.add(new CO2FromWasteV1(10, false, true, true, true));


       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWasteV1 dataRecord;
       
       
       for(int index = 0; index < households.size(); index ++)
       {
           dataRecord = households.get(index);
           System.out.printf("%-12s",index);
           System.out.printf("%-8s",dataRecord.getNumPeople());
           System.out.printf("%-12s",dataRecord.getPaper());
           System.out.printf("%-12s",dataRecord.getPlastic());
           System.out.printf("%-8s",dataRecord.getGlass());
           System.out.printf("%-12s",dataRecord.getCans());
           dataRecord.calcGrossWasteEmission();
           System.out.printf("%-12.1f",dataRecord.getEmissions());
           dataRecord.calcWasteReduction();
           System.out.printf("%-12.1f",dataRecord.getReduction());
           dataRecord.calcNetWasteReduction();
           System.out.printf("%-12.1f",dataRecord.getNetEmissions());
           System.out.println("");

       }
   }
}

