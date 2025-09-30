package ar.edu.unahur.obj2.Cazador.Cazador;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Cazador.Profugable;
import ar.edu.unahur.obj2.Cazador.Zona.Zona;

public abstract class Cazador {
   protected Integer experiencia;
   private List<Profugable> capturados = new ArrayList<Profugable>();
   private List<Profugable> intimidados = new ArrayList<Profugable>();

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    protected Boolean puedeCapturar(Profugable unProfugo){
        return this.experiencia > unProfugo.getInocencia() && this.condicionEspecifica(unProfugo);
    }

    protected abstract Boolean condicionEspecifica(Profugable unProfugo);

    protected void intimidar(Profugable unProfugo){
        unProfugo.disminuirInocencia();
        this.intimidacionEspecifica(unProfugo);
        intimidados.add(unProfugo);

    }

    protected abstract void intimidacionEspecifica(Profugable unProfugo);

    public Integer cantidadDeCapturados(){
        return capturados.size();
    }

    public void capturar(Profugable unProfugo, Zona unaZona){
        if(puedeCapturar(unProfugo)) {
            capturados.add(unProfugo);
            unaZona.quitarProfugo(unProfugo);

        }else{
            this.intimidar(unProfugo);
        }

        this.sumarExperiencia();
    }

    private void sumarExperiencia(){
        
        experiencia += this.minimaHabilidad() + 2 * getCapturados().size();
    }

    private Integer minimaHabilidad(){
        return intimidados.stream().mapToInt(i -> i.getHabilidad()).min().orElse(0);
    }
   
    public void realizarCapturaEnZona(Zona unaZona){
        unaZona.habitantes().stream().forEach(p -> this.capturar(p, unaZona));
    }

    public List<Profugable> getCapturados() {
        return capturados;
    }

}

// tiene un ---> es un compositeve
// un ---> herencia 
// decorator decide en que momento aplico que


