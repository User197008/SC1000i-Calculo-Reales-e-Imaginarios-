package calculadora;

public class Operaciones {
    
    public static double sin(String cadena)    {
        
            float value = Float.parseFloat(cadena);
            double seno = Math.sin(Math.toRadians(value));
            return seno;
        }
    
    
    public static double cos(String cadena)    {
        
            float value = Float.parseFloat(cadena);
            double coseno = Math.cos(Math.toRadians(value));
            return coseno;
        }
        
      
    
    public static double tan(String cadena)    {
       
        float value = Float.parseFloat(cadena);
        double tangente = Math.tan(Math.toRadians(value));
        return tangente;
    }
        
    
    
    
    public static double arcsin(String cadena)  {
       
        float value = Float.parseFloat(cadena);
        double arcseno = Math.asin(Math.toRadians(value));
        return arcseno;
    }
       
    
    
    public static double arccos(String cadena)    {
        
            float value = Float.parseFloat(cadena);
            double arccoseno = Math.acos(Math.toRadians(value));
            return arccoseno;
        }
       
    
     public static double arctan(String cadena)    {
        
        float value = Float.parseFloat(cadena);
        double arctangente = Math.atan(Math.toRadians(value));
        return arctangente;
    }
    
    
}
