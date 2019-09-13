public class Main {
    public static void main(String[] args) {
        Iventário iven = new Iventário(6);
        iven.addItem("luva", 50, 60, 70);

        System.out.println(iven.toString());
    }

}
