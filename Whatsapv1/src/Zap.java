public class Zap {
    Repository<String, User> usuario;
    Repository<String, Chat> chat;

    public Zap() {
        this.usuario = new Repository<String, User>("usuario");
        this.chat = new Repository<String, Chat>("chat");
    }

    @Override
    public String toString() {
        return "Zap{" +
                "usuario=" + usuario +
                '}';
    }

    void addUser(String nome){
        usuario.add(nome,new User(nome));
    }
    void showUser(){
        System.out.println(usuario.toString());
    }void showChat(){
        System.out.println(chat);
    }
    void addChat(String nomeUsuario,String nomeChat){
        this.chat.add(nomeChat, new Chat(nomeChat));
        this.chat.get(nomeChat).membros.add(nomeUsuario, new User(nomeUsuario));
        this.usuario.get(nomeUsuario).addChat(nomeChat);
    }
    void addToChat(String nomeUsuario , String nomeChat){
        this.usuario.get(nomeUsuario).addChat(nomeChat);
        this.chat.get(nomeChat).membros.add(nomeUsuario, new User(nomeUsuario));
    }
    void removeFromChat(String nomeUsuário , String nomeChat){
        this.usuario.get(nomeUsuário).removeChat(nomeChat);
        this.chat.get(nomeChat).membros.remove(nomeUsuário);
    }void mensagem(String user, String chat, String texto){
        texto = user + ": " + texto;
        for (User i : this.usuario.getAll()){
            this.usuario.get(i.nome).chatsUser.get(chat).escrever(texto);
        }

    }void showMessage(String user, String chat){
        System.out.println(this.usuario.get(user).chatsUser.get(chat).verInbox());

    }
}
