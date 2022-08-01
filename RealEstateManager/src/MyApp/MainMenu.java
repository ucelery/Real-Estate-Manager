/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import MyLibs.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Yumeno
 */
public class MainMenu extends javax.swing.JFrame {
    
    ArrayList<Block> blocks = new ArrayList<Block>();
    public MainMenu() {
        initComponents();
        
        // Sample data
        for (int i = 0; i < 5; i++) {
            Block block = new Block(i + 1);
            for (int j = 0; j < 20; j++) {
                Lot lot = new Lot(10, j + 1, 10000, "available");
                block.getLots().add(lot);
            }
            
            blocks.add(block);
        }
        
        DefaultTableModel model = (DefaultTableModel) sTable.getModel();
        
        for (Block block : blocks) {
            for (Lot lot : block.getLots()) {
                model.addRow(new Object[]{
                    block.getBlockNum(), lot.getLotNum(), lot.getSize(), lot.getPrice()}
                );
            }
        }
        
        sTable.setAutoCreateRowSorter(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        modLotsButton = new javax.swing.JButton();
        showLotButton = new javax.swing.JButton();
        procLotsButton = new javax.swing.JButton();
        genRepButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modifyLots = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mBlockFld = new javax.swing.JTextField();
        mSizeFld = new javax.swing.JTextField();
        mPriceFld = new javax.swing.JTextField();
        modifyButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        mLotFld = new javax.swing.JTextField();
        showLots = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sTable = new javax.swing.JTable();
        processLots = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pLotFld = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pStatusCbx = new javax.swing.JComboBox<>();
        backButton3 = new javax.swing.JButton();
        resButton = new javax.swing.JButton();
        pBlockCbx = new javax.swing.JComboBox<>();
        genRep = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        backButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setLayout(new java.awt.CardLayout());

        modLotsButton.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        modLotsButton.setText("Modify Lots");
        modLotsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modLotsButtonActionPerformed(evt);
            }
        });

        showLotButton.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        showLotButton.setText("Show Lots");
        showLotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLotButtonActionPerformed(evt);
            }
        });

        procLotsButton.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        procLotsButton.setText("Process Lots");
        procLotsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procLotsButtonActionPerformed(evt);
            }
        });

        genRepButton.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        genRepButton.setText("Generate Report");
        genRepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genRepButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel1.setText("Welcome!");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modLotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procLotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showLotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genRepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modLotsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showLotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(procLotsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genRepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        parentPanel.add(mainMenu, "card2");

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setText("Modify Lots");
        jLabel2.setToolTipText("");

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("Block:");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel7.setText("Size:");

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel8.setText("Price:");

        modifyButton.setText("Submit");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel14.setText("Lot:");

        javax.swing.GroupLayout modifyLotsLayout = new javax.swing.GroupLayout(modifyLots);
        modifyLots.setLayout(modifyLotsLayout);
        modifyLotsLayout.setHorizontalGroup(
            modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyLotsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(216, 216, 216))
            .addGroup(modifyLotsLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyLotsLayout.createSequentialGroup()
                        .addComponent(modifyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(modifyLotsLayout.createSequentialGroup()
                        .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(mPriceFld, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(mSizeFld)
                        .addComponent(mBlockFld)
                        .addGroup(modifyLotsLayout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(backButton1)))
                    .addComponent(mLotFld, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );
        modifyLotsLayout.setVerticalGroup(
            modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyLotsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mBlockFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(mLotFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mSizeFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mPriceFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(modifyLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(modifyButton))
                .addGap(52, 52, 52))
        );

        parentPanel.add(modifyLots, "card3");

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel3.setText("Show Lots");
        jLabel3.setToolTipText("");

        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        sTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Block", "Lot", "Size", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sTable);

        javax.swing.GroupLayout showLotsLayout = new javax.swing.GroupLayout(showLots);
        showLots.setLayout(showLotsLayout);
        showLotsLayout.setHorizontalGroup(
            showLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showLotsLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(showLotsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(showLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        showLotsLayout.setVerticalGroup(
            showLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showLotsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton2)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        parentPanel.add(showLots, "card4");

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel4.setText("Process Lots");
        jLabel4.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel12.setText("Block No.");

        jLabel15.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel15.setText("Lot No.");

        jLabel16.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel16.setText("Change Status:");

        pStatusCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Reserved", "Sold" }));

        backButton3.setText("Back");
        backButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton3ActionPerformed(evt);
            }
        });

        resButton.setText("Submit");

        pBlockCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout processLotsLayout = new javax.swing.GroupLayout(processLots);
        processLots.setLayout(processLotsLayout);
        processLotsLayout.setHorizontalGroup(
            processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processLotsLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processLotsLayout.createSequentialGroup()
                        .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(87, 87, 87)
                        .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pLotFld)
                                .addComponent(pStatusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pBlockCbx, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processLotsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processLotsLayout.createSequentialGroup()
                        .addComponent(resButton)
                        .addGap(87, 87, 87)
                        .addComponent(backButton3)
                        .addGap(209, 209, 209))))
        );
        processLotsLayout.setVerticalGroup(
            processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processLotsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pBlockCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pLotFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pStatusCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(processLotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resButton)
                    .addComponent(backButton3))
                .addGap(111, 111, 111))
        );

        parentPanel.add(processLots, "card5");

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel5.setText("Generate Report");
        jLabel5.setToolTipText("");

        backButton4.setText("Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });

        gTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Block No.", "Lot No.", "Size", "Price", "Status"
            }
        ));
        gTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(gTable);

        javax.swing.GroupLayout genRepLayout = new javax.swing.GroupLayout(genRep);
        genRep.setLayout(genRepLayout);
        genRepLayout.setHorizontalGroup(
            genRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genRepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton4)
                .addGap(287, 287, 287))
            .addGroup(genRepLayout.createSequentialGroup()
                .addGroup(genRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genRepLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel5))
                    .addGroup(genRepLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        genRepLayout.setVerticalGroup(
            genRepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genRepLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton4)
                .addGap(34, 34, 34))
        );

        parentPanel.add(genRep, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void modLotsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modLotsButtonActionPerformed
       
       parentPanel.removeAll();
       parentPanel.add(modifyLots);
       parentPanel.repaint();
       parentPanel.revalidate();
       
    }//GEN-LAST:event_modLotsButtonActionPerformed

    private void showLotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLotButtonActionPerformed
       
       parentPanel.removeAll();
       parentPanel.add(showLots);
       parentPanel.repaint();
       parentPanel.revalidate();
       
    }//GEN-LAST:event_showLotButtonActionPerformed

    private void procLotsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procLotsButtonActionPerformed
       
       parentPanel.removeAll();
       parentPanel.add(processLots);
       parentPanel.repaint();
       parentPanel.revalidate();
       
    }//GEN-LAST:event_procLotsButtonActionPerformed

    private void genRepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genRepButtonActionPerformed
       
       parentPanel.removeAll();
       parentPanel.add(genRep);
       parentPanel.repaint();
       parentPanel.revalidate();
       
    }//GEN-LAST:event_genRepButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
       parentPanel.removeAll();
       parentPanel.add(mainMenu);
       parentPanel.repaint();
       parentPanel.revalidate();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void backButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton3ActionPerformed
       parentPanel.removeAll();
       parentPanel.add(mainMenu);
       parentPanel.repaint();
       parentPanel.revalidate();
    }//GEN-LAST:event_backButton3ActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
       parentPanel.removeAll();
       parentPanel.add(mainMenu);
       parentPanel.repaint();
       parentPanel.revalidate();
    }//GEN-LAST:event_backButton4ActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        parentPanel.removeAll();
        parentPanel.add(mainMenu);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_backButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JButton backButton3;
    private javax.swing.JButton backButton4;
    private javax.swing.JTable gTable;
    private javax.swing.JPanel genRep;
    private javax.swing.JButton genRepButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mBlockFld;
    private javax.swing.JTextField mLotFld;
    private javax.swing.JTextField mPriceFld;
    private javax.swing.JTextField mSizeFld;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton modLotsButton;
    private javax.swing.JButton modifyButton;
    private javax.swing.JPanel modifyLots;
    private javax.swing.JComboBox<String> pBlockCbx;
    private javax.swing.JTextField pLotFld;
    private javax.swing.JComboBox<String> pStatusCbx;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton procLotsButton;
    private javax.swing.JPanel processLots;
    private javax.swing.JButton resButton;
    private javax.swing.JTable sTable;
    private javax.swing.JButton showLotButton;
    private javax.swing.JPanel showLots;
    // End of variables declaration//GEN-END:variables
}
