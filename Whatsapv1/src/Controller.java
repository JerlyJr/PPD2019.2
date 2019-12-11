import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Zap zapzap = new Zap();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].contentEquals("end"))
                break;
            else if (ui[0].contentEquals("addUser")){
                zapzap.addUser(ui[1]);
            }else if (ui[0].contentEquals("showUser")){
                zapzap.showUser();
            }else if (ui[0].contentEquals("addChat")){
                zapzap.addChat(ui[1],ui[2]);
            }else if (ui[0].contentEquals("chatUser")){
                System.out.println(zapzap.usuario.get(ui[1]).toString());
            }else if (ui[0].contentEquals("addToChat")){
                zapzap.addToChat(ui[1],ui[2]);
            }else if (ui[0].contentEquals("removeFromChat")){
                zapzap.removeFromChat(ui[1], ui[2]);
            }else if (ui[0].contentEquals("chat")){
                String message = "";
                for (int i = 3; i < ui.length; i++){
                message += ui[i] + " ";
                }
                zapzap.mensagem(ui[1], ui[2],message);
            }else if (ui[0].contentEquals("showMessage")){
                zapzap.showMessage(ui[1],ui[2]);
            }
        }

    }

}
