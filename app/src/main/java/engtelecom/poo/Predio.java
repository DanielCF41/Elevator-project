package engtelecom.poo;

public class Predio {
    private int numAndares;
    private Elevador elevador;

    // Inicialização Prédio
    public Predio (int i){
        this.numAndares = i;
        this.elevador = new Elevador(i);
    }

    public int getNumAndares() {
        return numAndares;
    }
    // Ações Elevador

    public Elevador getElevador() {
        return elevador;
    }
}
