package views;

import clases.DeclararVector;
import clases.Trabajadores;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaE extends javax.swing.JFrame {

    private ArrayList<Trabajadores> arrayList = new ArrayList<>();
    private DeclararVector DeVtrabajador = new DeclararVector();
    private VentanaT ventanaT;
    private VentanaInfo ventanaInfo;
    int i = 0;

    public VentanaE() {
        initComponents();
        setTitle("INICIO Y REGISTRO EMPLEADOS");
        setVisible(true);
        desavilitarRegistro();
        buscado.setEditable(false);
        ventanaT = new VentanaT();
        ventanaInfo = new VentanaInfo();
    }

    public void avilitarRegistro() {
        JPregistro.setEnabled(true);
        nombre.setEnabled(true);
        identificacion.setEnabled(true);
        correo.setEnabled(true);
        edad.setEnabled(true);
        estudio.setEnabled(true);
        sedes.setEnabled(true);
        lenguas.setEnabled(true);
        botonAgregar.setEnabled(true);
        jLabel6.setEnabled(true);
    }

    public void desavilitarRegistro() {
        JPregistro.setEnabled(false);
        nombre.setEnabled(false);
        identificacion.setEnabled(false);
        correo.setEnabled(false);
        edad.setEnabled(false);
        estudio.setEnabled(false);
        sedes.setEnabled(false);
        lenguas.setEnabled(false);
        botonAgregar.setEnabled(false);
        jLabel6.setEnabled(false);
    }

    public void crearEmpleado(String nom, int ide, int edad, String stud, String nIng, String correo, String sede) {
        if (i < DeVtrabajador.getTamano()) {

            Trabajadores tra = new Trabajadores();

            tra.setNombre(nom);
            tra.setIdentificacion(ide);
            tra.setEdad(edad);
            tra.setEstudios(stud);
            tra.setLengua(nIng);
            tra.setCorreo(correo);
            tra.setSede(sede);

            DeVtrabajador.setVectorTrabajadores(i, tra);
            arrayList.add(tra);
            i++;
            ventanaT.getInforme1().setModel(DeVtrabajador.cargarTablaTrabajador(arrayList));

        } else {
            JOptionPane.showMessageDialog(null, "Error...!" + "\n"
                    + "No se pueden ingresar más empleados");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tamano = new javax.swing.JTextField();
        botonTamano = new javax.swing.JButton();
        botonMostrarTabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        buscado = new javax.swing.JTextArea();
        buscar = new javax.swing.JTextField();
        JPregistro = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        identificacion = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        edad = new javax.swing.JSpinner();
        estudio = new javax.swing.JComboBox<>();
        sedes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lenguas = new javax.swing.JComboBox<>();
        botonAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel5.setText("No. EMPLEADOS");

        botonTamano.setBackground(new java.awt.Color(61, 139, 166));
        botonTamano.setText("ASIGNAR");
        botonTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTamanoActionPerformed(evt);
            }
        });

        botonMostrarTabla.setBackground(new java.awt.Color(135, 198, 152));
        botonMostrarTabla.setText("Mostrar Tabla");
        botonMostrarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMostrarTablaMouseClicked(evt);
            }
        });
        botonMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTablaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(235, 79, 87));
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar_Empleado_por_ID"));

        botonBuscar.setBackground(new java.awt.Color(61, 139, 166));
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        buscado.setColumns(20);
        buscado.setRows(5);
        jScrollPane2.setViewportView(buscado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPregistro.setBackground(new java.awt.Color(0, 204, 255));
        JPregistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro_Empleados"));

        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        identificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("IDENTIFICACIÓN"));
        identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionActionPerformed(evt);
            }
        });

        correo.setBorder(javax.swing.BorderFactory.createTitledBorder("CORREO"));
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 62, 1));
        edad.setBorder(javax.swing.BorderFactory.createTitledBorder("EDAD"));

        estudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Profesional", "Especialista", "Magister", "Doctor" }));
        estudio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("ESTUDIOS"), "ESTUDIOS"));
        estudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudioActionPerformed(evt);
            }
        });

        sedes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogota", "Barranquilla", "Cali", "Medellin" }));
        sedes.setBorder(javax.swing.BorderFactory.createTitledBorder("SEDE"));
        sedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sedesActionPerformed(evt);
            }
        });

        jLabel6.setText("SEGUNDA LENGUA (INGLES)");

        lenguas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        lenguas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenguasActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(102, 153, 255));
        botonAgregar.setText("Registrar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPregistroLayout = new javax.swing.GroupLayout(JPregistro);
        JPregistro.setLayout(JPregistroLayout);
        JPregistroLayout.setHorizontalGroup(
            JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPregistroLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPregistroLayout.createSequentialGroup()
                        .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sedes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPregistroLayout.createSequentialGroup()
                        .addComponent(lenguas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addGap(19, 19, 19))))
        );
        JPregistroLayout.setVerticalGroup(
            JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPregistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sedes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPregistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JPregistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lenguas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPregistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addGap(15, 15, 15))))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Otras Opciones.."));

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setText("Info_Sedes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setText("Info_Tecnicos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setText("Info_Estudios");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setText("Info_Lengua");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tamano, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonTamano))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botonMostrarTabla)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTamano)
                    .addComponent(tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMostrarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(44, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void sedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sedesActionPerformed

    private void botonTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTamanoActionPerformed
        i = 0;
        int n = Integer.parseInt(tamano.getText());
        DeVtrabajador.setTamano(n);
        DeVtrabajador.crearVector();
        JOptionPane.showMessageDialog(null, "Se registrarán " + DeVtrabajador.getTamano() + " empleados");
        tamano.setText("");
        avilitarRegistro();
    }//GEN-LAST:event_botonTamanoActionPerformed

    private void estudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estudioActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        String nombreEmpleado = nombre.getText();
        String identificacionEmpleadoStr = identificacion.getText();
        int identificacionEmpleado = 0;
        try {
            identificacionEmpleado = Integer.parseInt(identificacionEmpleadoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La identificación debe ser un número válido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        

        int edadEmpleado = (int) edad.getValue();
        String estudioEmpleado = estudio.getSelectedItem().toString();
        String lenguasEmpleado = lenguas.getSelectedItem().toString();
        String correoEmpleado = correo.getText();
        String sedeEmpleado = sedes.getSelectedItem().toString();

        if (nombreEmpleado.isEmpty() || identificacionEmpleadoStr.isEmpty() || correoEmpleado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            crearEmpleado(nombreEmpleado, identificacionEmpleado, edadEmpleado, estudioEmpleado, lenguasEmpleado, correoEmpleado, sedeEmpleado);

            identificacion.setText("");
            nombre.setText("");
            edad.setValue(18);
            correo.setText("");
            nombre.grabFocus();
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void lenguasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenguasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenguasActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        if (!buscar.toString().isEmpty()) {

            int identificacionTexto = Integer.parseInt(buscar.getText());

            Trabajadores empleadoEncontrado = DeVtrabajador.buscarEmpleadoPorIdentificacion(identificacionTexto);

            if (empleadoEncontrado != null) {

                buscado.setText("");
                buscado.append("" + empleadoEncontrado.informacion());

            } else {

                buscado.setText("No se encontró un empleado con la identificación proporcionada.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "El campo de búsqueda está vacío.");
        }
        buscar.setText("");
    }

    public void buscarEmpleadoEnTabla(int identificacionABuscar) {
        JTable informe1 = ventanaT.getInforme1();
        DefaultTableModel tableModel = (DefaultTableModel) informe1.getModel();
        for (int row = 0; row < tableModel.getRowCount(); row++) {
            if ((int) tableModel.getValueAt(row, 1) == identificacionABuscar) {
                informe1.setRowSelectionInterval(row, row);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un empleado con la identificación proporcionada.");
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonMostrarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMostrarTablaMouseClicked

    }//GEN-LAST:event_botonMostrarTablaMouseClicked

    private void botonMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarTablaActionPerformed
        ventanaT.mostrarVentana();
        ventanaT.setLocationRelativeTo(null);
        ventanaT.setTitle("Informe de Personal");
    }//GEN-LAST:event_botonMostrarTablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ventanaInfo.setVisible(true);
        ventanaInfo.setLocationRelativeTo(null);
        ventanaInfo.setTitle("Ventana de Informes");
        TitledBorder title1 = BorderFactory.createTitledBorder("Informe Por sedes");
        ventanaInfo.getjPanel1().setBorder(title1);
        ventanaInfo.getjTextArea1().setText("");

        for (String sede : new String[]{"Bogota", "Barranquilla", "Cali", "Medellin"}) {

            ventanaInfo.getjTextArea1().append("""
                                               Sede                 Nombre                 Identificación                 Nivel_De_Formación
                                               """);

            for (Trabajadores trabajador : arrayList) {

                if (trabajador.getSede().equals(sede)) {

                    ventanaInfo.getjTextArea1().append(trabajador.getSede() + "\t" + trabajador.getNombre() + "\t"
                            + trabajador.getIdentificacion() + "\t"
                            + trabajador.getEstudios() + "\n");
                }
            }

            ventanaInfo.getjTextArea1().append("\n_______________________________________________________________________________________\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ventanaInfo.setVisible(true);
        ventanaInfo.setLocationRelativeTo(null);
        ventanaInfo.setTitle("Ventana de informes");
        ventanaInfo.getjTextArea1().setText("");
        TitledBorder title1 = BorderFactory.createTitledBorder("Informe de tecnicos");
        ventanaInfo.getjPanel1().setBorder(title1);

        for (String sede : new String[]{"Bogota", "Barranquilla", "Cali", "Medellin"}) {

            int tecnicos = 0;

            for (Trabajadores trabajador : arrayList) {

                if (trabajador.getSede().equals(sede) && trabajador.getEstudios().equalsIgnoreCase("Tecnico")) {
                    tecnicos++;
                }
            }
            ventanaInfo.getjTextArea1().append("En la sede de " + sede + " hay " + tecnicos + " Técnicos\n\n");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ventanaInfo.setVisible(true);
        ventanaInfo.setLocationRelativeTo(null);
        ventanaInfo.setTitle("Ventana de informes");
        ventanaInfo.getjTextArea1().setText("");
        TitledBorder title1 = BorderFactory.createTitledBorder("Informe estudios del personal");
        ventanaInfo.getjPanel1().setBorder(title1);

        ventanaInfo.getjTextArea1().append("La empresa cuenta con un total de: \n");

        for (String Estudio : new String[]{"Tecnico", "Profesionale", "Especialista", "Magister", "Doctor"}) {
            int cantidad = 0;

            for (Trabajadores trabajador : arrayList) {

                if (trabajador.getEstudios().equalsIgnoreCase(Estudio)) {
                    cantidad++;
                }
            }
            ventanaInfo.getjTextArea1().append(cantidad + " " + Estudio + "\n");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ventanaInfo.setVisible(true);
        ventanaInfo.setLocationRelativeTo(null);
        ventanaInfo.setTitle("Ventana de informes");
        ventanaInfo.getjTextArea1().setText("");
        TitledBorder title1 = BorderFactory.createTitledBorder("Informe leguas del personal");
        ventanaInfo.getjPanel1().setBorder(title1);

        for (Trabajadores trabajador : arrayList) {
            if (trabajador.isManejaIngles()) {
                ventanaInfo.getjTextArea1().append("El trabajador " + trabajador.getNombre() + " de la sede "
                        + trabajador.getSede() + " habla ingles.\n");

            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPregistro;
    protected javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonMostrarTabla;
    private javax.swing.JButton botonTamano;
    private javax.swing.JTextArea buscado;
    private javax.swing.JTextField buscar;
    protected javax.swing.JTextField correo;
    private javax.swing.JSpinner edad;
    protected javax.swing.JComboBox<String> estudio;
    protected javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    protected javax.swing.JComboBox<String> lenguas;
    protected javax.swing.JTextField nombre;
    protected javax.swing.JComboBox<String> sedes;
    private javax.swing.JTextField tamano;
    // End of variables declaration//GEN-END:variables
}
