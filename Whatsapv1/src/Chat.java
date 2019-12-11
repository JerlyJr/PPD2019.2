import java.util.ArrayList;

public class Chat {
    String nome;
    Repository<String, User> membros;
    ArrayList<String> mensagens;

    public Chat(String nome) {
        this.nome = nome;
        this.membros = new Repository<String, User>("usuario");
        this.mensagens = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Chat: " +
                nome +
                "  Membros: " + membros +
                "  mensagens: " + mensagens.size() +
                '|';
    }
    void escrever(String mensagem){
        mensagens.add(mensagem);
    }
    String verInbox(){
        String texto = "";
        for (int i = 0; i < mensagens.size(); i++){
            texto += mensagens.get(i) + "\n";
        }
        return texto;
    }

}
