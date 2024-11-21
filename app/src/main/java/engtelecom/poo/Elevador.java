package engtelecom.poo;

public class Elevador {
    private CentralDeControle centralDeControle;

    // Inicialização Elevador
    public Elevador(int i){
        this.centralDeControle = new CentralDeControle(i);
    }

    // Ações Elevador
    public void subirElevador(){
        centralDeControle.setAndarAtualElevador(centralDeControle.getAndarAtualElevador() + 1);
    }

    public void descerElevador(){
        centralDeControle.setAndarAtualElevador(centralDeControle.getAndarAtualElevador() - 1);
    }

    public void pararElevador(){
        centralDeControle.setDirecao("parado");
    }

    public CentralDeControle getCentralDeControle() {
        return centralDeControle;
    }
}
