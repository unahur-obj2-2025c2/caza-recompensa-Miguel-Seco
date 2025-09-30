package ar.edu.unahur.obj2.Cazador;

public class EntrenamientoElite extends ProfugoDecorado{

    public EntrenamientoElite(Profugable profugoPosible) {
        super(profugoPosible);
    }

    @Override
    protected Boolean doEsNervioso() {
        return false;
    }

    @Override
    protected Integer doGetInocencia() {
        return profugoPosible.getInocencia();
    }

    @Override
    protected Integer doGetHbilidad() {
        return profugoPosible.getHabilidad();
    }


  

    

}
