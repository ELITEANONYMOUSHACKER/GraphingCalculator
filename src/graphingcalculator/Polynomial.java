/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nelss8521
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
        degree++;
        double[] coefs = new double[degree];
        
        for (int i=0;i<degree;i++){
            System.out.println("Enter coefficient "+(i+1));
            coefs[i]=s.nextDouble();
        }
        return coefs;
    }
    
    public void getTOV(){
        int counter=0;
        for (double i=minX;i<=maxX;i+=deltaX){
            double sum=0;
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
            //CONVERT VARIABLES TO LONGS
            TOV[counter][0]=i;
            TOV[counter][1]=sum;
            counter++;
            
        }
    }
    public void printTOV(){
        System.out.println(Arrays.deepToString(TOV));
    }
}
