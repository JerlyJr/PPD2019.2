import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if(ui[0].contentEquals("end"))
                break;
            else if(ui[0].contentEquals("add"))
                service.addUser(ui[1]);
            else if(ui[0].contentEquals("show"))
                System.out.println(service);
            else if(ui[0].contentEquals("follow")) {
                User seguidor = service.getUser(ui[1]);
                for(int i = 2; i < ui.length; i++)
                    seguidor.seguir(service.getUser(ui[i]));
            }else if(ui[0].contentEquals("twittar")) {
                String message = "";
                for(int i = 2; i < ui.length; i++)
                    message += ui[i] + " ";
                service.getUser(ui[1]).twittar(message);
            }else if(ui[0].contentEquals("inbox"))
                System.out.println(service.getInbox(ui[1]));
            else if(ui[0].contentEquals("like")) {
                service.getUser(ui[1]).darLike(Integer.parseInt(ui[2]));
            }
            else
                System.out.println("fail: comando invalido");
        }
        scanner.close();
    }
}
/*add savi
add jer
add mi
follow jer savi mi
follow savi mi
twittar mi ola
like jer 0
inbox savi
*/



