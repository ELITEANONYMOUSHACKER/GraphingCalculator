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
    
    public double[][] getTOV(){
        
        double[][] TOV = new double[800][2];
        
        for (int i=0; i<800; i++) {
            //get each value for TOV (x,y)
            TOV[i][0] = minX+(deltaX*i);
            TOV[i][1] = Math.log(minX+(deltaX*i))/Math.log(base);
        }
        
        return TOV;
        
    }
    
}
