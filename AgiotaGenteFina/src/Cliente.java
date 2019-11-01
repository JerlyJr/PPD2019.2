import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cliente {
    String nome;
    int dinheiro;
    Map<Integer , Transacao> transacoes;

    public Cliente(String nome){
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.transacoes = new TreeMap<Integer, Transacao>();
    }

    @Override
    public String toString() {
        return "nome: " + nome + "|" +
                "Saldo: " + dinheiro;
    }
    void receber(Transacao transacao){

    }
}


