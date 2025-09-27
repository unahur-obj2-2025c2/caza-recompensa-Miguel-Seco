package ar.edu.unahur.obj2.Cazador;

public class CazadorUrbano extends Cazador {

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo unProfugo) {
        return ! unProfugo.EstaNervioso();
    }


    

}
