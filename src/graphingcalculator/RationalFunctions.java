

package graphingcalculator;

import java.util.Arrays;
import java.util.Scanner;



public class RationalFunctions extends Function {
    
    Scanner scan = new Scanner(System.in);
   
    
    double numeratorcoeff;
    double numeratorconstant;
    double denominatorcoeff;
    double denominatorconstant;
    double min;
    double max;
    double xValue;
    double tovArray [][];
    
    
    public RationalFunctions (double minx, double maxx, double numcoeff, double numconst,double denomcoeff,double denomconst){
       super(minx,maxx);
       numeratorcoeff = numcoeff;
       numeratorconstant = numconst;
       denominatorcoeff = denomcoeff;
       denominatorconstant = denomconst;
       min = minx;
       max = maxx;
       int arrayMax = (int) ((max-min)/deltaX)+1;
       tovArray = new double [arrayMax][2];
       
       
    }
    
    
   
    public double numeratorValue(){
        
        double numValue = numeratorcoeff*xValue + numeratorconstant;
        
        return numValue;
    
    
}
     public double denominatorValue(){
        
        double denomValue = denominatorcoeff*xValue + denominatorconstant;
        
        return denomValue;
    
    
}
       public double[][] getTOV(RationalFunctions r){
         
           int i=0;
 
           
          
           while (min <= max){
               xValue = min;
               double yValue = r.numeratorValue()/r.denominatorValue();
          
               
               tovArray[i][0] = xValue;
               tovArray[i][1] = yValue;
               
              
               
               min = min + 1;
               i++;
               
             
           }
           System.out.println(Arrays.deepToString(tovArray));
           return tovArray;
      
    }
    
}



    
