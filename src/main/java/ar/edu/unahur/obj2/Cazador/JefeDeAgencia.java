package ar.edu.unahur.obj2.Cazador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


import ar.edu.unahur.obj2.Cazador.Cazador.Cazador;
import ar.edu.unahur.obj2.Cazador.Zona.Zona;

public class JefeDeAgencia {
    private static JefeDeAgencia instancia = new JefeDeAgencia();
    private List<Cazador> cazadoresDeLaAgencia;
    private List<Profugable> profugosCapturados;

    private JefeDeAgencia() {
        this.cazadoresDeLaAgencia = new ArrayList<Cazador>();
        this.profugosCapturados = new ArrayList<Profugable>();
    }

    public static JefeDeAgencia getInstancia(){
        return instancia;
    }
    
    public Integer todosLosProfugosCapturados(){
        return profugosCapturados.size();
    }

    public Profugable profugoMasHabilCapturado(){
        return profugosCapturados.stream().max(Comparator.comparingInt(p -> p.getHabilidad())).orElseThrow();        
    }

    // map -> transforma
    // filter -> filtra
    // soul -> ?  
    
    public Cazador cazadorConMasCapturasRealizadas(){
        return cazadoresDeLaAgencia.stream().max(Comparator.comparingInt(c -> c.cantidadDeCapturados())).orElseThrow();
                    
    }

    public void agregarProfugo(Profugo unProfugo){
        profugosCapturados.add(unProfugo);
    }

    public void agregarProfugosCapturados(){
        this.cazadoresDeLaAgencia.stream().forEach(c -> this.profugosCapturados.addAll(c.getCapturados()));


    }

    public void enviarCazador (Zona unaZona, Cazador unCazador){
        unCazador.realizarCapturaEnZona(unaZona);
    }

}
