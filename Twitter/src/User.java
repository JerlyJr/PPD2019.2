import java.util.ArrayList;
import java.util.List;

class User{
    static int nextId = 0;
    String login;
    Repository<String, User> seguidos;
    Repository<String, User> seguidores;
    List<Tweet> timeline;
    int unread = 0;
    public User(String login) {
        this.login = login;
        seguidos   = new Repository<String, User>("User");
        seguidores = new Repository<String, User>("User");
        timeline   = new ArrayList<Tweet>();
    }
    public String toString() {
        return login + "\n  seguidos  " + this.seguidos + "\n  seguidores" + seguidores;
    }
    public void seguir(User user) {
        if(seguidos.exists(user.login))
            return;
        seguidos.add(user.login, user);
        user.seguidores.add(this.login, this);
    }
    public void twittar(String message) {
        Tweet tweet = new Tweet(User.nextId, this.login, message);
        User.nextId += 1;
        this.timeline.add(tweet);
        for(User seguidor : seguidores.getAll()) {
            seguidor.timeline.add(tweet);
            seguidor.unread += 1;
        }
    }
    public String inbox() {
        String saida = "";
        for(int i = timeline.size() - unread; i < timeline.size(); i++)
            saida += timeline.get(i) + "\n";
        unread = 0;
        return saida;
    }
    public void darLike(int id) {
        for(Tweet tweet : this.timeline)
            if(tweet.id == id)
                tweet.darLike(this.login);
    }
}
