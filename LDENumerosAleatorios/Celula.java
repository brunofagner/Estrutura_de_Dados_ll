package LDENumerosAleatorios;

public class Celula {
    Celula proxima;
    Celula anterior;
    Object elemento;

    Celula(Celula proxima, Object elemento){
        this.proxima = proxima;
        this.anterior = null;
        this.elemento = elemento;
    }

    Celula(Object elemento){
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(Celula proxima){
        this.proxima = proxima;
    }
    public Celula getProxima() {
        return this.proxima;
    }

    void setAnterior(Celula anterior){
        this.anterior = anterior;
    }
    public Celula getAnterior() {
        return this.anterior;
    }

    public Object getElemento() {
        return this.elemento;
    }
}
