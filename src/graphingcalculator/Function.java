/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphingcalculator;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
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
        //System.out.println(deltaX);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, 800, 800);
        g.setColor(Color.black);
        int xVertLine=0;
        if (minX<0 && maxX>0){
            xVertLine=(int)((minX*-1)/deltaX);
            
            g.drawLine(xVertLine, 0, xVertLine, 800);
        }
        
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
        double deltaY = Math.abs((maxY-minY)/800.0);
        
        int yHorzLine=0;
        
        if (minY<0 && maxY>0){
            yHorzLine=(int) ((maxY)/deltaY);
            g.drawLine(0, yHorzLine, 800, yHorzLine);
            //System.out.println(yHorzLine);
        }
        else if (maxY<=0){
            yHorzLine=-10;
            g.drawLine(0, yHorzLine, 800, yHorzLine);
        }
        else if (minY>=0){
            yHorzLine=-10;
            g.drawLine(0, yHorzLine, 800, yHorzLine);
        }
        
        for (int i=0;i<800;i++){
            int x1=0;
            int x2=0;
            int y1=0;
            int y2=0;
            
            if (TOV[i][0]<0){
                x1=(int)(xVertLine+(TOV[i][0])/deltaX);
            }
            if (TOV[i][0]>0){
                x1=(int)(xVertLine+((TOV[i][0])/deltaX));
            }
            if (TOV[i+1][0]<0){
                x2=(int)(xVertLine+(TOV[i+1][0])/deltaX);
            }
            if (TOV[i+1][0]>0){
                x2=(int)(xVertLine+((TOV[i+1][0])/deltaX));
            }
            
            if (yHorzLine==-10){
                if (TOV[i][1]<0){
                    y1=(int)((((TOV[i][1]-TOV[0][1])*-1)/deltaY));
                }
                if (TOV[i][1]>0){
                    y1=(int)(800+(((TOV[i][1]-TOV[0][1])*-1)/deltaY));
                }
                if (TOV[i+1][1]<0){
                    y2=(int)((((TOV[i+1][1]-TOV[0][1])*-1)/deltaY));
                }
                if (TOV[i+1][1]>0){
                    y2=(int)(800+(((TOV[i+1][1]-TOV[0][1])*-1)/deltaY));
                }
            }
            else{
                if (TOV[i][1]<0){
                    y1=(int)(yHorzLine+((TOV[i][1]*-1)/deltaY));
                }
                if (TOV[i][1]>0){
                    y1=(int)(yHorzLine+((TOV[i][1]*-1)/deltaY));
                }
                if (TOV[i+1][1]<0){
                    y2=(int)(yHorzLine+((TOV[i+1][1]*-1)/deltaY));
                }
                if (TOV[i+1][1]>0){
                    y2=(int)(yHorzLine+((TOV[i+1][1]*-1)/deltaY));
                }
            }
            
            
            if ((i+1)==800){
                x2=x1;
                y2=y1;
            }
            System.out.println(x1);
            System.out.println(y1);
            System.out.println(x2);
            System.out.println(y2);
            
            g.drawLine(x1,y1,x2,y2);
        }
        
        System.out.println(TOV[0][0]);
        System.out.println(TOV[0][1]);
        System.out.println(TOV[1][0]);
        System.out.println(TOV[1][1]);
        System.out.println(TOV[799][0]);
        System.out.println(TOV[799][1]);
        System.out.println(deltaX);
        System.out.println(deltaY);
        System.out.println(minY);
        System.out.println(maxY);
        System.out.println(yHorzLine);
        
        for (int i=0;i<5;i++){
            
        }
    }
    
    public void initializeWindow(){
        setTitle("Graphing Calculator");
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
