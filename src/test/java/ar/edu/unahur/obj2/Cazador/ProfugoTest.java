package ar.edu.unahur.obj2.Cazador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProfugoTest {

    @Test
    public void guardaYDevuelveAtributos(){
        Profugo p = new Profugo(50,60,true);
        assertEquals(Integer.valueOf(50),p.getInocencia());
        assertEquals(Integer.valueOf(60),p.getHabilidad());
        assertTrue(p.EstaNervioso());
    }
    

    @Test
    public void disminuirInocenciaYNoBajaDeCero(){
        Profugo p = new Profugo(1,30,true);
        p.disminuirInocencia();
        p.disminuirInocencia();
        assertEquals(Integer.valueOf(0),p.getInocencia());
        assertEquals(Integer.valueOf(30),p.getHabilidad());
        assertTrue(p.EstaNervioso());
    }

    @Test
    public void reducirHabilidadYNoBajaDeCero(){
        Profugo p = new Profugo(10,3,true);
        p.reducirHabilidad();
        p.reducirHabilidad();
        assertEquals(Integer.valueOf(10),p.getInocencia());
        assertEquals(Integer.valueOf(0),p.getHabilidad());
        assertTrue(p.EstaNervioso());
    }

}
