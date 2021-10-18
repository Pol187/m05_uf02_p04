package cat.copernic.jmendezv

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MainKtTest {
    @Test
    fun IMC() {
    }

    @Test
    fun equSegundoGrado() {
        assertEquals(0.004330519548673002,IMC(231.321,231.12))
    }

    @Test
    fun distanciaEntre2Puntos() {
assertEquals(110.99717659922709, cat.copernic.jmendezv.distanciaEntre2Puntos(Punto(213.123,321.123),Punto(213.321,432.12)))
    }

    @Test
    fun pendiente() {
        assertEquals(38.425752950248324, Pendiente(Punto(1234.312,43123.123),(Punto(123.3123,432.123))))
    }

    @Test
    fun puntoMedio() {
        assertEquals(Punto(x=722.623, y=16232.7325), cat.copernic.jmendezv.puntoMedio(Punto(213.123,321.123),Punto(1232.123,32144.342)))
    }

    @Test
    fun calificacion() {
        assertEquals("No supera", cat.copernic.jmendezv.calificacion(3.2))
    }

    @Test
    fun maxMin() {
        assertEquals(Pair(1,7), cat.copernic.jmendezv.maxMin(arrayListOf(2,3,1,4,7,6,5)))
    }

    @Test
    fun masCercano() {
    }


}
