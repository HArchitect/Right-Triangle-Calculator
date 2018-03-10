/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author mark
 */
public class PythCalcGUI extends javax.swing.JFrame {

    /**
     * Creates new form PythCalcGUI
     */
    public PythCalcGUI() {
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

        sideLength = new javax.swing.JLabel();
        entryOne = new javax.swing.JTextField();
        entryTwo = new javax.swing.JTextField();
        calcLeg = new javax.swing.JButton();
        calcHypo = new javax.swing.JButton();
        load = new javax.swing.JLabel();
        calcAHypo = new javax.swing.JButton();
        calcALeg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pyth Calc");

        sideLength.setText("Side length");
        sideLength.setToolTipText("");

        entryOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryOneActionPerformed(evt);
            }
        });

        calcLeg.setText("Calculate Leg");
        calcLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcLegActionPerformed(evt);
            }
        });

        calcHypo.setText("Calculate Hypotenuse");
        calcHypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcHypoActionPerformed(evt);
            }
        });

        calcAHypo.setText("Calculate Actual Hypotenuse");
        calcAHypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAHypoActionPerformed(evt);
            }
        });

        calcALeg.setText("Calculate Actual Leg");
        calcALeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcALegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entryOne)
                    .addComponent(calcLeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcALeg, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcAHypo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(calcHypo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entryTwo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sideLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sideLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcLeg)
                    .addComponent(calcHypo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcAHypo)
                    .addComponent(calcALeg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryOneActionPerformed

    private void calcHypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcHypoActionPerformed
        load.setText ("Loading...");
        String input, inputTwo;
        double Dinput = 1.0; 
        double DinputTwo = 1.0; 
        double total, result;
        input = entryOne.getText();
        try {
            Dinput = Double.parseDouble(input);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        inputTwo = entryTwo.getText();
        try {
            DinputTwo = Double.parseDouble(inputTwo);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (Dinput <= 0 || DinputTwo <= 0) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        total = (Dinput * Dinput) + (DinputTwo * DinputTwo);
        result = Math.sqrt(total);
        sideLength.setText ("Side length: "+Double.toString(result));
        load.setText ("");
    }//GEN-LAST:event_calcHypoActionPerformed

    private void calcLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcLegActionPerformed
        load.setText ("Loading...");
        String input, inputTwo;
        double Dinput = 1.0; 
        double DinputTwo = 1.0; 
        double total, result;
        input = entryOne.getText();
        try {
            Dinput = Double.parseDouble(input);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        inputTwo = entryTwo.getText();
        try {
            DinputTwo = Double.parseDouble(inputTwo);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (Dinput <= 0 || DinputTwo <= 0) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (DinputTwo >= Dinput) {
            total = (DinputTwo * DinputTwo) - (Dinput * Dinput);
        } else {
            total = (Dinput * Dinput) - (DinputTwo * DinputTwo);
        }  
        result = Math.sqrt(total);
        sideLength.setText ("Side length: "+Double.toString(result));
        load.setText ("");
    }//GEN-LAST:event_calcLegActionPerformed

    private void calcAHypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcAHypoActionPerformed
        load.setText ("Loading...");
        String input, inputTwo;
        double Dinput = 1.0; 
        double DinputTwo = 1.0; 
        double total;
        input = entryOne.getText();
        try {
            Dinput = Double.parseDouble(input);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        inputTwo = entryTwo.getText();
        try {
            DinputTwo = Double.parseDouble(inputTwo);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (Dinput <= 0 || DinputTwo <= 0) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        total = (Dinput * Dinput) + (DinputTwo * DinputTwo);
        sideLength.setText ("Side length: sqrt("+Double.toString(total)+")");
        load.setText ("");
    }//GEN-LAST:event_calcAHypoActionPerformed

    private void calcALegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcALegActionPerformed
        load.setText ("Loading...");
        String input, inputTwo;
        double Dinput = 1.0; 
        double DinputTwo = 1.0; 
        double total;
        input = entryOne.getText();
        try {
            Dinput = Double.parseDouble(input);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        inputTwo = entryTwo.getText();
        try {
            DinputTwo = Double.parseDouble(inputTwo);
        } catch (Exception e) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (Dinput <= 0 || DinputTwo <= 0) {
            sideLength.setText ("ERROR");
            load.setText ("");
            return;
        }
        if (DinputTwo >= Dinput) {
            total = (DinputTwo * DinputTwo) - (Dinput * Dinput);
        } else {
            total = (Dinput * Dinput) - (DinputTwo * DinputTwo);
        }  
        sideLength.setText ("Side length: sqrt("+Double.toString(total)+")");
        load.setText ("");
    }//GEN-LAST:event_calcALegActionPerformed


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
            java.util.logging.Logger.getLogger(PythCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PythCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PythCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PythCalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PythCalcGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcAHypo;
    private javax.swing.JButton calcALeg;
    private javax.swing.JButton calcHypo;
    private javax.swing.JButton calcLeg;
    private javax.swing.JTextField entryOne;
    private javax.swing.JTextField entryTwo;
    private javax.swing.JLabel load;
    private javax.swing.JLabel sideLength;
    // End of variables declaration//GEN-END:variables
}
