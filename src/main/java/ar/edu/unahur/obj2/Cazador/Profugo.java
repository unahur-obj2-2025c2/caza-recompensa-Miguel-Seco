package ar.edu.unahur.obj2.Cazador;


public class Profugo {

    private Integer inocencia;
    private Integer habilidad;
    private Boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    public Integer getInocencia() {
        return inocencia;
    }

    public Boolean EstaNervioso() {
        return esNervioso;
    }

    public Integer getHabilidad() {
        return habilidad;
    }

    public void disminuirInocencia() {
        inocencia = Integer.max(0,inocencia - 2);
    }

    public void reducirHabilidad() {
        habilidad = Integer.max(0, habilidad - 5);
    }
    

}
