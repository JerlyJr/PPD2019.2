public class User {
    String nome;
    Repository<String, Chat> chatsUser;

    public User(String nome) {
        this.nome = nome;
        this.chatsUser = new Repository<String, Chat>("chat");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                chatsUser;
    }

    void addChat(String nome){
        chatsUser.add(nome, new Chat(nome));
    }void removeChat(String nome){
        chatsUser.remove(nome);

    }
}
