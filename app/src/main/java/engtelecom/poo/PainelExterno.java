package engtelecom.poo;

public class PainelExterno {

    private Botao subir;
    private Botao descer;

    public PainelExterno(){
        this.subir = new Botao();
        this.descer = new Botao();
    }

    public void ativarBotaoSubir(){
        subir.ativar();
    }

    public void ativarBotaoDescer(){
        descer.ativar();
    }

    public void desativarBotaoSubir(){
        subir.desativar();
    }

    public void desativarBotaoDescer(){
        descer.desativar();
    }

    public Botao getSubir() {
        return subir;
    }

    public Botao getDescer() {
        return descer;
    }
}
