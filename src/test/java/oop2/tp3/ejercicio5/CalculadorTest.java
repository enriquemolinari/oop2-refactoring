package oop2.tp3.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void test01() {
        var eventos = cargarEventos();
        var factura = crearFactura();

        assertEquals("Facturación para c1\n" +
                "Escuela de Rock: 156400.0. Asientos: 158\n" +
                "Hamlet: 113000.0. Asientos: 103\n" +
                "El Perfume: 40000.0. Asientos: 8\n" +
                "Monto ganado: 309400.0\n" +
                "Créditos ganados: 232.0\n", new Calculador().reporte(factura, eventos));

    }

    private List<Evento> cargarEventos() {
        return List.of(new Evento("Escuela de Rock", "Comedia"),
                new Evento("Hamlet", "Drama"),
                new Evento("El Avion", "Dram"),
                new Evento("Cantando en la playa", "Comedia"),
                new Evento("El Perfume", "Drama")
        );
    }

    private Factura crearFactura() {
        return new Factura("c1", List.of(new Comedia("Escuela de Rock", 158),
                new Drama("Hamlet", 103),
                new Drama("El Perfume", 8)));
    }

}
