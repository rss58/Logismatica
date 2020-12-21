package newVnt;

import estructuras.Nodo;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Vergara
 */
public final class JOptionEliminarFecha extends java.awt.Dialog implements ActionListener
{

    Nodo raiz = null;

    static String s[];
    int defaultY = 316;
    private boolean valida = false;
    java.awt.Frame paren;

    String confirmadosS[] = new String[0];

    /**
     * Creates new form NewDialog
     * @param parent
     * @param modal
     * @param raiz
     */
    public JOptionEliminarFecha(java.awt.Frame parent, boolean modal, Nodo raiz)
    {
        super(parent, modal);
        initComponents();

        this.raiz = raiz;

        Nodo aux = raiz;

        while (aux != null)
        {
            System.out.println("raiz: " + aux.getEtq());
            creaIzquierda(aux.getEtq());
            aux = aux.getSig();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jCheckBoxFont1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jSCElimina = new javax.swing.JScrollPane();
        jPElimina = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLInformacion = new javax.swing.JLabel();

        jCheckBoxFont1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxFont1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCheckBoxFont1.setText("hdgftregswedhftugosdfgb");
        jCheckBoxFont1.setFocusPainted(false);

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(174, 192, 124));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSCElimina.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jSCElimina.setPreferredSize(new java.awt.Dimension(172, 100));

        jPElimina.setBackground(new java.awt.Color(255, 255, 255));
        jPElimina.setPreferredSize(new java.awt.Dimension(342, 100));

        javax.swing.GroupLayout jPEliminaLayout = new javax.swing.GroupLayout(jPElimina);
        jPElimina.setLayout(jPEliminaLayout);
        jPEliminaLayout.setHorizontalGroup(
            jPEliminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        jPEliminaLayout.setVerticalGroup(
            jPEliminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );

        jSCElimina.setViewportView(jPElimina);

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        jLInformacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLInformacion.setText("Fecha(s) a eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSCElimina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInformacion)
                .addGap(23, 23, 23)
                .addComponent(jSCElimina, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed

        difuminadoSalir();
        for (int i = 0; i < s.length; i++)
        {

            AlertaAlEliminarFecha a = new AlertaAlEliminarFecha(this.paren, true, raiz, s[i]);
            a.setVisible(true);
            if (a.isConfirmarEli())
            {
                String tmp[] = new String[confirmadosS.length + 1];
                System.arraycopy(confirmadosS, 0, tmp, 0, confirmadosS.length);
                confirmadosS = tmp;
                confirmadosS[confirmadosS.length - 1] = a.getNombreEliminado();
            }
        }
        if (confirmadosS.length != 0)
        {
            System.out.println("nombre almacenados");
            s = confirmadosS;
            valida = true;
            setVisible(false);
        }
        difuminadoEntar();
        dispose();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    @SuppressWarnings("null")
    public Nodo buscar(Nodo r, String etq)
    {
        Nodo aux = r;
        Nodo resul = null;
        int nivel = 0;
        while (r != null)
        {
            if (aux != null)
            {
                resul = abajo(etq, aux, nivel, resul);

                if (aux.getEtq().equals(etq))
                {
                    resul = aux;
                    break;
                }
            }
            r = r.getSig();
            aux = r;
        }
        try
        {
            aux = resul.getAbj();
            if (aux != null)
            {
                resul = resul.getAbj();
            }
        } catch (Exception e)
        {
            System.out.println(e);
            resul = resul;
        }
        return resul;
    }

    public static Nodo abajo(String etq, Nodo aux, int nivel, Nodo resul)
    {
        while (aux != null)
        {
            aux = aux.getAbj();
            while (aux != null)
            {
                if (aux.getAbj() != null)
                {
                    resul = abajo(etq, aux, nivel + 1, resul);
                    if (aux.getEtq().equals(etq))
                    {
                        resul = aux;
                        break;
                    }
                }
                aux = aux.getSig();
            }
        }
        return resul;

    }

    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        s = new String[0];
        System.out.println(camposIzquierda.length);
        for (int i = 0; i <= camposIzquierda.length - 1; i++)
        {
            if (camposIzquierda[i].isSelected() == true)
            {
                String tmp[] = new String[s.length + 1];
                System.arraycopy(s, 0, tmp, 0, s.length);
                s = tmp;
                s[s.length - 1] = camposIzquierda[i].getText();
                System.out.println(camposIzquierda[i].getText());
            }
        }
        System.out.println(s.length);
        if (s.length > 0)
        {
            btnEliminar.setEnabled(true);
        } else
        {
            btnEliminar.setEnabled(false);
        }
    }

    //checkbox izquierda
    //boton
    int yI = 10;
    int xI = 10;
    int anchoIz = 30;
    int altoIz = 27;
    int yY = 100;

    int compIzquierda = 0;
    JCheckBox[] camposIzquierda = new JCheckBox[0];

    public void creaIzquierda(String text)
    {
        anchoIz = anchoIz + (text.length() * 8);
        if (anchoIz >= 250)
        {
            anchoIz = 250;
        }
        JCheckBox tmp[] = new JCheckBox[camposIzquierda.length + 1];
        System.arraycopy(camposIzquierda, 0, tmp, 0, camposIzquierda.length);
        camposIzquierda = tmp;
        camposIzquierda[compIzquierda] = new JCheckBox();
        camposIzquierda[compIzquierda].setText(text);
        camposIzquierda[compIzquierda].setFont(jCheckBoxFont1.getFont());
        camposIzquierda[compIzquierda].addActionListener(this);
        camposIzquierda[compIzquierda].setBackground(java.awt.Color.white);
        camposIzquierda[compIzquierda].setForeground(java.awt.Color.black);
        camposIzquierda[compIzquierda].setBounds(xI, yI, anchoIz, altoIz);//el metodo se llama setBounds
        jPElimina.add(camposIzquierda[compIzquierda]);

        if (yI >= 100)
        {
            yY += 30;

            if (yY >= defaultY)
            {
                this.setSize(458, defaultY);
            } else
            {
                Dimension d = new Dimension(jSCElimina.getSize().width, yY);
                jPElimina.setPreferredSize(d);
                jSCElimina.setPreferredSize(d);

            }

            System.out.println("yy: " + yY);
            Dimension d = new Dimension(jSCElimina.getSize().width, yY);
            jPElimina.setPreferredSize(d);

            Dimension bajarScroll = jPElimina.getSize();
            Point p = new Point(0, bajarScroll.height);
            jSCElimina.getViewport().setViewPosition(p);
        }
        jSCElimina.updateUI();
        yI += 30;
        compIzquierda++;
        anchoIz = 30;
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JCheckBox jCheckBoxFont1;
    private javax.swing.JLabel jLInformacion;
    private javax.swing.JPanel jPElimina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSCElimina;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valida
     */
    public boolean isValida()
    {
        return valida;
    }

    /**
     * 
     * @return 
     */
    public String[] getNombre()
    {
        return s;
    }
    
}