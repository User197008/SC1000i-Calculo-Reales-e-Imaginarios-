package calculadora;

/**
 *
 * @author jaime
 */
public class iii2Return {
    public static String iii (String cadena) {
        
        String cadena1 =  cadena.replace("( i +", "( 1 i +");
        
        String cadena2 = cadena1.replace("( i -", "( 1 i -");
        
        String cadena3 = cadena2.replace("+ i +", "+ 1 i +");
        
        String cadena4 = cadena3.replace("+ i -", "+ 1 i -");
        
        String cadena5 = cadena4.replace("- i -", "- 1 i -");
        
        String cadena6 = cadena5.replace("- i +", "- 1 i +");
        
        String cadena7 = cadena6.replace("+ i )", "+ 1 i )");
        
        String cadena8 = cadena7.replace("- i )", "- 1 i )");
        
        
        
        return cadena8;
        
    }  
}
