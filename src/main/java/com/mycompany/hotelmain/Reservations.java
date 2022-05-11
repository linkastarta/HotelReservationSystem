package com.mycompany.hotelmain;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Reservations extends javax.swing.JFrame {

    private ArrayList<Reservation> reservations;
    private ArrayList<Reservation> checkIns;
    private ArrayList<Reservation> history;
    private ArrayList<Room> hotel;
    
    public Reservations(ArrayList<Reservation> Reservations, ArrayList<Reservation> CheckIns, ArrayList<Reservation> History, ArrayList<Room> Hotel) {
        initComponents();
        reservations = Reservations;
        checkIns = CheckIns;
        history = History;
        hotel = Hotel;
    }
    public Reservations() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        checkRIn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ongoing Reservations");

        reservationTable.setBackground(new java.awt.Color(102, 102, 102));
        reservationTable.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        reservationTable.setForeground(new java.awt.Color(255, 255, 255));
        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation No.", "Customer Name", "Room No.", "Phone Number", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservationTable.setGridColor(new java.awt.Color(0, 0, 0));
        reservationTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        reservationTable.setShowGrid(false);
        reservationTable.setShowHorizontalLines(true);
        reservationTable.getTableHeader().setResizingAllowed(false);
        reservationTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(reservationTable);
        if (reservationTable.getColumnModel().getColumnCount() > 0) {
            reservationTable.getColumnModel().getColumn(0).setResizable(false);
            reservationTable.getColumnModel().getColumn(1).setResizable(false);
            reservationTable.getColumnModel().getColumn(2).setResizable(false);
            reservationTable.getColumnModel().getColumn(3).setResizable(false);
            reservationTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14));
        jLabel1.setText("Type Reservation No.");

        checkRIn.setBackground(new java.awt.Color(255, 255, 153));
        checkRIn.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        checkRIn.setText("Check In Reservation");
        checkRIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRInActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 153));
        cancel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        cancel.setText("Cancel Reservation");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 153));
        exit.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36));
        jLabel2.setText("CURRENT RESERVATIONS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkRIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkRIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jButton1.getAccessibleContext().setAccessibleName("");
        checkRIn.getAccessibleContext().setAccessibleName("");
        cancel.getAccessibleContext().setAccessibleName("");
        exit.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) reservationTable.getModel(); 
        model.setRowCount(0);
        int i = 0;
        for (Reservation r: reservations)
        {
            System.out.print(r.getRoom().getRoomnumber());
            model.insertRow(i++, new Object[]{r.getReservationNumber(),
                    r.getCustomer().getCustomerName(), r.getRoom().getRoomnumber(),r.getCustomer().getPhoneNumber(), 0});
        }
    }

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void checkRInActionPerformed(java.awt.event.ActionEvent evt) {

        Reservation tempreservation = null;
        for (Reservation r: reservations)
        {
            if (input.getText().equals(r.getReservationNumber()+""))
            {
                tempreservation = r;
                break;
            }
        }
        if (tempreservation != null)
        {
            reservations.remove(tempreservation);
            checkIns.add(tempreservation);
            input.setText("");
        }
        
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {

        Reservation tempreservation = null;
        for (Reservation r: reservations)
        {
            if (input.getText().equals(r.getReservationNumber()+""))
            {
                tempreservation = r;
                break;
            }
        }
        if (tempreservation != null)
        {
            reservations.remove(tempreservation);
            input.setText("");
            history.add(tempreservation);
        }
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
            this.setVisible(false);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservations().setVisible(true);
            }
        });
    }


    private javax.swing.JButton cancel;
    private javax.swing.JButton checkRIn;
    private javax.swing.JButton exit;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;

}