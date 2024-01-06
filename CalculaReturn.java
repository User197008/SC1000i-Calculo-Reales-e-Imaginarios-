package calculadora;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jaime
 */
public class CalculaReturn {
    public static String calcula (String cadena) {  
        ArrayList<String> elementos = MiniLibrary.split(cadena);
        
        while(Collections.frequency(elementos,"*")>0 || Collections.frequency(elementos,"/")>0 || Collections.frequency(elementos,"+")>0 || Collections.frequency(elementos,"-")>0) {
            
            for(int i=0;i<elementos.size();i++) {
                if("*".equals(elementos.get(i)))   {
                    elementos.add(i+2, String.valueOf(Float.parseFloat(elementos.get(i-1)) * Float.parseFloat(elementos.get(i+1))));
                    elementos.remove(i+1);
                    elementos.remove(i);
                    elementos.remove(i-1);
                    break;
                }
                else if("/".equals(elementos.get(i)))   {
                    elementos.add(i+2, String.valueOf(Float.parseFloat(elementos.get(i-1)) / Float.parseFloat(elementos.get(i+1))));
                    elementos.remove(i+1);
                    elementos.remove(i);
                    elementos.remove(i-1);
                    break; 
                }
            }
            
            if(Collections.frequency(elementos,"/")==0 && Collections.frequency(elementos,"*")==0)  {
                while(Collections.frequency(elementos,"+")>0 || Collections.frequency(elementos,"-")>0) {
                    for(int i=0;i<elementos.size();i++) {
                        
                        if("+".equals(elementos.get(i)))   {
                            
                            elementos.add(i+2, String.valueOf(Float.parseFloat(elementos.get(i-1)) + Float.parseFloat(elementos.get(i+1))));
                            elementos.remove(i+1);
                            elementos.remove(i);
                            elementos.remove(i-1);
                            break;
                        }
                        else if("-".equals(elementos.get(i)))   {
                            
                            elementos.add(i+2, String.valueOf(Float.parseFloat(elementos.get(i-1)) - Float.parseFloat(elementos.get(i+1))));
                            elementos.remove(i+1);
                            elementos.remove(i);
                            elementos.remove(i-1);
                            break; 
                        }
                    }
                }
            }
        }
        
        return elementos.get(0);
    }
}
