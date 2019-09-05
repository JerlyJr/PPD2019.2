import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta eu = new Conta("Jerly", 7978, 5000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sacar");

        while (true) {
            String line = scanner.nextLine();
            String[] in = line.split(" ");
            if (in[0].equals("sacar")) {
                eu.sacar(Integer.parseInt(in[1]));
            }if (in[0].equals("nomeTitular")){
                eu.setTitular(in[1]);
            }if (in[0].equals("numeroConta")){
                eu.setNumero(Integer.parseInt(in[1]));
            }

        }

    }

}