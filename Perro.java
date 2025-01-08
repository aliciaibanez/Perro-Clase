/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    private String tipoPelo;
    private int edad;
    private boolean ppp;

    /**
     * Constructor for objects of class Perro
     */
    public Perro(int esEdad, String esTipoPelo)
    {
        ppp = false;
        edad = esEdad;
        tipoPelo = esTipoPelo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String gettipoPelo ()
    {
        // put your code here
        return tipoPelo;
    }

    public int getedad ()
    {
        // put your code here
        return edad;
    }

    public boolean getppp ()
    {
        // put your code here
        return ppp;
    }

    public void settipoPelo (String esTipoPelo)
    {
        tipoPelo = esTipoPelo;
    }

    public void setcuantosAñosTendraEn (int año)
    {
        edad = edad + año;
    }

    public void setppp ()
    {
        if (ppp == false)
        { 
            ppp = true;
        }
        else {
            ppp = false;
        }
    }
}