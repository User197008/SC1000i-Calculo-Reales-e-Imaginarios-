package calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author jaime
 */
public class DIV2Return {
    public static String calcula(String cadena) {
        String var0 = RaizComplejo1Return.RC1(cadena);       
        String var1 = PotenciaComplejo2Return.Potencia2R(var0);       
        String var2 = OpeReturn.resuelve(var1);       
        String var3 = DIV1Return.DIV1(var2);        
        String var4 = MUL2Return.MUL2(var3);       
        String var5 = SumaRestaReturn.SumaResta(var4);
        return var5;
         
    }
    public static String DIV2 (String cadena) {  
        
        int count = MiniLibrary.countOccurrences(cadena, '/');
        
        String resultado;
        while (count > 0)   {
            ArrayList<String> cadenaLista = MiniLibrary.split(cadena);
            ArrayList<String> cadenaLista1 = MiniLibrary.split(cadena);           
            int INDEX = cadenaLista.indexOf("/");
            if(INDEX == -1){
                return cadena;
            }else{    
            
            ArrayList<String> cadenaLista2 = MiniLibrary.split(cadena);
            
            if(")".equals(cadenaLista.get(INDEX-1)))    {   // ) /   
                if("(".equals(cadenaLista.get(INDEX+1))) {   // ) / (
                    List<String> cadenaLista2b = cadenaLista2.subList(0, INDEX);                   
                    Collections.reverse(cadenaLista2b);
                    List<String> cadenaLista3 = cadenaLista2b;                   
                    int fin = INDEX-1;
                    int xo = 0;
                    int yo = 0;
                    int inicio = 0;
                    ArrayList<Integer> y1 = new ArrayList<>();
                    ListIterator<String> it = cadenaLista2b.listIterator();
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals(")")) {
                            xo += 1;
                        }
                        else if(x.equals("(")) {
                            y1.add(cadenaLista3.indexOf(x));
                            it.remove();
                            it.add("<");
                            yo += 1;
                            if(xo==yo)  {                                
                                Integer finn = Collections.max(y1);                               
                                inicio = (cadenaLista2b.size() - finn) - 1;                                
                                break;
                            }
                        }
                    }
                    
                    String sub = MiniLibrary.ListToString(cadenaLista.subList(inicio+1, fin));
                    String subnuevo = calcula(sub); // 1
                    
                    
                    String cadena1a;
                    String cadena1b;
                    String cadena1c;
                    String cadena1d;
                    if(inicio == 0) {
                        cadena1a = "";
                        cadena1b = "";
                        cadena1c = String.valueOf(cadenaLista.get(inicio)) + " ";
                        
                        cadena1d = " " + String.valueOf(cadenaLista.get(INDEX-1));    //////////////////////////////modi2
                        
                    }
                    else    {
                        List<String> cadena1 = cadenaLista.subList(0, inicio-1);
                        cadena1a = MiniLibrary.ListToString(cadena1) + " ";                       
                        cadena1b = String.valueOf(cadenaLista.get(inicio-1)) + " ";                        
                        cadena1c = MiniLibrary.ListToString(cadenaLista.subList(inicio, inicio+1)) + " ";                       
                        cadena1d = String.valueOf(cadenaLista.get(INDEX-1)); 
                    }
                    List<String> tr = cadenaLista1.subList(INDEX, cadenaLista.size());
                    int X1 = 0;
                    int Y1 = 0;
                    int fin2 = 0;
                    ArrayList<Integer> y2 = new ArrayList<>();
                    ListIterator<String> it1 = tr.listIterator();
                    while(it1.hasNext()) {
                        String x = it1.next();
                        if(x.equals("(")) {
                            X1 += 1;
                        }
                        else if(x.equals(")")) {
                            y2.add(tr.indexOf(x));
                            it1.remove();
                            it1.add(">");
                            Y1 += 1;
                            if(X1==Y1)  {                               
                                fin2 = Collections.max(y2);                               
                                break;
                            }
                        }
                    }
                    
                    String sub2 = MiniLibrary.ListToString(cadenaLista.subList(INDEX+2, fin2+INDEX));
                    String subnuevo2 = calcula(sub2); // 1                  
                    String cadenaObj;
                    String cadena2 = String.valueOf(cadenaLista.get(INDEX+1)) + " ";          //////////////////////////////////modi2
                    String cadena2a = " " + String.valueOf(cadenaLista.get(fin2+INDEX));
                    
                    String cadena2b = " " + MiniLibrary.ListToString(cadenaLista.subList(fin2+INDEX+1, cadenaLista.size()));           ///////////////////////modi2
                    
                    String SubcadenaObjb = cadena2 + subnuevo2 + cadena2a + cadena2b;                                 ///////////////////////////////modi2
                    
                    ArrayList<String>SubcadenaObjB = MiniLibrary.split(SubcadenaObjb); 
                    
                    String cadenaWW;           
                    
                    if(MiniLibrary.split(subnuevo).size() > 3 && MiniLibrary.split(subnuevo2).size()<=3)  {
                        
                        
                        if ("(".equals(SubcadenaObjB.get(0)) ){
                            cadenaObj = cadena1a + cadena1b + cadena1c + subnuevo + " " + cadena1d + " / " + subnuevo2;               /////////////////////////modi2
                            
                            cadena = D2Return.D2(cadenaObj);                                                                       ///////////////////////modi2
                            
                        }
                        
                    }
                     else if(MiniLibrary.split(subnuevo).size()<= 3 && MiniLibrary.split(subnuevo2).size()>3) {
                                          
                        String SubcadenaObja = cadena1a + cadena1b + cadena1c + subnuevo + cadena1d ;                             ////////////////////modi2
                                                                 /////////////////////modi2
                        ArrayList<String>SubcadenaObjA = MiniLibrary.split(SubcadenaObja);                                        ////////////////////modi2                        
                        
                        if("(".equals(SubcadenaObjA.get(0)) ){                   /////////////////modi2
                            cadenaObj = subnuevo + " / " + cadena2 + subnuevo2 + cadena2a + cadena2b;                                          ///////////////////modi2
                            
                            resultado = D1Return.D1(cadenaObj);                                                                       ///////////////////////modi2
                            
                        }
                        
                        else{                                                                                                     /////////////////////////modi2
                            cadenaObj = cadena1a + cadena1b + cadena1c + subnuevo + cadena1d + " / " + cadena2 + subnuevo2 + cadena2a + cadena2b; ////////////////////modi2
                            
                            String ReDiv = cadena1c + subnuevo + " " + cadena1d + " / " + cadena2 + subnuevo2 + cadena2a;        /////////////////////modi2
                            
                            
                            resultado = D3Return.D3(ReDiv);                                                      
                            cadena = cadena1a + cadena1b + resultado + cadena2b;
                            
                            
                        }
                        
                        
                        
                        if("( ".equals(cadena1b))    {
                            cadena = cadena1a + cadena1b + resultado + cadena2b;
                           
                        }
                        else    {
                            ArrayList<String> cadenaListaR = MiniLibrary.split(resultado);                 //
                            
                            if("+".equals(cadenaListaR.get(0)) || "-".equals(cadenaListaR.get(0)) )  {     //
                                cadena = cadena1a + resultado + cadena2b;                                             /////////mod2
                            }                                                                              //
                            else    {                                                                      //
                            cadena = cadena1a + cadena1b + "(" + " " + resultado + " " + ")" + cadena2b; //+ cadena2b;                        //////mod2
                            
                            
                                                         //
                            } 
                            
                        }
                   
                   }else {
                        if(MiniLibrary.split(subnuevo).size() <= 3 && MiniLibrary.split(subnuevo2).size() <= 3){
                             cadenaWW = cadena1a + cadena1b + cadena1c + subnuevo + cadena1d + " / " + cadena2 + subnuevo2 + cadena2a + cadena2b;  /////////////modi2
                             cadenaWW = cadenaWW.replace("(","");                        
                             cadena = cadenaWW.replace(")","");                                
                        
                        }else {
                            cadenaWW = cadena1a + cadena1b + cadena1c + subnuevo + " " + cadena1d + " / " + cadena2 + subnuevo2 + cadena2a + cadena2b;  /////////////modi2
                            
                            cadena = cadena1a + cadena1b + "( " + D3Return.D3(cadenaWW) + " )" + cadena2b;
                            
                        }
                    }
                }
                else    {       // ) / - 2 i
                    cadenaLista2 = MiniLibrary.split(cadena);
                    List<String> cadenaLista2b = cadenaLista2.subList(0, INDEX);                    
                    Collections.reverse(cadenaLista2b);                   
                    List<String> cadenaLista3 = cadenaLista2b;
                    
                    int xo = 0;
                    int yo = 0;
                    int inicio = 0;
                    ArrayList<Integer> y1 = new ArrayList<>();
                    ListIterator<String> it = cadenaLista2b.listIterator();
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals(")")) {
                            xo += 1;
                        }
                        else if(x.equals("(")) {
                            y1.add(cadenaLista3.indexOf(x));
                            it.remove();
                            it.add("<");
                            yo += 1;
                            if(xo==yo)  {                               
                                Integer finn = Collections.max(y1);                               
                                inicio = (cadenaLista2b.size() - finn) - 1;                              
                                break;
                            }
                        }
                    }
                    
                    
                    String sub = MiniLibrary.ListToString(cadenaLista.subList(inicio+1, INDEX-1));
                    String subnuevo = calcula(sub); // 1
                    
                    int fin;
                    if( Collections.frequency(cadenaLista.subList(INDEX+2, cadenaLista.size()), "+")!= 0) {
                        if( Collections.frequency(cadenaLista.subList(INDEX+2, cadenaLista.size()), "-")!= 0)   {
                            ArrayList<Integer> ff = new ArrayList<>();
                            ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            fin = INDEX + Collections.min(ff);
                            
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                            
                        }
                    }
                    else    {
                        if(Collections.frequency(cadenaLista.subList(INDEX+2, cadenaLista.size()), "-")!= 0)    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                           
                        }
                        else    {
                            
                            fin = cadenaLista.size();
                           
                        }
                    }
                    
                    if(MiniLibrary.split(subnuevo).size()<=3)   {
                        String cad1 = MiniLibrary.ListToString(cadenaLista.subList(0, inicio)) + " ";                       
                        String cad2 =" " + MiniLibrary.ListToString(cadenaLista.subList(INDEX, cadenaLista.size()));                       
                        String cadenaW = cad1 + subnuevo + cad2;                      
                        if(cadenaW.contains("/") ){                        ///////////////////////////  modi2
                            cadena = DIV1Return.DIV1(cadenaW);             ////////////////////////// modi2
                            
                        }                                                    ///////////////////// modi2
                        else{                                                ////////////////////modi2
                            cadena = cadenaW;                                /////////////////////modi2
                            
                        }           
                    }
                    else         {
                        String cad1 = MiniLibrary.ListToString(cadenaLista.subList(0, inicio)) + " ";                       
                        String cad2 = " " + MiniLibrary.ListToString(cadenaLista.subList(INDEX, cadenaLista.size())) + " ";                       
                        String subfinal = cad1 + "(" + " " + subnuevo + " " + ")" + cad2;                       
                        cadena = D2Return.D2(subfinal);                       
                    }
                }
                count -= 1;
            }
            else    {
                if("(".equals(cadenaLista.get(INDEX+1)) && "i".equals(cadenaLista.get(INDEX-1)))   {    
                    String subfinal;
                    String sub = null;
                    int inicio = 0;
                    if(INDEX>3) {
                        
                        if( Collections.frequency(cadenaLista.subList(INDEX-4, INDEX), "+")> 0) {
                            inicio = INDEX + cadenaLista.subList(INDEX-4, INDEX).indexOf("+")-4;
                            
                        }
                        else if(Collections.frequency(cadenaLista.subList(INDEX-4, INDEX), "-")> 0) {
                            inicio = INDEX + cadenaLista.subList(INDEX-4, INDEX).indexOf("-")-4;
                            
                        }
                    }
                    else    {
                        inicio = 0;
                        
                        
                    }
                    ArrayList<String> cadenaLista3 = MiniLibrary.split(cadena);
                    
                    int xo = 0;
                    int yo = 0;
                    int fin2 = 0;
                    int ini2 = 0;
                    int fin = 0;
                    int ini = 0;
                    List<String> tr = cadenaLista3.subList(0,cadenaLista.size());
                    ArrayList<Integer> y1 = new ArrayList<>();
                    ArrayList<Integer> x1 = new ArrayList<>();
                    ListIterator<String> it = tr.listIterator();
                    while(it.hasNext()) {
                        String x = it.next();
                        if(x.equals("(")) {
                            x1.add(tr.indexOf(x));
                            it.remove();
                            it.add("<");
                            xo += 1;
                        }
                        else if(x.equals(")")) {
                            y1.add(cadenaLista3.indexOf(x));
                            
                            it.remove();
                            it.add(">");
                            yo += 1;
                            if(xo==yo)  {
                                
                                Integer iniF = Collections.max(x1);
                                Integer finF = Collections.min(y1);
                                
                             if (finF > iniF)    {               /////////modi2
                                    ini = iniF;                     /////////modi2
                                    fin = finF;                     ////////modi2
                                }
                                else    {                           ////////modi2
                                    fin = finF;                         ////modi2
                                    List<String>SubListaINI = cadenaLista.subList(0, fin);  /////modi2                                   
                                    int INISub = SubListaINI.lastIndexOf("(");              /////modi2                                   
                                    ini = INISub;                                           ///////modi2
                                    
                                } 
                             
                             break;
                            }
                        }
                    }
                    
                    
                    if(cadenaLista.contains("(") == true && !"(".equals(cadenaLista.get(INDEX+2)) ) {   /////////modi1
                        
                        List<String> SubLista = cadenaLista.subList(ini, cadenaLista.size());   ///////////modi2
                        
                        int FinSub = SubLista.indexOf(")");                             //////////////modi2
                        
                        List<String> SubLista2 = cadenaLista.subList(ini+1, ini+FinSub);        /////modi2
                        
                        
                        sub = MiniLibrary.ListToString(SubLista2);                      //////////modi2
                        
                    }
                    else    {
                        
                        sub = MiniLibrary.ListToString(cadenaLista.subList(INDEX+3, fin));
                       
                        
                    }
                    
                    
                    String subnuevo = calcula(sub) + " "; //......1
                    
                    int subb = MiniLibrary.split(subnuevo).size();
                    
                    if(subb == 1)   {
                        String cad1 = MiniLibrary.ListToString(cadenaLista.subList(0, INDEX+1)) + " ";
                        
                        String cad2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin+1, cadenaLista.size()));
                        
                        cadena = cad1 + subnuevo + cad2;
                        
                    }
                    else if(subb == 2)  {
                        String cad1 = MiniLibrary.ListToString(cadenaLista.subList(inicio, INDEX+1)) + " ";
                        
                        String cad2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin+1,cadenaLista.size()));
                        
                        cadena = cad1 + subnuevo + cad2;
                        
                    }
                    else    {
                        if(!"(".equals(cadenaLista.get(INDEX+2)))  {                                                //modi1
                            
                            String cad1 = MiniLibrary.ListToString(cadenaLista.subList(inicio, INDEX+1)) + " "; /////modi1
                                                         
                            String cad2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin,fin+1));           /////modi1
                                                                     /////modi1
                            subfinal = cad1 + " " + "(" + " " + subnuevo + " " + ")";                               /////modi1
                            
                            String nuevo3 = D1Return.D1(subfinal);                           
                            ArrayList<String> nue3 = MiniLibrary.split(nuevo3);             ///////modi2                           
                            String cadena1 = null;                                                 ///////modi2                           
                            String visu = MiniLibrary.ListToString(cadenaLista.subList(0,INDEX));   //////modi2
                            
                            ArrayList<String> visu2 = MiniLibrary.split(visu);                      //////modi2
                            
                            if(visu2.size()>2){                                                     //////modi2
                                String caden1 = MiniLibrary.ListToString(cadenaLista.subList(0, INDEX-2));   //////error INDEX-1 o INDEX-2
                                ArrayList<String> cade1 = MiniLibrary.split(caden1);            ///////modi2
                                
                                if (nue3.get(0).equals(cade1.get(cade1.size()-1))){                                         /////////modi2
                                cadena1 = MiniLibrary.ListToString(cadenaLista.subList(0,cade1.size()-1)) + " ";        /////////modi2                               
                                }
                            else {                                                                                      ////////modi2
                                cadena1 = MiniLibrary.ListToString(cadenaLista.subList(0,cade1.size())) + " ";          ////////modi2
                                
                                }
                            }
                        else    {
                            cadena1 = "";                                                  ///////modi2
                            }
                            
                            
                            
                            String cadena2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin+1,cadenaLista.size())) + " "; /////////modi1
                            
                            cadena = cadena1 + nuevo3 + cadena2;
                            
                            
                        }
                        else    {                                                                               /////modi1
                            
                            String cad1 = MiniLibrary.ListToString(cadenaLista.subList(inicio, ini)) + " ";     /////modi1
             
                            String cad2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin+1,cadenaLista.size()));          /////modi1
      
                            subfinal = cad1 + " " + subnuevo + " " + cad2;                        /////modi1                                                               /////modi1
                            String subfinal2 = rem.rem(subfinal);                            //// ///////modi2////////rem
                            
                            String nuevo3 = D1Return.D1(subfinal2);
                            
                            String cadena1 = MiniLibrary.ListToString(cadenaLista.subList(0, inicio)) + " ";
                            
                            String cadena2 = " " + MiniLibrary.ListToString(cadenaLista.subList(fin+1,cadenaLista.size() - 1)) + " "; /////////modi1
                                           
                            cadena = nuevo3;
                            
                            
                            
                        }
                        
                    
                    }
                }
                else if("(".equals(cadenaLista.get(INDEX+1)) && !"i".equals(cadenaLista.get(INDEX-1))){   
                    int inicio5 = 0;
                    int fin5 = 0;
                    ArrayList<String>cadenaListaQ = MiniLibrary.split(cadena);
                    int X5 = 0;
                    int Y5 = 0;
                    ArrayList<Integer>Y1 = new ArrayList<>();
                    List<String>tr5 = cadenaListaQ.subList(INDEX,cadenaLista.size());
                    ListIterator<String>it5 = tr5.listIterator();
                    while(it5.hasNext()){
                        String x = it5.next();
                        if(x.equals("(")){
                            X5 += 1;
                        }
                        
                        else if(x.equals(")")){
                            Y1.add(cadenaListaQ.indexOf(x));
                            it5.remove();
                            it5.add(">");
                            Y5 += 1;
                            if(X5 == Y5){
                                fin5 = Collections.max(Y1);
                                inicio5 = INDEX + 2;
                                
                            }
                           
                        }
                        
                }
                    
                
                    
                String cad1Q = MiniLibrary.ListToString(cadenaLista.subList(0, INDEX + 2));
                
                String Cen = MiniLibrary.ListToString(cadenaLista.subList(inicio5, fin5));
                
                String cad2Q = MiniLibrary.ListToString(cadenaLista.subList(fin5, cadenaLista.size()));
                
                String RR =" " +  DIV2Return.calcula(Cen) + " ";
                               
                String cadenaR = cad1Q + RR + cad2Q;
                
                if(MiniLibrary.OccurrencesString(cadenaR,"/") > 0){
                    cadena = DIV1Return.DIV1(cadenaR);
                }else{
                    cadena = cadenaR;
                }        
                                       
                    
                }
                
                else if(!"(".equals(cadenaLista.get(INDEX+1)))   { 
                    int inicio;
                    if(INDEX>3) {
                        if(Collections.frequency(cadenaLista.subList(INDEX-4, INDEX), "+")> 0)  {
                            inicio = INDEX + cadenaLista.subList(INDEX-4, INDEX).indexOf("+")-3;
                            
                        }
                        else if(Collections.frequency(cadenaLista.subList(INDEX-4, INDEX), "-")>0)   {
                            inicio = INDEX + cadenaLista.subList(INDEX-4, INDEX).indexOf("-")-3;
                            
                        }
                        else if(Collections.frequency(cadenaLista.subList(INDEX-4, INDEX), "/")>0)  {
                            inicio = INDEX + cadenaLista.subList(INDEX-4, INDEX).indexOf("/")-3;
                            
                        }
                        else    {
                            inicio = INDEX + cadenaLista.subList(INDEX-3, INDEX).indexOf("(")-3;
                            
                        }
                    }
                    else    {
                        inicio = 0;
                    }
                    int fin;
                    if(Collections.frequency(cadenaLista.subList(INDEX+2,cadenaLista.size()), "+") != 0)  { 
                        if(Collections.frequency(cadenaLista.subList(INDEX+2,cadenaLista.size()), "-") != 0) {
                            ArrayList<Integer> ff = new ArrayList<>();
                            ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+"));
                            ff.add(cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-"));
                            fin = INDEX + Collections.min(ff);
                            
                        }
                        else    {
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("+");
                            
                        }
                    }
                    else    {
                        if(Collections.frequency(cadenaLista.subList(INDEX+2,cadenaLista.size()), "-") != 0)  { 
                            fin = INDEX + cadenaLista.subList(INDEX, cadenaLista.size()).indexOf("-");
                            
                        }
                        else    {
                            fin = cadenaLista.size();
                            
                        }
                    }
                    String cadena1;             ///////////modi2
                    String viejo4 = null;       //////////modi2
                    if(!"(".equals(cadenaLista.get(inicio))) {                                      /////////modi2
                       viejo4 = MiniLibrary.ListToString(cadenaLista.subList(inicio, fin));         /////////modi2**************errr
                       
                    }                                                                               /////////modi2
                    else    {                                                                       /////////modi2
                        viejo4 = MiniLibrary.ListToString(cadenaLista.subList(inicio+1, fin));      /////////modi2
                    }                        
                    
                    String nuevo4 = D_iReturn.D_i(viejo4) + " ";
                    
                    
                    if ("(".equals(cadenaLista.get(inicio))) {                                          //////////modi2
                        cadena1 = MiniLibrary.ListToString(cadenaLista.subList(0, inicio + 1)) + " ";   //////////modi2
                    }                                                                                   //////////modi2
                    else {                                                                              //////////modi2
                        cadena1 = MiniLibrary.ListToString(cadenaLista.subList(0, inicio)) + " ";       //////////modi2
                    }          
                    
                    
                    String cadena2 = MiniLibrary.ListToString(cadenaLista.subList(fin,cadenaLista.size()));
                    
                    cadena = cadena1 + nuevo4 + cadena2;
                    
                    
                }
                count -= 1;
            }
            
            
        }
        
        }
        
        return cadena;
        
        
       
        }
    }
        
    
    

