/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.util.Arrays;
import java.lang.Math;

public class SineFunction extends TrigFunctions {
    
   
    
     public SineFunction (double minx, double maxx, double insidecoeff, double outsidecoeff){
         super (minx,maxx,insidecoeff,outsidecoeff);
         
     }
     
     
       public double[][] getTOV(SineFunction s){
         
           int i=0;
          
 
          
           while (min <= max){
               xValue = min;
               double yValue = outsideCoefficient * Math.sin(insideCoefficient*xValue);
          
               
               TOV[i][0] = xValue;
               TOV[i][1] = yValue;
               
              
               
               min = min + deltaX;
               i++;
               
             
           }
           System.out.println(Arrays.deepToString(TOV));
           return TOV;
      
    }
    
}
