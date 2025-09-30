package ar.edu.unahur.obj2.Cazador.Cazador;

import ar.edu.unahur.obj2.Cazador.Profugable;

public class CazadorSigiloso extends Cazador {

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugable unProfugo) {
        return unProfugo.getHabilidad() < 50;
    }

    @Override
    protected void intimidacionEspecifica(Profugable unProfugo) {
        unProfugo.reducirHabilidad();
    }

    

}
