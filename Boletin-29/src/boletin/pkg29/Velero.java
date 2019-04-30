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
public class Velero extends Generico{
    private int mastil;

    public Velero() {
    }

    public Velero(int mastil, float eslora, int dia, String ID) {
        super(eslora, dia, ID);
        this.mastil = mastil;
    }
    

    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    
    @Override
    public void CalcularPrecio() {
        float prezo = 10* super.getEslora()*super.getDia()+8*mastil;
        super.setPrezo(prezo);
        
    }

    public Velero(int mastil) {
        this.mastil = mastil;
    }
    
    
}
