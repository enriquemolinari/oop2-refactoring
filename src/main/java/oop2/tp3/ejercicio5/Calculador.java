package oop2.tp3.ejercicio5;

import java.util.List;


public class Calculador {

    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        float volumeCredits = 0;
        var result = "Facturación para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            float monto = 0;

//            var tipo = eventos.stream()
//                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
//                    .findFirst()
//                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"))
//                    .tipo();
            monto = actuacion.calcularMonto();
//            switch (tipo) {
//                case "Drama":
//                    monto = 40000;
//                    if (actuacion.numberoEspectadores() > 30) {
//                        monto += 1000 * (actuacion.numberoEspectadores() - 30);
//                    }
//                    break;
//                case "Comedia":
//                    monto = 30000;
//                    if (actuacion.numberoEspectadores() > 20) {
//                        monto += 10000 + 500 * (actuacion.numberoEspectadores() - 20);
//                    }
//                    monto += 300 * actuacion.numberoEspectadores();
//                    break;
//                default:
//                    throw new RuntimeException("Tipo de evento no conocido");
//            }

            // creditos a ganar
            volumeCredits += actuacion.calcularCreditos();
            // creditos extras para comedia
//            if ("Comedia".equals(tipo)) {
//                volumeCredits += Math.floor(actuacion.numberoEspectadores() / 5);
//            }
            volumeCredits += actuacion.adicionalCreditos();

            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.espectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;
        }
        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Créditos ganados: " + volumeCredits + System.lineSeparator();

        return result;
    }
}
