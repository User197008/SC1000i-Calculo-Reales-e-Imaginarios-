package calculadora;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class D2Return {
    public static String D2 (String cadena) {  
        String cadena1 = iiiReturn.iii(cadena);
        String newcadena = OrdenarReturn.Ordenar(cadena1);
        ArrayList<String> elementos = MiniLibrary.split(newcadena);
        
        ArrayList<String> NuCom = new ArrayList<>();
        int ind = elementos.indexOf("/");
        
        
        
        if(!"(".equals(elementos.get(0)))   {
            if(")".equals(elementos.get(ind-1)))    {
                if(ind == 7 && elementos.size() >= 11)  {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add(elementos.get(ind+3)); 
                }
                else if(ind == 7 && elementos.size() == 10)     {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add("0"); 
                }
                else if(ind == 7 && elementos.size() == 9)     {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add("0");
                    NuCom.add("0"); 
                }
                else if(ind > 7 && ind == elementos.size()-2)     {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add("0");
                    NuCom.add("0"); 
                }
                else if(ind > 7 && ind == elementos.size()-3)     {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add("0"); 
                }
                else if(ind > 7 && ind <= elementos.size()-4)     {
                    NuCom.add(elementos.get(ind-7));
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add(elementos.get(ind+3));
                }                 
            }
        }
        
        else if("(".equals(elementos.get(0)))   {
            if(")".equals(elementos.get(ind-1)))    {
                if(ind == 6 && elementos.size() >= 10)  {
                    NuCom.add("0");
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add(elementos.get(ind+3)); 
                }
                else if(ind == 6 && elementos.size() == 9)  {
                    NuCom.add("0");
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add("0"); 
                }
                else if(ind == 6 && elementos.size() == 8)  {
                    NuCom.add("0");
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add("0");
                    NuCom.add("0"); 
                }
                else if(ind > 6 && ind == elementos.size()-2)  {                   
                    if("(".equals(elementos.get(1))) {
                        NuCom.add("0");
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add("0");
                        NuCom.add("0"); 
                    }
                    else    {                      
                        NuCom.add(elementos.get(ind-7));
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add("0");
                        NuCom.add("0");                    
                    }           
                }
                else if(ind > 6 && ind == elementos.size()-3)  {
                    
                    if("(".equals(elementos.get(1)))  {
                        NuCom.add("0");
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add(elementos.get(ind+2));
                        NuCom.add("0");                        
                    }
                    else    {
                        NuCom.add(elementos.get(ind-7));
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add(elementos.get(ind+2));
                        NuCom.add("0");
                        
                        
                    }
                        
                }
                else if(ind > 6 && ind <= elementos.size()-4)  {
                    
                    if("(".equals(elementos.get(1)))  {                    
                        NuCom.add("0");
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add(elementos.get(ind+2));
                        NuCom.add(elementos.get(ind+3));                       
                    }
                    else    {                       
                        NuCom.add(elementos.get(ind-7));
                        NuCom.add(elementos.get(ind-6));
                        NuCom.add(elementos.get(ind-5));
                        NuCom.add(elementos.get(ind-4));
                        NuCom.add(elementos.get(ind-3));
                        NuCom.add(elementos.get(ind-2));
                        NuCom.add(elementos.get(ind-1));
                        NuCom.add(elementos.get(ind));
                        NuCom.add(elementos.get(ind+1));
                        NuCom.add(elementos.get(ind+2));
                        NuCom.add(elementos.get(ind+3));
                    }
                }
                else if(ind > 6 && ind == elementos.size()-5)  {
                    NuCom.add("0");
                    NuCom.add(elementos.get(ind-6));
                    NuCom.add(elementos.get(ind-5));
                    NuCom.add(elementos.get(ind-4));
                    NuCom.add(elementos.get(ind-3));
                    NuCom.add(elementos.get(ind-2));
                    NuCom.add(elementos.get(ind-1));
                    NuCom.add(elementos.get(ind));
                    NuCom.add(elementos.get(ind+1));
                    NuCom.add(elementos.get(ind+2));
                    NuCom.add("0");              
                }
            }  
        }
        
        if("i".equals(NuCom.get(10)))    {
            if("+".equals(NuCom.get(3)))    {  
                if("+".equals(NuCom.get(0)))    {   
                    elementos.add(ind+4,"-");
                    elementos.add(ind+5,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+6, "+");
                    elementos.add(ind+7,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+8,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);    
                }
                else if("-".equals(NuCom.get(0)))   {   
                    elementos.add(ind+4,"+");
                    elementos.add(ind+5,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+6, "-");
                    elementos.add(ind+7,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+8,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);    
                }
                else if("0".equals(NuCom.get(0)))   {  
                    elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9))*-1)/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+5, "+");
                    elementos.add(ind+6, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+7,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);  
                }
                else if("(".equals(NuCom.get(0)))   {  
                    elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9))*-1)/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+5, "+");
                    elementos.add(ind+6, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+7,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);  
                }
            }
            else if("-".equals(NuCom.get(3)))   {  
                if("+".equals(NuCom.get(0)))    {
                    elementos.add(ind+4,"+");
                    elementos.add(ind+5,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+6, "+");
                    elementos.add(ind+7,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+8,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);  
                }
                else if("-".equals(NuCom.get(0)))   {   
                    elementos.add(ind+4,"-");
                    elementos.add(ind+5,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+6, "-");
                    elementos.add(ind+7,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+8,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);  
                }
                else if("0".equals(NuCom.get(0)))   {  
                    elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+5, "+");
                    elementos.add(ind+6,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+7,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                else if("(".equals(NuCom.get(0)))   {  
                    elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+5, "+");
                    elementos.add(ind+6, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(9)))/(Float.parseFloat(NuCom.get(9)) * Float.parseFloat(NuCom.get(9)))));
                    elementos.add(ind+7,"i");
                    elementos.remove(ind+3);
                    elementos.remove(ind+2);
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
            }
        }
        else if("i".equals(NuCom.get(9)))   {   
            if("+".equals(NuCom.get(3)))    {  
                if(!"-".equals(NuCom.get(8)) && !"+".equals(NuCom.get(8)))  {
                    if("+".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,"+");   
                        elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+5, "-"); 
                        elementos.add(ind+6,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("-".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+5, "+");
                        elementos.add(ind+6,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("0".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+4, "-");
                        elementos.add(ind+5, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);  
                    }
                    else if("(".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+4, "-");
                        elementos.add(ind+5,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);  
                    }
                    
                }
                else if("-".equals(NuCom.get(8)))    {  
                    if("+".equals(NuCom.get(0)))    {  
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+5,"+");
                        elementos.add(ind+6,String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);
                    }
                    else if("-".equals(NuCom.get(0)))    {  
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+5,"-");
                        elementos.add(ind+6,String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);
                    }
                    else if("0".equals(NuCom.get(0)))    {   
                        elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))*-1));
                        elementos.add(ind+4,"+");
                        elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                    }
                    else if("(".equals(NuCom.get(0)))    {   
                        elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))*-1));
                        elementos.add(ind+4,"+");
                        elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                    }
                    
                }
            }
            else if("-".equals(NuCom.get(3)))   {   
                if(!"-".equals(NuCom.get(8)) && !"+".equals(NuCom.get(8)))  {   
                    if("+".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+5, "-");
                        elementos.add(ind+6, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("-".equals(NuCom.get(0)))     { 
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+5, "+");
                        elementos.add(ind+6,String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("0".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8))*-1)/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+4, "-");
                        elementos.add(ind+5, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6); 
                    }
                    else if("(".equals(NuCom.get(0)))     {  
                        elementos.add(ind+3,String.valueOf((Float.parseFloat(NuCom.get(4)) * Float.parseFloat(NuCom.get(8))*-1)/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+4, "-");
                        elementos.add(ind+5, String.valueOf((Float.parseFloat(NuCom.get(2)) * Float.parseFloat(NuCom.get(8)))/(Float.parseFloat(NuCom.get(8)) * Float.parseFloat(NuCom.get(8)))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6); 
                    }
                }
                    
                else if("-".equals(NuCom.get(8)))   {   
                    if("+".equals(NuCom.get(0)))    {  
                        elementos.add(ind+3,"+");
                        elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+5, "+");
                        elementos.add(ind+6, String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("-".equals(NuCom.get(0)))    {   
                        elementos.add(ind+3,"-");
                        elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+5, "-");
                        elementos.add(ind+6, String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+7,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6);
                        elementos.remove(ind-7);  
                    }
                    else if("0".equals(NuCom.get(0)))    {  
                        elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+4, "+");
                        elementos.add(ind+5, String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6); 
                    }
                    else if("(".equals(NuCom.get(0)))    {   
                        elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                        elementos.add(ind+4, "+");
                        elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(2))));
                        elementos.add(ind+6,"i");
                        elementos.remove(ind+2);
                        elementos.remove(ind+1);
                        elementos.remove(ind);
                        elementos.remove(ind-1);
                        elementos.remove(ind-2);
                        elementos.remove(ind-3);
                        elementos.remove(ind-4);
                        elementos.remove(ind-5);
                        elementos.remove(ind-6); 
                    }
                }
            }
        }
        else if("i".equals(NuCom.get(8)))   {
            if("+".equals(NuCom.get(3)))    {  
                if("+".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,"+");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+4, "-");
                    elementos.add(ind+5, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("-".equals(NuCom.get(0)))    {  
                    elementos.add(ind+2,"-");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+4, "+");
                    elementos.add(ind+5, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("0".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                else if("(".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
            }
            else if("-".equals(NuCom.get(3)))   {   
                if("+".equals(NuCom.get(0)))    { 
                    elementos.add(ind+2,"-");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+4, "-");
                    elementos.add(ind+5, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("-".equals(NuCom.get(0)))    {  
                    elementos.add(ind+2,"+");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(4))));
                    elementos.add(ind+4, "+");
                    elementos.add(ind+5, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("0".equals(NuCom.get(0)))    {  
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(4))*-1));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                else if("(".equals(NuCom.get(0)))    {  
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(4))*-1));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4, String.valueOf(Float.parseFloat(NuCom.get(2))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                
            }
        }
        else if(!"i".equals(NuCom.get(8)))  {   
            if("+".equals(NuCom.get(3)))    {   
                if("+".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,"+");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+4, "+");
                    elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("-".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,"-");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+4, "-");
                    elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7); 
                }
                else if("0".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+3, "+");
                    elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                else if("(".equals(NuCom.get(0)))    {  
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+3, "+");
                    elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                
            }
            else if("-".equals(NuCom.get(3)))   {   
                if("+".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2, "+");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+4, "-");
                    elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);
                }
                else if("-".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2, "-");
                    elementos.add(ind+3,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+4, "+");
                    elementos.add(ind+5,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+6,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                    elementos.remove(ind-7);
                }
                else if("0".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
                else if("(".equals(NuCom.get(0)))    {   
                    elementos.add(ind+2,String.valueOf(Float.parseFloat(NuCom.get(2)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+3, "-");
                    elementos.add(ind+4,String.valueOf(Float.parseFloat(NuCom.get(4)) / Float.parseFloat(NuCom.get(8))));
                    elementos.add(ind+5,"i");
                    elementos.remove(ind+1);
                    elementos.remove(ind);
                    elementos.remove(ind-1);
                    elementos.remove(ind-2);
                    elementos.remove(ind-3);
                    elementos.remove(ind-4);
                    elementos.remove(ind-5);
                    elementos.remove(ind-6);
                }
            }
        }
        else    {
            
            return cadena;
        }
        //System.out.println(elementos);
        System.out.println(MiniLibrary.ArrayToString(elementos));
        return MiniLibrary.ArrayToString(elementos);
    }   
}
