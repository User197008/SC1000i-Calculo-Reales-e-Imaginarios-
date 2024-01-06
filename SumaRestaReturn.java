package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class SumaRestaReturn {
    
    
    
    
  
    public static String SumaResta (String cadena) {

        cadena = iiiReturn.iii(cadena);
        ArrayList<String> elementos = MiniLibrary.split(cadena);
        
        int pa = Collections.frequency(elementos,"(");
        
        while(pa > 0)   {
            int ini = elementos.indexOf("(")+1;
            
            int fin = elementos.indexOf(")");
            
            if(ini==1)  {
                elementos.remove(ini-1);
                elementos.remove(fin-1);

            }
            else if(ini>1)  {
                List<String> part = elementos.subList(ini, fin);
                
                if("-".equals(elementos.get(ini-2)))    {
                    List<String> part2 = CambioSigno.cambio(part);
                    

                    List<String> newpart2 = MiniLibrary.getWords(part2);

                    int ins = fin+1;
                    for (String parte : newpart2) {
                        elementos.add(ins, parte);
                        ins += 1;
                    }
                    List<String> SubLista = elementos.subList(ini-1, fin+1);
                    SubLista.clear();

                }
                else if("+".equals(elementos.get(ini-2)))    {
                    elementos.remove(ini-1);
                    elementos.remove(fin-1);
                }

            }
            pa -= 1;
            
        }
        if(Collections.frequency(elementos,"+")>0 || Collections.frequency(elementos,"-")>0)        {
            int counti = Collections.frequency(elementos,"i");
            
            ArrayList<String> imaginarios = new ArrayList<>();
            while (counti > 0)  {
                int ind = elementos.indexOf("i");
                if(ind==1 && "-".equals(elementos.get(0))) {
                    imaginarios.add("-1");
                    elementos.remove(0);
                    elementos.remove(0);
                }
                else if(ind==1) {
                    imaginarios.add(elementos.get(ind-1));
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                }
                else if(ind==0) {
                    imaginarios.add("1");
                    elementos.remove(ind);
                }
                else    {
                    imaginarios.add(elementos.get(ind-2));
                    imaginarios.add(elementos.get(ind-1));
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                }
                counti -= 1;
            }
            ArrayList<String> reales = new ArrayList<>();
            for(String part:elementos) {
                reales.add(part);
                
            }
            
            if(imaginarios.size()>0)    {
                if("-".equals(imaginarios.get(0)))  {
                    String negaIma = String.valueOf(Double.parseDouble(imaginarios.get(1))*-1);
                    imaginarios.add(2, negaIma);
                    imaginarios.remove(0);
                    imaginarios.remove(0);
                }
                else if("+".equals(imaginarios.get(0))) {
                    imaginarios.remove(0);
                }
                
            }
            else    {
                imaginarios.add("0");
            }
            if(reales.size()>0)    {
                if("-".equals(reales.get(0)))  {
                    String negaReales = String.valueOf(Double.parseDouble(reales.get(1))*-1);
                    reales.add(2, negaReales);
                    reales.remove(0);
                    reales.remove(0);
                }
                else if("+".equals(reales.get(0))) {
                    reales.remove(0);
                }

            }
            else    {
                reales.add("0");
            }
            String SImaginarios = "";
            for(String part:imaginarios)    {
                SImaginarios += part+" ";
            }
            
            String SReales = "";
            for(String part:reales)    {
                SReales += part+" ";
            }
            
            String IMAGI = CalculaReturn.calcula(SImaginarios);
            

            String REALES = CalculaReturn.calcula(SReales);
            
            if(Double.parseDouble(IMAGI) == 0)  {
                
                return REALES;

            }
            else if(Double.parseDouble(REALES) == 0)  {
                String NC = IMAGI + " " + "i"; 
                
                return NC;
            }
            else    {
                if(Double.parseDouble(IMAGI)<0)   {
                    IMAGI = String.valueOf(Double.parseDouble(IMAGI)*-1);
                    IMAGI = "-" + " " + IMAGI;
                }
                else if(Double.parseDouble(IMAGI)>0)  {
                    IMAGI = "+" + " " + IMAGI;
                }
                String NC = REALES + " " + IMAGI + " " + "i";
                
                return NC;
            }
        }
        else    {
            
            return cadena;
        }
    }
    
    
}
