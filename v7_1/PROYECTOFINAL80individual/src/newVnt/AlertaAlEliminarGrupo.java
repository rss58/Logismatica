/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newVnt;

import estructuras.Nodo;
import static estructuras.Multilista.*;

/**
 *
 * @author David Vergara
 */
public class AlertaAlEliminarGrupo extends java.awt.Dialog
{

    Nodo raiz = null;
    boolean confirmarEli = false;
    String nombreEliminado = null;
    String nombreAELiminar = null;

    /**
     * Creates new form Alerta
     * @param parent
     * @param modal
     * @param raiz
     * @param nombreAEliminar
     */
    public AlertaAlEliminarGrupo(java.awt.Frame parent, boolean modal, Nodo raiz, String nombreAEliminar)
    {
        super(parent, modal);
        initComponents();
        this.raiz = raiz;
        this.nombreAELiminar = nombreAEliminar;

        Nodo mostrar = busca(raiz, nombreAEliminar);

        txtMuestaDatos.setText(mostrarDatos(mostrar));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMuestaDatos = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(174, 192, 124));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(362, 393));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(161, 130, 98));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Todos estos datos se eliminaran!");

        txtMuestaDatos.setEditable(false);
        txtMuestaDatos.setColumns(20);
        txtMuestaDatos.setRows(5);
        jScrollPane1.setViewportView(txtMuestaDatos);

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        nombreEliminado = nombreAELiminar;
        confirmarEli = true;
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public boolean isConfirmarEli()
    {
        return this.confirmarEli;
    }

    public String getNombreEliminado()
    {
        return this.nombreEliminado;
    }

    public static String mostrarDatos(Nodo r)
    {
        String nom = "";
        Nodo aux = r;
        int nivel = 0;
        nom += r.getEtq() + ":\n   ♦ Personas: ↓\n";
        if (aux != null)
        {
            nom = abajoDatos(nom, aux, nivel);
        }
        return nom;
    }

    public static String abajoDatos(String nom, Nodo aux, int nivel)
    {
        System.out.println("nivel: " + nivel);
        boolean uno = false;
        while (aux != null)
        {
            aux = aux.getAbj();
            while (aux != null)
            {
                for (int i = 0; i <= nivel; i++)
                {
                    nom += "               ";
                }

                nom += "→ " + aux.getEtq() + "\n";
                if (nivel != 1)
                {
                    nom += "                      • Mensajes: ↓\n";
                }

                if (aux.getAbj() != null)
                {
                    nom = abajoDatos(nom, aux, nivel + 1);
                }
                aux = aux.getSig();
            }
        }
        return nom;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMuestaDatos;
    // End of variables declaration//GEN-END:variables
}
