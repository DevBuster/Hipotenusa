package logica;

import javax.swing.JOptionPane;

public class LogicaHipotenusa {

    private int cateto_uno;
    private int cateto_dos;
    int hipotenusa;

    // CONSTRUCTOR
    public LogicaHipotenusa(int cateto_uno, int cateto_dos) {
        this.cateto_uno = cateto_uno;
        this.cateto_dos = cateto_dos;
    }

    public void CalcularHipotenusa() {
        hipotenusa = (int) Math.sqrt(Math.pow(cateto_uno, 2) + Math.pow(cateto_dos, 2));
    }

    public void ImprimirHipotenusa() {
        CalcularHipotenusa();
        JOptionPane.showMessageDialog(null, hipotenusa, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }

    public int getCateto_uno() {
        return cateto_uno;
    }

    public void setCateto_uno(int cateto_uno) {
        this.cateto_uno = cateto_uno;
    }

    public int getCateto_dos() {
        return cateto_dos;
    }

    public void setCateto_dos(int cateto_dos) {
        this.cateto_dos = cateto_dos;
    }
}
