package oop2.tp3.ejercicio5;


public class Calculador {

    public static final String FACTURACION_PARA = "Facturación para ";
    public static final String LABEL_ASIENTOS = "Asientos:";
    public static final String LABEL_MONTO_GANADO = "Monto ganado: ";
    public static final String LABEL_CREDITOS_GANADOS = "Créditos ganados: ";

    public String reporte(Factura factura) {
        float totalAmount = 0;
        float volumeCredits = 0;
        var result = FACTURACION_PARA + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = actuacion.calcularMonto();
            volumeCredits += actuacion.calcularCreditos();
            result += actuacion.nombreEvento() + ": " + monto + ". " + LABEL_ASIENTOS + " " + actuacion.espectadores() + System.lineSeparator();
            totalAmount += monto;
        }
        result += LABEL_MONTO_GANADO + totalAmount + System.lineSeparator();
        result += LABEL_CREDITOS_GANADOS + volumeCredits + System.lineSeparator();

        return result;
    }
}
