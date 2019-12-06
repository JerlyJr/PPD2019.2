import java.util.ArrayList;

public class Historico<V> implements Observer<V> {
    ArrayList<V> entradas;
    public Historico(Repository<Integer, V> rep) {
        entradas = new ArrayList<V>();
        rep.attach(this);
    }

    public void update(Nome type, V value) {
        if(type == Nome.add)
            entradas.add(value);
    }

    @Override
    public String toString() {
        return "" + entradas;
    }
}
