package ar.edu.unahur.obj2.Cazador;


public class Profugo implements Profugable{

    private Integer inocencia; // entre mas bajo es mas culpable se lo considera
    private Integer habilidad; // lo determina la capacidad de evadir la captura
    private Boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    @Override
    public Integer getInocencia() {
        return this.inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return this.habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return this.esNervioso;
    }

    @Override
    public void volverseNervioso() {
        esNervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        esNervioso = false;
    }

    @Override
    public void reducirHabilidad() {
         habilidad = Integer.max(0, habilidad - 5);
    }

    @Override
    public void disminuirInocencia() {
        inocencia = Integer.max(0,inocencia - 2);
    }    
    
}
