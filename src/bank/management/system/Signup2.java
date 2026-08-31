package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    String formno;
    JTextField textTaxId;
    JRadioButton r1,r2,e1,e2;
    JButton next;


    Signup2(String first){
        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno=first;

        JLabel l1=new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2= new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Nationality :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,200,30);
        add(l3);

        String Nationality[]={"Turkish","German","French","Italian","Spanish","British","Other"};
        comboBox=new JComboBox(Nationality);
        comboBox.setBackground(new Color(255,255,255));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Country of Residence :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,230,30);
        add(l4);

        String Residence[]={"Turkey"};
        comboBox2=new JComboBox(Residence);
        comboBox2.setBackground(new Color(255,255,255));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income []={"No Income","Below 150,000", "150,000 - 500,000", "500,000 - 1,000,000", "Above 1,000,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education Level :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,300,30);
        add(l6);

        String Education []={"High School","Undergraduate","Graduate","Postgraduate","Doctorate","Other"};
        comboBox4 = new JComboBox(Education);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String Occupation []={"Student","Employed","Self-Employed","Business Owner","Retired","Unemployed","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("National ID Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        textTaxId = new JTextField();
        textTaxId.setFont(new Font("Raleway",Font.BOLD,18));
        textTaxId.setBounds(350,370,320,30);
        add(textTaxId);




        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,150,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(245, 235, 210));
        r1.setBounds(350,470,100,30);
        add(r1);


        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(245, 235, 210));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,250,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(245, 235, 210));
        e1.setBounds(350,520,100,30);
        add(e1);


        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(245, 235, 210));
        e2.setBounds(460,520,100,30);
        add(e2);

        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(e1);
        existingGroup.add(e2);

        JLabel l9=new JLabel(" Form No :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(570,10,100,30);
        add(l9);

        JLabel l12=new JLabel(first);
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(665,10,100,30);
        add(l12);

        next =new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(245, 235, 210));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nat=(String)comboBox.getSelectedItem();
        String res=(String) comboBox2.getSelectedItem();
        String in=(String) comboBox3.getSelectedItem();
        String ed=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String id=textTaxId.getText();
        if (nat.equals("Turkish")) {

            if (!id.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(null,
                        "Turkish National ID must contain exactly 11 digits.");
                return;
            }
        } else if (nat.equals("German")) {

            if (!id.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(null,
                        "German ID must contain exactly 11 digits.");
                return;
            }
        } else if (nat.equals("French")) {

            if (!id.matches("\\d{15}")) {
                JOptionPane.showMessageDialog(null,
                        "French identification number must contain exactly 15 digits.");
                return;
            }
        } else if (nat.equals("Italian")) {

            if (!id.matches("[A-Za-z0-9]{16}")) {
                JOptionPane.showMessageDialog(null,
                        "Italian identification code must contain exactly 16 characters.");
                return;
            }
        } else if (nat.equals("Spanish")) {

            if (!id.matches("\\d{8}[A-Za-z]")) {
                JOptionPane.showMessageDialog(null,
                        "Spanish DNI must contain 8 digits followed by a letter.");
                return;
            }
        } else if (nat.equals("British")) {

            if (!id.matches("[A-Za-z]{2}\\d{6}[A-Za-z]")) {
                JOptionPane.showMessageDialog(null,
                        "British National Insurance Number must contain 9 characters.");
                return;
            }
        }if (nat.equals("Other") && id.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Please enter your identification number.");
            return;
        }
        String sCitizen="";
        if((r1.isSelected())){
            sCitizen="Yes";

        } else if (r2.isSelected()) {

            sCitizen="No";
        } String eAccount=" ";
        if((e1.isSelected())){
            eAccount="Yes";

        } else if (e2.isSelected()) {

            eAccount="No";
        }
        try{
            if (textTaxId.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in the Tax ID Number.");
                return;

            }if (!r1.isSelected() && !r2.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select Senior Citizen status.");
                return;
            }if (!e1.isSelected() && !e2.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select Existing Account status.");
                return;
            }

            else{
                Connect c1=new Connect();
                String q ="insert into SignupTwo values('"+formno+"','"+nat+"','"+res+"','"+in+"','"+ed+"','"+occ+"','"+id+"','"+sCitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new Signup();
    }

    }

