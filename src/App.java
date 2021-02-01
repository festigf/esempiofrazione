public class App {
    public static void main(String[] args) throws Exception {
        Frazione f1 = new Frazione(7,5);
        Frazione f2= new Frazione(1,2);
        
        Frazione f3=f1.add(f2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }
}
