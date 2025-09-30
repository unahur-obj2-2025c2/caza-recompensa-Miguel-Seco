package ar.edu.unahur.obj2.Cazador.Cazador;

import ar.edu.unahur.obj2.Cazador.Profugable;

public class CazadorUrbano extends Cazador {

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugable unProfugo) {
        return !unProfugo.esNervioso();
    }

    @Override
    protected void intimidacionEspecifica(Profugable unProfugo) {
        unProfugo.dejarDeEstarNervioso();
    }

    
    

    

}
