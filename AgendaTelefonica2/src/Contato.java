import java.util.Map;
import java.util.TreeMap;

public class Contato {
    private String id;
    private Repository<String,Fone> fones;
    private boolean favorito;

    public Contato(String id) {
        this.id = id;
        this.fones = new Repository<String, Fone>("fone");
        this.favorito = false;
    }

    public String getId() {
        return id;
    }

    public boolean isFavorito() {
        return favorito;
    }

    @Override
    public String toString() {
        String caso = "";
        if (this.favorito == true){
            caso = "@";
        }else {
            caso = "-";
        }
        return caso + id +" : "+ fones.getAll();
    }

    public void addFone(String id, String number){
        if (number.matches("[0-9]*")){
            fones.add(id, new Fone(id,number));
        }else{
            System.out.println("fail");
        }

    }
    public void rmFone(String id){
        fones.remove(id);
    }
    public void favoritar(){
        this.favorito = true;
    }
    public void desfavoritar(){
        this.favorito = false;
    }

}
