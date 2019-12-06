import java.util.TreeSet;

public class Tweet {
    int id;
    String user;
    String message;
    TreeSet<String> likes;
    public Tweet(int id, String user, String message) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.likes = new TreeSet<String>();
    }

    public String toString() {
        String saida = id + ":" + user + ":" + message + " [ ";
        for(String user : likes)
            saida += user + " ";
        return saida + "]";
    }
    public void darLike(String user) {
        this.likes.add(user);
    }
}
