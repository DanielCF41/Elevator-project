package engtelecom.poo;

import java.util.ArrayList;

public class PainelInterno {

    private ArrayList<Botao> botoes;

    public PainelInterno(int i){
        this.botoes = new ArrayList<>(i);
        for (int j = 0; j < i; j++) {
            botoes.add(new Botao());
        }
    }

    public void ativarAndar(int i){
        Botao botaoAux = botoes.get(i);
        botaoAux.ativar();
    }
    public void desativarAndar(int i){
        Botao botaoAux = botoes.get(i);
        botaoAux.desativar();
    }

    public ArrayList<Botao> getBotoes() {
        return botoes;
    }
}
