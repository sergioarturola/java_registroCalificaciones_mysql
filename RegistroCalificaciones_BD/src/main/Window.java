/*
   Clase principal y donde esta la vista
   int califUno = Integer.parseInt(cbEx1.getSelectedItem().toString());
        int califDos = Integer.parseInt(cbEx2.getSelectedItem().toString());
        int califTres = Integer.parseInt(cbEx3.getSelectedItem().toString());
 */
package main;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Window extends javax.swing.JFrame {

    DatosTabla data = new DatosTabla();
    Consultas consulta = new Consultas();

    //constructor
    public Window() {
        initComponents();
        this.setResizable(false);
        lblReg.setText("");
        txtApproved.setEditable(false);
        txtModifyStatus.setEditable(false);
        setLocationRelativeTo(null);
        setTitle("Control de alumnos");
        fillCombo();

        data.fillTable(jTableData);

        Conexion c = new Conexion();

    }

    //metodo para llenar los combobox
    public void fillCombo() {

        for (int i = 5; i <= 10; i++) {
            cbEx1.addItem(String.valueOf(i));
            cbEx2.addItem(String.valueOf(i));
            cbEx3.addItem(String.valueOf(i));
            comboModify1.addItem(String.valueOf(i));
            comboModify2.addItem(String.valueOf(i));
            comboModify3.addItem(String.valueOf(i));
        }

    }

    //metodo para sacar promedio y poner estatus
    public double average(int califUno, int califDos, int califTres) {
        double average = 0;

        average = (califUno + califDos + califTres) / 3;

        return average;
    }

    //sobrecarga de metodos para verificar campos vacios
    public boolean isEmpty() {//verifica seccion de registro
        if (txtName.getText().equals("") || txtApproved.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(String cal1, String cal2, String cal3, String name, String status) {//verifica seccion de modificar
        if (cal1.equals("") || cal2.equals("") || cal3.equals("") || name.equals("")
                || status.equals("")) {//si cualquiera de estos string es vacio
            return true;
        } else {
            return false;
        }
    }

    //metodo para limpiar campos
    public void clean() {
        txtApproved.setText("");
        txtApproved.setBackground(Color.white);
        txtName.setText("");
        txtConsultEx1.setText("");
        txtConsultEx2.setText("");
        txtConsultEx3.setText("");
        lblID.setText("Sin Seleccion");
        lblReg.setText("");
        txtConsultName.setText("");
        txtModifyStatus.setText("");
        txtModifyStatus.setBackground(Color.white);
        txtName.setText("");
        cbEx1.setSelectedIndex(0);
        cbEx2.setSelectedIndex(0);
        cbEx3.setSelectedIndex(0);
        comboModify1.setSelectedIndex(0);
        comboModify2.setSelectedIndex(0);
        comboModify3.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEx1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbEx2 = new javax.swing.JComboBox<>();
        cbEx3 = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtApproved = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnCalif = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtConsultName = new javax.swing.JTextField();
        txtConsultEx1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtConsultEx2 = new javax.swing.JTextField();
        txtConsultEx3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtModifyStatus = new javax.swing.JTextField();
        btnPromediar = new javax.swing.JButton();
        comboModify1 = new javax.swing.JComboBox<>();
        comboModify2 = new javax.swing.JComboBox<>();
        comboModify3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Evaluacion 1");

        jLabel3.setText("Evaluacion 2");

        jLabel4.setText("Evaluacion 3");

        jLabel5.setText("Estatus");

        txtApproved.setForeground(new java.awt.Color(51, 51, 51));
        txtApproved.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnCalif.setText("Calificar");
        btnCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalifActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableData);

        jLabel6.setText("Registro Alumnos");

        btnModify.setText("Modificar");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Borrar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Consulta alumnos ID:");

        jLabel8.setText("Alumno");

        jLabel9.setText("Evaluaciones");

        jLabel10.setText("1");

        jLabel11.setText("2");

        jLabel12.setText("3");

        lblReg.setText("Reg");

        btnUpdate.setText("Actualizar Tabla");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblID.setText("Sin seleccion");

        btnPromediar.setText("Promediar");
        btnPromediar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromediarActionPerformed(evt);
            }
        });

        comboModify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModify1ActionPerformed(evt);
            }
        });

        comboModify2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModify2ActionPerformed(evt);
            }
        });

        comboModify3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModify3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalif))
                            .addComponent(cbEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnRegister))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEx3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEx2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton3)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtConsultEx1)
                                        .addGap(6, 6, 6)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConsultEx2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtConsultEx3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblID))
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtConsultName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboModify1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboModify2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboModify3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtModifyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPromediar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(83, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(lblID))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalif)
                    .addComponent(jLabel8)
                    .addComponent(txtConsultName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConsultEx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultEx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsultEx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModifyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboModify1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboModify2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboModify3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPromediar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbEx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbEx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbEx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblReg)))
                            .addComponent(btnRegister))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApproved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdate)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalifActionPerformed
        
        
        
        double calif = average(Integer.parseInt(cbEx1.getSelectedItem().toString()),
                Integer.parseInt(cbEx2.getSelectedItem().toString()),
                Integer.parseInt(cbEx3.getSelectedItem().toString()));
        String status;

        if (calif >= 6) {
            txtApproved.setBackground(Color.green);
            txtApproved.setText("aprobado");
            status = "aprobado";
        } else {
            txtApproved.setBackground(Color.red);
            txtApproved.setText("reprobado");
            status = "reprobado";
        }
        
        


    }//GEN-LAST:event_btnCalifActionPerformed

    private void jTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataMouseClicked
        //recuperando el modelo, tenemos que hacer un parseo del objeto
        DefaultTableModel alumnos = (DefaultTableModel) jTableData.getModel();

        //recuperando fila seleccionada
        int rowS = jTableData.getSelectedRow();

        //colocando los datos
        lblID.setText(alumnos.getValueAt(rowS, 0).toString());
        txtConsultName.setText(alumnos.getValueAt(rowS, 1).toString());
        txtConsultEx1.setText(alumnos.getValueAt(rowS, 2).toString());
        txtConsultEx2.setText(alumnos.getValueAt(rowS, 3).toString());
        txtConsultEx3.setText(alumnos.getValueAt(rowS, 4).toString());
        String status = alumnos.getValueAt(rowS, 5).toString();
        if(status.equals("aprobado")){
            txtModifyStatus.setBackground(Color.green);
            txtModifyStatus.setText("aprobado");
        }
        else{
            txtModifyStatus.setBackground(Color.red);
            txtModifyStatus.setText("reprobado");
        }
        
    }//GEN-LAST:event_jTableDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        data.fillTable(jTableData);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clean();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        if (isEmpty(txtConsultEx1.getText(), txtConsultEx2.getText(), txtConsultEx3.getText(), txtConsultName.getText(),
                txtModifyStatus.getText())) {
            JOptionPane.showMessageDialog(null, "No deben de quedar campos vacios", "Atencion", JOptionPane.WARNING_MESSAGE);
        } else {
            consulta.modify(txtConsultName.getText(), txtConsultEx1.getText(), txtConsultEx2.getText(),
                    txtConsultEx3.getText(), txtModifyStatus.getText(), lblID.getText());
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (isEmpty(txtConsultEx1.getText(), txtConsultEx2.getText(), txtConsultEx3.getText(), txtConsultName.getText(),
                txtModifyStatus.getText())) {
            JOptionPane.showMessageDialog(null, "No deben de quedar campos vacios", "Atencion", JOptionPane.WARNING_MESSAGE);
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el registro "+txtConsultName.getText(), "Confirmar", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                consulta.delete(lblID.getText());
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        //primero se debe de comprobar que el campo nombre no este vacio
        if(txtName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No debe estar vacio Nombre", "Atencion", JOptionPane.WARNING_MESSAGE);
        }
        else{//si no esta vacio entonces podemos registrar
        //para registrar se debe comprobar si el alumno esta registrado o no
        if (consulta.isRegistre(txtName.getText()) == 0) {
            //si retorna cero entonces lo podemos registrar
            if (consulta.register(txtName.getText(), cbEx1.getSelectedItem().toString(), cbEx2.getSelectedItem().toString(),
                    cbEx3.getSelectedItem().toString(), txtApproved.getText())) {

                lblReg.setText("Registro Exitoso");
                lblReg.setForeground(Color.green);
                lblReg.setBackground(Color.black);
            } else {
                lblReg.setText("No se registro");
                lblReg.setForeground(Color.red);
            }
        }//si retorna diferente de cero entonces mandamos mensaje
        else{
            String alum = txtName.getText();
            JOptionPane.showMessageDialog(null, "Alumno "+alum+" ya registrado", "Error", JOptionPane.WARNING_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnPromediarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromediarActionPerformed
        double promedio = average(Integer.parseInt(txtConsultEx1.getText()), Integer.parseInt(txtConsultEx2.getText()),
                Integer.parseInt(txtConsultEx3.getText()));
        
        if (promedio >= 6) {
            txtModifyStatus.setBackground(Color.green);
            txtModifyStatus.setText("aprobado");
            
        } else {
            txtModifyStatus.setBackground(Color.red);
            txtModifyStatus.setText("reprobado");
            
        }
    }//GEN-LAST:event_btnPromediarActionPerformed

    private void comboModify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModify1ActionPerformed

        txtConsultEx1.setText(comboModify1.getSelectedItem().toString());
    }//GEN-LAST:event_comboModify1ActionPerformed

    private void comboModify2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModify2ActionPerformed
        txtConsultEx2.setText(comboModify2.getSelectedItem().toString());
    }//GEN-LAST:event_comboModify2ActionPerformed

    private void comboModify3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModify3ActionPerformed
        txtConsultEx3.setText(comboModify3.getSelectedItem().toString());
    }//GEN-LAST:event_comboModify3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalif;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPromediar;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbEx1;
    private javax.swing.JComboBox<String> cbEx2;
    private javax.swing.JComboBox<String> cbEx3;
    private javax.swing.JComboBox<String> comboModify1;
    private javax.swing.JComboBox<String> comboModify2;
    private javax.swing.JComboBox<String> comboModify3;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableData;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblReg;
    private javax.swing.JTextField txtApproved;
    private javax.swing.JTextField txtConsultEx1;
    private javax.swing.JTextField txtConsultEx2;
    private javax.swing.JTextField txtConsultEx3;
    private javax.swing.JTextField txtConsultName;
    private javax.swing.JTextField txtModifyStatus;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
