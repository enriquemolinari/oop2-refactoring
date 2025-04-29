package oop2.tp3.ejercicio5;

public class Comedia extends Actuacion {
    public Comedia(String nombreEvento, int numberoEspectadores) {
        super(nombreEvento, numberoEspectadores);
    }

    @Override
    public float adicionalCreditos() {
        return (float) Math.floor(this.espectadores() / 5);
    }

    @Override
    public float calcularMonto() {
        float monto = 30000;
        if (this.espectadores() > 20) {
            monto += 10000 + 500 * (this.espectadores() - 20);
        }
        monto += 300 * this.espectadores();
        return monto;
    }
}
