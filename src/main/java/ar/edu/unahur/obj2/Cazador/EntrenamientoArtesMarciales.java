package ar.edu.unahur.obj2.Cazador;

public class EntrenamientoArtesMarciales extends ProfugoDecorado {

    public EntrenamientoArtesMarciales(Profugable profugoPosible) {
        super(profugoPosible);
    }

    @Override
    protected Integer doGetHbilidad() {
        return Integer.min(100,profugoPosible.getHabilidad() * 2);
    }

    @Override
    protected Boolean doEsNervioso() {
        return profugoPosible.esNervioso();
    }

    @Override
    protected Integer doGetInocencia() {
        return profugoPosible.getInocencia();
    }

    

   
}
