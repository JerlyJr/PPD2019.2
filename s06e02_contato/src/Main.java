public class Main {
    public static void main(String[] args) {
        Iventário iven = new Iventário(6);
        iven.addItem(1,"luva", 50, 60, 90);
        iven.addItem(4,"peitoral", 70, 50, 100);
        iven.addItem(3,"elmo", 20, 50, 60);
        iven.addItem(5,"bota", 20, 30, 80);
        System.out.println(iven.toString());
    }

}
