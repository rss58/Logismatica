/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* pues validando para que no se duplique el name
excelente :
 */
package newVnt;

import estructuras.Multilista;
import estructuras.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;

/**
 *
 * @author David Vergara
 */
public final class VtnAddPernsona extends javax.swing.JFrame
{

    Nodo raiz = null;
    TablaHash tablaDePersonas = null;
    
    String seleccionado = null;

    /**
     * Creates new form VtnAddPernsona
     * @param raiz
     * @param seleccionado
     */
    public VtnAddPernsona(Nodo raiz, String seleccionado)
    {
        initComponents();
        this.raiz = raiz;
        this.seleccionado = seleccionado;

        cargaTablaHash();
        System.out.println("Tabla Personas: \n");
        tablaDePersonas.verarboles();
        CambiaBoton(Multilista.busca(raiz, seleccionado).getAbj());
        jLabelRaizPersona.setText("Estas en grupo: " + seleccionado);
        guardaMultilista();
        guardaTablaHashs();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelBotones = new javax.swing.JPanel();
        jLabelRaizPersona = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 193, 66));

        jPanel3.setBackground(java.awt.Color.lightGray);

        btnAgregar.setBackground(new java.awt.Color(103, 119, 48));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregarPersona.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(103, 119, 48));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMover.setBackground(new java.awt.Color(103, 119, 48));
        btnMover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/moverPersona.png"))); // NOI18N
        btnMover.setText("Mover");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(325, 492));

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanelBotonesComponentRemoved(evt);
            }
        });
        jPanelBotones.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(jPanelBotones);

        jLabelRaizPersona.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelRaizPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRaizPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelRaizPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMover)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(88, 103, 39));

        btnSalir.setBackground(new java.awt.Color(103, 119, 48));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ExitChat.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
        JOptionAddPersona agregarPersona = new JOptionAddPersona(this, true, raiz);
        agregarPersona.setVisible(true);
        if (agregarPersona.isValidPersona())
        {
            System.out.println("nombre: " + agregarPersona.getNombrePersona());
            Nodo nuevo = new Nodo(null, agregarPersona.getNombrePersona());
            nuevo.setArriba(Multilista.busca(raiz, seleccionado));
            String[] etiq = new String[2];
            etiq[0] = seleccionado;
            etiq[1] = nuevo.getEtq();
            raiz = Multilista.inserta(raiz, nuevo, 0, etiq);
            tablaDePersonas.inserta(etiq[1], new NodoArbol(etiq[1], null,nuevo));
            tablaDePersonas.verarboles();
            CambiaBoton(Multilista.busca(raiz, seleccionado).getAbj());
        }
        System.out.println(Multilista.prb(raiz));
        difuminadoEntar();      

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        difuminadoSalir();
        JOptionEliminarGente eliminar = new JOptionEliminarGente(this, true, Multilista.busca(raiz, seleccionado).getAbj());
        eliminar.setVisible(true);
        if (eliminar.isValida())
        {
            String nombresAEliminar[] = eliminar.getNombre();
            System.out.println("lengt: " + nombresAEliminar.length);
            for (int i = 0; i < nombresAEliminar.length; i++)
            {
                String etiqs[] = new String[2];
                etiqs[0] = seleccionado;
                etiqs[1] = nombresAEliminar[i];
                System.out.println("Eliminando... " + etiqs[0]);
                raiz = Multilista.elimina(raiz, 0, etiqs, nombresAEliminar[i])[0];
                tablaDePersonas.elimina(nombresAEliminar[i]);
                tablaDePersonas.verarboles();
            }
            System.out.println(Multilista.prb(raiz));
            CambiaBoton(Multilista.busca(raiz, seleccionado).getAbj());
        }
        difuminadoEntar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMoverActionPerformed
    {//GEN-HEADEREND:event_btnMoverActionPerformed
        difuminadoSalir();
        JOptionMoverPerosna_Persona mover = new JOptionMoverPerosna_Persona(this, true, Multilista.busca(raiz, seleccionado).getAbj(),raiz, seleccionado);
        mover.setVisible(true);
        if (mover.isValida())
        {
            String personasAMover[] = mover.getPersonasAMover();
            String grupoAMover = mover.getGrupoAMover();
            
            for (int i = 0; i < personasAMover.length; i++)
            {
                String etiqs[] = new String[2];
                etiqs[0] = seleccionado;
                etiqs[1] = personasAMover[i];
                
                
                
                Nodo raizMover[] = new Nodo[2];
                raizMover = Multilista.elimina(raiz, 0, etiqs, personasAMover[i]);
                System.out.println("Raiz eliminada y lista para mover: "+raizMover[1].getEtq());
                etiqs[0] = grupoAMover;
                etiqs[1] = personasAMover[i];
                raiz = Multilista.inserta(raizMover[0], raizMover[1], 0, etiqs);
            
                
            }
            CambiaBoton(Multilista.busca(raiz, seleccionado).getAbj());
            
        }
        difuminadoEntar();
    }//GEN-LAST:event_btnMoverActionPerformed

    private void jPanelBotonesComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelBotonesComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelBotonesComponentRemoved

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VtnPrincipal principal = new VtnPrincipal(raiz, true);
        principal.setVisible(true);
        guardaTablaHashs();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public Nodo getRaiz()
    {
        return this.raiz;
    }

    private void CambiaBoton(Nodo contPersona)
    {
        jPanelBotones.removeAll();
        if (contPersona != null)
        {
            Nodo aux = contPersona;
            while (aux != null)
            {
                JButton boton = new JButton(aux.getEtq());
                boton.setBackground(new Color(103, 119, 48));
                boton.setFont(btnAgregar.getFont());
                jPanelBotones.add(boton);
                boton.addActionListener((ActionEvent e) -> {
                    VtnAddMensaje mensaje = new VtnAddMensaje(raiz, e.getActionCommand(), seleccionado);
                    mensaje.setVisible(true);
                    guardaMultilista();
                    guardaTablaHashs();
                    dispose();
                });
                aux = aux.getSig();
            }
        }
        jPanelBotones.updateUI();
    }

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
        guardaMultilista();
        guardaTablaHashs();
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
        guardaMultilista();
        guardaTablaHashs();
    }
    //=========================================================//

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelRaizPersona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
