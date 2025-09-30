package ar.edu.unahur.obj2.Cazador.Cazador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Cazador.EntrenamientoArtesMarciales;
import ar.edu.unahur.obj2.Cazador.Profugable;
import ar.edu.unahur.obj2.Cazador.Profugo;
import ar.edu.unahur.obj2.Cazador.ProfugoDecorado;
import ar.edu.unahur.obj2.Cazador.Zona.Zona;

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

    @Test
    void dadoUnCazadorUrbanoCapturaUnProfugoEnZona() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugo p = new Profugo(40, 70, false);
        Zona z = new Zona("rural");
        z.agregarProfugo(p);
        c.capturar(p, z);
        assertFalse(z.habitantes().contains(p));
        assertTrue(c.getCapturados().contains(p));
    }

    @Test
    void dadoUnCazadorUrbanoNoPuedeCapturaUnProfugoEnZonaYLoIntimida() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugo p = new Profugo(40, 70, true);
        Zona z = new Zona("rural");
        z.agregarProfugo(p);
        c.capturar(p, z);
        assertTrue(z.habitantes().contains(p));
        assertFalse(p.esNervioso());
    }

    @Test
    void dadoUnProfugoEntrenaArteMarcialesYDuplicaSuHabilidad() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugable p = new Profugo(40, 40, true);
        ProfugoDecorado m = new EntrenamientoArtesMarciales(p);
        assertEquals(80, m.getHabilidad());
        assertTrue(m.esNervioso());
        
    }


}