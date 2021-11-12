
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame{

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        buttonGroup5 = new javax.swing.ButtonGroup();
        lineBorder1 = (javax.swing.border.LineBorder)javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0));
        meal_type = new javax.swing.ButtonGroup();
        tmenu = new javax.swing.JComboBox<>();
        Title = new javax.swing.JLabel();
        veg = new javax.swing.JRadioButton();
        non_veg = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sel_meal = new javax.swing.JLabel();
        sel_table = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        amount = new javax.swing.JTextField();
        Est_amount = new javax.swing.JLabel();
        customer_name = new javax.swing.JLabel();
        customer_num = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 600));
        setSize(new java.awt.Dimension(1000, 600));

        tmenu.setBackground(new java.awt.Color(205, 247, 214));
        tmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tmenu.setForeground(new java.awt.Color(153, 0, 255));
        tmenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6" }));
        tmenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204), new java.awt.Color(204, 255, 204)));
        tmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmenuActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(102, 116, 255));
        Title.setText("Bill Counter");

        veg.setBackground(new java.awt.Color(157, 224, 172));
        meal_type.add(veg);
        veg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        veg.setForeground(new java.awt.Color(153, 0, 255));
        veg.setText("Veg");

        non_veg.setBackground(new java.awt.Color(157, 224, 172));
        meal_type.add(non_veg);
        non_veg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        non_veg.setForeground(new java.awt.Color(153, 0, 255));
        non_veg.setText("Non-Veg");

        table.setBackground(new java.awt.Color(255, 232, 207));
        table.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        table.setForeground(new java.awt.Color(144, 29, 73));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCellSelectionEnabled(true);
        table.setFillsViewportHeight(true);
        table.setRowHeight(35);
        table.setRowMargin(2);
        table.setShowGrid(true);
        jScrollPane1.setViewportView(table);

        sel_meal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sel_meal.setForeground(new java.awt.Color(204, 0, 255));
        sel_meal.setText("     | Select Meal |");
        sel_meal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        sel_table.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sel_table.setForeground(new java.awt.Color(204, 0, 255));
        sel_table.setText("     | Select Table |");
        sel_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        calculate.setBackground(new java.awt.Color(204, 255, 0));
        calculate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        calculate.setForeground(new java.awt.Color(255, 102, 102));
        calculate.setText("BILL");
        calculate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 204), new java.awt.Color(255, 255, 204)));
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        amount.setBackground(new java.awt.Color(255, 218, 226));
        amount.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 102, 204));
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        Est_amount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Est_amount.setForeground(new java.awt.Color(255, 102, 102));
        Est_amount.setText("Estimated Amount =");

        customer_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        customer_name.setForeground(new java.awt.Color(204, 0, 255));
        customer_name.setText("   Customer Name");
        customer_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        customer_num.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        customer_num.setForeground(new java.awt.Color(204, 0, 255));
        customer_num.setText(" Customer Number");
        customer_num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        name.setBackground(new java.awt.Color(255, 216, 193));
        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(153, 0, 255));
        name.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nameInputMethodTextChanged(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        number.setBackground(new java.awt.Color(255, 219, 195));
        number.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        number.setForeground(new java.awt.Color(153, 0, 255));
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Est_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customer_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(number)
                            .addComponent(sel_meal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sel_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customer_num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(name)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(non_veg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(veg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tmenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customer_num, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(sel_table, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sel_meal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(veg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(non_veg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Est_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed

    }//GEN-LAST:event_calculateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void nameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nameInputMethodTextChanged
            
    }//GEN-LAST:event_nameInputMethodTextChanged

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void tmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmenuActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Est_amount;
    private javax.swing.JLabel Title;
    public javax.swing.JTextField amount;
    private javax.swing.ButtonGroup buttonGroup5;
    public javax.swing.JButton calculate;
    private javax.swing.JLabel customer_name;
    private javax.swing.JLabel customer_num;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.border.LineBorder lineBorder1;
    public javax.swing.ButtonGroup meal_type;
    public javax.swing.JTextField name;
    public javax.swing.JRadioButton non_veg;
    public javax.swing.JTextField number;
    private javax.swing.JLabel sel_meal;
    private javax.swing.JLabel sel_table;
    public javax.swing.JTable table;
    public javax.swing.JComboBox<String> tmenu;
    public javax.swing.JRadioButton veg;
    // End of variables declaration//GEN-END:variables
}
