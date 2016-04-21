
package graphingcalculator;


public class TrigFunctions extends Function {
    
     
    double insideCoefficient;
    double outsideCoefficient;
    double min;
    double max;
    double xValue;
    double TOV[][]  = new double [801][2];
    
    public TrigFunctions (double minx, double maxx, double insidecoeff, double outsidecoeff){
         super (minx,maxx);
         
         insideCoefficient = insidecoeff;
         outsideCoefficient = outsidecoeff;
         min = minx;
         max = maxx;
    
}
}
