/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newVnt;

import estructuras.Multilista;
import estructuras.Nodo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JButton;

/**
 *
 * @author David Vergara
 */
public final class VtnAddMensaje extends javax.swing.JFrame
{

    String seleccionado = null;
    String seleccionadoAnterior = null;
    String SeleccionaFecha = null;
    Nodo raiz = null;

    /**
     * Creates new form VtnAddPernsona
     * @param raiz
     * @param seleccionado
     * @param seleccionadoAnterior
     */
    public VtnAddMensaje(Nodo raiz, String seleccionado, String seleccionadoAnterior)
    {
        initComponents();
        this.seleccionado = seleccionado;
        this.seleccionadoAnterior = seleccionadoAnterior;
        this.raiz = raiz;
        
        System.out.println(Multilista.prb(raiz));
        
        CambiaBoton(Multilista.busca(Multilista.busca(raiz, seleccionadoAnterior).getAbj(), seleccionado).getAbj());
        jLabelPersona.setText("Grupo: "+seleccionadoAnterior+" persona: " + seleccionado);
        guardaMultilista();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanelBotones = new javax.swing.JPanel();
        jLabelPersona = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 193, 66));

        jPanel3.setBackground(java.awt.Color.lightGray);

        btnAgregar.setBackground(new java.awt.Color(103, 119, 48));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregarCalendario.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(103, 119, 48));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setLayout(new java.awt.GridLayout(0, 1));

        jLabelPersona.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(88, 103, 39));

        btnSalir.setBackground(new java.awt.Color(103, 119, 48));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ExitChat.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAgregarActionPerformed
    {//GEN-HEADEREND:event_btnAgregarActionPerformed
     difuminadoSalir();
        JOptionAddFecha agregarFecha = new JOptionAddFecha(this, true);
        agregarFecha.setVisible(true);
        if (agregarFecha.isValidFecha())
        {
            System.out.println("nombre: " + agregarFecha.getFecha());
            Nodo nuevo = new Nodo(null, agregarFecha.getFecha());
            String[] etiq = new String[3];
            etiq[0] = seleccionadoAnterior;
            etiq[1] = seleccionado;
            etiq[2] = nuevo.getEtq();
            raiz = Multilista.inserta(raiz, nuevo, 0, etiq);
            CambiaBoton(Multilista.busca(Multilista.busca(raiz, seleccionadoAnterior).getAbj(), seleccionado).getAbj());
        }
        System.out.println(Multilista.prb(raiz));
        difuminadoEntar();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        difuminadoSalir();
        JOptionEliminarFecha eliminar = new JOptionEliminarFecha(this, true, Multilista.busca(Multilista.busca(raiz, seleccionadoAnterior).getAbj(), seleccionado).getAbj());
        eliminar.setVisible(true);
        if (eliminar.isValida())
        {
            String fechaAEliminar[] = eliminar.getNombre();
            System.out.println("lengt: " + fechaAEliminar.length);
            for (int i = 0; i < fechaAEliminar.length; i++)
            {
                String etiqs[] = new String[3];
                etiqs[0] = seleccionadoAnterior;
                etiqs[1] = seleccionado;
                etiqs[2] = fechaAEliminar[i];
                System.out.println("Eliminando... "+etiqs[0]);
                raiz = Multilista.elimina(raiz, 0, etiqs, fechaAEliminar[i])[0];
            }
            System.out.println(Multilista.prb(raiz));
           CambiaBoton(Multilista.busca(Multilista.busca(raiz, seleccionadoAnterior).getAbj(), seleccionado).getAbj());
        }
        difuminadoEntar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        VtnAddPernsona personas = new VtnAddPernsona(raiz, seleccionadoAnterior);
        personas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    //===============Efecto difuminador========================//
    @SuppressWarnings("SleepWhileInLoop")
    public void difuminadoSalir()
    {
        float f = (float) 1.0;
        for (int i = 1; i <= 7; i++)
        {
            this.setOpacity(f);
            f = (float) (f - 0.1);
            try
            {
                Thread.sleep(15);
            } catch (InterruptedException ex)
            {
            }
        }
    }

    @SuppressWarnings("SleepWhileInLoop")
    public void difuminadoEntar()
    {
        float f = 0.3f;
        this.setOpacity(f);
        for (int i = 1; i <= 7; i++)
        {

            f = (float) (0.1) + f;
            if (f == 1.0000001f)
            {
                f = 1.f;
            }
            this.setOpacity(f);
            try
            {
                Thread.sleep(15);
            } catch (InterruptedException ex)
            {
            }
        }
    }
    //=========================================================//
    
    private void CambiaBoton(Nodo contMensaje)
    {
        jPanelBotones.removeAll();
        if (contMensaje != null)
        {
            Nodo aux = contMensaje;
            while (aux != null)
            {
                JButton boton = new JButton(aux.getEtq());
                boton.setBackground(new Color(103,119,48));
                boton.setFont(btnAgregar.getFont());
                jPanelBotones.add(boton);
                boton.addActionListener((ActionEvent e) -> {
                    System.out.println("Al puchar el voton se le envia la raiz: "+Multilista.prb(raiz));
                    mensajeWhats.InterWhats mensaje = new mensajeWhats.InterWhats(raiz, e.getActionCommand(), seleccionado, seleccionadoAnterior);
                    mensaje.setVisible(true);
                    guardaMultilista();
                    dispose();
                });
                aux = aux.getSig();
            }
        }
        jPanelBotones.updateUI();
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelPersona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBotones;
    // End of variables declaration//GEN-END:variables
}