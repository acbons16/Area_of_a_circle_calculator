/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Ruth
 */
public class Circle extends javax.swing.JFrame {

    /**
     * Creates new form Circle
     */
    public Circle() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radius = new javax.swing.JTextField();
        result = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        area = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(500, 400));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        jLabel1.setText("AREA OF A CIRCLE CALCULATOR");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 60));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("Enter radius: ");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        radius.setBackground(new java.awt.Color(255, 153, 153));
        radius.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        radius.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        radius.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        radius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusActionPerformed(evt);
            }
        });
        jDesktopPane1.add(radius, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 80, 30));

        result.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 190, 40));

        exit.setBackground(new java.awt.Color(255, 153, 153));
        exit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jDesktopPane1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 80, 30));

        area.setBackground(new java.awt.Color(255, 153, 153));
        area.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        area.setText("Calculate area");
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, 30));

        reset.setBackground(new java.awt.Color(255, 153, 153));
        reset.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jDesktopPane1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 30));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruth\\Downloads\\2222.png")); // NOI18N
        jDesktopPane1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusActionPerformed
        //
    }//GEN-LAST:event_radiusActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        if (radius.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "You must enter radius to compute",
                    "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            double Area;
            double pi = 3.14;
            double radius1;
            radius1 = Double.parseDouble(radius.getText());
            Area = pi * radius1 * radius1;
            
            String value = String.format("%.2f", Area);
            result.setText("Area = " + value);
        }

    }//GEN-LAST:event_areaActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        radius.setText(null);
        result.setText(null);
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Circle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Circle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton area;
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField radius;
    private javax.swing.JButton reset;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
