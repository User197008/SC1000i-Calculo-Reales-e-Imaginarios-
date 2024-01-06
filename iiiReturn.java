package calculadora;

/**
 *
 * @author jaime
 */
public class iiiReturn {
    public static String iii (String cadena) {
        
        String cadena1 = cadena.replace("+ i", " 1 i");
        
        String cadena2 = cadena1.replace("- i", "- 1 i");
        
        String cadena3 = cadena2.replace("( i", "( 1 i");
        
        return cadena3;
        
    }  
}
