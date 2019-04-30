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
public class Yate extends Generico{
  private int cabalos;
  private int camarote;

    public Yate() {
    }

    public Yate(int cabalos, int camarote, float eslora, int dia, String ID) {
        super(eslora, dia, ID);
        this.cabalos = cabalos;
        this.camarote = camarote;
    }
    

    public int getCabalos() {
        return cabalos;
    }

    public void setCabalos(int cabalos) {
        this.cabalos = cabalos;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

  
    @Override
    public void CalcularPrecio() {
       float prezo = 10*super.getEslora()*super.getDia()+(2*cabalos)+25*camarote;
    }

    @Override
    public String toString() {
        return "Yate{" + "cabalos=" + cabalos + ", camarote=" + camarote + '}';
    }
  
  
}
