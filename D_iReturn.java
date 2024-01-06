package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class D_iReturn {
    public static String D_i (String cadena) {  
        
        ArrayList<String> elementos = MiniLibrary.split(cadena);
        
        int countx = MiniLibrary.countOccurrences(cadena,'/');
        
        ArrayList<String> NumIma = new ArrayList<>();
        if(!"0".equals(countx))  {
            int ind = elementos.indexOf("/");
            
            if(ind == 1 && elementos.size() == 3)   {
                NumIma.add("0");
                NumIma.add("0");
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add("0");
            }
            else if(ind == 1)   {
                NumIma.add("0");
                NumIma.add("0");
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add(elementos.get(ind+2));
            }
            else if(ind == 2 && elementos.size() == 4)  {
                NumIma.add("0");
                NumIma.add(elementos.get(ind-2));
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add("0");
            }
            else if(ind == 2)   {
                NumIma.add("0");
                NumIma.add(elementos.get(ind-2));
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add(elementos.get(ind+2));
            }
            else if(ind >= 3 && ind <= elementos.size()-3)  {
                NumIma.add(elementos.get(ind-3));
                NumIma.add(elementos.get(ind-2));
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add(elementos.get(ind+2));
            }
            else if(ind == elementos.size()-2)  {
                NumIma.add(elementos.get(ind-3));
                NumIma.add(elementos.get(ind-2));
                NumIma.add(elementos.get(ind-1));
                NumIma.add(elementos.get(ind));
                NumIma.add(elementos.get(ind+1));
                NumIma.add("0");
            }
            
            if(!"i".equals(NumIma.get(2)) && !"i".equals(NumIma.get(4)) && !"i".equals(NumIma.get(5)))  {  
                if("-".equals(NumIma.get(1)))   {  
                    elementos.add(ind+2,"-");
                    elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))));
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);      
                }
                else if("+".equals(NumIma.get(1)))  {   
                    elementos.add(ind+2,"+");
                    elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))));
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);  
                }
                else    {   
                    elementos.add(ind+2, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))));
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                }
            }
            else    {
                if("i".equals(NumIma.get(2)) && "i".equals(NumIma.get(5)))  {   
                    if("-".equals(NumIma.get(0)))   {   
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                        elementos.remove(ind-3); 
                    }
                    else if("+".equals(NumIma.get(0)))  {   
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                        elementos.remove(ind-3); 
                    }
                    else if("0".equals(NumIma.get(0)) && !"0".equals(NumIma.get(1)) && !"-".equals(NumIma.get(1)) && !"+".equals(NumIma.get(1)))    {   
                        elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("0".equals(NumIma.get(0)) && "0".equals(NumIma.get(1))) {   
                        elementos.add(ind+3, String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                    }
                    else if("0".equals(NumIma.get(0)) && "-".equals(NumIma.get(1))) {  
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4,String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                    }
                    else if("0".equals(NumIma.get(0)) && "+".equals(NumIma.get(1))) {   
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4,String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                }
                else if("i".equals(NumIma.get(2)) && "i".equals(NumIma.get(4))) {  
                    if("-".equals(NumIma.get(0)))   {  
                        elementos.add(ind+2,"-");
                        elementos.add(ind+3,NumIma.get(1));
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3); 
                    }
                    else if("+".equals(NumIma.get(0)))   {   
                        elementos.add(ind+2,"+");
                        elementos.add(ind+3,NumIma.get(1));
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3); 
                    }
                    else if("0".equals(NumIma.get(0)) && !"0".equals(NumIma.get(1)) && !"-".equals(NumIma.get(1)) && !"+".equals(NumIma.get(1)))    {   
                        elementos.add(ind+2, NumIma.get(1));
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("0".equals(NumIma.get(0)) && "-".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,"-");
                        elementos.add(ind+3,"1");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                    }
                    else if("0".equals(NumIma.get(0)) && "+".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,"+");
                        elementos.add(ind+3,"1");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                    }
                    else if("0".equals(NumIma.get(0)) && "0".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,"1");    
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);      
                    }    
                }
                else if(!"i".equals(NumIma.get(4)) && !"i".equals(NumIma.get(5))) {   
                    if("-".equals(NumIma.get(0)))   {   
                        elementos.add(ind+2,"-");
                        elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                        elementos.remove(ind-3); 
                    }
                    else if("+".equals(NumIma.get(0)))   {   
                        elementos.add(ind+2,"+");
                        elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                        elementos.remove(ind-3); 
                    }
                    else if("0".equals(NumIma.get(0)) && !"0".equals(NumIma.get(1)) && !"-".equals(NumIma.get(1)) && !"+".equals(NumIma.get(1)))    {   
                        elementos.add(ind+2, String.valueOf(Float.parseFloat(NumIma.get(1)) / Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+3,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("0".equals(NumIma.get(0)) && "-".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,"-");
                        elementos.add(ind+3,String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                    }
                    else if("0".equals(NumIma.get(0)) && "+".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,"+");
                        elementos.add(ind+3,String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                    }
                    else if("0".equals(NumIma.get(0)) && "0".equals(NumIma.get(1))) {   
                        elementos.add(ind+2,String.valueOf(1/Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+3,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                    }
                }
                else if(!"i".equals(NumIma.get(2)) && !"i".equals(NumIma.get(4))) {   
                    if("-".equals(NumIma.get(1)))   {   
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+5,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("+".equals(NumIma.get(1)))   {   
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))));
                        elementos.add(ind+5,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("0".equals(NumIma.get(0)) && "0".equals(NumIma.get(1))) {   
                        elementos.add(ind+3, String.valueOf(Float.parseFloat(NumIma.get(2)) / Float.parseFloat(NumIma.get(4))*-1));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                    }
                }
                else if(!"i".equals(NumIma.get(2)) && !"i".equals(NumIma.get(5))) {   
                    if("-".equals(NumIma.get(1)))   {  
                        elementos.add(ind+2,"+");
                        elementos.add(ind+3,NumIma.get(2));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("+".equals(NumIma.get(1)))   {  
                        elementos.add(ind+2,"-");
                        elementos.add(ind+3,NumIma.get(2));
                        elementos.add(ind+4,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2); 
                    }
                    else if("0".equals(NumIma.get(1)))   {   
                        elementos.add(ind+2,String.valueOf(Float.parseFloat(NumIma.get(2))*-1));
                        elementos.add(ind+3,"i");
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                    }
                }
            }
            
            return MiniLibrary.ArrayToString(elementos);
            
        }
        else    {
            
            return cadena;
        }
    }
}
