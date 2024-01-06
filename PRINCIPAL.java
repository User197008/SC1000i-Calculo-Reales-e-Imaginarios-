package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author jaime
 */
public class PRINCIPAL {

    public static String calcula(String cadena) {
        String var0 = PotenciaComplejo2Return.Potencia2R(cadena);       
        String var0a = iii2Return.iii(var0);       
        String var1 = RaizComplejo1Return.RC1(var0a);       
        String var2 = OpeReturn.resuelve(var1);       
        String var3 = MUL2Return.MUL2(var2);       
        String var4 = DIV2Return.DIV2(var3);       
        String var5 = SumaRestaReturn.SumaResta(var4);
        return var5;

    }

    public static int fin(String cadena) {
        int fin = cadena.indexOf(")") + 1;
        return fin;
    }

    public static int inicio(String cadena) {
        ArrayList<Integer> inicios = new ArrayList<>();
        int count = 0;
        inicios.add(cadena.indexOf("("));
        while (count != -1) {
            int pp = cadena.indexOf("(", count + 1);
            if (pp != -1) {
                inicios.add(pp);
            }
            count = pp;
        }
        List<Integer> new_inicios = MiniLibrary.uniqueSinOrdenado(inicios);
        ArrayList<Integer> kk = new ArrayList<>();
        for (Integer y : new_inicios) {
            if (y < fin(cadena)) {
                kk.add(y);
            }
        }
        Integer inicio = Collections.max(kk);
        
        return inicio;
    }

   

    public static String rem2(String cadena) {
        ArrayList<String> cadena1 = MiniLibrary.split(cadena);
        cadena = MiniLibrary.ArrayToString(cadena1);
       
        int contInicio = MiniLibrary.OccurrencesString(cadena, " ( ");

        String resultado = null;
        if (contInicio > 0) {
            ArrayList<String> nuevosplit = null;
            while (contInicio > 0) {

                if (inicio(cadena) != -1 && inicio(cadena) != 0) {
                    if (!cadena.substring(inicio(cadena), fin(cadena)).contains("<")) {
                        String viejo = cadena.substring(inicio(cadena), fin(cadena));                       
                        String signo = String.valueOf(cadena.charAt(inicio(cadena) - 2));                       
                        String viejo1 = viejo.replace("(", "");                       
                        String viejo2 = viejo1.replace(")", "");                       
                        String nuevo = calcula(viejo2);                        
                        nuevosplit = MiniLibrary.split(nuevo);    
                        String nuevo2 = MiniLibrary.ArrayToString(nuevosplit) + " ";
                        
                        String nuevo3;
                        if (nuevosplit.size() >= 4) {
                            if (cadena.charAt(inicio(cadena) - 1) == '*' || cadena.charAt(inicio(cadena) - 1) == '/' || cadena.charAt(inicio(cadena) + 1) == '*' || cadena.charAt(inicio(cadena) + 1) == '/') {
                                nuevo3 = "(" + nuevo2.substring(0, nuevo2.length() - 1) + ")";
                                
                            } else if (cadena.charAt(inicio(cadena) - 2) == '√') {
                                nuevo3 = "(" + nuevo2.substring(0, nuevo2.length() - 1) + ")";
                                
                            } else {
                                nuevo3 = "(" + " " + nuevo2.substring(0, nuevo2.length() - 1) + " " + ")";          //////////modi2
                                
                            }
                        } else {
                            nuevo3 = nuevo2.substring(0, nuevo2.length() - 1);
                            
                        }
                        cadena = cadena.replace(viejo, nuevo3);
                        
                        resultado = calcula(cadena);
                        
                    }
                } else {
                    resultado = calcula(cadena);
                    
                }
                contInicio -= 1;
            }
        } else {
            resultado = calcula(cadena);
            
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        String cadena;
       
        //cadena = "( 2 - 3 i ) * ( 3 - 4 i )"; // -6.0 - 17.0 i
        //cadena = "( 8 + 3 - 8 / 2 ) / ( 8 + 2 - 4 * 2 )"; // 3.5
        //cadena = "sin ( ( 9 + 3 * ( 8 * 4 - 8 / 2 ) * 5 + 54 ) + 8 )"; // 0.7547095802227723
        //cadena = "4 - ( 3.0 + 4.0 i ) + 3 i"; // 1.0 - 1.0 i // 
        //cadena = "4 * ( ( 3.0 + 4.0 i ) + 3 i )"; // 12.0 + 28.0 i
        //cadena = "4 * ( 3 + 4 i + 3 i )"; //  12 + 28 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i * 3 i + ( 12 + 4 i ) * 2 i ) * 2 i + 15 - 2 i * ( 3 + 2 i ) + ( 3 i - 6 ) * ( 2 - 4 i ) )"; // -29.0 - 36.0 i
        //cadena = "4 + ( ( -8.0 + 2.0 i ) * 2 i + 15 - 2 i * ( 3 + 2 i ) - ( 3 i - 6 ) * ( 2 - 4 i ) )"; // 19.0 - 52.0 i
        //cadena = "4 - ( -8.0 + 2.0 i ) * - 2 i + 3 i"; // -13.0 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i * 3 i + ( 12 + 4 i ) * 2 i ) ^ 2 + 15 - 2 i * ( 3 + 2 i ) + ( 3 i - 6 ) * ( 2 - 4 i ) )"; // 247.0 - 1536.0001 i
        //cadena = "2 i * ( 3 + 2 i )"; // -4.0 + 6.0 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i / 3 i + ( 12 + 4 i ) / 2 i ) ^ 2 + 15 - 2 i / ( 3 + 2 i ) + ( 3 i - 6 ) / ( 2 - 4 i ) ) + 2"; // 14.607541 + 25.305887 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i * 3 i + ( 12 + 4 i ) * 2 i ) ^ 2 + 15 - 2 i * ( 3 + 2 i ) + ( 3 i - 6 ) * ( 2 - 4 i ) ) + 2"; // 249 - 1536 i
        //cadena = "( 4 + 3 i - 5 i * 3 * ( ( 3 + 2 i ) / 2 i ) )"; // -18.5 - 12.0 i
        //cadena = "( ( ( 4 + 3 i ) * -2 i + 7 i * 2 ) / 2 i ) * 3"; // 9.0 - 9.0 i
        //cadena = "( 2 - 3 i ) * ( 3 - 4 i )"; // -6.0 - 17.0 i
        //cadena = "( 8 + 3 - 8 / 2 ) / ( 8 + 2 - 4 * 2 )"; // 3.5
        //cadena = "sin ( ( 9 + 3 * ( 8 * 4 - 8 / 2 ) * 5 + 54 ) + 8 )"; // 0.7547095802227723 
        //cadena = "4 - ( 3.0 + 4.0 i ) + 3 i"; // 1.0 -1.0 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i * 3 i + ( 12 + 4 i ) * 2 i ) * 2 i + 15 - 2 i * ( 3 + 2 i ) + ( 3 i - 6 ) * ( 2 - 4 i ) )";  // -29.0 - 36.0 i
        //cadena = "4 + ( ( -8.0 + 2.0 i ) * 2 i + 15 - 2 i * ( 3 + 2 i ) - ( 3 i - 6 ) * ( 2 - 4 i ) )"; // 19.0 - 52.0 i
        //cadena = "4 - ( -8.0 + 2.0 i ) * - 2 i + 3 i"; // -13.0 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i * 3 i + ( 12 + 4 i ) * 2 i ) ^ 2 + 15 - 2 i * ( 3 + 2 i ) + ( 3 i - 6 ) * ( 2 - 4 i ) )";  // 247.0 - 1536.0001 i
        //cadena = "2 i * ( 3 + 2 i )"; // -4.0 + 6.0 i
        //cadena = "4 + ( ( 2 i - 7 + 5 i / 3 i + ( 12 + 4 i ) / 2 i ) ^ 2 + 15 - 2 i / ( 3 + 2 i ) + ( 3 i - 6 ) / ( 2 - 4 i ) ) + 2"; // 14.607541 + 25.305887 i 
        cadena = "sin 45 + ( cos 45 i + 3 ) * 2 i"; // -0.70710677 + 6.0 i
        //cadena = "( 4 + 3 i - 5 i * 3 * ( ( 3 + 2 i ) / 2 i ) )"; // -18.5 - 12.0 i
        //cadena = "( ( ( 4 + 3 i ) * -2 i + 7 i * 2 ) / 2 i ) * 3"; // 9.0 - 9.0 i
        //cadena = "4 - 2 i * ( 3 + 2 i ) + 1 i"; // 8.0 - 5.0 i
        //cadena = "( ( ( (  2 + 3 i ) * 2 i + 3 i - 7 ) * 2 i - 9 ) * 7 i ) * -2 i + ( 1 - 3 i ) * ( 3 + 6 i ) - ( 2 * 3 i - 7 + 8 i ) + ( 2 - 9 i ) ^ 2"; // -370.9985 - 417.0032 i  
        //cadena = "2 + ( 2 * 3 i )"; //// 2 + 6 i
        //cadena = "2 + ( 3 i * 2 )";   //  2 + 6 i
        //cadena = "( i ^ 7 - i ^ -7 ) / 2 i"; // -1.0
        //cadena = "( i ^ 7 - i ^ -7 ) * 2 i"; // 4.0
        //cadena = "( ( 2 - 3 i ) - ( 3 + 2 i ) ) / ( ( 3 + 2 i ) - ( 2 + 1 i ) )"; // -3.0 - 2.0 i
        //cadena = "( - 2.0 i ) / 2 i"; // -1.0 
        //cadena = "( 3 + i ) / ( 2 - 5 i )";  // 0.03448276 + 0.5862069 i
        //cadena = "( i ^ 7 - i ^ -7 ) * ( 2 i ) + 2"; // 6.0 
        //cadena = "( 2 i ) / 7"; // 0.2857143 i 
        //cadena = "( ( -3 + 4 i ) - ( 5 - 2 i ) ) * ( 3 / 2 + i )"; // -18.0 + 1.0 i
        //cadena = "( 3 / 2 + i ) * ( ( -3 + 4 i ) - ( 5 - 2 i ) )"; // -18.0 + 1.0 i
        //cadena = "( ( -3 + 4 i ) - ( 5 - 2 i ) ) * ( 3 / 2 )"; // -12.0 + 9.0 i // 
        //cadena = "( 3 / 2 ) * ( ( -3 + 4 i ) - ( 5 - 2 i ) )"; // -12.0 + 9.0 i 
        //cadena = "( 3 / 2 ) * ( ( -3 + 4 i ) + ( 2 - 9 i ) - ( 5 - 2 i ) )";   // -9 - 4.5 i 
        //cadena = "4 i - 3 - ( ( 5 + 2 i ) + ( 3 - 2 i ) )"; // -11 + 4 i
        //cadena = "( -8.0 + 6.0 i ) * ( 1.5 )"; // -12.0 + 9.0 i  //
        //cadena = "( -3 + 4 i ) * 7 i + ( 3 / 2 ) * 7 i "; // -28.0 - 10.5 i
        //cadena = "-3 + 4 i + 7 i - 5 * ( 5 - 2 i )"; // -28.0 + 21.0 i
        //cadena = "-3 + 4 i + ( 3 / 2 ) ^ -1"; // -2.333333 + 4 i
        //cadena = "-3 + 4 i + ( 3 * 2 ) ^ -1";   // -2.833333333333333 + 4 i
        //cadena ="( 3 * 2 ) ^ -1";  ///// 0.166666667
        //cadena = "( 3 / 2 ) ^ -1";    // 0.6666667
        //cadena = "1.5 ^ -1";   //0.6666666666666
        //cadena = "( 5 - 2 i ) ^ -1"; // 0.17241549183827284 + 0.06896127669972611 i
        //cadena = "( -3 + 4 i ) * ( 5 - 2 i )"; // -7.0 + 26.0 i
        //cadena = "( ( -3 + 4 i ) + ( 5 - 2 i ) ) ^ -1"; // 0.25000000427856783 - 0.25 i
        //cadena = "( ( -3 + 4 i ) ^ 2 ) * 3 / 2"; // -10.500001 - 36.0 i
        //cadena = "( 5 - 2 i ) / ( -3 + 4 i )"; // -0.92 + 0.56 i  // -092 - 0.56 i
        //cadena = "( -3 + 4 i ) / ( 2 * 3 / 2 + 7 i )"; // 0.3275862 + 0.5689655 i
        //cadena = "5 + 3 i + 4 √ ( 2 + 2 i ) 2 - 7 * 7 i + 5 √ ( 2 + 2 i ) 0 "; // 4.944066 - 46.06041 i
        //cadena = "5 √ ( 2 + 2 i ) 0"; // 1.2159869864174835 + 0.1925934182856526 i
        //cadena = "5 + 3 + 2 √ 25 * ( ( 2 * 3 ) / 3 ) * 4"; // 48.0
        //cadena = "3 i * ( 3 - 3 + 2 i )"; // -6.0
        //cadena = "2 + 2 √ 25 + 4"; // 11.0
        //cadena = "( ( 3 √ 25 + 4 ) * 3 ) / 4 + ( 3 / 2 - 4 ) / 4 + 25"; // 29.568012
        //cadena = "3 ^ 5"; // 243.0
        //cadena = "( 2 + 2 i ) * 2"; // 4.0 + 4.0 i
        //cadena = "5 + 3 i + 4 √ ( 2 + 2 i ) 2 - 7 * 7 i + 2 √ 25 + 4"; // 12.728079 - 46.253002 i
        //cadena = "2 √ 25"; // 5.0
        //cadena = "5 + 3 i + 4 √ ( 2 + 2 i ) 2 - 7 * 7 i + 5 √ ( 2 + 2 i ) 0 + 5 √ ( 2 + 2 i ) 0"; // 6.1600533 - 45.867817 i
        //cadena = "3 * ( ( 5 i + 2 ) * ( 6 - 2 i ) + 2 + 3 i )"; // 72.0 + 87.0 i 
        //cadena = "3 / ( ( 5 i + 2 ) / ( 6 - 2 i ) + 2 + 3 i )"; // 0.32325885 - 0.6070959 i
        //cadena = "( ( 5 i + 2 ) / ( 6 - 2 i ) + 2 + 3 i )"; //   2.05 + 3.85 i
        //cadena = "( 56 - 8 i ) / ( 14 + 10 i )"; // 2.3783784 - 2.2702703 i
        //cadena = "( ( 28 - 4 i ) * ( 7 - 5 i ) ) / ( ( 7 + 5 i ) * ( 7 - 5 i ) )"; // 2.3783784 - 2.2702703 i
        //cadena = "( ( 7 - 8 i ) * ( 4 - 2 i ) + 2 )"; // 14 - 46 i
        //cadena = "( ( 7 - 8 i ) / ( 4 - 2 i ) + 2 )"; // 4.2 - 0.9 i
        //cadena = "( 5 - 2 i / ( 4 + 7 i + 3 / 3 i - 2 i ) ) / ( 4 - 7 i ) + 8 i"; // 0.31923077 + 8.49615383 i
        //cadena = "( ( 28 - 4 i ) / ( 7 - 5 i ) ) / ( ( 7 + 5 i ) * ( 7 - 5 i ) )"; // 0.03944485 - 0.020452887 i
        //cadena = "( ( 28 - 4 i ) * ( 7 - 5 i ) ) * ( ( 7 + 5 i ) / ( 7 - 5 i ) )"; // 216 + 112 i
        //cadena = "4 - ( 3 i - 6 ) / ( 2 - 4 i )"; //5.2 + 0.9 i
        //cadena = "4 - ( 3 + 2 i ) * ( 2 - i )"; // - 4 - 1 i
        //cadena = "4 - ( 8 + i )"; // -4 - 1 i
        //cadena = "( 0 + ( 2.9189188 + 1.5135136 i ) / 74 )"; //   0.03944485 + 0.020452887 i
        //cadena = "( 8 - 4 i ) / 2 )"; //  4.0 - 2.0 i
        //cadena = "( 2 + ( 2.9189188 + 1.5135136 i ) * 74 ) + 5";    // 223 + 112 i
        //cadena = "( 2 - ( 2.9189188 + 1.5135136 i ) / 74 ) + 5";    // 6.960555 - 0.020452887 i
        //cadena = "( ( 2.9189188 + 1.5135136 i ) / 74 ) + 5";        // 5.039445 + 0.020452887 i
        
        cadena = iii2Return.iii(cadena);
        
        if (MiniLibrary.OccurrencesString(cadena, " i ") == 0) {           
            int count = MiniLibrary.OccurrencesString(cadena, "(");
            while (count > 0) {
               
                cadena = rem.rem(cadena);
                count -= 1;
            }
        }
        
        String t1 = OpeReturn.resuelve(cadena); 
       
        String t2 = PotenciaComplejo2Return.Potencia2R(t1); 
        
        String t3 = RaizComplejo1Return.RC1(t2);
        
        String t4 = DIV2Return.DIV2(t3); 
        
        String t5 = MUL2Return.MUL2(t4);
       
        String t6 = rem2(t5);
        System.out.println("Resultado Final : " + t6);
        
    }
}
