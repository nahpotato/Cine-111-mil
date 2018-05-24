package sistemacine.views;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import nucleuxsoft.collections.CollectionEvent;
import nucleuxsoft.collections.ObservableList;
import sistemacine.models.Actor;
import sistemacine.models.Pelicula;
import sistemacine.models.Personaje;
import sistemacine.models.Rol;
import sistemacine.models.Sexo;
import sistemacine.utilities.StringUtils;

public class RegistrarElenco extends javax.swing.JFrame {

    private final Pelicula pelicula;
    private final ObservableList<Personaje> personajes;
    
    public RegistrarElenco(Pelicula pelicula) {
        if (pelicula == null) {
            throw new IllegalArgumentException(new NullPointerException("Object "
                    + "reference not set to an instance of an object."));
        }
        
        this.pelicula = pelicula;
        
        initComponents();
        
        if (this.pelicula.getPersonajes() == null) {
            this.pelicula.setPersonajes(personajes = new ObservableList<>());
        } else {
            personajes = (ObservableList<Personaje>) this.pelicula.getPersonajes();
        }
        
        rellenarPersonajesList();
        
        añadirButton.addActionListener((ActionEvent ae) -> {
            añadirPersonaje();
        });
        
        confirmarButton.addActionListener((ActionEvent ae) -> {
            registrarElenco();
        });
        
        cancelarButton.addActionListener((ActionEvent ae) -> {
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        });
        
        animadoCheckBox.addItemListener((ItemEvent ie) -> {
            animadoCheckBoxItemStateChanged();
        });
        
        personajes.addCollectionListener((CollectionEvent ce) -> {
            actualizarPersonajesList(ce.getNewItems());
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreEnPeliculaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rolTextField = new javax.swing.JTextField();
        animadoCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sexoTextField = new javax.swing.JTextField();
        añadirButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personajesList = new javax.swing.JList<>();
        confirmarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Elenco");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Personaje"));

        jLabel1.setText("Nombre en Película:");

        jLabel2.setText("Rol:");

        animadoCheckBox.setText("¿Es animado?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreEnPeliculaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(animadoCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rolTextField)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreEnPeliculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rolTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(animadoCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actor"));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Sexo: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTextField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoTextField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoTextField)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sexoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        añadirButton.setText("Añadir");

        personajesList.setModel(new DefaultListModel());
        personajesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        personajesList.setEnabled(false);
        personajesList.setFocusable(false);
        jScrollPane1.setViewportView(personajesList);

        confirmarButton.setText("Confirmar");

        cancelarButton.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(añadirButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(confirmarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirButton)
                    .addComponent(confirmarButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarPersonajesList(List newItems) {
        DefaultListModel listModel = (DefaultListModel) personajesList.getModel();
        
        newItems.forEach((personaje) -> {
            listModel.addElement(personaje);
        });
        
        personajesList.setModel(listModel);
    }
    
    private void añadirPersonaje() {
        if (hayCamposVacios()) {
            return;
        }
        
        Personaje personaje = new Personaje();
        personaje.setNombreEnPelicula(nombreEnPeliculaTextField.getText());
        personaje.setRol(new Rol(rolTextField.getText()));
        
        Actor actor = new Actor();
        actor.setAnimado(animadoCheckBox.isSelected());
        
        if (!actor.isAnimado()) {
            actor.setNombre(nombreTextField.getText());
            actor.setApellido(apellidoTextField.getText());
            actor.setSexo(new Sexo(sexoTextField.getText()));
        }
        
        personaje.setActor(actor);
        
        if (personajes.contains(personaje)) {
            JOptionPane.showMessageDialog(this, "El personaje ya fue agregado.");
            return;
        }
        
        if (personajes.add(personaje)) {
            System.out.println("El personaje " + personaje.getNombreEnPelicula() + " fue añadido exitosamente.");
        } else {
            System.out.println("Ocurrió un error añadiendo el personaje " + personaje.getNombreEnPelicula());
        }
        
        limpiarCampos();
    }
    
    private void registrarElenco() {
        if (personajes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Agrega un personaje.");
            nombreEnPeliculaTextField.requestFocusInWindow();
            nombreEnPeliculaTextField.selectAll();
            return;
        }
        
        pelicula.setPersonajes(personajes);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
    
    private void limpiarCampos() {
        animadoCheckBox.setSelected(false);
        apellidoTextField.setText("");
        nombreEnPeliculaTextField.setText("");
        nombreTextField.setText("");
        rolTextField.setText("");
        sexoTextField.setText("");
        
        nombreEnPeliculaTextField.requestFocusInWindow();
        nombreEnPeliculaTextField.selectAll();
    }
    
    private boolean hayCamposVacios() {
        String nombreEnPelicula = nombreEnPeliculaTextField.getText();
        String rol = rolTextField.getText();
        String nombre = nombreTextField.getText();
        String apellido = nombreTextField.getText();
        String sexo = sexoTextField.getText();
        
        if (StringUtils.isNullOrWhitespace(nombreEnPelicula) || StringUtils.isNullOrEmpty(nombreEnPelicula)) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del personaje.");
            nombreEnPeliculaTextField.requestFocusInWindow();
            nombreEnPeliculaTextField.selectAll();
            return true;
        }
        
        if (StringUtils.isNullOrWhitespace(rol) || StringUtils.isNullOrEmpty(rol)) {
            JOptionPane.showMessageDialog(this, "Ingrese el rol del personaje,");
            rolTextField.requestFocusInWindow();
            rolTextField.selectAll();
            return true;
        }
        
        if (!animadoCheckBox.isSelected()) {
            if (StringUtils.isNullOrWhitespace(nombre) || StringUtils.isNullOrEmpty(nombre)) {
                JOptionPane.showMessageDialog(this, "Ingrese nombre del actor.");
                nombreTextField.requestFocusInWindow();
                nombreTextField.selectAll();
                return true;
            }
            
            if (StringUtils.isNullOrWhitespace(apellido) || StringUtils.isNullOrEmpty(apellido)) {
                JOptionPane.showMessageDialog(this, "Ingrese apellido del actor.");
                apellidoTextField.requestFocusInWindow();
                apellidoTextField.selectAll();
                return true;
            }
            
            if (StringUtils.isNullOrWhitespace(sexo) || StringUtils.isNullOrEmpty(sexo)) {
                JOptionPane.showMessageDialog(this, "Ingrese sexo del actor.");
                sexoTextField.requestFocusInWindow();
                sexoTextField.selectAll();
                return true;
            }
        }
        
        return false;
    }
    
    private void animadoCheckBoxItemStateChanged() {
        nombreTextField.setEnabled(!animadoCheckBox.isSelected());
        apellidoTextField.setEnabled(!animadoCheckBox.isSelected());
        sexoTextField.setEnabled(!animadoCheckBox.isSelected());
    }
    
    private void rellenarPersonajesList() {
        DefaultListModel listModel = (DefaultListModel) personajesList.getModel();
        
        personajes.forEach((personaje) -> {
            listModel.addElement(personaje);
        });
        
        personajesList.setModel(listModel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox animadoCheckBox;
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JButton añadirButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreEnPeliculaTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JList<sistemacine.models.Personaje> personajesList;
    private javax.swing.JTextField rolTextField;
    private javax.swing.JTextField sexoTextField;
    // End of variables declaration//GEN-END:variables
}
