/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.util.Arrays;

/**
 *
 * @author mahbo5024
 */
public class CosFunction extends TrigFunctions {
    
    public CosFunction (double minx, double maxx, double insidecoeff, double outsidecoeff){
         super (minx,maxx,insidecoeff,outsidecoeff);
         
     }
     
     
       public double[][] getTOV(CosFunction c){
         
           int i=0;
          
 
          
           while (min <= max){
               xValue = min;
               double yValue = outsideCoefficient * Math.cos(insideCoefficient*xValue);
          
               
               TOV[i][0] = xValue;
               TOV[i][1] = yValue;
               
              
               
               min = min + deltaX;
               i++;
               
             
           }
           System.out.println(Arrays.deepToString(TOV));
           return TOV;
      
    }
    
}

    

