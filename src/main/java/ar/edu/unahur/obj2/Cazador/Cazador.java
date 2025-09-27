package ar.edu.unahur.obj2.Cazador;

public abstract class Cazador {
   protected Integer experiencia;

    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Boolean puedeCapturar(Profugo unProfugo) {
    return this.experiencia > unProfugo.getInocencia() && this.condicionEspecifica(unProfugo);
    }

    protected abstract Boolean condicionEspecifica(Profugo unProfugo);
}

// tiene un ---> es un compositeve
// un ---> herencia 
// decorator decide en que momento aplico que


