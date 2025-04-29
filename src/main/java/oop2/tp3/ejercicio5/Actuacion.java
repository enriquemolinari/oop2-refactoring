package oop2.tp3.ejercicio5;

public abstract class Actuacion {
    private String nombreEvento;
    private int numberoEspectadores;


    public Actuacion(String nombreEvento, int numberoEspectadores) {
        this.nombreEvento = nombreEvento;
        this.numberoEspectadores = numberoEspectadores;
    }

    protected int espectadores() {
        return this.numberoEspectadores;
    }

    protected float calcularCreditos() {
        return Math.max(this.espectadores() - 30, 0);
    }

    public abstract float adicionalCreditos();

    public abstract float calcularMonto();

    public String nombreEvento() {
        return nombreEvento;
    }
}
