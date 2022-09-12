
package vista;

import DTO.reporteDosDTO;
import DTO.reporteTresDTO;
import controlador.controladorLibros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import modelo.autor;
import modelo.libros;


public class JFReportes extends javax.swing.JFrame {

   private controladorLibros controlador;
    
    public JFReportes(controladorLibros controlador) {
        initComponents();
        this.controlador = controlador;
        setLocationRelativeTo(null);
        txtReporte1.setText(cantidadLibros());
        cargarCombo();
        reporteDos();
        reporteTres();
        txtReporte6.setText(cantidadLectura());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtReporte1 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstReporte2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstReporte3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txtReporte4 = new javax.swing.JTextField();
        btnReporte4 = new javax.swing.JButton();
        cboAutores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtReporte6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Reportes");

        jLabel2.setText("Cantidad libros registrados:");

        txtReporte1.setEditable(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Reporte 2:");

        jScrollPane1.setViewportView(lstReporte2);

        jLabel4.setText("Reporte 3:");

        jScrollPane2.setViewportView(lstReporte3);

        jLabel5.setText("Reporte 4:");

        btnReporte4.setText("Consultar");
        btnReporte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporte4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Porcentaje libros solo lectura:");

        txtReporte6.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtReporte1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReporte4)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtReporte6)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtReporte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporte4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReporte6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporte4ActionPerformed
        reporteCuatro();
    }//GEN-LAST:event_btnReporte4ActionPerformed

    public String cantidadLibros(){
        int cantidad = 0;
        String texto = "";
        List<libros> lst = controlador.obtenerLibros();
        for (libros lib : lst) {
            cantidad++;
        }
        texto = "Hay "+ cantidad + " de libros registrados";       
        
        return texto;
    }
    
    public void reporteDos(){
        List <reporteDosDTO> lst = controlador.obtenerReporteDos();
        
        reporteDosDTO[] array = new reporteDosDTO[lst.size()];

        for (int i = 0; i < lst.size(); i++) {
            array[i] = lst.get(i);
        }

        lstReporte2.setListData(array);
    }
    
    public void reporteTres(){
        List<reporteTresDTO> lst = controlador.obtenerReporteTres();
        reporteTresDTO[] array = new reporteTresDTO[lst.size()];
        
        for (int i = 0; i < lst.size(); i++) {
            array[i] = lst.get(i);
        }
        lstReporte3.setListData(array);
    }
    
    public void reporteCuatro(){
       // List <reporteDosDTO> lst = controlador.obtenerReporteCuatro(txtReporte4.getText());
       List <reporteDosDTO> lst = controlador.obtenerReporteCuatro(cboAutores.getSelectedIndex()+1);
        
        reporteDosDTO[] array = new reporteDosDTO[lst.size()];

        for (int i = 0; i < lst.size(); i++) {
            array[i] = lst.get(i);
        }

        lstReporte2.setListData(array);
    }
    
    public void cargarCombo() {
    DefaultComboBoxModel model = new DefaultComboBoxModel(); 
    List<autor> lst = controlador.obtenerCorredores();
        for (autor au : lst) {
            model.addElement(au);
        }
        cboAutores.setModel(model);
    }
    
    public String cantidadLectura(){
        float cantidadL = 0;
        float cantidadT = 0;
        String porcentaje = "";
        float porcentajeNum= 0f;
        List<libros> lst = controlador.obtenerLibros();
        for (libros lib : lst) {
            cantidadT++;
            if (lib.getTipoPrestamo().equalsIgnoreCase("Prestamo")) {
                cantidadL++;
            }
        }
        porcentajeNum = (cantidadL/cantidadT)*100;
        porcentaje = "El porcentaje de Lectura es "+porcentajeNum+"%";
               
        
        return porcentaje;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte4;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboAutores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<reporteDosDTO> lstReporte2;
    private javax.swing.JList<reporteTresDTO> lstReporte3;
    private javax.swing.JTextField txtReporte1;
    private javax.swing.JTextField txtReporte4;
    private javax.swing.JTextField txtReporte6;
    // End of variables declaration//GEN-END:variables
}
