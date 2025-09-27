package ar.edu.unahur.obj2.Cazador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class intimidacionTest {

    @Test
    public void urbanoIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorUrbano c = new CazadorUrbano(10);
    Profugo p = new Profugo(40, 50, true);
    c.intimida(p);
    assertFalse(p.EstaNervioso());
    assertEquals(Integer.valueOf(40), p.getInocencia());
    }

    @Test
    public void ruralIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorUrbano c = new CazadorUrbano(10);
    Profugo p = new Profugo(40, 50, false);
    c.intimida(p);
    assertTrue(p.EstaNervioso());
    assertEquals(Integer.valueOf(40), p.getInocencia());
    }

     @Test
    public void sigilosoIntimidaYDeEstarNerviosoYDisminuyeInociencia(){ 
    CazadorUrbano c = new CazadorUrbano(10);
    Profugo p = new Profugo(40, 50, false);
    c.intimida(p);
    assertFalse(p.EstaNervioso());
    assertEquals(Integer.valueOf(40), p.getInocencia());
    }

}
