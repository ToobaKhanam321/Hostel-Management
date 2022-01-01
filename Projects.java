/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.lang.*;
abstract class Hostels{   //it is an abstract class
    abstract void display();      //it is an abstract method
}
class Management extends Write implements ActionListener{    //it is our base class 
JFrame jf;  //declare variable of JFrame

// variables for JLabel
JLabel label1,label03,label2,label3,label101,label33,label4,label5,label6,label7,label8,label9,label10,
label11,label12,label13,label14,label15,label16,label17,label18,label19,label20
,label21,label22,label23,label24,label25,label26,label118,label119;

//variables for JComboBox
JComboBox box01,box02,box04,box05,box06,box07,box08,box1,box09;
//variables for JTextField

JTextField txt01,t02,t03,t04,t09,t009,t010,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
JButton b1,b2;  //variables for JButton
JPanel panel1;  //variables for JPanel

// private variables of type String
private String Registration,name,classs,gender,cnic,department,batch,father,
        p_contact1,p_contact2,f_occupation,address,c_city,addressN,block,roomNum,
        location,bed,relation,emerCont,rent,pay_method,total_amt;
//Private variables of type int
private int num1, num2, num4, num3;
Management(){        //constructor
    jf = new JFrame("Hostel Management System");   //window with specified name
   
    label1 = new JLabel("STUDENT DETAILS");        //JLabel with specified text
    label1.setBounds(10, 10, 250, 20);             //set bounds of specified JLabel
    label1.setOpaque(true);
    label1.setBackground(Color.YELLOW);            //set background colour
    jf.add(label1);                                //add this label on our frame
    
    label03 = new JLabel("Registration No.");
    label03.setBounds(10, 40, 120, 20);
    jf.add(label03);
    t03 = new JTextField();                      //create JTextField 
    t03.setBounds(120, 40, 140, 20);
    t03.addActionListener(this);
    jf.add(t03);
    
    label2 = new JLabel("Student Name");
    label2.setBounds(10, 70, 120, 20);
    jf.add(label2);
    t01 = new JTextField();                      //create JTextField 
    t01.setBounds(120, 70, 140, 20);
    t01.addActionListener(this);
    jf.add(t01);
    
    label101 = new JLabel("Class");
    label101.setBounds(10, 100, 100, 20);
    jf.add(label101);
    String [] options33 = {"Bachelors","Masters","M.Phil","Phd"};
    box05 = new JComboBox(options33);
   box05.setBounds(120, 100, 140, 20);
    box05.addActionListener(this);
    jf.add(box05);
    
    label6 = new JLabel("Department");
    label6.setBounds(10, 130, 100, 20);
    jf.add(label6);
    String [] options1 = {"Food Science","Microbiology","Pharmacy","Computer Science","Software Engineering",
    "Bussiness Adminstration","Chemistry","Biotechnology"};
    box1 = new JComboBox(options1);
    box1.setBounds(120, 130, 140, 20);
    box1.addActionListener(this);
    jf.add(box1);
       
    label101 = new JLabel("Batch");
    label101.setBounds(10, 160, 100, 20);
    jf.add(label101);
    String [] options3 = {"2021","2020","2019","2018","2017"};
    box02 = new JComboBox(options3);
    box02.setBounds(120, 160, 140, 20);
    box02.addActionListener(this);
    jf.add(box02);
    
    label5 = new JLabel("Gender");
    label5.setBounds(10,190,100, 20);
    jf.add(label5);
    t04 = new JTextField();
    t04.setBounds(120, 190, 140, 20);
    t04.addActionListener(this);
    jf.add(t04);
    
    label3 = new JLabel("Contact Number");
    label3.setBounds(10, 220, 120, 20);
    jf.add(label3);
    t1 = new JTextField();                             //create JTextField 
    t1.setBounds(120, 220, 140, 20);
    t1.addActionListener(this);
    jf.add(t1);
    
    label33 = new JLabel("CNIC Number");
    label33.setBounds(10, 250, 120, 20);
    jf.add(label33);
    t02 = new JTextField();                            //create JTextField 
    t02.setBounds(120, 250, 140, 20);
    t02.addActionListener(this);
    jf.add(t02);
    
    label11 = new JLabel("PARENTS DETAILS");
    label11.setBounds(10, 280, 250, 20);
    label11.setOpaque(true);
    label11.setBackground(Color.YELLOW);
    jf.add(label11);
    
    label5 = new JLabel("Father Name");
    label5.setBounds(10,310,100, 20);
    jf.add(label5);
    t2 = new JTextField();
    t2.setBounds(120, 310, 140, 20);
    t2.addActionListener(this);
    jf.add(t2);
    
    label7 = new JLabel("Parents Contact1");
    label7.setBounds(10, 340, 100, 20);
    jf.add(label7);
    t4 = new JTextField();
    t4.setBounds(120, 340, 140, 20);
    t4.addActionListener(this);
    jf.add(t4);
    
    label8 = new JLabel("Parents Contact2");
    label8.setBounds(10, 370, 100, 20);
    jf.add(label8);
    t5 = new JTextField();
    t5.setBounds(120, 370, 140, 20);
    t5.addActionListener(this);
    jf.add(t5);
    
    label9 = new JLabel("Father Occupaion");
    label9.setBounds(10, 400, 100, 20);
    jf.add(label9);
    t6 = new JTextField();
    t6.setBounds(120, 400, 140, 20);
    t6.addActionListener(this);
    jf.add(t6);
    
    label10 = new JLabel("City");
    label10.setBounds(10, 430, 100, 20);
    jf.add(label10);
    String [] options2 = {"Karachi","Hyderabad","Faislabad","Islamabad","Lahore",
    "Quetta","Muree","Gawadar"};
    box01 = new JComboBox(options2);
    box01.setBounds(120, 430, 140, 20);
    box01.addActionListener(this);
    jf.add(jcb01);
    
    label18 = new JLabel("Address");
    label18.setBounds(10, 460, 100, 20);
    jf.add(label18);    
    t009 = new JTextField();
    t009.setBounds(120, 460, 140, 20);
    t009.addActionListener(this);
    jf.add(t009);
    
    label15 = new JLabel("ROOM DETAILS");
    label15.setBounds(300, 10, 250, 20);
    label15.setOpaque(true);
    label15.setBackground(Color.YELLOW);
    jf.add(label15);
    
    label16 = new JLabel("Hostel Name");
    label16.setBounds(300, 40, 100, 20);
    jf.add(label16); 
    String [] options04 = {"Jinnah Block","Allama Iqbal Block","Fatima Jinnah Block"};
    box04 = new JComboBox(options04);
    box04.setBounds(410, 40, 140, 20);
    box04.addActionListener(this);
    jf.add(box04);
    
    label16 = new JLabel("Room No.");
    label16.setBounds(300, 70, 100, 20);
    jf.add(label16); 
    String [] options06 = {"1","2","3","4","5","6","7","8","9","10"};
    box06 = new JComboBox(options06);
    box06.setBounds(410, 70, 140, 20);
    box06.addActionListener(this);
    jf.add(box06);
    
    label17 = new JLabel("Room Location");
    label17.setBounds(300, 100, 100, 20);
    jf.add(label17);    
    String [] options07 = {"Ground Floor","First Floor","Second Floor","Third Floor"};
    box07 = new JComboBox(options07);
    box07.setBounds(410, 100, 140, 20);
    box07.addActionListener(this);
    jf.add(box07);
    
    label19 = new JLabel("FACILITIES");
    label19.setBounds(300, 130, 250, 20);
    label19.setOpaque(true);
    label19.setBackground(Color.YELLOW);
    jf.add(label19);
    
    label17 = new JLabel("Bed");
    label17.setBounds(300, 160, 100, 20);
    jf.add(label17);    
    String [] options08 = {"Single","Double"};
    box08 = new JComboBox(options08);
    box08.setBounds(410, 160, 140, 20);
    box08.addActionListener(this);
    jf.add(box08);
    
    //create Checkbox
    JCheckBox checkBox1 = new JCheckBox("Study Tables are available in the Room.");  
    checkBox1.setBounds(300,190, 250,20);  
    JCheckBox checkBox2 = new JCheckBox("Computers are Available in the Room", true);  
    checkBox2.setBounds(300,210, 250,20);  
    JCheckBox checkBox3 = new JCheckBox("WIFI Available in the Hostel Premises", true);  
    checkBox3.setBounds(300,230, 250,20);  
    jf.add(checkBox1);  
    jf.add(checkBox2);  
    jf.add(checkBox3);
    jf.setSize(300,400);  
    jf.setLayout(null);  
    jf.setVisible(true);  
    
    label19 = new JLabel("CONTACT IN CASE OF EMERGENCY");
    label19.setBounds(300, 260, 250, 20);
    label19.setOpaque(true);
    label19.setBackground(Color.YELLOW);
    jf.add(label19);
    
    label18 = new JLabel("Name");
    label18.setBounds(300, 290, 100, 20);
    jf.add(label18);    
    t9 = new JTextField();
    t9.setBounds(410, 290, 140, 20);
    t9.addActionListener(this);
    jf.add(t9);
    
    label118 = new JLabel("Relation");
    label118.setBounds(300, 320, 100, 20);
    jf.add(label118);    
    txt09 = new JTextField();
    txt09.setBounds(410, 320, 140, 20);
    txt09.addActionListener(this);
    jf.add(txt09);
    
    label119 = new JLabel("Contac No");
    label119.setBounds(300, 350, 100, 20);
    jf.add(label119);    
    t010 = new JTextField();
    t010.setBounds(410, 350, 140, 20);
    t010.addActionListener(this);
    jf.add(t010);
    
    label22 = new JLabel("ROOM RENT");
    label22.setBounds(300, 380, 250, 20);
    label22.setOpaque(true);
    label22.setBackground(Color.YELLOW);
    jf.add(label22);
    
    label24 = new JLabel("Rent");
    label24.setBounds(300, 410, 100, 20);
    jf.add(label24);    
    t11 = new JTextField("0");
    t11.setBounds(410, 410, 140, 20);
    jf.add(t11);
    label25 = new JLabel("Payment method");
    label25.setBounds(300, 440, 100, 20);
    jf.add(label25);    
    String [] options8 = {"Cash","Online"};
    box09 = new JComboBox(options8);
    box09.setBounds(410, 440, 140, 20);
    jf.add(box09);   
    label26 = new JLabel("Total Amount");
    label26.setBounds(300, 480, 100, 20);
    jf.add(label26);    
    t12 = new JTextField("0");
    t12.setBounds(410, 480, 140, 20);
    jf.add(t12);

    b1 = new JButton("Calculate Total");          //create JButton with specified text
    b1.setBounds(300, 510, 120, 40);
    b1.addActionListener(this);
    jf.add(b1);
    b2 = new JButton("Confirm Room");
    b2.setBounds(430, 510, 120, 40);
    b2.addActionListener(this);
    jf.add(b2);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //close window by clicking cross on top
    jf.setSize(600, 600);                                   //size of window
    jf.setLayout(null);  
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);
}
public void actionPerformed(ActionEvent e){     //override method of ActionListener interface
    Registration = t03.getText();
    name= t01.getText();                      //to know what is written in text field
    classs=(String) box05.getSelectedItem();
    gender=t04.getText();                     //to know what is written in text field
    cnic = t02.getText();
    department = (String) box01.getSelectedItem();
    batch = (String) box02.getSelectedItem();
    father = t2.getText();
    p_contact1 = t4.getText();
    p_contact2 = t5.getText();
    f_occupation = t6.getText();
    address = t9.getText();
    addressN=t009.getText();
    c_city = (String) box1.getSelectedItem();
    block = (String) box04.getSelectedItem();
    roomNum = (String) box06.getSelectedItem();
    location = (String) box07.getSelectedItem();
    bed = (String) box08.getSelectedItem();
    relation=t09.getText();
    emerCont=t010.getText();
    rent=t11.getText();
    pay_method = (String)box09.getSelectedItem();
    total_amt=t12.getText();
   
    String str = e.getActionCommand();
    if (str == "Confirm Room"){    //checking either confirm order or calculate total button is pressed
        Print();
        JOptionPane.showMessageDialog(jf,"Room is Successfully placed");
    }
    else if(str == "Calculate Total"){
        if(bed == "Single"){ num1 = 15000;}      //set per month rent for diff bed 
        else if (bed == "Double"){num1 = 20000;}
        
        String s = String.valueOf(num1);        //convert int in String
        txt11.setText(s);                       //write value in text field
        if(location == "Ground Floor")
           {num2 = 3000;}                       //set price according to floor level
        else if(location == "First Floor")
           {num2 = 2500;}
        else if(location == "Second Floor")
           {num2 = 2000;}
        else 
           {num2 = 1500;}
        
       if (block == "Jinnah Block"){ num3 = 5000;}      //set price according to facilities
        else if(block == "Allama Iqbal"){num3 = 4000;}
        else{ num3 =2000;}
        num4 = (num1+num2+num3);                        //calculate total
        String str1 = String.valueOf(num4);
        txt12.setText(str1);    
    
}}
void display(){                                           //override method of abstract class "Write"
    try{                                                //try to run the following code
        File file = new File("Order Details.txt");      //create object of file
        FileWriter fr = new FileWriter(file, true);     //create object of FileWriter
        BufferedWriter br = new BufferedWriter(fr);     //create object of BufferedWriter
        PrintWriter pw = new PrintWriter(br);           //create object of PrintWriter
        
        //we use above classes to append data in the end of file rather than over write the previous data
        String str1 = "Registration no.: "+Registration;     //making String to write in file
        String str2 = "Student Name: "+name;
        String str3 = "Student Class: "+classs;
        String str4 = "Student Department: "+c_city;
        String str5 = "Student Batch: "+batch;
        String str6 = "Student Gender: "+gender;
        String str7 = "Student CNIC: "+cnic;
        String str8 = "Student Father: "+father;
        String str9 = "Parent Contact1: "+p_contact1;
        String str10 = "Parent Contact2: "+p_contact2;
        String str11 = "Father Occupation: "+f_occupation;
        String str12 = "City: "+department;
        String str25 = "Address: "+addressN;
        String str13 = "Student Hostel Name: "+block;
        String str14 = "Student Room No: "+roomNum;
        String str15 = "Student Room Location: "+location;
        String str16 = "Student Bed: "+bed;
        String str28 ="Emergency Contact: "+address;
        String str29="Student Relation: "+relation;
        String str30="Student Emergency Contact No.: "+emerCont;
        String str31="Room Rent: "+rent;
        String str32="Payment Method: "+pay_method;
        String str17 = "Total Amount: "+num4;
        
        pw.println(str1);     //write data in file
        pw.println(str2);
        pw.println(str3);
        pw.println(str4);
        pw.println(str5);
        pw.println(str6);
        pw.println(str7);
        pw.println(str8);
        pw.println(str9);
        pw.println(str10);
        pw.println(str11);
        pw.println(str12);
        pw.println(str25);
        pw.println(str13);
        pw.println(str14);
        pw.println(str15);
        pw.println(str16);
        pw.println(str28);
        pw.println(str29);
        pw.println(str30);
        pw.println(str31);
        pw.println(str32);
        pw.println(str17);
        pw.println();
        pw.flush();     //enforce all data to write in file
        pw.close();     //closes PrintWriter
        br.close();     //closes BufferedWriter
        fr.close();     //closes FileWriter
    }
    catch(Exception e){ // use try catch if the following code gives error then program does not crash
        System.out.println(e);
    }
}
}

public class Projects {      
public static void main(String[] args) {
Management obj1 = new Management();   //create object of our base class
}    
}
    
    


