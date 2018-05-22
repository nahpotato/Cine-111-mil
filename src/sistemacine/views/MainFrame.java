package sistemacine.views;

import java.awt.event.ActionEvent;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        
        registrarPeliculaMenuItem.addActionListener((ActionEvent ae) -> {
            registrarPelicula();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevoCineMenuItem = new javax.swing.JMenuItem();
        registrarPeliculaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Cine");

        jMenu1.setText("Archivo");

        nuevoCineMenuItem.setText("Nuevo cine");
        jMenu1.add(nuevoCineMenuItem);

        registrarPeliculaMenuItem.setText("Registrar Pelicula");
        jMenu1.add(registrarPeliculaMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPelicula() {
        RegistrarPelicula registrarPelicula = new RegistrarPelicula();
        registrarPelicula.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem nuevoCineMenuItem;
    private javax.swing.JMenuItem registrarPeliculaMenuItem;
    // End of variables declaration//GEN-END:variables
}
