import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Agenda agends = new Agenda();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            String[] ui= line.split(" ");
            if (ui[0].contentEquals("end")){
                break;
            }else if (ui[0].contentEquals("addCont")){
                agends.addContato(ui[1]);
            }else if (ui[0].contentEquals("rmCont")){
                agends.rmContato(ui[1]);
            }else if (ui[0].contentEquals("favoritar")){
                agends.favoritar(ui[1]);
            }else if (ui[0].contentEquals("desfavoritar")){
                agends.desfavoritar(ui[1]);
            }else if (ui[0].contentEquals("buscar")){
                agends.buscarContato(ui[1]);
            }else if (ui[0].contentEquals("show")){
                System.out.println(agends);
            }else if (ui[0].contentEquals("mostrarFav")){
                agends.mostrarFav();
            }else if (ui[0].contentEquals("addNum")){
                agends.addNumero(ui[1],ui[2],ui[3]);
            }else if (ui[0].contentEquals("rmNum")){
                agends.rmNumero(ui[1],ui[2]);
            }
        }
    }
}
