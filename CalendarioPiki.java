
/**
 * Write a description of class CalendarioPiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioPiki
{
    // instance variables - replace the example below with your own
    private int dia;
    
    private int mes;
    
    private int año;

    /**
     * Constructor for objects of class CalendarioPiki
     */
    public CalendarioPiki()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        año = 01;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void introducirFecha(int d,int m,int a)
    {
        
        dia = d;
        mes = m;
        año = a;
        
    }
    
    /**
     * Permita, a través de un método, avanzar en un día la fecha almacenada. El método deberá de preocuparse de que la nueva fecha del objeto sea una fecha legal teniendo en cuenta que
     * No vamos a preocuparnos por los años bisiestos.
     * Todos los meses van a tener para nosotros 30 días
     */
    public void avanzarFecha () {
        if(dia < 30) {
            
        dia = dia + 1;
        
    }
    else if (mes <12){
        dia = 1;
        mes = mes + 1;
    }
    else {
        mes = 1;
        año = año + 1;
}
}
    /**
     * metodo que devuelve la fecha actual
     */
public String mostrarFecha(){
       String Fecha = String.format("%02d",dia) + "-" + String.format("%02d",mes) + "-" + String.format("%02d",año);
       return Fecha;
    }
}


