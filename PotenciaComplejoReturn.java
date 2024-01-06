package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class PotenciaComplejoReturn {
    
    public static String calcula(String cadena) {
        
        String var0 = OpeReturn.resuelve(cadena);
        
        String var1 = DIV2Return.DIV2(var0);
        
        String var2 = MUL1Return.MUL1(var1);
        
        String var3 = SumaRestaReturn.SumaResta(var2);
        
        return var3;           
           
    }
    
    public static String PotenciaR (String cadena) {  
        int count = MiniLibrary.countOccurrences(cadena, '^');
        
        if(count>0) {
            while(count>0)  {
                ArrayList<String> com = MiniLibrary.split(cadena);
                ArrayList<String> com2 = MiniLibrary.split(cadena);
                int ind = com.indexOf("^");
                
                if("i".equals(com.get(ind+1))) {
                    float d = Float.parseFloat(com.get(ind+1))%4;
                    if (d < 0)  {
                        d += 4;
                    }
                    
                    String Z = null;
                    if(d==0) {
                        Z = "1"; 
                    }
                    else if(d==1) {
                        Z = "i"; 
                    }
                    else if(d==2) {
                        Z = "-1"; 
                    }
                    else if(d==3) {
                        Z = "-1 i"; 
                    }
                    else if(d==4) {
                        Z = "1"; 
                    }
                    cadena = MiniLibrary.ListToString(com.subList(0, ind-1)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size()));
                    
                    count -= 1;
                } 
                else if(")".equals(com.get(ind-1))) {
                    
                    int fin = ind-1;
                    ArrayList<Integer> ini = new ArrayList<>();
                    List<String> SubLista = com2.subList(0, fin);
                    
                    ListIterator<String> it = SubLista.listIterator();
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals("(")) {
                            ini.add(com2.indexOf(x));
                            
                            it.remove();
                            it.add("<");  
                        }
                    }
                    
                    int inicio = Collections.max(ini)+1;  
                    List<String> comp = com.subList(inicio, fin);
                    String pot = com.get(ind+1);
                    String signo = null;
                    if(inicio >= 2) {
                        signo = com.get(inicio-2);
                    }
                    
                    if(com.size()==2)   {  
                       double n = Math.pow(Double.parseDouble(comp.get(0)),Double.parseDouble(pot));
                       
                       float d = Float.parseFloat(pot)%4;
                       
                       String s = null;
                       if(d==0) {
                           s = String.valueOf(n);
                        }
                       else if(d==1) {
                           s = String.valueOf(n) + " " + "i";
                        }
                       else if(d==2) {
                           s = String.valueOf(-n);
                        }   
                       else if(d==3) {
                           s = String.valueOf(-n) + " " + "i";
                        }
                       else if(d==4) {
                           s = String.valueOf(n);
                        }
                       
                       String Z = null;
                       if( "-".equals(signo))  {
                           Z = "-" + " " + s;
                        }
                       else if( "+".equals(signo))  {
                           Z = "+" + " " + s;
                        }
                       cadena = MiniLibrary.ListToString(com.subList(0, inicio-2)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size()));
                       count -= 1;
                       
                    }
                    else    {
                        String new_comp = "";
                        for(String i : comp)    {
                            new_comp += i + " ";
                        }
                        String new_comp1 = new_comp.substring(0,new_comp.length()-1);
                        
                        String new_comp2 = calcula(new_comp1); // 1
                        
                        double r = APOLARReturn.ApolarR(new_comp2);
                        
                        double al = APOLARReturn.ApolarA(new_comp2);
                        
                        double rp = Math.pow(r,Double.parseDouble(pot));
                        
                        double alp = al*Double.parseDouble(pot);
                        
                        
                        double Z1 = rp*Math.cos(alp);
                        
                        double Z2 = rp*Math.sin(alp);
                        
                        String Z;
                        if("-".equals(signo))    {
                            Z1 = Z1*-1;
                            Z2 = Z2*-1;
                            Z = "+" + " " + String.valueOf(Z1) + " " + "+" + String.valueOf(Z2) + " " + "i";
                        }
                        else if("+".equals(signo)) {
                            Z = "+" + " " + String.valueOf(Z1) + " " + "+" + " " + String.valueOf(Z2) + " " + "i";
                        }
                        else    {
                            Z = String.valueOf(Z1) + " " + "+" + " " + String.valueOf(Z2) + " " + "i";
                        }
                        
                        if(inicio==1)   {
                            cadena = Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                        }
                        else    {
                            cadena = MiniLibrary.ListToString(com.subList(0,inicio-2)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                        }
                        count -= 1;
                    }
                }  
                else    {
                    double Z = Math.pow(Double.parseDouble(com.get(ind-1)),Double.parseDouble(com.get(ind+1)));
                    
                    cadena = MiniLibrary.ListToString(com.subList(0,ind-1)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size()));
                }
                count -= 1;
            }
            
            return cadena;
        }
        else    {
            
            return cadena;
        }
    }
}
