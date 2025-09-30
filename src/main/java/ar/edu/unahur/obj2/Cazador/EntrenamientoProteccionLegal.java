package ar.edu.unahur.obj2.Cazador;

public class EntrenamientoProteccionLegal extends ProfugoDecorado {

    public EntrenamientoProteccionLegal(Profugable profugoPosible) {
        super(profugoPosible);
        
    }

    @Override
    protected Boolean doEsNervioso() {
        return profugoPosible.esNervioso();
    }

    @Override
    protected Integer doGetInocencia() {
        return Integer.max(40,profugoPosible.getInocencia());
    }

    @Override
    protected Integer doGetHbilidad() {
        return profugoPosible.getHabilidad();
    }

}
