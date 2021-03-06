/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author rcc
 */
public class CalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorFrame
     */
    public CalculatorFrame() {
        initComponents();
    }

    // utility method to handle updating the InputOutputTextField when a new
    // character is entered.
    private void InputOutputTextFieldUpdate(Character c)
    {
        InputOutputTextField.setText(InputOutputTextField.getText()+c);
        this.ButtonClear.setEnabled(true);
        this.ButtonClear.setText("CE");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputOutputTextField = new javax.swing.JTextField();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonDivide = new javax.swing.JButton();
        ButtonMemoryStore = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        ButtonMultiply = new javax.swing.JButton();
        ButtonMemoryClear = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonAddition = new javax.swing.JButton();
        ButtonMemoryRecall = new javax.swing.JButton();
        ButtonClear = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonDecimal = new javax.swing.JButton();
        ButtonSubtraction = new javax.swing.JButton();
        ButtonEquals = new javax.swing.JButton();
        CalculatorMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        EditMenu = new javax.swing.JMenu();
        HelpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InputOutputTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        InputOutputTextField.setToolTipText("Input numeric value");

        Button7.setLabel("7");

        Button8.setText("8");

        Button9.setText("9");

        ButtonDivide.setText("/");

        ButtonMemoryStore.setText("Ms");
        ButtonMemoryStore.setToolTipText("Memory Store");

        Button4.setText("4");

        Button5.setText("5");

        Button6.setText("6");

        ButtonMultiply.setText("*");

        ButtonMemoryClear.setText("Mc");
        ButtonMemoryClear.setToolTipText("Memory Clear");

        Button1.setText("1");

        Button2.setText("2");

        Button3.setText("3");

        ButtonAddition.setText("+");

        ButtonMemoryRecall.setText("M");
        ButtonMemoryRecall.setToolTipText("Get Value From Memory");
        ButtonMemoryRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMemoryRecallActionPerformed(evt);
            }
        });

        ButtonClear.setText("C");
        ButtonClear.setEnabled(false);
        ButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonClearMouseClicked(evt);
            }
        });

        Button0.setText("0");
        Button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button0MouseClicked(evt);
            }
        });
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ButtonDecimal.setText(".");
        ButtonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonDecimalMouseClicked(evt);
            }
        });
        ButtonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDecimalActionPerformed(evt);
            }
        });

        ButtonSubtraction.setText("-");

        ButtonEquals.setText("=");
        ButtonEquals.setToolTipText("");
        ButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEqualsActionPerformed(evt);
            }
        });

        FileMenu.setText("File");
        CalculatorMenuBar.add(FileMenu);

        EditMenu.setText("Edit");
        CalculatorMenuBar.add(EditMenu);

        HelpMenu.setText("Help");
        CalculatorMenuBar.add(HelpMenu);

        setJMenuBar(CalculatorMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputOutputTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonAddition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMultiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonDivide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(ButtonSubtraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonEquals, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMemoryRecall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonMemoryClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonMemoryStore, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InputOutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMemoryStore, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMemoryClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMemoryRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMemoryRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMemoryRecallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonMemoryRecallActionPerformed

    private void ButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEqualsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEqualsActionPerformed

    private void Button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseClicked
        // TODO add your handling code here:
        //String temp = InputOutputTextField.getText()+'0';
        //InputOutputTextField.setText(InputOutputTextField.getText()+'0');
        this.InputOutputTextFieldUpdate('0');
    }//GEN-LAST:event_Button0MouseClicked

    private void ButtonDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDecimalMouseClicked
        // TODO add your handling code here:
        if ( this.ButtonDecimal.isEnabled())
        {
            this.InputOutputTextFieldUpdate('.');
            this.ButtonDecimal.setEnabled(false);
        }
    }//GEN-LAST:event_ButtonDecimalMouseClicked

    private void ButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonClearMouseClicked
        // TODO add your handling code here:
        if ( this.ButtonClear.isEnabled())
        {
            if ( this.InputOutputTextField.getText().length() != 0 ) // we have characters in the textfield
            {
                this.InputOutputTextField.setText("");                
            }
            else
            {
                this.ButtonDecimal.setEnabled(true);
                this.ButtonClear.setText("C");
                this.ButtonClear.setEnabled(false);
                
            }
            this.ButtonDecimal.setEnabled(true);
        }
    }//GEN-LAST:event_ButtonClearMouseClicked

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        // TODO add your handling code here:
        System.out.println("Button 0 Action Performed");
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDecimalActionPerformed
        // TODO add your handling code here:
        System.out.println("Button '.' Action Performed");
    }//GEN-LAST:event_ButtonDecimalActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonAddition;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonDecimal;
    private javax.swing.JButton ButtonDivide;
    private javax.swing.JButton ButtonEquals;
    private javax.swing.JButton ButtonMemoryClear;
    private javax.swing.JButton ButtonMemoryRecall;
    private javax.swing.JButton ButtonMemoryStore;
    private javax.swing.JButton ButtonMultiply;
    private javax.swing.JButton ButtonSubtraction;
    private javax.swing.JMenuBar CalculatorMenuBar;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JTextField InputOutputTextField;
    // End of variables declaration//GEN-END:variables
}
