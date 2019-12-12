public class Fone {
    private String id;
    private String number;





    @Override
    public String toString() {
        return id + ':' + number;
    }

    public Fone(String id, String number) {
        this.id = id;
        this.number = number;

    }
}
