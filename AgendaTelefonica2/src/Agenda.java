public class Agenda {
    private Repository<String,Contato> contatos;

    public Agenda() {
        this.contatos = new Repository<String, Contato>("contatos");
    }

    @Override
    public String toString() {
        String cont = "";
        for ( Contato contatin : contatos.getAll()){
            if (contatin.isFavorito()){
            cont += contatin.toString() + "\n";
            }

        }for (Contato contatin : contatos.getAll()){
            if (!contatin.isFavorito()){
                cont += contatin.toString()+ "\n";
            }
        }
        return cont;
    }public void mostrarFav(){
        String cont = "";
        for ( Contato contatin : contatos.getAll()) {
            if (contatin.isFavorito()) {
                cont += contatin.toString() + "\n";
            }
        }
        System.out.println(cont);
    }

    public void addContato(String idContato){
        this.contatos.add(idContato,new Contato(idContato));

    }
    public void rmContato(String id){
        this.contatos.remove(id);
    }
    public boolean validar(String number){
        if (number.matches("1234567890-#")){
            System.out.println("o número é valido");
            return true;
        }return false;
    }
    public void addNumero(String id, String idNum, String num){
        if (validar(num)){
            this.contatos.get(id).addFone(idNum,num);
        }else {
            System.out.println("numero invalido");
        }
    }
    public void rmNumero(String id, String idNum){
        this.contatos.get(id).rmFone(idNum);
    }
    public void favoritar(String id){
        this.contatos.get(id).favoritar();

    }
    public void desfavoritar(String id){
        this.contatos.get(id).desfavoritar();

    }
    public void buscarContato(String id){
        String cont = "";
        for ( Contato contatin : contatos.getAll()){
            if (contatin.isFavorito()){
                if (contatin.getId().contains(id)){
                cont += contatin.toString() + "\n";
                }
            }

        }for (Contato contatin : contatos.getAll()){
            if (!contatin.isFavorito()){
                if (contatin.getId().contains(id))
                cont += contatin.toString()+ "\n";
            }
        }
        System.out.println(cont);
    }
}
