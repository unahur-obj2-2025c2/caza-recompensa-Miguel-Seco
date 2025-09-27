package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Cazador.CazadorRural;
import ar.edu.unahur.obj2.Cazador.CazadorSigiloso;
import ar.edu.unahur.obj2.Cazador.CazadorUrbano;
import ar.edu.unahur.obj2.Cazador.Profugo;

public class CazadorTest {
    @Test
    void cazadorUrbanoCapturaSiExperienciaMayorYNoNervioso() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugo p = new Profugo(40, 70, false);
        assertTrue(c.puedeCapturar(p));
    }

    @Test
    void cazadorRuralNoCapturaSiEstaNervioso() {
        CazadorRural c = new CazadorRural(70);
        Profugo p = new Profugo(30, 60, true);
        assertTrue(c.puedeCapturar(p));
    }

    @Test
    void cazadorSigilosoNoCapturaSiHibildadAlta() {
        CazadorSigiloso c = new CazadorSigiloso(80);
        Profugo p = new Profugo(20, 90, true);
        assertFalse(c.puedeCapturar(p));
    }


}
