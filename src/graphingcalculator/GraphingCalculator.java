/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.awt.Graphics;
import javax.swing.JFrame;


/**
 *
 * @author nelss8521
 */
public class GraphingCalculator{
            
    public static void main(String[] args) {
        GraphingCalculator gc = new GraphingCalculator();
        
        double[] arraycoefs=Polynomial.returnPolynomialCoefs();
        
        Polynomial p1 = new Polynomial(-15,5,arraycoefs);
        p1.getTOV();
        p1.printTOV();
        
        p1.initializeWindow();
        
        
    }
}
