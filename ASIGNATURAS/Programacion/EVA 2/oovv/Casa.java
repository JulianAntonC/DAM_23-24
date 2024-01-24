package oovv;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Casa {

    private static final double SUPERFICIE_MINIMA = 43.5;
    private static int contadorCasa;
    private String calle;
    private int numCalle;
    private String poblacion;
    private double superficie = SUPERFICIE_MINIMA;
    private boolean hasGarage;
    private int edadCasa;


    public Casa() {
        incrementaContadorCasas();
    }

    public Casa(String calle, int numCalle, String poblacion, double superficie, boolean hasGarage, int edadCasa) {
        this(calle, numCalle, poblacion);
        this.superficie = superficie;
        this.hasGarage = hasGarage;
        this.edadCasa = edadCasa;
    }

    public Casa(String calle, int numCalle, String poblacion) {
        this();
        this.calle = calle;
        this.numCalle = numCalle;
        this.poblacion = poblacion;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {}

    public int getNumCalle() {
        return numCalle;
    }
    public void setNumCalle(int numCalle) {}

    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {}

    public double getSuperficie() {
        return  superficie;
    }
    public void setSuperficie(double superficie) {}

    public boolean isHasGarage() {
        return hasGarage;
    }
    public void setHasGarage(boolean hasGarage) {}

    public int getEdadCasa() {
        return edadCasa;
    }
    public void setEdadCasa(int edadCasa) {}

    public void incrementaContadorCasas(){
        contadorCasa++;
    }
    public static int getContadorCasa() {return contadorCasa;}
    public void setContadorCasa(int contadorCasa) {
        Casa.contadorCasa = contadorCasa;
    }

    public boolean esVocal(String poblacion) {
        Pattern inicial = Pattern.compile("^[aeiouAEIOU].*");
        Matcher vocal = inicial.matcher(poblacion);
        return vocal.matches();
    }

    public String getFullAdress() {
        return "C/ " + this.getCalle() + " nº " + this.getNumCalle() + (this.esVocal(poblacion)? " d'" : " de ") + this.getPoblacion();
    }

    public String getInfo() {
        return this.getFullAdress() + " " + superficie + "m\u00b2 " + (hasGarage? "tiene garaje " : "no tiene garaje ") + "Antiguedad " + edadCasa;
    }

}
