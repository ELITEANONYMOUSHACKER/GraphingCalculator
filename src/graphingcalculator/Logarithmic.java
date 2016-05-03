/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

/**
 *
 * @author pikes7641
 */
public class Logarithmic extends Function{
    
    // amount the function is stretched
    double stretch;
    //amount the function is shifted
    double shift;
    //base of the function
    double base;

    public Logarithmic(double minx, double maxx, double st, double sh, double b){
       super(minx,maxx);
       stretch = st;
       shift = sh;
       base = b;

    }
    
    public void getTOV(){
        
        for (int i=0; i<800; i++) {
            //get each value for TOV (x,y)
            TOV[i][0] = minX+(deltaX*i);
            TOV[i][1] = (Math.log(minX+(deltaX*i))/Math.log(base))*stretch+shift;
            
            //Checks if a value is not a number
            if (Double.isNaN(TOV[i][1])) {
                TOV[i][0] = 0;
                TOV[i][1] = 0;
            }
        }      
    }
    
}
