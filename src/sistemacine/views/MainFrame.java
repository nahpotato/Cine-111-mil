package sistemacine.views;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import nucleuxsoft.collections.CollectionEvent;
import nucleuxsoft.collections.ObservableList;
import sistemacine.controller.GestorPeliculas;
import sistemacine.models.Pelicula;

public class MainFrame extends javax.swing.JFrame {
    
    private final GestorPeliculas gestorPeliculas;
    private final ObservableList<Pelicula> peliculas;

    public MainFrame() {
        initComponents();
        
        gestorPeliculas = GestorPeliculas.getCurrent();
        peliculas = (ObservableList<Pelicula>)gestorPeliculas.getPeliculas();
        
        registrarPeliculaButton.addActionListener((ActionEvent ae) -> {
            registrarPelicula();
        });
        
        peliculas.addCollectionListener((CollectionEvent ce) -> {
            actualizarPeliculasList(ce.getNewItems());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        peliculasList = new javax.swing.JList<>();
        registrarPeliculaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Cine");

        peliculasList.setModel(new DefaultListModel());
        peliculasList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        peliculasList.setEnabled(false);
        jScrollPane1.setViewportView(peliculasList);

        registrarPeliculaButton.setText("Registrar Pelicula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrarPeliculaButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarPeliculaButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registrarPelicula() {
        RegistrarPelicula registrarPelicula = new RegistrarPelicula();
        registrarPelicula.setVisible(true);
    }
    
    private void actualizarPeliculasList(List newItems) {
        DefaultListModel listModel = (DefaultListModel) peliculasList.getModel();
        
        newItems.forEach((item) -> {
            listModel.addElement(item);
        });
        
        peliculasList.setModel(listModel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Pelicula> peliculasList;
    private javax.swing.JButton registrarPeliculaButton;
    // End of variables declaration//GEN-END:variables
}
