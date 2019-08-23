import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peixe filezin = new Peixe(10);
        System.out.println("digite alimentar, esperar ou show");
        while(true){
            String line = scanner.nextLine();
            String[] in = line.split(" ");
            if (in[0].equals("alimentar")){
                filezin.alimentar(Integer.parseInt(in[1]));
            }else if(line.equals("esperar")){
                filezin.esperar();
            }else if (line.equals("show")){
                System.out.println(filezin);
            }
        }

    }
}
