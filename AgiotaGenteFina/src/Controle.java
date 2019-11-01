import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agiota agiots = new Agiota();
        while(true) try {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            if (ui[0].equals("init")) {
                agiots = new Agiota(Integer.parseInt(ui[1]));
            }else if (ui[0].contentEquals("end"))
                break;
            else if (ui[0].equals("addCli")) {
                agiots.clientes.add(ui[1], new Cliente(ui[1]));
            }else if (ui[0].equals("show")) {
                System.out.println(agiots);
            }else if (ui[0].equals("transferir")) {
                agiots.transferir(ui[1], Integer.parseInt(ui[2]));
            }else if (ui[0].equals("receber")){
                agiots.receber(ui[1], Integer.parseInt(ui[2]));
            }
            else if (ui[0].equals("history")) {
                System.out.println(agiots.transacoes);
            }else if (ui[0].equals("histCli")){
                System.out.println(agiots.clientes.get(ui[1]).transacoes);
            }else if (ui[0].equals("matar")){
                agiots.matar(ui[1]);
            }
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
}
}




