public class Item {
   private String nome;
   private int valorDeDefesa;
   private int pontosDeVida;
   private int preco;

   public Item(){

   }

   public Item(String nome, int valorDeDefesa, int pontosDeVida, int preco){
       this.nome = nome;
       this.valorDeDefesa = valorDeDefesa;
       this.pontosDeVida = pontosDeVida;
       this.preco = preco;
   }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" +
                "Defesa: " + valorDeDefesa +"\n"+
                "Pontos de Vida:" + pontosDeVida +"\n"+
                "preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorDeDefesa() {
        return valorDeDefesa;
    }

    public void setValorDeDefesa(int valorDeDefesa) {
        this.valorDeDefesa = valorDeDefesa;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
