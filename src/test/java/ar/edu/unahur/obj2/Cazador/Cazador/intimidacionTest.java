package ar.edu.unahur.obj2.Cazador.Cazador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Cazador.Profugo;

public class intimidacionTest {

    @Test
    public void urbanoIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorUrbano c = new CazadorUrbano(10);
    Profugo p = new Profugo(40, 50, true);
    c.intimidar(p);
    assertFalse(p.esNervioso());
    assertEquals(Integer.valueOf(38), p.getInocencia());
    }

    @Test
    public void ruralIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorRural c = new CazadorRural(10);
    Profugo p = new Profugo(40, 50, false);
    c.intimidar(p);
    assertTrue(p.esNervioso());
    assertEquals(Integer.valueOf(38), p.getInocencia());
    }

     @Test
    public void sigilosoIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorSigiloso c = new CazadorSigiloso(10);
    Profugo p = new Profugo(40, 50, false);
    c.intimidar(p);
    assertFalse(p.esNervioso());
    assertEquals(Integer.valueOf(45), p.getHabilidad());
    }

}
