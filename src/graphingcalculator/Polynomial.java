/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.util.Scanner;

/**
 *
 * @author PIKES7641
 */
public class Polynomial extends Function{
    
    double[] coef;
    
    
    public Polynomial(double minx, double maxx, double [] co){
       super(minx,maxx);
       coef=co;
    }
    
    public static double[] returnPolynomialCoefs(){
        Scanner s = new Scanner(System.in);
        System.out.println("What degree is your polynomial?: ");
        int degree = s.nextInt();
        double[] coefs = new double[degree];
        
        for (int i=0;i<degree;i++){
            System.out.println("Enter coefficient "+(i+1));
            coefs[i]=s.nextDouble();
        }
        return coefs;
    }
    
    //public double[][] getTOV(Polynomial p){
    //    
    //}
}
