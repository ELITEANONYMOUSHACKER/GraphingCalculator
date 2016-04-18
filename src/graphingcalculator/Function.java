/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

/**
 *
 * @author PIKES7641
 */
public class Function {
    double minX, maxX, deltaX;
    double[][] TOV;
    
    public Function(double minx, double maxx){
        minX=minx;
        maxX=maxx;
        deltaX=(maxX-minX)/800;
    }
}
