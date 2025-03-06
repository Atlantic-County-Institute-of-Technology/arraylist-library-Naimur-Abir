import java.util.ArrayList;

//Naimur Abir
//ArrayList Library
//3-6-2025
public class Main {
    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList<String>();
        Library l1 = new Library();
        l1.addItem("R");
        l1.addItem("q");
        l1.addItem("s");
        l1.addItem("a");
        l1.removeItem("R");
        l1.addItem("x");
        l1.addItem("u");
        l1.addItem("p");
        System.out.println(l1.find("q"));
        System.out.println(l1.print());
        l1.shuffle();
        System.out.println(l1.getNextItem());
        System.out.println(l1.print());
        l1.skipNextItem();
        System.out.println(l1.print());
    }
}

