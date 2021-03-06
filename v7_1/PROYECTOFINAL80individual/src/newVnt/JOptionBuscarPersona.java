package newVnt;

import estructuras.Nodo;
import estructuras.NodoArbol;
import estructuras.TablaHash;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Vergara
 */
public final class JOptionBuscarPersona extends java.awt.Dialog
{

    String nombrePersona = null;
    boolean validPersona = false;
    Nodo raiz = null;
    TablaHash tablaDePersonas = null;

    /**
     * Creates new form NewDialog
     * @param parent
     * @param modal
     * @param raiz
     */
    public JOptionBuscarPersona(java.awt.Frame parent, boolean modal, Nodo raiz)
    {
        super(parent, modal);
        initComponents();
        this.raiz = raiz;

        cargaTablaHash();
        System.out.println("Tablas en busqueda:\n");
        tablaDePersonas.verarboles();
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
        txtNombrePersona = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();

        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(174, 192, 124));

        txtNombrePersona.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtNombrePersona.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtNombrePersonaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtNombrePersonaKeyTyped(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar persona");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("¡Escribe el nombre de la persona!");

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombrePersona)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombrePersonaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombrePersonaKeyReleased
    {//GEN-HEADEREND:event_txtNombrePersonaKeyReleased
        jPanelBotones.removeAll();
        if (txtNombrePersona.getText().length() > 0)
        {
            String posibleName[] = tablaDePersonas.buscarDTS(txtNombrePersona.getText().trim());
            for (int i = 0; i < posibleName.length; i++)
            {
                JButton boton = new JButton(posibleName[i]);
                boton.setBackground(new Color(103, 119, 48));
                boton.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
                jPanelBotones.add(boton);
                String aux = posibleName[i];
                NodoArbol f = tablaDePersonas.buscarDT(aux);
                boton.addActionListener(new ActionListener()
                {
                    private Frame parent;

                    @Override
                    public void actionPerformed(ActionEvent e)
                    {

                        VtnAddMensaje mensaje = new VtnAddMensaje(raiz, e.getActionCommand(), f.getHilo().getArriba().getEtq());
                        mensaje.setVisible(true);
                        guardaMultilista();
                        guardaTablaHashs();
                        dispose();
                    }
                }
                );
                jPanelBotones.updateUI();

            }
        } else
        {
            jPanelBotones.updateUI();
        }

    }//GEN-LAST:event_txtNombrePersonaKeyReleased

    private void txtNombrePersonaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNombrePersonaKeyTyped
    {//GEN-HEADEREND:event_txtNombrePersonaKeyTyped
        System.out.println("Presionados");
    }//GEN-LAST:event_txtNombrePersonaKeyTyped

    public String getNombrePersona()
    {
        return this.nombrePersona;
    }

    public boolean isValidPersona()
    {
        return this.validPersona;
    }

    public void guardaTablaHashs()
    {
        try
        {
            try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("Archivos/Tabla.dat"))) {
                file.writeObject(tablaDePersonas);
            }
            System.out.println("Archivito guardadito Hashs");
        } catch (IOException ex)
        {
            System.out.println("No se encontro archivo");
        }

    }

    public void cargaTablaHash()
    {
        try
        {
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream("Archivos/Tabla.dat"))) {
                tablaDePersonas = (TablaHash) file.readObject();
            }
            if (tablaDePersonas != null)
            {
                TablaHash t = new TablaHash();
                t.verarboles();
            }
        } catch (ClassNotFoundException ex)
        {
            System.out.println("La clase no existe o diferente");
        } catch (IOException e)
        {
            System.out.println("No existe el archivo");
            tablaDePersonas = new TablaHash();
        }
    }

    public void guardaMultilista()
    {
        try
        {
            try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("Archivos/raiz.dat"))) {
                file.writeObject(raiz);
            }
            System.out.println("Archivito guardadito");
        } catch (IOException ex)
        {
            System.out.println("No se encontro archivo");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JTextField txtNombrePersona;
    // End of variables declaration//GEN-END:variables
}
