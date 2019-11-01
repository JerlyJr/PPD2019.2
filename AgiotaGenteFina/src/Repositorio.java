import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Repositorio <Dados>{
    Map<String, Dados> info;
    String identificador;

    public Repositorio(String identificador) {
       this.info = new TreeMap<String, Dados>();
       this.identificador = identificador;
    }
    public void add(String key, Dados data){
        Dados t = info.get(key);
        if (t == null){
            info.put(key, data);
        }else{
            throw new RuntimeException(identificador + " " + key + " ja existe");
        }
    }public void remove(String key){
        Dados t = info.get(key);
        if (t == null){
            throw new RuntimeException(identificador + " " + key + " ja existe");
        }else{
            info.remove(key);
        }
    }
    public Dados get(String key){
        Dados t = info.get(key);
        if (t == null){
            throw new RuntimeException(identificador + " " + key + " nao existe");
        }else{
            return t;
        }
    }
    public ArrayList<Dados> getAll(){
        ArrayList<Dados> out = new ArrayList<Dados>();
        for(String key : info.keySet())
            out.add(info.get(key));
        return out;

    }
}
