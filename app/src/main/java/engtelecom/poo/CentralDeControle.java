package engtelecom.poo;

import java.util.ArrayList;

public class CentralDeControle {
    private PainelInterno painelInterno;
    private ArrayList<PainelExterno> paineis;
    private int andarAtualElevador;
    private String direcao;

    // Inicialização Central de Controle
    public CentralDeControle(int i){
        this.paineis = new ArrayList<>(i);
        for (int j = 0; j < i; j++) {
            paineis.add(new PainelExterno());
        }
        this.painelInterno = new PainelInterno(i);
        this.andarAtualElevador = 0;
        this.direcao = "Parado";
    }

    public int getAndarAtualElevador() {
        return andarAtualElevador;
    }
    public void setAndarAtualElevador(int andarAtualElevador) {
        this.andarAtualElevador = andarAtualElevador;
    }

    public String getDirecao() {
        return direcao;
    }
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public PainelInterno getPainelInterno() {
        return painelInterno;
    }
    public ArrayList<PainelExterno> getPaineis() {
        return paineis;
    }

}
