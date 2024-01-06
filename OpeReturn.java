package calculadora;

import java.util.ArrayList;
import java.util.Collections;

 
class Operacion1 {  
    String cadena,opera;
    String ff;
    

    public Operacion1(String opera, String cadena) {
        this.opera = opera;
        this.cadena = cadena;
    }

   
    
    public String Operaciones(){
        ArrayList<String> pri = MiniLibrary.split(cadena);
        int count = Collections.frequency(pri,opera);
        
        while(count > 0)    {
            int bus = pri.indexOf(opera);
            
            if ("sin".equals(opera)) {
                double Value = Operaciones.sin(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
                
            }
            else if ("cos".equals(opera)) {
                double Value = Operaciones.cos(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
                
            }
            else if ("tan".equals(opera)) {
                double Value = Operaciones.tan(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
                
            }
            else if ("asin".equals(opera)) {
                double Value = Operaciones.arcsin(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
                
            }
            else if ("acos".equals(opera)) {
                double Value = Operaciones.arccos(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
                
            }
            else if ("atan".equals(opera)) {
                double Value = Operaciones.arctan(pri.get(bus+1));
                String Value1 = Double.toString(Value);
                pri.remove(bus+1);
                pri.remove(bus);
                pri.add(bus,Value1);
            count -= 1;   
            
            
        }}
        
        ff = MiniLibrary.ArrayToString(pri);
        return ff;   
        
    }}
    
    
public class OpeReturn  {
    
    public  static String resuelve(String entrada)   {
        
        
        Operacion1 caden = new Operacion1("sin",entrada);
        String cadena1 = caden.Operaciones();        
        
        Operacion1 caden1 = new Operacion1("cos",cadena1);
        String cadena2 = caden1.Operaciones();
                
        Operacion1 caden2 = new Operacion1("tan",cadena2);
        String cadena3 = caden2.Operaciones();
        
        Operacion1 caden3 = new Operacion1("asin",cadena3);
        String cadena4 = caden3.Operaciones();
        
        Operacion1 caden4 = new Operacion1("acos",cadena4);
        String cadena5 = caden4.Operaciones();
        
        Operacion1 caden5 = new Operacion1("atan",cadena5);
        String cadena6 = caden5.Operaciones();
        
        
        return cadena6;
    }

    

    
   
}
