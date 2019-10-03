import java.util.ArrayList;

public class Topic {
    int preferenciais;
    ArrayList<Passageiro> cadeiras;

    public Topic(int capacidade, int preferenciais) {
        this.preferenciais = preferenciais;
        for (int i = 0 ; i  < capacidade; i++){
            cadeiras.add(null);
        }
    }

    @Override
    public String toString() {
        String mostrar = "[ ";
        for (int i = 0; i < cadeiras.size(); i++){
            if (i < preferenciais){
                mostrar += " @";
            }else {
                mostrar += " =";
            }if (cadeiras.get(i) != null){
                mostrar += cadeiras.get(i);

            }
        }return mostrar += " ]";
    }
    void addPassageiro(Passageiro pass){
        if (pass.preferencial()){

        }
    }

}
