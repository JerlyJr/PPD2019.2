import java.util.ArrayList;

public class Iventário {
    private int espacos;
    public ArrayList<Item> itens;

    public Iventário(int espacos){
        this.espacos = espacos;
        this.itens = new ArrayList<Item>();
        for (int i = 0; i < espacos; i++) {
            this.itens.add(null);
        }
    }

    public String toString() {
        String out = "Slots: " + espacos + "\n" + "Itens: " + "\n";
        for (Item itens : itens){
            if (this.itens == null) {
               out += "[Vazio]" + "\n";
            }
            if (this.itens != null)
                out += itens;
            }

        return out;
    }


    public int getEspacos() {
        return espacos;
    }

    public void setEspacos(int espacos) {
        this.espacos = espacos;
    }
    public void addItem(int posicao, String nome, int valorDeDefesa, int pontosDeVida, int preco){
        if (itens != null){
        itens.set(posicao, new Item(nome,valorDeDefesa,pontosDeVida,preco));
        }else{
        System.out.println("não há espaço para mais itens");
        }
    }
}
