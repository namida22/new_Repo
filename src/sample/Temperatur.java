package sample;

public class Temperatur {

    private float wert;
    private float masseinheit;
    private int monat;

    public Temperatur(float wert, float masseinheit, int monat) {
        this.wert = wert;
        this.masseinheit = masseinheit;
        this.monat = monat;
    }

    public float getWert() {
        return wert;
    }

    public float getMasseinheit() {
        return masseinheit;
    }

    public int getMonat() {
        return monat;
    }

    public void setWert(float wert) {
        this.wert = wert;
    }

    public void setMasseinheit(float masseinheit) {
        this.masseinheit = masseinheit;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }
}
