package ar.edu.unahur.obj2.Cazador;

public class CazadorRural extends Cazador {

     
    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }
    @Override
    protected Boolean condicionEspecifica(Profugo unProfugo) {
        return unProfugo.EstaNervioso();
    }

}
