import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lapiseira lapis = new Lapiseira("Geforce",0.5,20);

        lapis.colocarGrafite(0.7, 30);
        lapis.escrever(10);
        lapis.escrever(10);
        lapis.escrever(10);
        lapis.escrever(20);


    }
}
