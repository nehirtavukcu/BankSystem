package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;

    JButton next;

    JTextField textName,textFName,textEmail,textAdd,textPin;
    JComboBox<String> cityBox;
    JComboBox<String> stateBox;
    JDateChooser dateChosser;
    Random ran =new Random();

    long first4=(ran.nextLong()% 9000L)+1000L;

    String first =" "+Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 =new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFName=new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChosser = new JDateChooser();
        dateChosser.setForeground(new Color(105,105,105));
        dateChosser.setBounds(300,340,400,30);
        add(dateChosser);


        JLabel labelG=new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail =new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);


        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs =new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);


        m2=new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);


        m3=new JRadioButton("other");
        m3.setBounds(635,440,100,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

       ButtonGroup buttonGroup1 = new ButtonGroup();
       buttonGroup1.add(m1);
       buttonGroup1.add(m2);
       buttonGroup1.add(m3);



        JLabel labelAdd =new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);


        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        String[] cities = {
                "Adana",
                "Ankara",
                "Antalya",
                "Bursa",
                "İstanbul",
                "İzmir",
                "Konya",
                "Mersin",
                "Sakarya",
                "Trabzon"
        };

        cityBox = new JComboBox<>(cities);
        cityBox.setFont(new Font("Raleway", Font.BOLD, 14));
        cityBox.setBounds(300, 540, 400, 30);
        add(cityBox);

        JLabel labelPin =new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);


        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState = new JLabel("Districts:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        stateBox = new JComboBox<>();
        stateBox.setFont(new Font("Raleway", Font.BOLD, 14));
        stateBox.setBounds(300, 640, 400, 30);
        add(stateBox);
        Map<String, String[]> districts = new HashMap<>();

        districts.put("Adana", new String[]{
                "Aladağ", "Ceyhan", "Çukurova", "Feke",
                "İmamoğlu", "Karaisalı", "Karataş", "Kozan",
                "Pozantı", "Saimbeyli", "Sarıçam", "Seyhan",
                "Tufanbeyli", "Yumurtalık", "Yüreğir"
        });

        districts.put("Ankara", new String[]{
                "Altındağ", "Çankaya", "Etimesgut", "Gölbaşı",
                "Keçiören", "Mamak", "Sincan", "Yenimahalle"
        });

        districts.put("Antalya", new String[]{
                "Akseki", "Aksu", "Alanya", "Döşemealtı",
                "Elmalı", "Finike", "Gazipaşa", "Kaş",
                "Kemer", "Kepez", "Konyaaltı", "Korkuteli",
                "Kumluca", "Manavgat", "Muratpaşa", "Serik"
        });

        districts.put("Bursa", new String[]{
                "Gemlik", "Gürsu", "İnegöl", "İznik",
                "Karacabey", "Kestel", "Mudanya", "Mustafakemalpaşa",
                "Nilüfer", "Orhangazi", "Osmangazi", "Yıldırım"
        });

        districts.put("İstanbul", new String[]{
                "Adalar", "Arnavutköy", "Ataşehir", "Avcılar",
                "Bağcılar", "Bahçelievler", "Bakırköy", "Başakşehir",
                "Bayrampaşa", "Beşiktaş", "Beykoz", "Beylikdüzü",
                "Beyoğlu", "Büyükçekmece", "Çatalca", "Çekmeköy",
                "Esenler", "Esenyurt", "Eyüpsultan", "Fatih",
                "Gaziosmanpaşa", "Kadıköy", "Kağıthane", "Kartal",
                "Küçükçekmece", "Maltepe", "Pendik", "Sancaktepe",
                "Sarıyer", "Silivri", "Şile", "Şişli",
                "Tuzla", "Ümraniye", "Üsküdar", "Zeytinburnu"
        });

        districts.put("İzmir", new String[]{
                "Aliağa", "Bayındır", "Bayraklı", "Bergama",
                "Bornova", "Buca", "Çeşme", "Çiğli",
                "Dikili", "Foça", "Gaziemir", "Güzelbahçe",
                "Karabağlar", "Karşıyaka", "Kemalpaşa", "Konak",
                "Menemen", "Narlıdere", "Ödemiş", "Seferihisar",
                "Selçuk", "Tire", "Torbalı", "Urla"
        });

        districts.put("Konya", new String[]{
                "Akşehir", "Beyşehir", "Bozkır", "Cihanbeyli",
                "Çumra", "Ereğli", "Ilgın", "Karatay",
                "Meram", "Selçuklu", "Seydişehir", "Yunak"
        });

        districts.put("Mersin", new String[]{
                "Akdeniz", "Anamur", "Aydıncık", "Bozyazı",
                "Erdemli", "Gülnar", "Mezitli", "Mut",
                "Silifke", "Tarsus", "Toroslar", "Yenişehir"
        });

        districts.put("Sakarya", new String[]{
                "Adapazarı", "Akyazı", "Arifiye", "Erenler",
                "Ferizli", "Geyve", "Hendek", "Karasu",
                "Kaynarca", "Sapanca", "Serdivan", "Söğütlü"
        });

        districts.put("Trabzon", new String[]{
                "Akçaabat", "Araklı", "Arsin", "Çaykara",
                "Maçka", "Ortahisar", "Sürmene", "Tonya",
                "Vakfıkebir", "Yomra"
        });
        cityBox.addActionListener(e -> {
            String selectedCity = (String) cityBox.getSelectedItem();

            stateBox.removeAllItems();

            if (districts.containsKey(selectedCity)) {
                for (String district : districts.get(selectedCity)) {
                    stateBox.addItem(district);
                }
            }
        });String firstCity = (String) cityBox.getSelectedItem();

        if (districts.containsKey(firstCity)) {
            for (String district : districts.get(firstCity)) {
                stateBox.addItem(district);
            }
        }

        next =new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob = "";
        if (dateChosser.getDate() == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter a valid date of birth."
            );
            return;
        }
        dob = new java.text.SimpleDateFormat("yyyy-MM-dd").format(dateChosser.getDate());
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }else if (m2.isSelected()){
            marital="Unmarried";
        }else if(m3.isSelected()){
            marital="other";
        }
        String address = textAdd.getText();

        String city = (String) cityBox.getSelectedItem();
        String state = (String) stateBox.getSelectedItem();

        String pin = textPin.getText();

        if (textName.getText().trim().isEmpty() ||
                textFName.getText().trim().isEmpty() ||
                gender == null ||
                email.trim().isEmpty() ||
                marital == null ||
                textAdd.getText().trim().isEmpty() ||
                cityBox.getSelectedItem()==null ||
                textPin.getText().trim().isEmpty() ||
                stateBox.getSelectedItem() == null) {

            JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
            return;
        }java.util.Date birthDate = dateChosser.getDate();

        java.util.Calendar today = java.util.Calendar.getInstance();
        java.util.Calendar birth = java.util.Calendar.getInstance();

        birth.setTime(birthDate);

        int age = today.get(java.util.Calendar.YEAR) - birth.get(java.util.Calendar.YEAR);

        if (today.get(java.util.Calendar.MONTH) < birth.get(java.util.Calendar.MONTH) ||
                (today.get(java.util.Calendar.MONTH) == birth.get(java.util.Calendar.MONTH) &&
                        today.get(java.util.Calendar.DAY_OF_MONTH) < birth.get(java.util.Calendar.DAY_OF_MONTH))) {
            age--;
        }

        if (age < 18) {
            JOptionPane.showMessageDialog(
                    null,
                    "You must be at least 18 years old to open an account."
            );
            return;
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            JOptionPane.showMessageDialog(
                    null,
                    "Please enter a valid email address."
            );
            return;
        }if (!pin.matches("\\d+")) {

            JOptionPane.showMessageDialog(
                    null,
                    "Pin Code must contain only numbers."
            );
            return;
        } if (pin.length() != 5) {

            JOptionPane.showMessageDialog(
                    null,
                    "Pin Code must be 5 digits."
            );
            return;
        }

        try{

                Connect connect1 =new Connect();
                String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";

                connect1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);



        } catch (Exception E) {
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {
        new Signup();
    }

}
