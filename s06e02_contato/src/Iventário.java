import java.util.ArrayList;

public class Iventário {
    private int espacos;
    public ArrayList<Item> itens;

    public Iventário(int espacos){
        this.espacos = espacos;
        this.itens = new Item();
    }

    public String toString() {
        return "Slots: " + espacos + "\n"
              + "Itens: \n";
    }

    public void mostrarIventário(){
        for (int i = 0; i < itens.size(); i++){
            System.out.println(itens.get(i));
        }
    }

    public int getEspacos() {
        return espacos;
    }

    public void setEspacos(int espacos) {
        this.espacos = espacos;
    }
    public void addItem(String nome, int valorDeDefesa, int pontosDeVida, int preco){
        itens.add(new Item(nome,valorDeDefesa,pontosDeVida,preco));
    }
}
