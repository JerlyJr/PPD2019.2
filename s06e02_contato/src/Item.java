public class Item {
   private String nome;
   private int valorDeDefesa;
   private int pontosDeVida;
   private int durabilidade;

   public Item(){

   }

   public Item(String nome, int valorDeDefesa, int pontosDeVida, int durabilidade){
       this.nome = nome;
       this.valorDeDefesa = valorDeDefesa;
       this.pontosDeVida = pontosDeVida;
       this.durabilidade = durabilidade;
   }

    @Override
    public String toString() {
        return "\n" +
                "Nome: " + nome + "\n" +
                "Defesa: " + valorDeDefesa +"\n"+
                "Pontos de Vida: " + pontosDeVida +"\n"+
                "Durabilidade: " + durabilidade + "\n";
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

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
