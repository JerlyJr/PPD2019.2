public class Grafite {
    private double ponta;
    private int tamanhoGrafite;

    public Grafite(double ponta,int tamanhoGrafite){
        this.ponta = ponta;
        this.tamanhoGrafite = tamanhoGrafite;

    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getTamanhoGrafite() {
        return tamanhoGrafite;
    }

    public void setTamanhoGrafite(int tamanhoGrafite) {
        this.tamanhoGrafite = this.tamanhoGrafite += tamanhoGrafite;
    }
}
