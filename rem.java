package calculadora;

import java.util.ArrayList;
import java.util.List;
import calculadora.CambioSigno;
import calculadora.MiniLibrary;
import static calculadora.PRINCIPAL.calcula;
import static calculadora.PRINCIPAL.fin;
import static calculadora.PRINCIPAL.inicio;
import static calculadora.SumaRestaReturn.SumaResta;

/**
 *
 * @author RYZEN
 */
public class rem {
    
    public static String rem(String cadena){
        
        String cadena2 = "0 + " + cadena;
        String nuevo3 = "";
        String nuevo4 = "";
        ArrayList<String> cadena1 = MiniLibrary.split(cadena2);
        
        cadena = MiniLibrary.ArrayToString(cadena1);
        
        int contInicio = MiniLibrary.OccurrencesString(cadena, " ( ");
        
        if (contInicio > 0) {
            ArrayList<String> viejosignosplit = null;
            ArrayList<String> nuevosplit = null;
            //*****************************************************************************************
            while (contInicio > 0) {
                if (!cadena.substring(inicio(cadena), fin(cadena)).contains("<")) {
                    
                    String viejosigno = cadena.substring(inicio(cadena)-2 , fin(cadena));
                   
                    viejosignosplit = MiniLibrary.split(viejosigno);
                    
                    String viejo = cadena.substring(inicio(cadena), fin(cadena));
                    
                    String viejo1 = viejo.replace("(", "");
                    
                    String viejo2 = viejo1.replace(")", "");
                    
                    String nuevo = calcula(viejo2);
                    
                    nuevosplit = MiniLibrary.split(nuevo);
                    
                    String nuevo2 = MiniLibrary.ArrayToString(nuevosplit);
                    
                    if(nuevosplit.size() > 2 && nuevo2.contains("i")){
                        nuevo3 = "( " +nuevo2.substring(0, nuevo2.length()) + " )";
                    }else{
                        nuevo3 = nuevo2.substring(0, nuevo2.length());
                    }
                    
                    
                    if (MiniLibrary.countOccurrences(nuevo3, 'i') == 1 || nuevo3.length() == 2) {
                        
                      
                        if ("-".equals(viejosignosplit.get(0)) || "+".equals(viejosignosplit.get(0)) || "(".equals(viejosignosplit.get(0))){  ///modi2    adicion de  || "(".equals(viejosignosplit.get(0))
                            String cadenaviejo = viejosignosplit.get(0) + " " + "(" + " " + nuevo3 + " " + ")";
                            ArrayList<String> cadenaviejosplit = MiniLibrary.split(cadenaviejo);
                            
                            int iniP = cadenaviejosplit.indexOf("(") + 1;
                            
                            int finP = cadenaviejosplit.indexOf(")");
                            
                            List<String> nuevo4split = CambioSigno.Signo(cadenaviejosplit, iniP, finP);
                            
                            
                            nuevo4 = MiniLibrary.ListToString(nuevo4split);
                            
                            nuevo4 = nuevo4.substring(1,nuevo4.length());
                            
                            
                            
                        }
                        
                    } else {
                        nuevo4 = nuevo3;
                        
                    }
                    
                    if (cadena.contains("(") && MiniLibrary.countOccurrences(cadena,'(') == 1){            
                    
                        int IN = cadena.indexOf("(")+2;                                                     
                                                               
                        int FI = cadena.indexOf(")")-1;                                                     
                                                               
                        String subcadenaF = cadena.substring(IN, FI);                                      
                                                 
                        String www = SumaResta(subcadenaF);                                                 
                                                                
                        cadena = cadena.replace(subcadenaF,www);                                            ////////  modi2
                                                        ////////  modi2
                    }                                                                                       ////////   modi2
                    else{                                                                                   ///////   modi2
                        
                        cadena = cadena;                                                                    
                    }                                                                                      
                    
                    
                    
                    
                    contInicio -= 1;
                    

                }
                
            }
            cadena = cadena.replace("<", "(").replace(">", ")");
            return cadena; //...............cambio mod2
          //**********************************************************************************************  
        }
        
        return cadena;
    }
}

        
   
