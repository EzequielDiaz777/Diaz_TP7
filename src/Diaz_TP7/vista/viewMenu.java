/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diaz_TP7.vista;
    
import Diaz_TP7.entidad.Alumno;
import Diaz_TP7.entidad.Materia;
import java.util.HashSet;

public class viewMenu extends javax.swing.JFrame {
    HashSet<Alumno> listaDeAlumnos = new HashSet<>();
    HashSet<Materia> listaDeMaterias = new HashSet<>();
    /**
     * Creates new form viewMenu
     */
    public viewMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAltas = new javax.swing.JMenu();
        jmiAltaDeMaterias = new javax.swing.JMenuItem();
        jmiAltaDeAlumnos = new javax.swing.JMenuItem();
        jmFormularioDeInscripcion = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jmAltas.setText("Altas");
        jmAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAltasActionPerformed(evt);
            }
        });

        jmiAltaDeMaterias.setText("Alta de materias");
        jmiAltaDeMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaDeMateriasActionPerformed(evt);
            }
        });
        jmAltas.add(jmiAltaDeMaterias);

        jmiAltaDeAlumnos.setText("Alta de alumnos");
        jmiAltaDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaDeAlumnosActionPerformed(evt);
            }
        });
        jmAltas.add(jmiAltaDeAlumnos);

        jMenuBar1.add(jmAltas);

        jmFormularioDeInscripcion.setText("Formulario de inscripción");
        jmFormularioDeInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmFormularioDeInscripcionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmFormularioDeInscripcion);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAltaDeMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaDeMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        
        viewFormularioDeMaterias fdm = new viewFormularioDeMaterias(listaDeMaterias);
        fdm.setVisible(true);
        escritorio.add(fdm);
        escritorio.moveToFront(fdm);
    }//GEN-LAST:event_jmiAltaDeMateriasActionPerformed

    private void jmiAltaDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaDeAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        
        viewFormularioDeAlumnos fda = new viewFormularioDeAlumnos(listaDeAlumnos);
        fda.setVisible(true);
        escritorio.add(fda);
        escritorio.moveToFront(fda);
    }//GEN-LAST:event_jmiAltaDeAlumnosActionPerformed

    private void jmAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAltasActionPerformed
        
    }//GEN-LAST:event_jmAltasActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmFormularioDeInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmFormularioDeInscripcionMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        
        viewFormularioDeInscripcion fdi = new viewFormularioDeInscripcion(listaDeAlumnos,listaDeMaterias);
        fdi.setVisible(true);
        escritorio.add(fdi);
        escritorio.moveToFront(fdi);
    }//GEN-LAST:event_jmFormularioDeInscripcionMouseClicked

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
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAltas;
    private javax.swing.JMenu jmFormularioDeInscripcion;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAltaDeAlumnos;
    private javax.swing.JMenuItem jmiAltaDeMaterias;
    // End of variables declaration//GEN-END:variables
}