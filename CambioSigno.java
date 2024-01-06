package calculadora;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Jaime
 */
public class CambioSigno {
    
    public static List<String>cambio(List<String>Lista)  {
        
        ListIterator<String> it = Lista.listIterator();
        while(it.hasNext()) {
            String x = it.next();
            if(x.equals("+")) {
                it.remove();
                it.add("-");       
            }
            else if(x.equals("-"))  {
                it.remove();
                it.add("+");  
            }
        }
        
        return Lista;
    }
    
    public static List<String>Signo(List<String>Lista1,int iniP, int finP)  {
        
        List<String> Lista2 = Lista1.subList(iniP, finP);
        
        if ("-".equals(Lista1.get(0))){
            List<String>part2 = cambio(Lista2);
            
            List<String>newpart2 = MiniLibrary.getWords(part2);
            
            int ins = finP + 1;
            
            for(String parte : newpart2){
                Lista1.add(ins,parte);
                ins += 1;
            }
            
            List<String>SubLista = Lista1.subList(iniP-1, finP+1);
            
            SubLista.clear();
            
            return Lista1;
            
        }
        else    {
            Lista1.remove("(");
            Lista1.remove(")");
            
            return Lista1;
        }
        
    }

    
    
    
}
