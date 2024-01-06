package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class MUL1Return {
    public static String MUL1 (String cadena) {          
        int count = MiniLibrary.countOccurrences(cadena, '*');
        
        
        while (count > 0)   {
            ArrayList<String> cadenaLista = MiniLibrary.split(cadena);
            
            cadenaLista.add("$");
            cadenaLista.add("$");            
            int INDEX = cadenaLista.indexOf("*");
            
            
            if(cadenaLista.size()-1-INDEX>1){
            
            }
            
            if(cadenaLista.size()-1-INDEX>2){
            
            }
           
         
            
            ArrayList<String> cadenaLista2 = MiniLibrary.split(cadena);
            
            
            if(")".equals(cadenaLista.get(INDEX-1)))    {    
                if("(".equals(cadenaLista.get(INDEX+1))) {  
                    int inicio;
                    if(INDEX-6 != 0)    {   
                         
                        if(!"(".equals(cadenaLista.get(INDEX-7)))    {   
                            List<String> SubLista = cadenaLista2.subList(0, INDEX);
                            ArrayList<Integer> po = new ArrayList<>();
                           
                                                       
                            ListIterator<String> it = SubLista.listIterator();
                            while(it.hasNext()) {
                                String x = it.next();
                                if(x.equals("(")) {
                                    po.add(cadenaLista2.indexOf(x));
                                   
                                    it.remove();
                                    it.add("<");  
                                    
                                }    
                            }
                            
                            
                            inicio = Collections.max(po);   
                        }
                        else       {    
                            List<String> SubLista = cadenaLista2.subList(0, INDEX);
                            ArrayList<Integer> po = new ArrayList<>();
                            
                            
                            ListIterator<String> it = SubLista.listIterator();
                            while(it.hasNext()) {
                                String x = it.next();
                                if(x.equals("(")) {
                                    po.add(cadenaLista2.indexOf(x));
                                    
                                    it.remove();
                                    it.add("<");  
                                   
                                }
                            }
                           
                            inicio = Collections.max(po);  
                        }
                    }
                    else    {  
                        inicio = 0;
                        
                    }
                    
                   
                    int fin = INDEX + cadenaLista.subList(INDEX+1, INDEX+7).indexOf(")");
                    
                    List<String> viejoLista = cadenaLista.subList(inicio, fin+2);
                    
                    String viejop = MiniLibrary.ListToString(viejoLista);
                    String viejo = viejop.replace("$", "");
                    
                    String nuevo = M3Return.M3(viejo);
                    
                    List<String>cadena1 =cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                    
                    List<String>cadena2 = cadenaLista.subList(fin+2, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                    
                    String cadena$ = cad1 + nuevo + cad2 ;
                    cadena = cadena$.replace("$", "");
                    
                }
                else    {  
                    int inicio = 0;
                    int fin;
                    if(INDEX-6 != 0)    { 
                        List<String> SubLista = cadenaLista2.subList(0, INDEX);
                        ArrayList<Integer> po = new ArrayList<>();
                        ListIterator<String> it = SubLista.listIterator();
                        while(it.hasNext()) {
                            String x = it.next();
                            if(x.equals("(")) {
                                po.add(cadenaLista2.indexOf(x));
                                
                                it.remove();
                                it.add("<");  
                                
                            }
                        }
                        
                        int subinicio = Collections.max(po);
                        
                        if("(".equals(cadenaLista.get(subinicio)))  {
                            inicio = Collections.max(po);
                        }
                        else    {
                            inicio = subinicio;
                        }
                        
                    }
                    else    {
                        if("(".equals(cadenaLista.get(0)))  {  
                            if("(".equals(cadenaLista.get(1)))  {    
                                inicio = 1;
                            }
                            else    {  
                                inicio = 0;
                                
                            }
                        }
                    }
                    
                    List<String> Subcade = cadenaLista.subList(INDEX+2, cadenaLista.size());
                    String Subcadena = MiniLibrary.ListToString(Subcade);
                    if((MiniLibrary.countOccurrences(Subcadena,'+') != 0))   {
                        if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            ArrayList<Integer> ff = new ArrayList<>();
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            }
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            }
                            
                            fin = INDEX + Collections.min(ff);
                           
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                           
                        }
                    }
                    else    {
                        if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                            
                        }
                        else    {
                            fin = cadenaLista.size();
                            
                        }
                        
                    }
                    List<String> vie2 = cadenaLista.subList(inicio, fin);
                    
                    String viejop = MiniLibrary.ListToString(vie2);
                    String viejo2 = viejop.replace("$", "");
                   
                    String nuevo2 = M2Return.M2(viejo2);
                   
                    List<String> cadena1 = cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                    
                    List<String>cadena2 = cadenaLista.subList(fin, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                   
                    String cadena$ = cad1 + nuevo2 + cad2 ;
                    cadena = cadena$.replace("$", "");
                    
                }
                
            }
            else if(!")".equals(cadenaLista.get(INDEX-1)))   {               
                if("(".equals(cadenaLista.get(INDEX+1)))    {  
                   
                    int inicio = 0;
                    if(INDEX > 3)   {
                        List<String> Subcadena = cadenaLista.subList(INDEX-4,INDEX);
                        if(Collections.frequency(Subcadena,"+")>0)  {
                            inicio = INDEX + Subcadena.indexOf("+")-4;
                           
                        }
                        else if(Collections.frequency(Subcadena,"-")>0) {
                            inicio = INDEX + Subcadena.indexOf("-")-4;
                           
                        }
                    }
                    else    {
                        inicio = 0;
                    }
                    int fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf(")") + 1;
                    
                    List<String> vie3 = cadenaLista.subList(inicio, fin);
                    
                    String viejop = MiniLibrary.ListToString(vie3);
                    String viejo3 = viejop.replace("$", "");
                    
                    String Nuevo3 = M1Return.M1(viejo3);
                    
                    List<String> cadena1 = cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                    
                    List<String>cadena2 = cadenaLista.subList(fin, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                    
                    String cadena$ = cad1 + Nuevo3 + cad2 ;
                    cadena = cadena$.replace("$", "");
                    
                }
                
                else if(!"(".equals(cadenaLista.get(INDEX+1))&& "i".equals(cadenaLista.get(INDEX+2)) && "i".equals(cadenaLista.get(INDEX-1))) 
                      {   // - 2 i * 3 i
                    int inicio = 0;
                    int fin = 0;
                    if(INDEX>3) {
                        List<String> Subcadena = cadenaLista.subList(INDEX-4,INDEX);
                        if(Collections.frequency(Subcadena,"+")>0)  {
                            inicio = INDEX + Subcadena.indexOf("+")-3;
                            
                        }
                        else if(Collections.frequency(Subcadena,"-")>0) {
                            inicio = INDEX + Subcadena.indexOf("-")-3;
                            
                        }
                    }
                    else    {
                        inicio = 0;
                    }
                    
                    List<String> Subcade = cadenaLista.subList(INDEX+2, cadenaLista.size());
                    String Subcadena = MiniLibrary.ListToString(Subcade);
                    if((MiniLibrary.countOccurrences(Subcadena,'+') != 0))   {
                        if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            ArrayList<Integer> ff = new ArrayList<>();
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            }
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            }
                            
                            fin = INDEX + Collections.min(ff);
                            
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                           
                        }
                    }
                    else if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                            
                   }
                    else if(cadenaLista.size()-1-INDEX>3){
                        
                        if  ( "*".equals(cadenaLista.get(INDEX+3)) || "/".equals(cadenaLista.get(INDEX+3))){
                             fin = INDEX+3;
                            
                        }
                        else    {
                            fin = cadenaLista.size();
                           
                        }                       
                    }
                        else    {
                            fin = cadenaLista.size();
                           
                        }
                    
                    
                    
                    List<String> vie4 = cadenaLista.subList(inicio, fin);
                    
                    String viejop = MiniLibrary.ListToString(vie4);
                    String viejo4 = viejop.replace("$", "");
                    
                    String nuevo4 = M_iReturn.M_i(viejo4);
                    
                    List<String> cadena1 = cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                    
                    List<String>cadena2 = cadenaLista.subList(fin, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                    
                    String cadena$ = cad1 + nuevo4 + cad2 ;
                    cadena = cadena$.replace("$", "");
                   
                    
                        
                         
                }
                else if(!"(".equals(cadenaLista.get(INDEX+1)) && "i".equals(cadenaLista.get(INDEX+2))){  
                    int inicio = 0;
                    int fin = 0;
                    if(INDEX>2){
                        List<String> Subcadena = cadenaLista.subList(INDEX-3,INDEX);
                        
                        if(Collections.frequency(Subcadena,"+")>0)  {
                            inicio = INDEX + Subcadena.indexOf("+")-2;
                            
                        }
                        else if(Collections.frequency(Subcadena,"-")>0) {
                            inicio = INDEX + Subcadena.indexOf("-")-2;
                            
                        }
                    }else    {
                        inicio = 0;
                    }
                    
                    List<String> Subcade = cadenaLista.subList(INDEX+2, cadenaLista.size());
                    String Subcadena = MiniLibrary.ListToString(Subcade);
                    
                    if((MiniLibrary.countOccurrences(Subcadena,'+') != 0))   {   
                        if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            ArrayList<Integer> ff = new ArrayList<>();
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            }
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            }
                            
                            
                            fin = INDEX + Collections.min(ff);
                           
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                            
                        }
                   }else if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                            
                   }else if("*".equals(cadenaLista.get(INDEX+3)) || "/".equals(cadenaLista.get(INDEX+3))){
                             fin = INDEX+3;
                            
                        }
                        else    {
                            fin = cadenaLista.size();
                           
                        }
                        
                      
                    
                    List<String> vie5 = cadenaLista.subList(inicio, fin);
                    
                    List<String> cadena1 = cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                    
                    List<String>cadena2 = cadenaLista.subList(fin, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                    
                    String viejop = MiniLibrary.ListToString(vie5);
                    String viejo5 = viejop.replace("$", "");
                    
                    String nuevo5 = M_iReturn.M_i(viejo5);
                    
                    String cadena$ = cad1 + nuevo5 + cad2 ;
                    cadena = cadena$.replace("$", "");
                    
                        
                    
                }else if(!"(".equals(cadenaLista.get(INDEX+1)) && "i".equals(cadenaLista.get(INDEX-1)))
                { 
                    
                   int inicio = 0;
                    int fin = 0;
                    if(INDEX>2){
                        List<String> Subcadena = cadenaLista.subList(INDEX-4,INDEX);
                        
                        if(Collections.frequency(Subcadena,"+")>0)  {
                            inicio = INDEX + Subcadena.indexOf("+")-3;
                            
                        }
                        else if(Collections.frequency(Subcadena,"-")>0) {
                            inicio = INDEX + Subcadena.indexOf("-")-3;
                            
                        }
                    }else    {
                        inicio = 0;
                    }
                    
                    List<String> Subcade = cadenaLista.subList(INDEX+2, cadenaLista.size());
                    String Subcadena = MiniLibrary.ListToString(Subcade);
                    
                    if((MiniLibrary.countOccurrences(Subcadena,'+') != 0))   {   /////////////////////////////******************************************
                        if((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            ArrayList<Integer> ff = new ArrayList<>();
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            }
                            if(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-")!=-1){
                                 ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            }
                            
                            
                            fin = INDEX + Collections.min(ff);
                            
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                            
                        }
                    }
                    else  if ((MiniLibrary.countOccurrences(Subcadena,'-') != 0))  {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                            
                        }else if(cadenaLista.size()-1-INDEX>1){
                        
                        if("*".equals(cadenaLista.get(INDEX+2)) || "/".equals(cadenaLista.get(INDEX+2))){
                             fin = INDEX+2;
                             
                        }
                        else    {
                            fin = cadenaLista.size();
                            
                            }
                        
                        }
                        else    {
                            fin = cadenaLista.size();
                           
                        }
                    
                    List<String> vie6 = cadenaLista.subList(inicio, fin);
                    
                    List<String> cadena1 = cadenaLista.subList(0, inicio);
                    String cad1 = MiniLibrary.ListToString(cadena1) + " ";
                   
                    List<String>cadena2 = cadenaLista.subList(fin, cadenaLista.size());
                    String cad2 = " " + MiniLibrary.ListToString(cadena2);
                    
                    String viejop = MiniLibrary.ListToString(vie6);
                    String viejo6 = viejop.replace("$", "");
                    
                    String nuevo6 = M_iReturn.M_i(viejo6);
                    
                    String cadena$ = cad1 + nuevo6 + cad2 ;
                    cadena = cadena$.replace("$", "");
                    
                        
                }
            }
            count -= 1;
    }
        return cadena;
    }
}
