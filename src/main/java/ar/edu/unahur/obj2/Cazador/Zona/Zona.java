package ar.edu.unahur.obj2.Cazador.Zona;

import java.util.ArrayList;

import java.util.List;

import ar.edu.unahur.obj2.Cazador.Profugable;
import ar.edu.unahur.obj2.Cazador.Profugo;

public class Zona {
    private String nombre;
    private List<Profugable> habitantesProfugos;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.habitantesProfugos = new ArrayList<Profugable>();
    }
    public void agregarProfugo(Profugo unProfugo){
        habitantesProfugos.add(unProfugo);
    }
    public List<Profugable> habitantes(){
        return habitantesProfugos;
    }
    public void quitarProfugo(Profugable unProfugo){
        habitantesProfugos.remove(unProfugo);
    }

    public String getNombre() {
        return nombre;
    }
    

    
}
    


// serCapturado o ser intimidado cuando el cazador caza
    

/*
 * public enviarCazador(Zona unaZona, Cazador unCazador){
 * 
 *     unCazador.realizarCapturaEnZona(unZona);
 * 
 * }
 */









