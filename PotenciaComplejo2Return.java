package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class PotenciaComplejo2Return {
    
    public static String calcula(String cadena) {       
        String var0 = RaizComplejo1Return.RC1(cadena);
        
        String var1 = PotenciaComplejoReturn.PotenciaR(var0);
        
        String var2 = OpeReturn.resuelve(var1);
        
        String var3 = DIV2Return.DIV2(var2);
        
        String var4 = MUL2Return.MUL2(var3);
        
        String var5 = SumaRestaReturn.SumaResta(var4);
        
        return var5;           
           
    }
    
    public static String  Potencia2R (String cadena) {  
        int count = MiniLibrary.countOccurrences(cadena, '^');
        
        if(count>0) {
            while(count>0)  {
                ArrayList<String> com = MiniLibrary.split(cadena);
                ArrayList<String> com2 = MiniLibrary.split(cadena);
                
                int ind = com.indexOf("^");
                
                String Z = null;
                if("i".equals(com.get(ind-1))) {
                    float d = Float.parseFloat(com.get(ind+1))%4;
                    if (d < 0)  {
                        d += 4;
                    }
                   
                   
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
                    
                }
                else if(")".equals(com.get(ind-1))) {
                    ArrayList<String> cadenaLista = MiniLibrary.split(cadena);
                    List<String> cadenaLista2 = cadenaLista.subList(0, ind);
                    
                    Collections.reverse(cadenaLista2);
                    List<String> cadenaLista3 = cadenaLista2;
                    
                    
                    int fin = ind-1;
                    int xo = 0;
                    int yo = 0;
                    int inicio = 0;
                    int finn = 0;
                    ArrayList<Integer> ini = new ArrayList<>();
                    ListIterator<String> it = cadenaLista2.listIterator();
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals(")")) {
                            xo += 1;
                        }
                        else if(x.equals("(")) {
                            ini.add(cadenaLista3.indexOf(x));
                            it.remove();
                            it.add("<");
                            yo += 1;
                            if(xo==yo)  {
                                
                                finn = Collections.max(ini);
                               
                                inicio = (cadenaLista2.size() - finn) - 1;
                                
                                break;
                            }
                        }
                        
                    }
                    
                    List<String> comp = com.subList(inicio+1, fin);
                    String comp1 = calcula(MiniLibrary.ListToString(comp));
                    ArrayList<String> comp2 = MiniLibrary.split(comp1);
                    
                    String pot = com.get(ind+1);
                    String signo = " ";
                    
                     if ( comp2.contains("i"))       {             
                    
                    if(inicio >= 1) {
                        signo = com.get(inicio-1);
                        
                    }
                    
                    if(comp2.size()==2)  {
                       double n = Math.pow(Double.parseDouble(comp2.get(0)),Double.parseDouble(pot));
                       
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
                       
                       
                       if( "-".equals(signo))  {
                           Z = "-" + " " + s;
                        }
                       else if( "+".equals(signo))  {
                           Z = "+" + " " + s;
                        }
                       else if(!"+".equals(signo) || !"-".equals(signo))    {
                           Z = s;
                       }
                       
                       if( "+".equals(signo) || "-".equals(signo) ) {
                           cadena = MiniLibrary.ListToString(com.subList(0, inicio-1)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size())); 
                           
                        }
                       else if("(".equals(signo))   {
                           cadena = MiniLibrary.ListToString(com.subList(0, inicio)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size()));
                           
                        }
                       else {
                           cadena = MiniLibrary.ListToString(com.subList(0, inicio)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2,com.size()));
                           
                        }
                       
                       count -= 1;
                    }
                    else    {
                        String new_comp = "";
                        for(String i : comp2)    {
                            new_comp += i + " ";
                        }
                        String new_comp1 = new_comp.substring(0,new_comp.length()-1);
                        
                        String new_comp2 = new_comp1;
                        
                        double r = APOLARReturn.ApolarR(new_comp2);
                        
                        double al = APOLARReturn.ApolarA(new_comp2);
                        
                        double rp = Math.pow(r,Double.parseDouble(pot));
                        
                        double alp = al*Double.parseDouble(pot);
                        
                        
                        double Z1 = rp*Math.cos(Math.toRadians(alp));
                        
                        double Z2 = rp*Math.sin(Math.toRadians(alp));
                        
                        
                        if("-".equals(signo))    {
                            Z1 = Z1*-1;
                            Z2 = Z2*-1;
                            Z = "+" + " " + String.valueOf(Z1) + " " + "+" + " " + String.valueOf(Z2) + " " + "i";
                            
                        }
                        else if("+".equals(signo)) {
                            Z = "+" + " " + String.valueOf(Z1) + " " + "+" + " " + String.valueOf(Z2) + " " + "i";
                            
                        }
                        else    {
                            Z = String.valueOf(Z1) + " " + "+" + " " + String.valueOf(Z2) + " " + "i";
                            
                        }
                        
                        if(inicio==1)   {
                            cadena = MiniLibrary.ListToString(com.subList(0,inicio)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                            
                        }
                        else if(inicio==0)   {
                            cadena = Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                            
                        }
                        else    {
                            if("(".equals(com.get(inicio-1)))   {
                                cadena = MiniLibrary.ListToString(com.subList(0,inicio)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                                
                            }
                            else    {
                                cadena = MiniLibrary.ListToString(com.subList(0,inicio-1)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                                
                            }
                        }
                        
                        
                    }
                    
                }
                else    {
                    
                    Z = String.valueOf(Math.pow(Double.parseDouble(comp2.get(0)),Double.parseDouble(pot)));
                    
                    cadena = MiniLibrary.ListToString(com.subList(0,inicio)) + " " + Z + " " + MiniLibrary.ListToString(com.subList(ind+2, com.size()));
                    
                
                }
                
                }else{
                    Z = String.valueOf(Math.pow(Double.parseDouble(com.get(ind-1)),Double.parseDouble(com.get(ind+1))));
                    
                    String cad1 = MiniLibrary.ListToString(com.subList(0,ind-1));
                    
                    String cad2 = MiniLibrary.ListToString(com.subList(ind+2, com2.size()));
                    
                    cadena = cad1 + " " + Z + " " + cad2;
                    
                } 
                count -= 1;
            }
            
            return cadena;
        }
       
            return cadena;
      
    }
}
