package calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jaime
 */
public class MiniLibrary {
    
    public static ArrayList<String> split(String cadena)  {    
        List<String> myList = new ArrayList<>(Arrays.asList(cadena.split(" ")));    
        ArrayList<String> Lista = new ArrayList<>();
        for (int i=0;i<=myList.size()-1;i++) {
            String x = myList.get(i);
            if (!"".equals(x)) {
                Lista.add(x);
            } 
        }
        return Lista;
      
    }
    
    public static String ArrayToString(ArrayList<String>Lista)  {      
        String listString = "";
        String newString = "";
        for (String s : Lista){
        listString += s + " ";
        newString = listString.substring(0, listString.length()-1);
        }
        
        return newString; 
    }
    
    public static String ListToString(List<String>Lista)  { 
        String listString = "";
        String newString = "";
        for (String s : Lista){
        listString += s + " ";
        newString = listString.substring(0, listString.length()-1);
        }
        
        return newString; 
    }
    
    
    
    
    public static int countOccurrences(String cadena, char car)    {    
        int count = 0;
        for (int i=0; i < cadena.length(); i++)   {
            if (cadena.charAt(i) == car)   {
                count++;
            }
        }
        return count;
    }
    
    
    public static List<String> getWords(List<String> strSentences){     
        ArrayList<String> allWords = new ArrayList<>();
        Iterator<String> itrTemp = strSentences.iterator();
        while(itrTemp.hasNext()){
            String strTemp = itrTemp.next();
            allWords.addAll(Arrays.asList(strTemp.toLowerCase().split("\\s+")));
        }
        return allWords;
    }
    public static List<Integer> uniqueSinOrdenado(List<Integer> lista){     
        HashSet<Integer> hs = new HashSet<>();                              
        hs.addAll(lista);
        lista.clear();
        lista.addAll(hs);
        return lista;  
    }
    
    public static List<Integer> uniqueOrdenado(List<Integer> lista){        
        Set<Integer> s = new LinkedHashSet<>(lista);                       
        lista.clear();
        lista.addAll(s);
        return lista;
    }
    
    public static int OccurrencesString(String sTexto, String sTextoBuscado)    {  
        int contador = 0;                                                         
        
        while (sTexto.contains(sTextoBuscado)) {
            sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(),sTexto.length());
            contador++; 
        }
        return contador;
    }
    public static <T> List<List<T>> zip(List<T>... lists) {
        List<List<T>> zipped = new ArrayList<>();
        for (List<T> list : lists) {
            for (int i = 0, listSize = list.size(); i < listSize; i++) {
                List<T> list2;
                if (i >= zipped.size()) 
                    zipped.add(list2 = new ArrayList<>());
                
                else    
                    list2 = zipped.get(i);
                list2.add(list.get(i));
                
            }
        }
        return zipped;
    }

   

    
}
