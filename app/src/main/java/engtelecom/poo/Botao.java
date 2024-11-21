package engtelecom.poo;

public class Botao {

    private boolean estado;

    public Botao(){
        this.estado = false;
    }

    public int getEstado() {
        if(estado == true){
            return 1;
        }else{
            return 0;
        }
    }

    public void ativar(){
        this.estado = true;
    }

    public void desativar(){
        this.estado = false;
    }

}
