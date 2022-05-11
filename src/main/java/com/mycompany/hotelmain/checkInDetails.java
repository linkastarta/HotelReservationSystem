package com.mycompany.hotelmain;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class checkInDetails extends javax.swing.JFrame {
    private ArrayList<Reservation> reservations;
    private ArrayList<Reservation> checkIns;
    private ArrayList<Reservation> history;
    private ArrayList<Room> hotel;
    
    public checkInDetails(ArrayList<Reservation> Reservations, ArrayList<Reservation> CheckIns, ArrayList<Reservation> History, ArrayList<Room> Hotel) {
        initComponents();
        reservations = Reservations;
        checkIns = CheckIns;
        history = History;
        hotel = Hotel;
    }
    
    public checkInDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        checkInTable = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        extend = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Current Check Ins");
        setPreferredSize(new java.awt.Dimension(659, 607));

        checkInTable.setBackground(new java.awt.Color(102, 102, 102));
        checkInTable.setForeground(new java.awt.Color(255, 255, 255));
        checkInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation No.", "Customer Name", "Room No.", "Phone Number", "Total Cost"
            }
        ));
        checkInTable.setShowHorizontalLines(true);
        checkInTable.getTableHeader().setResizingAllowed(false);
        checkInTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(checkInTable);

        refresh.setBackground(new java.awt.Color(255, 255, 153));
        refresh.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        extend.setBackground(new java.awt.Color(255, 255, 153));
        extend.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        extend.setText("Extend (1 Day)");
        extend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14));
        jLabel2.setText("Type Reservation No.");

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK IN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extend, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }

    private void extendActionPerformed(java.awt.event.ActionEvent evt) {
        for (Reservation r: checkIns)
        {
            if (r.getReservationNumber().equals(input.getText()))
            {
                r.Extend(1);
                break;
            }
        }
    }

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) checkInTable.getModel();
        model.setRowCount(0);
        int i = 0;
        for (Reservation r: checkIns)
        {
            System.out.print(r.getRoom().getRoomnumber());
            model.insertRow(i++, new Object[]{r.getReservationNumber(),
                    r.getCustomer().getCustomerName(), r.getRoom().getRoomnumber(),r.getCustomer().getPhoneNumber(), r.getTotalCost()});
        }
        
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
         this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        Reservation temp = null;
        for (Reservation r: checkIns)
        {
            if (input.getText().equals(r.getReservationNumber()))
            {
                 temp = r;
            }
        }
        if (temp != null)
        {
                checkIns.remove(temp);
                temp.getRoom().reserve();
                double price = temp.getDays() * ((temp.getRoom().RoomCost() + temp.getRoom().BedCost()) * (temp.getCustomer().getAdult() + (temp.getCustomer().getChildren_Senior() * 0.80)));
                temp.setPrice(price);
                history.add(temp);
        }
    }

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkInDetails().setVisible(true);
            }
        });
    }


    private javax.swing.JTable checkInTable;
    private javax.swing.JButton exit;
    private javax.swing.JButton extend;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refresh;

}