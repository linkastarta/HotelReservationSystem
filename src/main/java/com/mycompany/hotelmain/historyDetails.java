package com.mycompany.hotelmain;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class historyDetails extends javax.swing.JFrame {

    private ArrayList<Reservation> reservations;
    private ArrayList<Reservation> checkIns;
    private ArrayList<Reservation> history;
    private ArrayList<Room> hotel;

    public historyDetails(ArrayList<Reservation> Reservations, ArrayList<Reservation> CheckIns, ArrayList<Reservation> History, ArrayList<Room> Hotel) {
        initComponents();
        reservations = Reservations;
        checkIns = CheckIns;
        history = History;
        hotel = Hotel;
    }
    public historyDetails() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("History Logs");

        historyTable.setBackground(new java.awt.Color(102, 102, 102));
        historyTable.setForeground(new java.awt.Color(255, 255, 255));
        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation No.", "Customer Name", "Room No.", "Phone Number", "Total Cost"
            }
        ));
        historyTable.setShowHorizontalLines(true);
        historyTable.getTableHeader().setResizingAllowed(false);
        historyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(historyTable);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PREVIOUS CUSTOMERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel model = (DefaultTableModel) historyTable.getModel(); 
        model.setRowCount(0);
        int i = 0;
        for (Reservation r: history)
        {
            System.out.print(r.getRoom().getRoomnumber());
            model.insertRow(i++, new Object[]{r.getReservationNumber(),
                    r.getCustomer().getCustomerName(), r.getRoom().getRoomnumber(),r.getCustomer().getPhoneNumber(), r.getTotalCost()});
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
           this.setVisible(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyDetails().setVisible(true);
            }
        });
    }


    private javax.swing.JTable historyTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;

}