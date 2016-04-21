/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author nelss8521
 */
public class Function extends JFrame{
    double minX, maxX, deltaX;
    double[][] TOV = new double[801][2];
    
    public Function(double minx, double maxx){
        minX=minx;
        maxX=maxx;
        deltaX=Math.abs((maxX-minX)/800.0);
        System.out.println(deltaX);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 800);
        g.setColor(Color.black);
        int xVertLine=0;
        if (minX<0 && maxX>0){
            xVertLine=(int) ((maxX+minX)/deltaX);
            if (xVertLine<0){
                xVertLine=400+(int)(Math.abs(xVertLine));
            }
            g.drawLine(xVertLine, 0, xVertLine, 800);
        }
        System.out.println(xVertLine);
        
        double minY=TOV[0][1];
        double maxY=TOV[0][1];
        
        for (int i=0;i<TOV.length;i++){
            if (TOV[i][1]<minY){
                minY=TOV[i][1];
            }
            if (TOV[i][1]>maxY){
                maxY=TOV[i][1];
            }
        }
        //System.out.println(minY);
        //System.out.println(maxY);
        double deltaY = (maxY-minY)/800;
        
        if (minY<0 && maxY>0){
            int yHorzLine=(int) ((minY+maxY)/deltaY);
            g.drawLine(0, yHorzLine, 800, yHorzLine);
            //System.out.println(yHorzLine);
        }
        else if (maxY<0){
            int yHorzLine=100;
            g.drawLine(0, yHorzLine, 800, yHorzLine);
        }
        else if (maxY>0){
            int yHorzLine=700;
            g.drawLine(0, yHorzLine, 800, yHorzLine);
        }
    }
    
    public void initializeWindow(){
        setTitle("Graphing Calculator");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
