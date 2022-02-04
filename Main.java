//Her kan man teste at koden funker. her vil du få en utskrift av 5.

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.put(1);
        ds.put(3);
        ds.put(3);
        ds.put(4);
        ds.put(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(ds.get());
        }
    }
}