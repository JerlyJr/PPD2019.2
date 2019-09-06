import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        Nave nave = new Nave();
        while (true){
            line = scanner.nextLine();
            String in[] = line.split(" ");
            if (in[0].equals("init")){
                nave = new Nave(in[1],Integer.parseInt(in[2]),Integer.parseInt(in[3]));
            }
            if (in[0].equals("acelerar")){
                nave.acelerar();
            }
            if (in[0].equals("setPotencia")){
                nave.setPotenciaNave(Integer.parseInt(in[1]));
            }
            if (in[0].equals("addPassageiros")){
                nave.addPassageiros(Integer.parseInt(in[1]));
            }
            if (in[0].equals("removerPassageiros")){
                nave.removerPassageiros(Integer.parseInt(in[1]));
            }
            if (in[0].equals("novoMotor")){
                nave.novoMotor(Integer.parseInt(in[1]),Integer.parseInt(in[2]));
            }

        }






    }


}
