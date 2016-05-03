
package graphingcalculator;

import java.util.Arrays;

public class SineFunction extends TrigFunctions {
    
   
    // EXTENDS THE TRIG FUNCTION CLASS SO THE ONLY THING DIFFERENT IS THE EQUATION 
     public SineFunction (double minx, double maxx, double insidecoeff, double outsidecoeff){
         super (minx,maxx,insidecoeff,outsidecoeff);
         
     }
     
     // FINDS THE TABLE OF VALUES FOR THE FUNCTION 
       public void getTOV(){
         
           int i=0;
          // WHILE INSIDE THE DOMAIN SET BY THE USER, THE FUNCTION WILL GENERATES POINTS AFTER CALCULATING DELTA X
       
           while (min <= max){
               xValue = min;
               
               //CALCULATION OF THE Y-VALUE 
               double yValue = outsideCoefficient * Math.sin(insideCoefficient*xValue);
          
               //X-VALUE AND Y-VALUE ARE ADDED TO THE ARRAY 
               TOV[i][0] = xValue;
               TOV[i][1] = yValue;
               
              
               // THE NEW MIN VALUE IS THE OLD VALUE ADDED TO THE DELTA X WHICH THE X-VALUE IS INCREASED BY EACH TIME  
               min = min + deltaX;
               i++;
               
           }
      
    }
    
}
