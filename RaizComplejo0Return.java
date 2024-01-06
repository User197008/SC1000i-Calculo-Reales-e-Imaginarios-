package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class RaizComplejo0Return {
    public static String RC0 (String cadena) {  
        
        int count = MiniLibrary.countOccurrences(cadena, '√');
        
        if(count>0) {
            while(count>0)  {
                ArrayList<String> Lista = MiniLibrary.split(cadena);
                int ind = Lista.indexOf("√");
                
                float n = Float.parseFloat(Lista.get(ind-1));
                
                List<String> Lista2 = Lista.subList(ind, Lista.size());
                
                int inicio = ind + 1;
                if("(".equals(Lista.get(inicio)))  {
                   int xo = 0;
                   int yo = 0;
                   ArrayList<Integer> fin = new ArrayList<>();
                   ListIterator<String> it = Lista2.listIterator();
                   int fi = 0;
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals("(")) {
                            xo += 1;
                        }
                        else if(x.equals(")")) {
                            fin.add(Lista2.indexOf(x));
                            it.remove();
                            it.add(">");
                            yo += 1;
                            if(xo==yo)  {
                                
                                fi = Collections.max(fin) + ind;
                                
                                break;
                            }
                        } 
                    }
                    
                    String sub2 = MiniLibrary.ListToString(Lista.subList(inicio+1, fi));
                    
                    ArrayList<String> sub3L = MiniLibrary.split(sub2);
                    String resultado = null;
                    if(Collections.frequency(sub3L, "i")>0)   {
                       int inx = sub3L.indexOf("i");
                       if(sub3L.size()==4)  {
                           double a = Math.pow(Double.parseDouble(sub3L.get(inx-3)),2);
                           
                           double b = Math.pow(Double.parseDouble(sub3L.get(inx-1)),2);
                          
                           double alpha = Math.toDegrees(Math.atan(a/b));
                           
                           double r = Math.pow(a+b,1/(n*2));
                           
                           float k = Float.parseFloat(Lista.get(fi+1));
                           
                           double alpha1 = (alpha + 360 * k)/n;
                           
                           String re1 = String.valueOf(r * Math.cos(Math.toRadians(alpha1)));
                           String re2 = String.valueOf(r * Math.sin(Math.toRadians(alpha1)));
                           resultado = "("+" "+re1+" "+"+"+" "+re2+" "+"i"+" "+")";
                           
                           
                       }
                        
                    }
                    if(ind>3)   {
                        if(Collections.frequency(Lista.subList(ind-4, ind),"+")>0)  {
                            inicio = ind + Lista.subList(ind-4, ind).indexOf("+") - 4;
                            
                        }
                        else if(Collections.frequency(Lista.subList(ind-4, ind),"-")>0) {
                            inicio = ind + Lista.subList(ind-4, ind).indexOf("-") - 4;
                            
                        }
                    }
                    List<String> cadena1 = Lista.subList(0, inicio+1);
                    String cadena1a = MiniLibrary.ListToString(cadena1);
                    
                    List<String> cadena2 = Lista.subList(fi+2, Lista.size());
                    String cadena2a = MiniLibrary.ListToString(cadena2);
                    
                    cadena = cadena1a + " " + resultado + " " + cadena2a;
                    
                    count -= 1;       
                }
                else    {
                    double resultado = Math.pow(Float.parseFloat(Lista.get(ind+1)),1/n);
                    
                    List<String> cadena1 = Lista.subList(0, inicio-2);
                    String cadena1a = MiniLibrary.ListToString(cadena1);
                    
                    List<String> cadena2 = Lista.subList(ind+2, Lista.size());
                    String cadena2a = MiniLibrary.ListToString(cadena2);
                    
                    cadena = cadena1a + " " + resultado + " " + cadena2a;
                    
                    count -= 1;
                }
                   
                        
                        
               
            }
        }
        System.out.println("RaizComplejo0.cadenaResultado: " + cadena);
        return cadena;
    }
}
