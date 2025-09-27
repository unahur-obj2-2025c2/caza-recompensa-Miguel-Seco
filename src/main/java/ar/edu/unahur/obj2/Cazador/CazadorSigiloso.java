package ar.edu.unahur.obj2.Cazador;

public class CazadorSigiloso extends Cazador {

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo unProfugo) {
        return unProfugo.getHabilidad() < 50;
    }

}
