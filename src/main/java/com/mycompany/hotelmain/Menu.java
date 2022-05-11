package com.mycompany.hotelmain;

import java.util.ArrayList;
import java.util.Arrays;


public class Menu extends javax.swing.JFrame {
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private ArrayList<Reservation> checkIns = new ArrayList<Reservation>();
    private ArrayList<Reservation> History = new ArrayList<Reservation>();
    private ArrayList<Room> Hotel= new ArrayList<Room>(Arrays.asList(new Room("1",false,"Standard", "Single"),
                new Room("2",false,"Standard", "Single"),
                new Room("3",false,"Standard", "Single"),
                new Room("4",false,"Standard", "Single"),
                new Room("5",false,"Standard", "Single"),
                new Room("6",false,"Standard", "Double"),
                new Room("7",false,"Standard", "Double"),
                new Room("8",false,"Standard", "Double"),
                new Room("9",false,"Standard", "Double"),
                new Room("10",false,"Standard", "Double"),
                new Room("11",false,"Deluxe","Single"),
                new Room("12",false,"Deluxe","Single"),
                new Room("13",false,"Deluxe","Single"),
                new Room("14",false,"Deluxe","Single"),
                new Room("15",false,"Deluxe","Single"),
                new Room("16",false,"Deluxe","Double"),
                new Room("17",false,"Deluxe","Double"),
                new Room("18",false,"Deluxe","Double"),
                new Room("19",false,"Deluxe","Double"),
                new Room("20",false,"Deluxe","Double"),
                new Room("21",false,"Premium","Single"),
                new Room("22",false,"Premium","Single"),
                new Room("23",false,"Premium","Single"),
                new Room("24",false,"Premium","Single"),
                new Room("25",false,"Premium","Single"),
                new Room("26",false,"Premium","Double"),
                new Room("27",false,"Premium","Double"),
                new Room("28",false,"Premium","Double"),
                new Room("29",false,"Premium","Double"),
                new Room("30",false,"Premium","Double"))); 
    
   
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cr = new javax.swing.JButton();
        vh = new javax.swing.JButton();
        vr = new javax.swing.JButton();
        vci = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Victoria Hotel Administration");
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Mistral", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Victoria Hotel");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cr.setBackground(new java.awt.Color(255, 255, 153));
        cr.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        cr.setText("Create Reservation");
        cr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crActionPerformed(evt);
            }
        });

        vh.setBackground(new java.awt.Color(255, 255, 153));
        vh.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        vh.setText("View History");
        vh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhActionPerformed(evt);
            }
        });

        vr.setBackground(new java.awt.Color(255, 255, 153));
        vr.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        vr.setText("View Reservations");
        vr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrActionPerformed(evt);
            }
        });

        vci.setBackground(new java.awt.Color(255, 255, 153));
        vci.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        vci.setText("View Check Ins");
        vci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vciActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        pack();
    }

    private void crActionPerformed(java.awt.event.ActionEvent evt) {
        MakeReservation CreateRes = new MakeReservation(reservations, checkIns, History, Hotel);
        CreateRes.show();
    }

    private void vrActionPerformed(java.awt.event.ActionEvent evt) {
        Reservations CurrentRes = new Reservations(reservations, checkIns, History, Hotel);
        CurrentRes.show();
    }

    private void vhActionPerformed(java.awt.event.ActionEvent evt) {
        historyDetails PrevLogs = new historyDetails(reservations, checkIns, History, Hotel);
        PrevLogs.show();
    }

    private void vciActionPerformed(java.awt.event.ActionEvent evt) {
        checkInDetails currentCheckIn = new checkInDetails(reservations, checkIns, History, Hotel);
        currentCheckIn.show();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {

    }


    private javax.swing.JButton cr;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton vci;
    private javax.swing.JButton vh;
    private javax.swing.JButton vr;

}