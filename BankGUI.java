import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
public class BankGUI implements ActionListener {
    //Instrance Variables
    ArrayList < BankCard > list = new ArrayList < BankCard > ();
    final static int INVALID = -1;
    private JFrame menuFrame, debitFrame, creditFrame;
    private JLabel menuL1, menuL2, debitL1, debitL2, debitL3, debitL4, debitL5, debitL6, debitL7, debitL8, debitL9, debitL10, creditL6, creditL5, creditL4, creditL3, creditL2, creditL1, creditL7, creditL8, creditL9,creditL10,creditL11;
    private JTextField debitT1, debitT2, debitT3, debitT4, debitT5, debitT6, debitT7, debitT8, creditT1, creditT2, creditT3, creditT4, creditT5, creditT6, creditT7, creditT8,creditT9,creditT10;
    private JButton menuButton1, menuButton2, debitButton1, debitButton2, debitButton3, returnButton, returnButton2, creditButton2, creditButton1, returnButton1, creditButton3, creditButton4;
    private JPanel debitp1, debitp2, creditp1,creditp2;
    private JComboBox < String > yearBox, monthBox, dayBox, yearBox1, monthBox1, dayBox1;
    BankGUI() {
        //Menu Frame
        menuFrame = new JFrame("Automatic Tailer Machine");
        menuFrame.setSize(630, 400);
        menuFrame.setLayout(null);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.getContentPane().setBackground(Color.DARK_GRAY);
        menuFrame.setLocationRelativeTo(null);



        menuL2 = new JLabel("««««———————Nepal Rastra Bank————————««««");
        menuL2.setFont(new Font("Serif", Font.BOLD, 22));
        menuL2.setForeground(Color.BLACK);
        menuL2.setOpaque(true);
        menuL2.setBackground(null); // Set background color to null
        menuL2.setBounds(10, 0, 800, 70);
        menuFrame.add(menuL2);

        menuL2 = new JLabel("««««————————All over Nepal————————««««");
        menuL2.setFont(new Font("Serif", Font.BOLD, 22));
        menuL2.setForeground(Color.BLACK);
        menuL2.setOpaque(true);
        menuL2.setBackground(null); // Set background color to null
        menuL2.setBounds(10, 300, 800, 70);
        menuFrame.add(menuL2);



        menuL1 = new JLabel("WELCOME TO ATM");
        menuL1.setFont(new Font("Impact", Font.BOLD, 40));
        menuL1.setForeground(Color.BLACK);
        menuL1.setOpaque(true);
        menuL1.setBackground(Color.white);
        menuL1.setBounds(160, 90, 300, 40);
        menuFrame.add(menuL1);
        //BankCard button
        menuButton1 = new JButton("Debit Card");
        menuButton1.setFont(new Font("Verdana", Font.BOLD, 20));
        menuButton1.setBounds(20, 190, 240, 60);
        menuButton1.setFocusPainted(false);
        menuButton1.setBackground(Color.BLACK);
        menuButton1.setForeground(Color.WHITE);
        menuFrame.add(menuButton1);
        //debit card button
        menuButton2 = new JButton("Credit Card");
        menuButton2.setFont(new Font("Verdana", Font.BOLD, 20));
        menuButton2.setBounds(350, 190, 240, 60); // set position and size
        menuButton2.setFocusPainted(false);
        menuButton2.setBackground(Color.BLACK); // Change background color to
        menuButton2.setForeground(Color.WHITE);
        menuFrame.add(menuButton2);
        menuFrame.setVisible(true);

        //tip tools
        menuButton1.setToolTipText("Click here to add a new bank account.");
        menuButton2.setToolTipText("Click here to add a new credit card.");



        menuButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                debitFrame = new JFrame("Add Debit Card");
                debitFrame.setSize(1000, 650);
                debitFrame.setLayout(null);
                debitFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                // add components to the new frame
                debitL1 = new JLabel("DEBIT CARD");
                debitL1.setBounds(180, 40, 450, 40);
                debitL1.setFont(new Font("Impact", Font.BOLD, 40));
                debitFrame.add(debitL1);

                //for panel
                debitp1 = new JPanel();
                debitp1.setSize(430, 430);
                debitp1.setLocation(10, 90);
                debitp1.setLayout(null);
                debitp1.setBorder(BorderFactory.createTitledBorder("Bank Card Details"));
                debitp1.setBackground(Color.WHITE);
                debitFrame.add(debitp1);




                //For CardId
                debitL2 = new JLabel("CardId");
                debitL2.setBounds(20, 40, 200, 50);
                debitL2.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL2);

                debitT1 = new JTextField();
                debitT1.setBounds(160, 52, 200, 30);
                debitp1.add(debitT1);
                //For BankAccount
                debitL3 = new JLabel("BankAccount");
                debitL3.setBounds(20, 90, 200, 50);
                debitL3.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL3);
                debitT2 = new JTextField();
                debitT2.setBounds(160, 102, 200, 30);
                debitp1.add(debitT2);
                //for ClientName
                debitL4 = new JLabel("ClientName");
                debitL4.setBounds(20, 140, 200, 50);
                debitL4.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL4);
                debitT3 = new JTextField();
                debitT3.setBounds(160, 152, 200, 30);
                debitp1.add(debitT3);
                //Issuer bank
                debitL5 = new JLabel("IssuerBank");
                debitL5.setBounds(20, 190, 200, 50);
                debitL5.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL5);
                debitT4 = new JTextField();
                debitT4.setBounds(160, 202, 200, 30);
                debitp1.add(debitT4);
                //balanceAmount
                debitL6 = new JLabel("BalanceAmount");
                debitL6.setBounds(20, 240, 200, 50);
                debitL6.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL6);
                debitT5 = new JTextField();
                debitT5.setBounds(160, 252, 200, 30);
                debitp1.add(debitT5);
                //pin number
                debitL7 = new JLabel("Pin number");
                debitL7.setBounds(20, 290, 200, 50);
                debitL7.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp1.add(debitL7);
                debitT6 = new JTextField();
                debitT6.setBounds(160, 302, 200, 30);
                debitp1.add(debitT6);
                //debit button
                debitButton1 = new JButton("Add Debit");
                debitButton1.setFont(new Font("Verdana", Font.BOLD, 13));
                debitButton1.setBounds(20, 370, 105, 40); // set position and size
                debitButton1.setFocusPainted(false);
                debitp1.add(debitButton1);

                //display button
                debitButton2 = new JButton("Display");
                debitButton2.setFont(new Font("Verdana", Font.BOLD, 13));
                debitButton2.setBounds(160, 370, 105, 40);
                debitButton2.setFocusPainted(false);
                debitp1.add(debitButton2);

                debitp2 = new JPanel();
                debitp2.setSize(430, 430);
                debitp2.setLocation(520, 90);
                debitp2.setLayout(null);
                debitp2.setBorder(BorderFactory.createTitledBorder("Bank Card Details"));
                debitp2.setBackground(Color.WHITE);
                debitFrame.add(debitp2);

                //For Pin Number
                debitL8 = new JLabel("Pin Number");
                debitL8.setBounds(20, 40, 200, 50);
                debitL8.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp2.add(debitL8);
                debitT7 = new JTextField("");
                debitT7.setBounds(170, 52, 200, 30);
                debitp2.add(debitT7);
                //Withdrawal Amount
                debitL9 = new JLabel("WithdrawalAmount");
                debitL9.setBounds(10, 90, 200, 50);
                debitL9.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp2.add(debitL9);
                debitT8 = new JTextField("");
                debitT8.setBounds(170, 102, 200, 30);
                debitp2.add(debitT8);

                debitL10 = new JLabel("WithDrawal Date");
                debitL10.setBounds(5, 140, 200, 50);
                debitL10.setFont(new Font("Verdana", Font.PLAIN, 15));
                debitp2.add(debitL10);
                String[] years = {
                    "Year",
                    "2022",
                    "2023",
                    "2024",
                    "2025"
                };
                yearBox = new JComboBox < String > (years);
                yearBox.setBounds(170, 153, 70, 25);
                debitp2.add(yearBox);
                String[] months = {
                    "Months",
                    "January",
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
                };
                monthBox = new JComboBox < String > (months);
                monthBox.setBounds(250, 153, 70, 25);
                debitp2.add(monthBox);
                String[] days = {
                    "Days",
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
                };
                dayBox = new JComboBox < String > (days);
                dayBox.setBounds(330, 153, 70, 25);
                debitp2.add(dayBox);

                //withdraw
                debitButton3 = new JButton("Withdraw");
                debitButton3.setFont(new Font("Verdana", Font.BOLD, 13));
                debitButton3.setBounds(20, 370, 105, 40); // set position and size
                debitButton3.setFocusPainted(false);
                debitp2.add(debitButton3);




                //return button of bank
                returnButton = new JButton("Return to main menu");
                returnButton.setFont(new Font("Verdana", Font.BOLD, 15));
                returnButton.setBounds(386, 530, 200, 60); // set position and
                returnButton.setFocusPainted(false);
                debitFrame.add(returnButton);
                //ActionLister to return button
                returnButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        debitFrame.dispose(); // close the current bankFrame
                        menuFrame.setVisible(true); // open the main menu frame agaiin

                    }
                });
                //Action listener for Add debit
                debitButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        addDebit();

                    }
                });
                //Action listener for addwithdraw
                debitButton3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        addwithDrawal();

                    }
                });
                debitButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        display();

                    }
                });
                debitFrame.setVisible(true);
            }
        });
        menuButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f) {
                creditFrame = new JFrame("Add debit Card");
                creditFrame.setSize(1100, 700);
                creditFrame.setLayout(null);
                creditFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // to dispose this frame only

                // add components to the new frame
                creditL1 = new JLabel("DEBIT CARD");
                creditL1.setBounds(180, 40, 450, 40);
                creditL1.setFont(new Font("Impact", Font.BOLD, 40));
                creditFrame.add(creditL1);
                //for panel
                creditp1 = new JPanel();
                creditp1.setSize(430, 430);
                creditp1.setLocation(10, 90);
                creditp1.setLayout(null);
                creditp1.setBorder(BorderFactory.createTitledBorder("Bank Card Details"));
                creditp1.setBackground(Color.WHITE);
                creditFrame.add(creditp1);

                //For CardId
                creditL2 = new JLabel("CardId");
                creditL2.setBounds(20, 40, 190, 40);
                creditL2.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL2);

                creditT1 = new JTextField();
                creditT1.setBounds(160, 52, 190, 25);
                creditp1.add(creditT1);
                //For BankAccount
                creditL3 = new JLabel("BankAccount");
                creditL3.setBounds(20, 80, 190, 40);
                creditL3.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL3);
                creditT2 = new JTextField();
                creditT2.setBounds(160, 92, 190, 25);
                creditp1.add(creditT2);
                //for ClientName
                creditL4 = new JLabel("ClientName");
                creditL4.setBounds(20, 120, 190, 40);
                creditL4.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL4);
                creditT3 = new JTextField();
                creditT3.setBounds(160, 132, 190, 25);
                creditp1.add(creditT3);
                //Issuer bank
                creditL5 = new JLabel("IssuerBank");
                creditL5.setBounds(20, 160, 190, 40);
                creditL5.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL5);
                creditT4 = new JTextField();
                creditT4.setBounds(160, 172, 190, 25);
                creditp1.add(creditT4);
                //balanceAmount
                creditL6 = new JLabel("BalanceAmount");
                creditL6.setBounds(20, 200, 190, 40);
                creditL6.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL6);
                creditT5 = new JTextField();
                creditT5.setBounds(160, 212, 190, 25);
                creditp1.add(creditT5);
                //cvc number
                creditL7 = new JLabel("cvc number");
                creditL7.setBounds(20, 240, 190, 40);
                creditL7.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL7);
                creditT6 = new JTextField();
                creditT6.setBounds(160, 252, 190, 25);
                creditp1.add(creditT6);
                //Interest rate
                creditL8 = new JLabel("Interest rate");
                creditL8.setBounds(20, 280, 190, 40);
                creditL8.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL8);
                creditT7 = new JTextField();
                creditT7.setBounds(160, 292, 190, 25);
                creditp1.add(creditT7);
                //expairation date
                creditL9 = new JLabel("Expiration date");
                creditL9.setBounds(20, 320, 190, 40);
                creditL9.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp1.add(creditL9);

                String[] years1 = {
                    "Year",
                    "2022",
                    "2023",
                    "2024",
                    "2025"
                };
                yearBox1 = new JComboBox < String > (years1);
                yearBox1.setBounds(160, 330, 70, 25);
                creditp1.add(yearBox1);
                String[] months1 = {
                    "Months",
                    "January",
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July",
                    "August",
                    "September",
                    "October",
                    "November",
                    "December"
                };
                monthBox1 = new JComboBox < String > (months1);
                monthBox1.setBounds(235, 330, 70, 25);
                creditp1.add(monthBox1);
                String[] days1 = {
                    "Days",
                    "1",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9",
                    "10",
                    "11",
                    "12",
                    "13",
                    "14",
                    "15",
                    "16",
                    "17",
                    "18",
                    "19",
                    "20",
                    "21",
                    "22",
                    "23",
                    "24",
                    "25",
                    "26",
                    "27",
                    "28",
                    "29",
                    "30",
                    "31"
                };
                dayBox1 = new JComboBox < String > (days1);
                dayBox1.setBounds(310, 330, 70, 25);
                creditp1.add(dayBox1);



                //debit button
                creditButton1 = new JButton("Add Credit");
                creditButton1.setFont(new Font("Verdana", Font.BOLD, 13));
                creditButton1.setBounds(20, 370, 105, 40); // set position and size
                creditButton1.setFocusPainted(false);
                creditp1.add(creditButton1);

                //display button
                creditButton2 = new JButton("Display");
                creditButton2.setFont(new Font("Verdana", Font.BOLD, 13));
                creditButton2.setBounds(160, 370, 105, 40);
                creditButton2.setFocusPainted(false);
                creditp1.add(creditButton2);
                
                //panel 2
                creditp2 = new JPanel();
                creditp2.setSize(430, 230);
                creditp2.setLocation(520, 90);
                creditp2.setLayout(null);
                creditp2.setBorder(BorderFactory.createTitledBorder("Bank Card Details"));
                creditp2.setBackground(Color.WHITE);
                creditFrame.add(creditp2);

                //For credit limit
                creditL10 = new JLabel("creditlimit");
                creditL10.setBounds(20, 40, 200, 50);
                creditL10.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp2.add(creditL10);
                creditT9 = new JTextField("");
                creditT9.setBounds(170, 52, 200, 30);
                creditp2.add(creditT9);
                //Grace peroid
                creditL11 = new JLabel("Grace Peroid");
                creditL11.setBounds(10, 90, 200, 50);
                creditL11.setFont(new Font("Verdana", Font.PLAIN, 15));
                creditp2.add(creditL11);
                creditT10 = new JTextField("");
                creditT10.setBounds(170, 102, 200, 30);
                creditp2.add(creditT10);
                //set setcredit limit
                creditButton3 = new JButton("Setcreditlimit");
                creditButton3.setFont(new Font("Verdana", Font.BOLD, 13));
                creditButton3.setBounds(20, 180, 155, 40);
                creditButton3.setFocusPainted(false);
                creditp2.add(creditButton3);
                //cancelcredit limit
                creditButton4 = new JButton("Cancelcreditlimit");
                creditButton4.setFont(new Font("Verdana", Font.BOLD, 13));
                creditButton4.setBounds(100, 180, 155, 40);
                creditButton4.setFocusPainted(false);
                creditp2.add(creditButton4);





                //return button of bank
                returnButton1 = new JButton("Return to main menu");
                returnButton1.setFont(new Font("Verdana", Font.BOLD, 15));
                returnButton1.setBounds(386, 530, 200, 60); // set position and
                returnButton1.setFocusPainted(false);
                creditFrame.add(returnButton1);
                //ActionLister to return button
                returnButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        creditFrame.dispose(); // close the current bankFrame
                        menuFrame.setVisible(true); // open the main menu frame agaiin

                    }
                });
                //Action listener for Add debit
                creditButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        addCredit();

                    }
                });
                //Action listener for display
                creditButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        display();

                    }
                });
                //Action listener for display
                creditButton3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    setCreditLimit();

                    }
                });
                //Action listener for display
                creditButton3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cancelCredit();

                    }
                });



                creditFrame.setVisible(true);

            }
        });









    }
    public int getCardId() {

        int cardId = INVALID;
        try {
            cardId = Integer.parseInt(debitT1.getText().trim());
            if (cardId <= 0) {
                cardId = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(debitFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return cardId;
    }
    public String getBankAccount() {
        return debitT2.getText().trim();
    }
    public String getClientName() {
        return debitT3.getText().trim();
    }
    public String getIssuerBank() {
        return debitT4.getText().trim();
    }
    public int getBalanceAmount() {

           int balanceAmount = INVALID;
        try {
            balanceAmount = Integer.parseInt(debitT5.getText().trim());
            if (balanceAmount <= 0) {
                balanceAmount = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(debitFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }

        return balanceAmount;
    }
    public int getPinNumber() {

        int pinNumber = INVALID;
        try {
            pinNumber = Integer.parseInt(debitT6.getText().trim());
            if (pinNumber <= 0) {
                pinNumber = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(debitFrame, "please input pinNumber in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }
    public int getPinNumber1() {

        int pinNumber = INVALID;
        try {
            pinNumber = Integer.parseInt(debitT7.getText().trim());
            if (pinNumber <= 0) {
                pinNumber = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(debitFrame, "please input pinNumber in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }
    public int getWithDrawalAmount() {
        int withDrawAmount = INVALID;
        try {
            withDrawAmount = Integer.parseInt(debitT8.getText().trim());
            if (withDrawAmount < 0) {
                withDrawAmount = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(debitFrame, "please input pinNumber in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return withDrawAmount;
    }
    public String getWithDrawalDate() {
        String date = "";
        String year = yearBox.getSelectedItem().toString();
        String month = monthBox.getSelectedItem().toString();
        String day = dayBox.getSelectedItem().toString();

        if (year.equals("Year") || month.equals("Months") || day.equals("Days")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day + "-");
        }




        return date;
    }
    public void addDebit() {
        //card id ko
        int cardId = getCardId();
        if (cardId == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter Id greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //BankAccount ko
        String bankAccount = getBankAccount();
        if (bankAccount.isEmpty()) {
            JOptionPane.showMessageDialog(debitFrame, "please inputBankAccount", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //client Name ko
        String clientName = getClientName();
        if (clientName.isEmpty()) {
            JOptionPane.showMessageDialog(debitFrame, "please inputclientName", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String issuerBank = getIssuerBank();
        if (issuerBank.isEmpty()) {
            JOptionPane.showMessageDialog(debitFrame, "please inputissuername", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int balanceAmount = getBalanceAmount();
        if (balanceAmount == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter positive balance\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int pinNumber = getPinNumber();
        if (pinNumber == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter positive pinNumber\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean found = checkCardIdUnique(cardId);
        if (found == false) {
            DebitCard obj = new DebitCard(issuerBank, bankAccount, cardId, balanceAmount, issuerBank, pinNumber);
            list.add(obj);
            JOptionPane.showMessageDialog(debitFrame, "SuccessFully Added\n", "INFORMATION!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(debitFrame, "please enter unique CardId\n", "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }



        

    }
    public void display() {
        for (BankCard obj: list) {
            if (obj instanceof DebitCard) {
                DebitCard d = (DebitCard) obj;
                d.display();
            } else if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                c.display();
            }

        }
    }

    public boolean checkCardIdUnique(int cardId) {
        boolean found = false;
        for (BankCard obj: list) {
            if (obj instanceof DebitCard) {
                DebitCard d = (DebitCard) obj;
                if (d.getCardId() == cardId) {
                    found = true;
                }

            } else if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                if (c.getCardId() == cardId) {
                    found = true;

                }
            }
        }
        return found;
    }
    public void addwithDrawal() {
        int pinNumber = getPinNumber1();
        if (pinNumber == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter positive pinNumber\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int withDrawalAmount = getWithDrawalAmount();
        if (withDrawalAmount == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter Amount greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String date = getWithDrawalDate();
        if (date == null) {
            JOptionPane.showMessageDialog(debitFrame, "enter correct Dates\n", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        int cardId = getCardId();


        for (BankCard obj: list) {
            if (obj instanceof DebitCard) {
                DebitCard d = (DebitCard) obj;
                if (d.getCardId() == cardId) {
                    d.withdraw(withDrawalAmount, date, pinNumber);
                }
            }
        }
    }
    
    public int getCardId1() {

        int cardId = INVALID;
        try {
            cardId = Integer.parseInt(creditT1.getText().trim());
            if (cardId <= 0) {
                cardId = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return cardId;
    }
    public String getBankAccount1() {
        return creditT2.getText().trim();
    }
    public String getClientName1() {
        return creditT3.getText().trim();
    }
    public String getIssuerBank1() {
        return creditT4.getText().trim();
    }
    public int getBalanceAmount1() {

        int balanceAmount = INVALID;
        try {
            balanceAmount = Integer.parseInt(creditT5.getText().trim());
            if (balanceAmount <= 0) {
                balanceAmount = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }

        return balanceAmount;
    }
    public int getCvcNumber1() {

        int cvcNumber = INVALID;
        try {
            cvcNumber = Integer.parseInt(creditT6.getText().trim());
            if (cvcNumber <= 0) {
                cvcNumber = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }

        return cvcNumber;
    }
    public double getInterestRate1() {
        double interestRate = INVALID;
        try {
            interestRate = Double.parseDouble(creditT7.getText().trim());

            if (interestRate <= 0) {
                interestRate = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input id in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return interestRate;
    }
    public String getExpirationDate1() {
        String date1 = "";
        String year1 = yearBox1.getSelectedItem().toString();
        String month1 = monthBox1.getSelectedItem().toString();
        String day1 = dayBox1.getSelectedItem().toString();

        if (year1.equals("Year") || month1.equals("Months") || day1.equals("Days")) {
            date1 = null;
        } else {
            date1 = (year1 + "-" + month1 + "-" + day1 + "-");
        }




        return date1;
    }
    public double getCreditLimit() {

        double creditLimit = INVALID;
        try {
            creditLimit = Double.parseDouble(creditT9.getText().trim());

            if (creditLimit <= 0) {
                creditLimit = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input creditlimi in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        return creditLimit;
    }
    public int getGracePeroid() {

        int gracePeroid = INVALID;
        try {
            gracePeroid = Integer.parseInt(creditT10.getText().trim());
            if (gracePeroid <= 0) {
                gracePeroid = INVALID;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(creditFrame, "please input graceperiod in integerformat", "Error!!", JOptionPane.ERROR_MESSAGE);
        }

        return gracePeroid;
    }
    

    public void addCredit() {
        //card id ko
        int cardId = getCardId1();
        if (cardId == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "enter Id greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //BankAccount ko
        String bankAccount = getBankAccount1();
        if (bankAccount.isEmpty()) {
            JOptionPane.showMessageDialog(creditFrame, "please inputBankAccount", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //client Name ko
        String clientName = getClientName1();
        if (clientName.isEmpty()) {
            JOptionPane.showMessageDialog(creditFrame, "please inputclientName", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String issuerBank = getIssuerBank1();
        if (issuerBank.isEmpty()) {
            JOptionPane.showMessageDialog(creditFrame, "please inputissuername", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int balanceAmount = getBalanceAmount1();
        if (balanceAmount == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "enter positive balance\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cvcNumber = getCvcNumber1();
        if (cvcNumber == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "enter cvc number greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double interestRate = getInterestRate1();
        if (interestRate == INVALID) {
            JOptionPane.showMessageDialog(creditFrame, "enter InterestRate greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String date1 = getExpirationDate1();
        if (date1 == null) {
            JOptionPane.showMessageDialog(debitFrame, "enter correct Dates\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean found = checkCardIdUnique(cardId);
        if (found == false) {
            CreditCard obj = new CreditCard(issuerBank, bankAccount, cardId, balanceAmount, clientName, cvcNumber, interestRate, date1);
            list.add(obj);
            JOptionPane.showMessageDialog(debitFrame, "SuccessFully Added\n", "INFORMATION!!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(debitFrame, "please enter unique CardId\n", "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }

        

    }
    public void setCreditLimit()
    {
        double creditLimit = getCreditLimit();
        if (creditLimit == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter Id greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int gracePeriod = getGracePeroid();
        if (gracePeriod == INVALID) {
            JOptionPane.showMessageDialog(debitFrame, "enter Id greater than 0\n", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cardId = getCardId1();


        for (BankCard obj: list) {
            if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                if (c.getCardId() == cardId) {
                    c.setCreditLimit(creditLimit,gracePeriod);
                }
            }
        }

    }
    public void cancelCredit()
    {
        for (BankCard obj: list) {
            if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                c.cancelCreditCard();
                }
            }
    }
    


    public static void main(String[] args) {
        new BankGUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}