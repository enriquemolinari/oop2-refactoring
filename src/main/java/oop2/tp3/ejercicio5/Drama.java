package oop2.tp3.ejercicio5;

public class Drama extends Actuacion {

    public Drama(String nombreEvento, int numberoEspectadores) {
        super(nombreEvento, numberoEspectadores);
    }

    @Override
    public float calcularCreditos() {
        return Math.max(this.espectadores() - 30, 0);
    }
    
    @Override
    public float calcularMonto() {
        float monto = 40000;
        if (this.espectadores() > 30) {
            monto += 1000 * (this.espectadores() - 30);
        }
        return monto;
    }
}
