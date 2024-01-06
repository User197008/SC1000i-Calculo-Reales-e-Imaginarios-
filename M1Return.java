package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class M1Return {
    public static String M1 (String cadena) { 
        String cadena1 = iiiReturn.iii(cadena);
        String newcadena = OrdenarReturn.Ordenar(cadena1);
        ArrayList<String> elementos = MiniLibrary.split(newcadena);
        
        ArrayList<String> Resultado = new ArrayList<>() ;
        ArrayList<String> NuCom = new ArrayList<>();
        int ind = elementos.indexOf("*");
        
        if ("(".equals(elementos.get(ind+1))) {
            if (ind==1) {
                NuCom.add("0");
                NuCom.add("0");
                NuCom.add(elementos.get(ind-1));
                NuCom.add(elementos.get(ind));
                NuCom.add(elementos.get(ind+1));
                NuCom.add(elementos.get(ind+2));
                NuCom.add(elementos.get(ind+3));
                NuCom.add(elementos.get(ind+4));
                NuCom.add(elementos.get(ind+5));
                NuCom.add(elementos.get(ind+6)); }
            else if (ind==2) {
                NuCom.add("0");
                NuCom.add(elementos.get(ind-2));
                NuCom.add(elementos.get(ind-1));
                NuCom.add(elementos.get(ind));
                NuCom.add(elementos.get(ind+1));
                NuCom.add(elementos.get(ind+2));
                NuCom.add(elementos.get(ind+3));
                NuCom.add(elementos.get(ind+4));
                NuCom.add(elementos.get(ind+5));
                NuCom.add(elementos.get(ind+6));
                        }
            else if (ind==3) {
                NuCom.add(elementos.get(ind-3));
                NuCom.add(elementos.get(ind-2));
                NuCom.add(elementos.get(ind-1));
                NuCom.add(elementos.get(ind));
                NuCom.add(elementos.get(ind+1));
                NuCom.add(elementos.get(ind+2));
                NuCom.add(elementos.get(ind+3));
                NuCom.add(elementos.get(ind+4));
                NuCom.add(elementos.get(ind+5));
                NuCom.add(elementos.get(ind+6));
                        }
            else if (ind>=3 && ind<= elementos.size()) {
                NuCom.add(elementos.get(ind-3));
                NuCom.add(elementos.get(ind-2));
                NuCom.add(elementos.get(ind-1));
                NuCom.add(elementos.get(ind));
                NuCom.add(elementos.get(ind+1));
                NuCom.add(elementos.get(ind+2));
                NuCom.add(elementos.get(ind+3));
                NuCom.add(elementos.get(ind+4));
                NuCom.add(elementos.get(ind+5));
                NuCom.add(elementos.get(ind+6));
                
            }
          
          if("i".equals(NuCom.get(2)) && "+".equals(NuCom.get(6))) { 
              
              if("-".equals(NuCom.get(0))) { 
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"+");
                  Resultado.add(3,"+");
                  elementos.add(ind+11,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(4,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
                  elementos.remove(ind-3);
                  
              }
              else if("+".equals(NuCom.get(0))) {   
                 
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"-");
                  Resultado.add(3,"-");
                  elementos.add(ind+11,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(4,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
                  elementos.remove(ind-3);     
              }
              else if("0".equals(NuCom.get(0)) && !"0".equals(NuCom.get(1)) && !"-".equals(NuCom.get(1)) && !"+".equals(NuCom.get(1)) && !"(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);   
              }
              else if("(".equals(NuCom.get(0)) && !"0".equals(NuCom.get(1)) && !"-".equals(NuCom.get(1)) && !"+".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
              }
              else if("0".equals(NuCom.get(0)) && "-".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,NuCom.get(5));
                  Resultado.add(1,NuCom.get(5));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"+");
                  Resultado.add(3,"+");
                  elementos.add(ind+11,NuCom.get(7));
                  Resultado.add(4,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);     
              }
              else if("0".equals(NuCom.get(0)) && "+".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");
                  elementos.add(ind+8,NuCom.get(5));
                  Resultado.add(1,NuCom.get(5));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"-");
                  Resultado.add(3,"-");
                  elementos.add(ind+11,NuCom.get(7));
                  Resultado.add(4,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2); 
              }
              else if("0".equals(NuCom.get(0)) && "0".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,NuCom.get(5));
                  Resultado.add(0,NuCom.get(5));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");
                  elementos.add(ind+10,NuCom.get(7));
                  Resultado.add(3,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
              }
              else if("0".equals(NuCom.get(0)) && "(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,NuCom.get(5));
                  Resultado.add(0,NuCom.get(5));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");
                  elementos.add(ind+10,NuCom.get(7));
                  Resultado.add(3,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
              }
          }
          else if("i".equals(NuCom.get(2)) && "-".equals(NuCom.get(6))) { 
               
               if("-".equals(NuCom.get(0))) { 
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"-");
                  Resultado.add(3,"-");
                  elementos.add(ind+11,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(4,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
                  elementos.remove(ind-3);
               }  
               else if("+".equals(NuCom.get(0))) { 
                  
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"-");
                  Resultado.add(3,"-");
                  elementos.add(ind+11,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(4,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
                  elementos.remove(ind-3);
               }
               else if("0".equals(NuCom.get(0)) && !"0".equals(NuCom.get(1)) && !"-".equals(NuCom.get(1)) && !"+".equals(NuCom.get(1)) && !"(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2); 
               }
               else if("(".equals(NuCom.get(0)) && !"0".equals(NuCom.get(1)) && !"-".equals(NuCom.get(1)) && !"+".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(1)) * Float.parseFloat(NuCom.get(7))));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);  
               }
               else if("0".equals(NuCom.get(0)) && "-".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,NuCom.get(5));
                  Resultado.add(1,NuCom.get(5));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"-");
                  Resultado.add(3,"-");
                  elementos.add(ind+11,NuCom.get(7));
                  Resultado.add(4,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2); 
               }
               else if("0".equals(NuCom.get(0)) && "+".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");
                  elementos.add(ind+8,NuCom.get(5));
                  Resultado.add(1,NuCom.get(5));
                  elementos.add(ind+9,"i");
                  Resultado.add(2,"i");
                  elementos.add(ind+10,"+");
                  Resultado.add(3,"+");
                  elementos.add(ind+11,NuCom.get(7));
                  Resultado.add(4,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);       
               }
               else if("0".equals(NuCom.get(0)) && "0".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,NuCom.get(5));
                  Resultado.add(0,NuCom.get(5));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,NuCom.get(7));
                  Resultado.add(3,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);             
               }
               else if("0".equals(NuCom.get(0)) && "(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,NuCom.get(5));
                  Resultado.add(0,NuCom.get(5));
                  elementos.add(ind+8,"i");
                  Resultado.add(1,"i");
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,NuCom.get(7));
                  Resultado.add(3,NuCom.get(7));
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);        
               }
          }
           else if(!"i".equals(NuCom.get(2)) && !"+".equals(NuCom.get(2)) && !"-".equals(NuCom.get(2)) && "+".equals(NuCom.get(6))) { 
               
               if("-".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+11,"i");
                  Resultado.add(4,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
               }
               else if("+".equals(NuCom.get(1))) {
                  
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+11,"i");
                  Resultado.add(4,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
               }
               else if("0".equals(NuCom.get(0)) && "0".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"+");
                  Resultado.add(1,"+");
                  elementos.add(ind+9,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(2,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+10,"i");
                  Resultado.add(3,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
               }
               else if("0".equals(NuCom.get(0)) && "(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"+");
                  Resultado.add(1,"+");
                  elementos.add(ind+9,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(2,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+10,"i");
                  Resultado.add(3,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
               }       
           }
           else if(!"i".equals(NuCom.get(2)) && !"+".equals(NuCom.get(2)) && !"-".equals(NuCom.get(2)) && "-".equals(NuCom.get(6))) { 
               
               if("-".equals(NuCom.get(1))) {  
                  
                  elementos.add(ind+7,"-");
                  Resultado.add(0,"-");
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+9,"+");
                  Resultado.add(2,"+");
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+11,"i");
                  Resultado.add(4,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
                 }
               else if("+".equals(NuCom.get(1))) {  
                  
                  elementos.add(ind+7,"+");
                  Resultado.add(0,"+");       
                  elementos.add(ind+8,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(1,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));        
                  elementos.add(ind+9,"-");
                  Resultado.add(2,"-");                                                                                    
                  elementos.add(ind+10,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(3,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));        
                  elementos.add(ind+11,"i");
                  Resultado.add(4,"i");                                                                                    
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
                  elementos.remove(ind-2);
               }
               else if("0".equals(NuCom.get(0)) && "0".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"-");
                  Resultado.add(1,"-");
                  elementos.add(ind+9,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(2,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+10,"i");
                  Resultado.add(3,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
               }
               else if("0".equals(NuCom.get(0)) && "(".equals(NuCom.get(1))) { 
                  
                  elementos.add(ind+7,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  Resultado.add(0,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(5))));
                  elementos.add(ind+8,"-");
                  Resultado.add(1,"-");
                  elementos.add(ind+9,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  Resultado.add(2,String.valueOf(Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(7))));
                  elementos.add(ind+10,"i");
                  Resultado.add(3,"i");
                  elementos.remove(ind+6);
                  elementos.remove(ind+5);
                  elementos.remove(ind+4);
                  elementos.remove(ind+3);
                  elementos.remove(ind+2);
                  elementos.remove(ind+1);
                  elementos.remove(ind);
                  elementos.remove(ind-1);
               }
               
           } 
        }
        else {
            
            return cadena;
        }
        
        return MiniLibrary.ArrayToString(Resultado);
        
    }
}
