package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class APOLARReturn {
    public static float ApolarR(String cadena)      {   
        ArrayList<String> com = MiniLibrary.split(cadena);
        float r = 0;
        if("+".equals(com.get(1))) {
            r = (float) Math.pow(Math.pow(Float.parseFloat(com.get(0)),2) + Math.pow(Float.parseFloat(com.get(2)),2), (float) 0.5);
           
        }
        else if("-".equals(com.get(1))) {
            r = (float) Math.pow(Math.pow(Float.parseFloat(com.get(0)),2) + Math.pow(Float.parseFloat(com.get(2))*-1,2), (float) 0.5);
           
        }
        return r;
    }
    
    public static double ApolarA(String cadena)  {
        ArrayList<String> com = MiniLibrary.split(cadena);
        double alfa = 0;
        if("+".equals(com.get(1))) {
            if(Float.parseFloat(com.get(0))<0)   {
                alfa = Math.atan(Float.parseFloat(com.get(2))/Float.parseFloat(com.get(0)));
                alfa = Math.toDegrees(alfa);
                alfa = Math.rint(alfa*100000000)/100000000;
                alfa = 180 + alfa;    
            }
            else if(Float.parseFloat(com.get(0))>0) {
                alfa = Math.atan(Float.parseFloat(com.get(2))/Float.parseFloat(com.get(0)));
                alfa = Math.toDegrees(alfa);
                alfa = Math.rint(alfa*100000000)/100000000;   
            }
            else    {
                alfa = 0;
            }
        }
        else if("-".equals(com.get(1))) {
            if(Float.parseFloat(com.get(0))<0)   {
                alfa = Math.atan((Float.parseFloat(com.get(2))*-1)/Float.parseFloat(com.get(0)));
                alfa = Math.toDegrees(alfa);
                alfa = Math.rint(alfa*100)/100;
                alfa = 180 + alfa; 
            }
            else if(Float.parseFloat(com.get(0))>0)   {
                alfa = Math.atan((Float.parseFloat(com.get(2))*-1)/Float.parseFloat(com.get(0)));
                alfa = Math.toDegrees(alfa);
                alfa = Math.rint(alfa*100)/100;
                alfa = 360 + alfa; 
            }
            else    {
                alfa = 180;
            }
            
        }
        return (double) alfa;
    }
}

