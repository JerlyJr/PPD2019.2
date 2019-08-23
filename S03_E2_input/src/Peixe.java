public class Peixe {
    int barriga;
    int maxBarriga;
    boolean estaVivo;

    Peixe (int barriga){
        this.barriga = barriga;
        this.maxBarriga = barriga;
        this.estaVivo = true;
    }

    @Override
    public String toString() {
        return barriga + "/" + maxBarriga;
    }

    boolean testarVida(){
        if (estaVivo == true){
            return true;
        }else{
            System.out.println("Peixe esta morto");
            return false;
        }
    }
    void alimentar (int quantidade){
        if(testarVida()){
        this.barriga = this.barriga + quantidade;
        if (this.barriga > this.maxBarriga){
            estaVivo = false;
            System.out.println("peixe expludiu");
        }else{
            System.out.println("hmmmmmmmm");
        }
        }


    }
    void esperar(){
        if(testarVida()){
            this.barriga = this.barriga - 1;
            if (barriga < 0){
                estaVivo = false;
                System.out.println("Peixe foi esquecido e morreu");
            }else{
                System.out.println("Peixe Nada");
            }
        }

    }
}
