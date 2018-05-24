package sistemacine;

import sistemacine.controller.GestorPeliculas;
import sistemacine.views.MainFrame;

public class SistemaCine {

    public static void main(String[] args) {
        GestorPeliculas gestor = new GestorPeliculas();
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
