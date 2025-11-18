package p146_Fifa;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class App extends JFrame {
    
    // Componentes de la GUI
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JTextField txtNombre, txtNacionalidad, txtPeso, txtFechaNac, txtRating;
    private JComboBox<String> cbPosicion, cbPie;
    private ArrayList<Jugador> listaJugadores;
    private File archivoActual;

    // Constructor
    public App() {
        super("Gestión de Jugadores FIFA");
        listaJugadores = new ArrayList<>();
        
        // Configuración básica de la ventana
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- 1. MENÚ ---
        crearMenu();

        // --- 2. TABLA (Panel Norte/Centro Superior) ---
        // Usamos un panel para contener la tabla y darle margen
        JPanel panelTabla = new JPanel(new BorderLayout());
        panelTabla.setBorder(BorderFactory.createTitledBorder("Lista de Jugadores"));
        
        String[] columnas = {"Nombre", "Nacionalidad", "Peso (kg)", "F. Nacimiento", "Posición", "Pie", "Rating"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // La tabla no se edita directamente, se usa el formulario
            }
        };
        tabla = new JTable(modeloTabla);
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Evento al hacer clic en la tabla para llenar el formulario
        tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabla.getSelectedRow() != -1) {
                cargarJugadorEnFormulario(tabla.getSelectedRow());
            }
        });

        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setPreferredSize(new Dimension(780, 200));
        panelTabla.add(scrollPane, BorderLayout.CENTER);
        
        // --- 3. FORMULARIO (Panel Centro) ---
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new GridBagLayout());
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Jugador"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Definición de campos
        txtNombre = new JTextField(15);
        txtNacionalidad = new JTextField(15);
        txtPeso = new JTextField(10);
        txtFechaNac = new JTextField(10);
        txtRating = new JTextField(5);
        
        String[] posiciones = {"Delantero", "Mediocentro", "Defensa", "Portero"};
        cbPosicion = new JComboBox<>(posiciones);
        
        String[] pies = {"Derecho", "Izquierdo", "Ambos"};
        cbPie = new JComboBox<>(pies);

        // Agregando componentes al GridBagLayout (Fila 0)
        gbc.gridx = 0; gbc.gridy = 0; panelFormulario.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; gbc.gridy = 0; panelFormulario.add(txtNombre, gbc);
        gbc.gridx = 2; gbc.gridy = 0; panelFormulario.add(new JLabel("Nacionalidad:"), gbc);
        gbc.gridx = 3; gbc.gridy = 0; panelFormulario.add(txtNacionalidad, gbc);

        // Fila 1
        gbc.gridx = 0; gbc.gridy = 1; panelFormulario.add(new JLabel("Peso (kg):"), gbc);
        gbc.gridx = 1; gbc.gridy = 1; panelFormulario.add(txtPeso, gbc);
        gbc.gridx = 2; gbc.gridy = 1; panelFormulario.add(new JLabel("F. Nacimiento (YYYY-MM-DD):"), gbc);
        gbc.gridx = 3; gbc.gridy = 1; panelFormulario.add(txtFechaNac, gbc);

        // Fila 2
        gbc.gridx = 0; gbc.gridy = 2; panelFormulario.add(new JLabel("Posición:"), gbc);
        gbc.gridx = 1; gbc.gridy = 2; panelFormulario.add(cbPosicion, gbc);
        gbc.gridx = 2; gbc.gridy = 2; panelFormulario.add(new JLabel("Pie Preferido:"), gbc);
        gbc.gridx = 3; gbc.gridy = 2; panelFormulario.add(cbPie, gbc);
        
        // Fila 3
        gbc.gridx = 0; gbc.gridy = 3; panelFormulario.add(new JLabel("Rating (1-99):"), gbc);
        gbc.gridx = 1; gbc.gridy = 3; panelFormulario.add(txtRating, gbc);

        // --- 4. BOTONES (Panel Sur) ---
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JButton btnEditar = new JButton("Editar");
        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnAnterior = new JButton("Anterior");
        JButton btnSiguiente = new JButton("Siguiente");
        JButton btnEstadistica = new JButton("Estadística");

        panelBotones.add(btnEditar);
        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnAnterior);
        panelBotones.add(btnSiguiente);
        panelBotones.add(btnEstadistica);

        // --- ACCIONES DE BOTONES ---
        
        // Botón Nuevo: Limpia el formulario y deselecciona la tabla
        btnNuevo.addActionListener(e -> limpiarFormulario());

        // Botón Guardar: Crea o Actualiza (según selección)
        btnGuardar.addActionListener(e -> guardarJugador());
        
        // Botón Editar: Pone el foco en el nombre (visual)
        btnEditar.addActionListener(e -> txtNombre.requestFocus());

        // Navegación
        btnAnterior.addActionListener(e -> navegar(-1));
        btnSiguiente.addActionListener(e -> navegar(1));
        
        // Estadística
        btnEstadistica.addActionListener(e -> mostrarEstadisticas());

        // --- ARMADO FINAL ---
        // Panel central que une tabla y formulario
        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.add(panelTabla, BorderLayout.NORTH);
        panelCentral.add(panelFormulario, BorderLayout.CENTER);

        add(panelCentral, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        // Menú Archivo
        JMenu menuArchivo = new JMenu("Archivo");
        menuArchivo.setMnemonic(KeyEvent.VK_A);

        JMenuItem itemAbrir = new JMenuItem("Abrir", KeyEvent.VK_A);
        itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        itemAbrir.addActionListener(e -> abrirArchivo());

        JMenuItem itemGrabar = new JMenuItem("Grabar", KeyEvent.VK_G);
        itemGrabar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        itemGrabar.addActionListener(e -> grabarArchivo());

        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0));

        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGrabar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        // Menú Ayuda
        JMenu menuAyuda = new JMenu("Ayuda");
        
        JMenuItem itemAcerca = new JMenuItem("Acerca de");
        itemAcerca.addActionListener(e -> JOptionPane.showMessageDialog(this, 
            "Aplicación de Gestión de Jugadores FIFA\nVersion: 2.0\nProgramador: Tu Nombre / IA", 
            "Acerca de...", JOptionPane.INFORMATION_MESSAGE));

        JMenuItem itemTeclas = new JMenuItem("Ayuda Teclas");
        itemTeclas.addActionListener(e -> JOptionPane.showMessageDialog(this, 
            "Menú:\nCtrl + A: Abrir archivo\nCtrl + G: Grabar archivo\n\nTabla:\nCtrl + D: Borrar registro\nCtrl + I: Iniciar nuevo", 
            "Ayuda Teclas de Acceso", JOptionPane.INFORMATION_MESSAGE));

        menuAyuda.add(itemAcerca);
        menuAyuda.add(itemTeclas);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);
        
        // Key Bindings globales para la tabla (Borrar y Nuevo)
        KeyStroke ctrlD = KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK);
        KeyStroke ctrlI = KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK);

        getRootPane().registerKeyboardAction(e -> borrarJugador(), ctrlD, JComponent.WHEN_IN_FOCUSED_WINDOW);
        getRootPane().registerKeyboardAction(e -> limpiarFormulario(), ctrlI, JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    // --- LÓGICA DE NEGOCIO ---

    private void cargarJugadorEnFormulario(int index) {
        if (index >= 0 && index < listaJugadores.size()) {
            Jugador j = listaJugadores.get(index);
            txtNombre.setText(j.getNombre());
            txtNacionalidad.setText(j.getNacionalidad());
            txtPeso.setText(String.valueOf(j.getPeso()));
            txtFechaNac.setText(j.getFechaNacimiento());
            cbPosicion.setSelectedItem(j.getPosicion());
            cbPie.setSelectedItem(j.getPie());
            txtRating.setText(String.valueOf(j.getRating()));
        }
    }

    private void limpiarFormulario() {
        tabla.clearSelection();
        txtNombre.setText("");
        txtNacionalidad.setText("");
        txtPeso.setText("");
        txtFechaNac.setText("");
        txtRating.setText("");
        cbPosicion.setSelectedIndex(0);
        cbPie.setSelectedIndex(0);
        txtNombre.requestFocus();
    }

    private void guardarJugador() {
        try {
            String nombre = txtNombre.getText();
            String nacionalidad = txtNacionalidad.getText();
            double peso = Double.parseDouble(txtPeso.getText());
            String fecha = txtFechaNac.getText();
            String posicion = (String) cbPosicion.getSelectedItem();
            String pie = (String) cbPie.getSelectedItem();
            int rating = Integer.parseInt(txtRating.getText());

            if (rating < 1 || rating > 99) {
                JOptionPane.showMessageDialog(this, "El rating debe estar entre 1 y 99");
                return;
            }

            Jugador nuevoJugador = new Jugador(nombre, nacionalidad, peso, fecha, posicion, pie, rating);
            int selectedRow = tabla.getSelectedRow();

            if (selectedRow == -1) {
                // Nuevo registro
                listaJugadores.add(nuevoJugador);
            } else {
                // Editar registro existente
                listaJugadores.set(selectedRow, nuevoJugador);
            }
            actualizarTabla();
            if (selectedRow != -1) tabla.setRowSelectionInterval(selectedRow, selectedRow); // Mantener selección
            else tabla.setRowSelectionInterval(listaJugadores.size()-1, listaJugadores.size()-1); // Seleccionar nuevo
            
            JOptionPane.showMessageDialog(this, "Jugador guardado correctamente.");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error en formato de número (Peso o Rating).", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarJugador() {
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow != -1) {
            String nombre = listaJugadores.get(selectedRow).getNombre();
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea borrar a " + nombre + "?", "Confirmar Borrado", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                listaJugadores.remove(selectedRow);
                actualizarTabla();
                limpiarFormulario();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un jugador para borrar.");
        }
    }

    private void navegar(int direction) {
        if (listaJugadores.isEmpty()) return;
        
        int currentRow = tabla.getSelectedRow();
        int newRow = currentRow + direction;
        
        if (newRow >= 0 && newRow < listaJugadores.size()) {
            tabla.setRowSelectionInterval(newRow, newRow);
            // Asegurar que la fila sea visible
            tabla.scrollRectToVisible(tabla.getCellRect(newRow, 0, true));
        }
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        for (Jugador j : listaJugadores) {
            modeloTabla.addRow(new Object[]{
                j.getNombre(), j.getNacionalidad(), j.getPeso(), j.getFechaNacimiento(), j.getPosicion(), j.getPie(), j.getRating()
            });
        }
    }
    
    private void mostrarEstadisticas() {
        if (listaJugadores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay jugadores registrados.");
            return;
        }
        double sumaRating = 0;
        for(Jugador j : listaJugadores) sumaRating += j.getRating();
        double promedio = sumaRating / listaJugadores.size();
        
        JOptionPane.showMessageDialog(this, 
            "Total de Jugadores: " + listaJugadores.size() + "\nRating Promedio: " + String.format("%.2f", promedio), 
            "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    // --- PERSISTENCIA (Archivos Serializados) ---

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Serializados (*.ser)", "ser"));
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileChooser.getSelectedFile()))) {
                listaJugadores = (ArrayList<Jugador>) ois.readObject();
                archivoActual = fileChooser.getSelectedFile();
                actualizarTabla();
                JOptionPane.showMessageDialog(this, "Archivo cargado exitosamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir archivo: " + ex.getMessage());
            }
        }
    }

    private void grabarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos Serializados (*.ser)", "ser"));
        if (archivoActual != null) fileChooser.setSelectedFile(archivoActual);
        else fileChooser.setSelectedFile(new File("jugadores_fifa.ser"));

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileChooser.getSelectedFile()))) {
                oos.writeObject(listaJugadores);
                archivoActual = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar archivo: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Establecer Look and Feel nativo para que se vea como en el sistema operativo (similar al PDF si es Mac/Windows)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { e.printStackTrace(); }
        
        SwingUtilities.invokeLater(() -> new App().setVisible(true));
    }
}