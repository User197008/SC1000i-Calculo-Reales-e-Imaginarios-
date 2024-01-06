package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jaime
 */
public class OrdenarReturn {
    
    public static String Ordenar(String cadena) { 
        String cadena1 = cadena.replace("<", "(");
        String cadena2 = cadena1.replace(">", ")");
        int conteo;
        String cadenafinal2 = null;
        conteo = MiniLibrary.countOccurrences(cadena2,'(');
        ArrayList<String> newLista = new ArrayList<>();
        while(conteo>0) {
            ArrayList<String> cadenaLista = MiniLibrary.split(cadena2);           
            int inicio = cadenaLista.indexOf("(");           
            int fin = cadenaLista.indexOf(")");           
            List<String> fragviejo = cadenaLista.subList(inicio,fin+1);           
            String FragviejoString = MiniLibrary.ListToString(fragviejo);
            if(MiniLibrary.OccurrencesString(FragviejoString, "i")==0){                
                List<String> fragviejo2 = fragviejo;
                fragviejo2.remove(0);
                fragviejo2.remove(fragviejo2.size()-1);                
                String fragviejo3 = MiniLibrary.ListToString(fragviejo2);
                String fragviejo4 = PRINCIPAL.calcula(fragviejo3);               
                cadenafinal2 = cadena.replace(FragviejoString,fragviejo4);               
                conteo -= 1;           
                
            }else{
            
            if(fragviejo.size()>5 && fragviejo.size()<7)  {
                String newfragviejo = MiniLibrary.ListToString(fragviejo);
                ArrayList<String> fragLista = MiniLibrary.split(newfragviejo);
                int ind = fragLista.indexOf("i");
                if(ind==2) {
                    if("+".equals(fragLista.get(3))) {
                        newLista.add("<");
                        newLista.add(fragLista.get(4));
                        newLista.add(fragLista.get(3));
                        newLista.add(fragLista.get(1));
                        newLista.add(fragLista.get(2));
                        newLista.add(">");    
                    }
                    else if("-".equals(fragLista.get(3)))  {
                        newLista.add("<");
                        newLista.add(String.valueOf(Float.parseFloat(fragLista.get(4)) * -1));
                        newLista.add("+");
                        newLista.add(fragLista.get(1));
                        newLista.add(fragLista.get(2));
                        newLista.add(">");
                    }
                }
                else {
                     newLista.add("<");
                     newLista.add(fragLista.get(1));
                     newLista.add(fragLista.get(2));
                     newLista.add(fragLista.get(3));
                     newLista.add(fragLista.get(4));
                     newLista.add(">");  
                }
                
                conteo -= 1;
                
           
                String Multi = MiniLibrary.ArrayToString(newLista);              
                cadena = cadena.replace(newfragviejo,Multi);               
                newLista.clear();
                String cadenafinal1 = cadena.replace("<", "(");
                cadenafinal2 = cadenafinal1.replace(">", ")");
                                   
            }
            else {
               
                String cadenafinal1A = cadena.replace("<", "(");
                String cadenafinal2A = cadenafinal1A.replace(">", ")");
                
                return cadenafinal2A;
            }   
        }
        }
        
        return cadenafinal2;   
    }
}
