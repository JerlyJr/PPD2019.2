import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Repositório <Objeto>{
    Map<String,Objeto> banco;
    String nametype;

    public Repositório(String nametype) {
        this.banco = new TreeMap<String, Objeto>();
        this.nametype = nametype;
    }
    public void add(String key, Objeto user){
        Objeto t = banco.get(key);
        if (t == null){
            banco.put(key, user);
        }else{
            throw new RuntimeException(nametype + " " + key + " ja existe");
        }
    }
    public Objeto get(String key){
        Objeto u = banco.get(key);
        if (u == null){
            throw new RuntimeException(nametype + " " + key + " ja existe");
        }else{
            return u;
        }
    }
    public ArrayList<Objeto> getAll(){
        ArrayList<Objeto> out = new ArrayList<Objeto>();
        for(String key : banco.keySet())
            out.add(banco.get(key));
        return out;
    }
}
