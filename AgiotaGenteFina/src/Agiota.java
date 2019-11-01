import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Agiota {
    int saldoag;
    int nextid;
    Repositorio<Cliente> clientes;
    HashMap<Transacao, Integer> transacoes;
    public Agiota(){

    }
    public Agiota(int saldoag) {
        this.saldoag = saldoag;
        this.nextid = 0;
        this.clientes = new Repositorio<Cliente>("Cliente");
        this.transacoes = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Agiota{" +
                "saldo: " + saldoag +
                ", clientes: " + clientes.getAll()+
                '}';
    }
    public void transferir(String idcli, int valor){
        if (saldoag >= valor){
            this.saldoag -= valor;
            clientes.get(idcli).dinheiro += valor;
            transacoes.put(new Transacao (this.nextid, idcli, -valor), nextid);
            clientes.get(idcli).transacoes.put(nextid, new Transacao(this.nextid, idcli, valor));
            this.nextid += 1;
        }else{
            System.out.println("bolso vazio :(");
        }
    }
    public void receber(String idcli, int valor){
        if (clientes.get(idcli).dinheiro >= valor){
            this.saldoag += valor;
            clientes.get(idcli).dinheiro -= valor;
            transacoes.put(new Transacao (this.nextid, idcli, +valor), nextid);
            clientes.get(idcli).transacoes.put(nextid, new Transacao(this.nextid, idcli, -valor));
            this.nextid += 1;
        }else {
            System.out.println("Diniheiro insuficiente");
        }
    }
    public void matar(String idcli){
        clientes.remove(idcli);
        transacoes.remove(idcli);
    }

}

