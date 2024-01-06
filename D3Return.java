package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class D3Return {
    public static String D3 (String cadena) { 
       
        String cadena1 = iiiReturn.iii(cadena);
        
        String newcadena = OrdenarReturn.Ordenar(cadena1);
        
        ArrayList<String> Lista = MiniLibrary.split(newcadena);
        
        int ind = Lista.indexOf("/");
        
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
        
        float a = Float.parseFloat(Lista2.get(2));
        
        float b = Float.parseFloat(Lista2.get(4));
        
        float c = Float.parseFloat(Lista2.get(9));
        
        float d = Float.parseFloat(Lista2.get(11));
        
        float ac = a*c;
        
        float cb = c*b;
        
        float ad = a*d;
        
        float bd = b*d;
        
        float deno = c*c+d*d;
        
        String r,i,divi;
        if("+".equals(Lista2.get(3)))  {
            if("+".equals(Lista2.get(10))) {
                r = String.valueOf((ac+bd)/deno);
                i = String.valueOf((cb-ad)/deno);
                divi = r + " " + "+" + " " + i + " " + "i";
                
            }
            else    {
                r = String.valueOf((ac-bd)/deno);
                i = String.valueOf((cb+ad)/deno);
                divi = r + " " + "+" + " " + i + " " + "i";
                
            }
        }
        else    {
            if("+".equals(Lista2.get(10))) {
                r = String.valueOf((ac+bd*-1)/deno);
                i = String.valueOf((ad-cb*-1)/deno);
                divi = r + " " + "-" + " " + i + " " + "i";
                
            }
            else    {
                r = String.valueOf((ac-bd*-1)/deno);
                i = String.valueOf((cb*-1-ad*-1)/deno);
                divi = r + " " + "+" + " " + i + " " + "i";
                
            }
        }
        
            return divi;
        
    }
    
}
