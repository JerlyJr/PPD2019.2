public class Lapiseira {
    private String marca;
    private double ponta;
    private Grafite grafite;

    public Lapiseira(String marca, double ponta, int tamanhoGrafite){
        this.marca = marca;
        this.ponta = ponta;
        this.grafite = null;

    }

    @Override
    public String toString() {
        return "Lapiseira{" +
                "marca='" + marca + '\'' +
                ", ponta=" + ponta +
                ", grafite=" + grafite +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public Grafite getGrafite() {
        return grafite;
    }

    public void setGrafite(Grafite grafite) {
        this.grafite = grafite;
    }

    public void escrever(int quantidade){
        if (grafite.getTamanhoGrafite() >= quantidade){
            grafite.setTamanhoGrafite(-quantidade);
            System.out.println("escrevendo...");

        }else{
            System.out.println("grafite insuficiente");
        }
    }
    public void colocarGrafite(double ponta, int tamanho){
        if (grafite.getPonta() == this.ponta){
            grafite.setTamanhoGrafite(tamanho);
            grafite.setPonta(ponta);
        }else{
            System.out.println("ponta do grafite Incompatível");
        }
    }
}
