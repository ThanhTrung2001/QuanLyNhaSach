/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author 19522
 */
public class RevenueManagement extends javax.swing.JFrame {

    /**
     * Creates new form RevenueManagement
     */
    public RevenueManagement() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        ParentPanel = new javax.swing.JTabbedPane();
        SearchTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchTable = new javax.swing.JTable();
        SearchTxb = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        EditChangeBtn = new javax.swing.JButton();
        AddTab = new javax.swing.JPanel();
        UpdateTab = new javax.swing.JPanel();
        ViewTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 200));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REVENUE MANAGEMENT");

        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/icons8_previous_70px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn)
                .addGap(373, 373, 373)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ParentPanel.setBackground(new java.awt.Color(204, 204, 255));

        SearchTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "PhoneNumber", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SearchTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        SearchTable.setCellSelectionEnabled(true);
        SearchTable.setGridColor(new java.awt.Color(0, 0, 0));
        SearchTable.setShowGrid(true);
        jScrollPane1.setViewportView(SearchTable);
        SearchTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        SearchTab.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 935, 577));

        SearchTxb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchTxb.setText("Search here ...");
        SearchTxb.setToolTipText("Search Here....");
        SearchTab.add(SearchTxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 13, 310, 52));

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/Minisize/icons8_search_35px.png"))); // NOI18N
        SearchBtn.setToolTipText("Search");
        SearchTab.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1076, 83, -1, 52));

        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteBtn.setText("DELETE");
        SearchTab.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 265, 116, 51));

        EditChangeBtn.setBackground(new java.awt.Color(255, 204, 204));
        EditChangeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditChangeBtn.setText("EDIT");
        EditChangeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditChangeBtnMouseClicked(evt);
            }
        });
        SearchTab.add(EditChangeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 176, 116, 51));

        ParentPanel.addTab("Daily Report", new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/Minisize/icons8_search_35px.png")), SearchTab); // NOI18N

        AddTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ParentPanel.addTab("Monthly Report", new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/Minisize/icons8_Plus_+_35px.png")), AddTab); // NOI18N

        UpdateTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ParentPanel.addTab("Monthly Revenue", new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/Minisize/icons8_restart_35px.png")), UpdateTab); // NOI18N

        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "PhoneNumber", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ViewTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ViewTable.setColumnSelectionAllowed(false);
        ViewTable.setGridColor(new java.awt.Color(0, 0, 0));
        ViewTable.setShowGrid(true);
        jScrollPane2.setViewportView(ViewTable);
        ViewTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout ViewTabLayout = new javax.swing.GroupLayout(ViewTab);
        ViewTab.setLayout(ViewTabLayout);
        ViewTabLayout.setHorizontalGroup(
            ViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTabLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        ViewTabLayout.setVerticalGroup(
            ViewTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        ParentPanel.addTab("View Customer", new javax.swing.ImageIcon(getClass().getResource("/GUI/Component/Minisize/icons8_eye_35px.png")), ViewTab); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParentPanel)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ParentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void EditChangeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditChangeBtnMouseClicked
        ParentPanel.setSelectedIndex(2);
    }//GEN-LAST:event_EditChangeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(RevenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevenueManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddTab;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditChangeBtn;
    private javax.swing.JTabbedPane ParentPanel;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JPanel SearchTab;
    private javax.swing.JTable SearchTable;
    private javax.swing.JTextField SearchTxb;
    private javax.swing.JPanel UpdateTab;
    private javax.swing.JPanel ViewTab;
    private javax.swing.JTable ViewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}