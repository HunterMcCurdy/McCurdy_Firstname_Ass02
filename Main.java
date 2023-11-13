import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RandProductMaker main = new RandProductMaker();
                main.initialize();
                main.createDisplayPanel();

                RandProductSearch main2 = new RandProductSearch();
                main2.initialize();
                main2.createDisplayPanel();

            }
        });
    }
}