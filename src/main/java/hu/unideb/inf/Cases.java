package hu.unideb.inf;

public class Cases {

    String teljesnev;
    String ugy;
    String sorszam;
    String idopont;

    public Cases(String teljesnev, String ugy, String sorszam, String idopont) {
        this.teljesnev = teljesnev;
        this.ugy = ugy;
        this.sorszam = sorszam;
        this.idopont = idopont;
    }

    public String getTeljesnev() {
        return teljesnev;
    }

    public void setTeljesnev(String teljesnev) {
        this.teljesnev = teljesnev;
    }

    public String getUgy() {
        return ugy;
    }

    public void setUgy(String ugy) {
        this.ugy = ugy;
    }

    public String getSorszam() {
        return sorszam;
    }

    public void setSorszam(String sorszam) {
        this.sorszam = sorszam;
    }

    public String getIdopont() {
        return idopont;
    }

    public void setIdopont(String idopont) {
        this.idopont = idopont;
    }





}
