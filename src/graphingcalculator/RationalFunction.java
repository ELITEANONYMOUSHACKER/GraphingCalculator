
package graphingcalculator;


// EXTENDS THE FUNCTION CLASS WHICH IS WHERE IT GETS IT'S MINIMUM AND MAXIMUM X-VALUE 
public class RationalFunction extends Function {
    double coefTwo[];
    double coef[];
    
    //THE COEFFICIENTS OF THE TOP POLYNOMIAL AND THE BOTTOM POLYNOMIAL ARE NEEDED TO CALCULATE THE POINTS FOR THE RATIONAL FUNCTION 
    public RationalFunction(double minx, double maxx, double [] co, double []coTwo){
       super(minx,maxx);
       coef = co;
       coefTwo = coTwo;
       
    }
    
    // RETURNS THE TABLE OF VALUES  
    public void getTOV(){
        
        int counter=0;
        // LOOP FINDS THE Y-VALUE OF THE POLYNOMIAL IN THE NUMERATOR AND DENOMINATOR 
        
        for (double i=minX;i<=maxX;i+=deltaX){
           
            //KEEPS TRACK OF THE Y-VALUE TOTAL
            double sum=0;
            double sumTwo=0;
            double sumFinal = 0;
            
            // FINDS THE Y-VALUE OF NUMERATOR 
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
            
            //FINDS Y-VALUE OF DENOMINATOR 
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
            
            // CANNOT DIVIDE BY ZERO 
            if (sumTwo!=0){
                sumFinal = sum/sumTwo;
            }
            
            else{
                sumFinal = sum/(sumTwo+0.01);
            }
            
          
            //  UPDATES THE ARRAY TO THE NEW LOCATION 
            TOV[counter][0]=i;
            TOV[counter][1]=sumFinal;
            
            //  CATCH INFINITE VALUES
            if (Double.isInfinite(sumFinal)) {
                TOV[counter][0]=0;
                TOV[counter][1]=0;
            }
            
            counter++;
            
        }
    }
    
}
