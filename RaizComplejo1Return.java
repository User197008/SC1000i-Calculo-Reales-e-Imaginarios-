package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class RaizComplejo1Return {
    static int count;
    public static String calcula(String cadena) {
        String var0 = RaizComplejo0Return.RC0(cadena);
        
        String var1 = PotenciaComplejo2Return.Potencia2R(var0);
        
        String var2 = OpeReturn.resuelve(var1);
        
        String var3 = DIV2Return.DIV2(var2);
        
        String var4 = MUL2Return.MUL2(var3);
        
        String var5 = SumaRestaReturn.SumaResta(var4);
        
        return var5;
         
    }
    
    public static String RC1 (String cadena) {  
        count = MiniLibrary.countOccurrences(cadena, '√');
        if(count>0) {
            while(count>0)  {
                ArrayList<String> Lista = MiniLibrary.split(cadena);
                int ind = Lista.indexOf("√");
                double n = Double.parseDouble(Lista.get(ind-1));

                List<String> Lista2 = Lista.subList(ind, Lista.size());

                int inicio = ind + 1;
                if("(".equals(Lista.get(inicio)))  {
                    int xo = 0;
                    int yo = 0;
                    ArrayList<Integer> fin = new ArrayList<>();
                    ListIterator<String> it = Lista2.listIterator();
                    int fi = 0;
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals("(")) {
                            xo += 1;
                        }
                        else if(x.equals(")")) {
                            fin.add(Lista2.indexOf(x));
                            it.remove();
                            it.add(">");
                            yo += 1;
                            if(xo==yo)  {
                                fi = Collections.max(fin) + ind;
                                break;
                            }
                        }
                    }
                    String sub2 = MiniLibrary.ListToString(Lista.subList(inicio+1, fi));
                    
                    String sub2a = sub2.replace(">",")");
                    
                    String sub3 = calcula(sub2a);
                    
                    if(MiniLibrary.countOccurrences(sub3, 'i')==1)   {
                        ArrayList<String> sub3L = MiniLibrary.split(sub3);
                        String resultado = null;
                        if(Collections.frequency(sub3L, "i")>0)   {
                            int inx = sub3L.indexOf("i");
                            if(sub3L.size()==4)  {
                                double a = Math.pow(Double.parseDouble(sub3L.get(inx-3)),2);
                                double b = Math.pow(Double.parseDouble(sub3L.get(inx-1)),2);
                                double alpha = APOLARReturn.ApolarA(sub3);
                                double r = Math.pow(a+b,1/(n*2));
                                double k = Double.parseDouble(Lista.get(fi+1));

                                if(k>=0 && k<=n-1) {
                                    double alpha1 = (alpha + 360 * k)/n;
                                    String re1 = String.valueOf(r * Math.cos(Math.toRadians(alpha1)));
                                    String re2 = String.valueOf(r * Math.sin(Math.toRadians(alpha1)));
                                    resultado = "("+" "+re1+" "+"+"+" "+re2+" "+"i"+" "+")";
                                    

                                }else{
                                    return "Error : 0 <= k <= n-1";
                                }
                            }

                        }
                        if(ind>3)   {
                            if(Collections.frequency(Lista.subList(ind-4, ind),"+")>0)  {
                                inicio = ind + Lista.subList(ind-4, ind).indexOf("+") - 4;
                            }
                            else if(Collections.frequency(Lista.subList(ind-4, ind),"-")>0) {
                                inicio = ind + Lista.subList(ind-4, ind).indexOf("-") - 4;

                            }
                        }
                        String cadena1a;
                        if("√".equals(Lista.get(1)))   {
                            cadena1a = "";
                        }
                        else    {
                            List<String> cadena1 = Lista.subList(0, ind-1);
                            cadena1a = MiniLibrary.ListToString(cadena1);
                            
                        }
                        List<String> cadena2 = Lista.subList(fi+2, Lista.size());
                        String cadena2a = MiniLibrary.ListToString(cadena2);
                        
                        cadena = cadena1a + " " + resultado + " " + cadena2a;
                        
                        count -= 1;

                    }else   {
                        cadena = String.valueOf(Math.pow(Double.parseDouble(sub3),1/n));
                        
                        count -= 1;
                    }

                }
                else   {
                        double resultado = Math.pow(Double.parseDouble(Lista.get(ind+1)),1/n);
                        List<String> cadena1 = Lista.subList(0, inicio-2);
                        String cadena1a = MiniLibrary.ListToString(cadena1);
                        
                        List<String> cadena2 = Lista.subList(ind+2, Lista.size());
                        String cadena2a = MiniLibrary.ListToString(cadena2);
                        
                        cadena = cadena1a + " " + resultado + " " + cadena2a;
                        
                        count -= 1;
                    }


            }
        }
        
        return cadena;
    }
}
