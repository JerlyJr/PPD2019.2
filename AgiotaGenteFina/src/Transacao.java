public class Transacao String{
    int id;
    String clienteId;
    int valor;

    public Transacao(){

    }
    public Transacao(int id, String clienteId, int valor) {
        this.id = id;
        this.clienteId = clienteId;
        this.valor = valor;

    }

    @Override
    public String toString() {
        return "id " + id + " " + clienteId +
                ": " + valor +"\n";
    }
}
