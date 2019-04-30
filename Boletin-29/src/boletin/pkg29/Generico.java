/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg29;

/**
 *
 * @author ifernandezblanco
 */
public abstract class Generico {

    float eslora;
    private float prezo;
    int dia;
    String ID;

    public Generico() {
    }

    public Generico(float eslora, int dia, String ID) {
        this.eslora = eslora;
        this.dia = dia;
        this.ID = ID;
    }

    public Generico(float eslora, float prezo, int dia) {
        this.eslora = eslora;
        this.prezo = prezo;
        this.dia = dia;
    }
    

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public abstract void CalcularPrecio();

    @Override
    public String toString() {
        return "Generico{" + "eslora=" + eslora + ", prezo=" + prezo + ", dia=" + dia + ", ID=" + ID + '}';
    }

    
}
