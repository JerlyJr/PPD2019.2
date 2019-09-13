import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(3);
        list.add(98);
        list.add(57);
        list.set(2 , 4);
        list.add(0,9);
        list.remove(1);
        list.add(2);
        list.add(1,5);




        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");
        System.out.println(list.lastIndexOf(2));

        for (int i = 0; i < list.size(); i++){
            int y = list.get(i);
            list.set(i, y + 1);
            System.out.print(list.get(i) + " ");
        }
        System.out.print("\n");
        System.out.println(list.lastIndexOf(5));
        System.out.println(list);




    }
}
