package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class M3Return {   
    public static String M3 (String cadena) { 
        
        String cadena1 = iiiReturn.iii(cadena);
        
        String newcadena = OrdenarReturn.Ordenar(cadena1); 
        
        ArrayList<String> Lista = MiniLibrary.split(newcadena);
        
        int ind = Lista.indexOf("*");
        
        ArrayList<String> Lista2 = new ArrayList<>();
        if("(".equals(Lista.get(0)))    {
            Lista2.add("0");
            Lista2.add(Lista.get(ind-6));
            Lista2.add(Lista.get(ind-5));
            Lista2.add(Lista.get(ind-4));
            Lista2.add(Lista.get(ind-3));
            Lista2.add(Lista.get(ind-2));
            Lista2.add(Lista.get(ind-1));
            Lista2.add(Lista.get(ind));
            Lista2.add(Lista.get(ind+1));
            Lista2.add(Lista.get(ind+2));
            Lista2.add(Lista.get(ind+3));
            Lista2.add(Lista.get(ind+4));
            Lista2.add(Lista.get(ind+5));
            Lista2.add(Lista.get(ind+6));
        }
        else   {
            Lista2.add(Lista.get(ind-7));
            Lista2.add(Lista.get(ind-6));
            Lista2.add(Lista.get(ind-5));
            Lista2.add(Lista.get(ind-4));
            Lista2.add(Lista.get(ind-3));
            Lista2.add(Lista.get(ind-2));
            Lista2.add(Lista.get(ind-1));
            Lista2.add(Lista.get(ind));
            Lista2.add(Lista.get(ind+1));
            Lista2.add(Lista.get(ind+2));
            Lista2.add(Lista.get(ind+3));
            Lista2.add(Lista.get(ind+4));
            Lista2.add(Lista.get(ind+5));
            Lista2.add(Lista.get(ind+6));
        }
        
        float b;
        float d;
        String MulCom;
        float a = Float.parseFloat(Lista2.get(2));
        if("-".equals(Lista2.get(3)))   {   
            b = Float.parseFloat(Lista2.get(4))*-1;
        }
        else    {
            b = Float.parseFloat(Lista2.get(4));
        }
        float c = Float.parseFloat(Lista2.get(9));
        if("-".equals(Lista2.get(10)))   {
            d = Float.parseFloat(Lista2.get(11))*-1;
        }
        else    {
            d = Float.parseFloat(Lista2.get(11));
        }    
        float ac = a*c;
        float bd = b*d;
        float ad = a*d;
        float bc = b*c;
        float T1 = ac-bd;
        float T2 = ad+bc;
        
        if(T2 < 0)    {
            
                MulCom = String.valueOf(T1) + " " + "-" + " " + String.valueOf(T2*-1) + " " + "i";
            
        }else  {
               
                MulCom = String.valueOf(T1) + " " + "+" + " " + String.valueOf(T2) + " " + "i";
             
           
        }    
        
        
        return MulCom;
        
        
        }   
    }   

