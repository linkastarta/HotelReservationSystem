package com.mycompany.hotelmain;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;


public class MakeReservation extends javax.swing.JFrame {
        private ArrayList<Reservation> reservations;
    private ArrayList<Reservation> checkIns;
    private ArrayList<Reservation> history;
    private ArrayList<Room> hotel;
    private int reservationNum = 10000;
    
    public MakeReservation(ArrayList<Reservation> Reservations, ArrayList<Reservation> CheckIns, ArrayList<Reservation> History, ArrayList<Room> Hotel) {
        initComponents();
        reservations = Reservations;
        checkIns = CheckIns;
        history = History;
        hotel = Hotel;
    }
    public MakeReservation()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        roomradio = new javax.swing.ButtonGroup();
        bedradio = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        a = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        nameOfCustomer = new javax.swing.JTextField();
        contactNumber = new javax.swing.JTextField();
        numOfAdults = new javax.swing.JTextField();
        numOfKids = new javax.swing.JTextField();
        numOfSeniors = new javax.swing.JTextField();
        numOfDaysStaying = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservation Form");
        setBackground(new java.awt.Color(255, 255, 153));

        a.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        a.setText("Customer Name");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jLabel2.setText("Contact Number");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jLabel3.setText("Num. of Adults");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jLabel4.setText("No. of Kids");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jLabel5.setText("No. of Seniors");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12));
        jLabel6.setText("Days Staying");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14));
        jLabel7.setText("Room Type");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14));
        jLabel8.setText("Bed Type");

        roomradio.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12));
        jRadioButton1.setText("Deluxe");
        jRadioButton1.setToolTipText("");

        roomradio.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12));
        jRadioButton2.setText("Premium");
        jRadioButton2.setToolTipText("");

        bedradio.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12));
        jRadioButton3.setText("Single");
        jRadioButton3.setToolTipText("");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        bedradio.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12));
        jRadioButton4.setText("Double");
        jRadioButton4.setToolTipText("");

        roomradio.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12));
        jRadioButton5.setText("Standard");
        jRadioButton5.setToolTipText("");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        nameOfCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameOfCustomerActionPerformed(evt);
            }
        });

        contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberActionPerformed(evt);
            }
        });

        numOfAdults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfAdultsActionPerformed(evt);
            }
        });

        numOfKids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfKidsActionPerformed(evt);
            }
        });

        numOfSeniors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfSeniorsActionPerformed(evt);
            }
        });

        numOfDaysStaying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfDaysStayingActionPerformed(evt);
            }
        });

        confirm.setBackground(new java.awt.Color(255, 255, 153));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        result.setEditable(false);
        result.setBackground(new java.awt.Color(102, 102, 102));
        result.setColumns(1);
        result.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 13));
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setRows(5);
        result.setToolTipText("");
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(result);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numOfAdults)
                                    .addComponent(numOfKids)
                                    .addComponent(numOfSeniors)
                                    .addComponent(contactNumber)
                                    .addComponent(nameOfCustomer, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numOfDaysStaying, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameOfCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfAdults, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(numOfSeniors, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numOfKids, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfDaysStaying, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButton5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jLabel8))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }

    private void numOfDaysStayingActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {
        try{
        Customer Cus = new Customer(nameOfCustomer.getText(), contactNumber.getText(),Integer.parseInt(numOfAdults.getText()), Integer.parseInt(numOfKids.getText()) + Integer.parseInt(numOfSeniors.getText()),
                getSelectedButtonText(roomradio), getSelectedButtonText(bedradio));
        
        
        int available = roomFinder(Cus.getQualPref(), Cus.getBedTypePref());
        
        
        if (numOfDaysStaying.getText().equals("0"))
        {
            result.append("Invalid Days\n");
        }
        else if (available == -1){
            result.append("No Room Found!\n");
        }
        else
        {    
            hotel.get(available).reserve();
            Reservation ResA = new Reservation(hotel.get(available), Cus, (10000+reservations.size() + checkIns.size() + history.size()) + "", 
                                                  Integer.parseInt(numOfDaysStaying.getText()), 0);
            reservations.add(ResA);
            System.out.println(ResA);
            nameOfCustomer.setText("");
            contactNumber.setText("");
            numOfAdults.setText("");
            numOfKids.setText("");
            numOfSeniors.setText("");
            roomradio.clearSelection();
            bedradio.clearSelection();
            numOfDaysStaying.setText("");
            result.append("SUCCESS: Reservation No. " + ResA.getReservationNumber() + "\n");
        } 
        }
        catch(NumberFormatException e){
            result.append("This input is invalid!\n");
        }
        catch(RuntimeException b){
            result.append("This input is invalid!\n");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.show(false);
    }

    private void nameOfCustomerActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void contactNumberActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void numOfAdultsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void numOfKidsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void numOfSeniorsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeReservation().setVisible(true);
            }
        });
    }
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
    for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText();
        }
    }
    return null;
    }
    public int roomFinder(String roomQuality, String bedType){
        for(int i = 0; i < hotel.size(); i++){
            if(roomQuality.equals( hotel.get(i).getRoomQuality()) && bedType.equals(hotel.get(i).getbedType()) && !hotel.get(i).isReserved()){
                return i;
            }
        }
        return -1;
    }

    private javax.swing.JLabel a;
    private javax.swing.ButtonGroup bedradio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField contactNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameOfCustomer;
    private javax.swing.JTextField numOfAdults;
    private javax.swing.JTextField numOfDaysStaying;
    private javax.swing.JTextField numOfKids;
    private javax.swing.JTextField numOfSeniors;
    private javax.swing.JTextArea result;
    private javax.swing.ButtonGroup roomradio;
}