public class Celular {
    String marca;
    String modelo;
    String tamanho;
    String resolucaoDaTela;
    String resolucaoDaCamere
    int bateria;

}


public class Serie{
    String nome;
    String dataDeLancamento;
    String estudio;
    String diretor;
    String elenco
    int quantidadeDeTemporadas;
    int quantidadeDeEpisódios;

}
void desligar(){
    if (estaligado == false){
        System.out.println("Já está desligada");
        return;
    }estaligado= false;
    System.out.println("desligando moto");
}