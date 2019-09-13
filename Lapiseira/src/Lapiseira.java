import java.util.ArrayList;

public class Lapiseira {
    private String marca;
    private double ponta;
    private ArrayList<Grafite> grafite;

    public Lapiseira(String marca, double ponta, int tamanhoGrafite){
        this.marca = marca;
        this.ponta = ponta;
        this.grafite.add(null);

    }

    @Override
    public String toString() {
        return "Lapiseira{" +
                "marca='" + marca + '\'' +
                ", ponta=" + ponta +
                ", grafite=" + (grafite.size() - 1)  +
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
        if (quantidade < grafite.){
            grafite.setTamanhoGrafite(-quantidade);
            System.out.println("escrevendo...");

        }else{
            System.out.println("grafite insuficiente");
        }
    }
    public void colocarGrafite(double ponta, int tamanho){
        if (this.ponta == grafite.indexOf(ponta)){
            grafite.add(new Grafite(ponta,tamanho));
        }else{
            System.out.println("ponta do grafite Incompatível");
        }
    }
}
