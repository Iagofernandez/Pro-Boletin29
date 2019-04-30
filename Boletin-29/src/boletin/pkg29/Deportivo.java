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
public class Deportivo extends Generico {
    private int cabalos;

    public Deportivo() {
    }

    public Deportivo(int cabalos, float eslora, int dia, String ID) {
        super(eslora, dia, ID);
        this.cabalos = cabalos;
    }
    

    public int getCabalos() {
        return cabalos;
    }

    public void setCabalos(int cabalos) {
        this.cabalos = cabalos;
    }
    
    

    @Override
    public void CalcularPrecio() {
       float prezo = 10 * super.getEslora()*super.getDia()+2*cabalos;
       super.setPrezo(prezo);
    }

    @Override
    public String toString() {
        return "Deportivo{" + "cabalos=" + cabalos + '}';
    }
    
    
    
}
