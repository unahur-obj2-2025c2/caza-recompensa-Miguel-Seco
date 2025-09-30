package ar.edu.unahur.obj2.Cazador;

public abstract class ProfugoDecorado implements Profugable {
    protected Profugable profugoPosible;

    public ProfugoDecorado(Profugable profugoPosible) {
        this.profugoPosible = profugoPosible;
        
    }

    @Override
    public Boolean esNervioso() {
        return this.doEsNervioso();
    }

    protected abstract Boolean doEsNervioso();

    @Override
    public Integer getInocencia() {
        return doGetInocencia();
    }

    protected abstract Integer doGetInocencia();

    @Override
    public Integer getHabilidad() {
        return this.doGetHbilidad();
    }
    protected abstract Integer doGetHbilidad();

    @Override
    public void volverseNervioso() {
        profugoPosible.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugoPosible.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugoPosible.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoPosible.disminuirInocencia();
    }

}
