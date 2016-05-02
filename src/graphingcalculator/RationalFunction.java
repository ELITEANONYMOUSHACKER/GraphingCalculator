/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.util.Arrays;


public class RationalFunction extends Function {
    double coefTwo[];
    double coef[];
    
    
    
    public RationalFunction(double minx, double maxx, double [] co, double []coTwo){
       super(minx,maxx);
       coef = co;
       coefTwo = coTwo;
       
    }
    
     
    public void getTOV(){
        int counter=0;
        
        for (double i=minX;i<=maxX;i+=0.5){
           
            double sum=0;
            double sumTwo=0;
            double sumFinal;
            
            for (int j=0;j<coef.length;j++){
                if (coef.length==1){
                    sum=sum+i;
                }
                else if (j==coef.length-1){
                    sum=sum+coef[j];
                }
                else{
                    sum=(sum+(Math.pow(i,(coef.length-j-1))*coef[j]));
                }
                
            }
            
            for (int k=0;k<coefTwo.length;k++){
                if (coefTwo.length==1){
                    sumTwo=sumTwo+i;
                }
                else if (k==coefTwo.length-1){
                    sumTwo=sumTwo+coefTwo[k];
                }
                else{
                    sumTwo=(sumTwo+(Math.pow(i,(coefTwo.length-k-1))*coefTwo[k]));
                }
                
            }
            System.out.println(sum + " " + sumTwo + "ji");
            if (sumTwo==0){
                sumFinal = sum/sumTwo;
            }
            
            else{
                sumFinal = sum/sumTwo;
            }
            
          
            
            TOV[counter][0]=i;
            TOV[counter][1]=sumFinal;
            counter++;
            
        }
    }
    public void printTOV(){
        System.out.println(Arrays.deepToString(TOV));
    }
    
}
