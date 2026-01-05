package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JButton next;
   
    JTextField pan,aadhar;
    JRadioButton syes,sno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE2");
        JLabel persondetails = new JLabel("PAGE 2: ADDITIONAL DETAILS");
        persondetails.setFont(new Font("Raleway", Font.BOLD,38));
        persondetails.setBounds(140,20,600,40);
        add(persondetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[] = {"hindu","Muslim","sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel bob = new JLabel("Income:");
        bob.setFont(new Font("raleway",Font.BOLD,20));
        bob.setBounds(100,240,200,30);
        add(bob);
        
        String valincome[] = {"null","<1,50,500","<2,50,500","<5,00,000","upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[] = {"Non Graduation","Graduate","Post Graduation","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
       
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
         String valoccupation[] = {"Salaried","Self Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
      
        
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel("Aadher Number:");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state= new JLabel("Senior Citizen:");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes  = new JRadioButton("YES");
        syes.setBounds(300, 540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno  = new JRadioButton("NO");
        sno.setBounds(450, 540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(sno);
        gendergroup.add(syes);
        
     
        
       
        
        next = new JButton("NEXT");
        next.setBounds(600,600,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
         String sincome = (String)income.getSelectedItem();
         String seducation = (String)education.getSelectedItem();
         String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen =  null;
        
        if (syes.isSelected()){
            seniorcitizen = "Yes";
        }else if (sno.isSelected()){
            seniorcitizen = "No";
        }
        
        
        
        String span = pan.getText();
       
        String saadhar = aadhar.getText();
        
        
        try{
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null,"religion is Required");
            }
            
        
            if(category.equals("")){
                JOptionPane.showMessageDialog(null,"category is Required");
            }
            
            if(income.equals("")){
                JOptionPane.showMessageDialog(null,"income is Required");
            }
            
            if(education.equals("")){
                JOptionPane.showMessageDialog(null,"education is Required");
            }
            
            if (occupation.equals("")) {
    JOptionPane.showMessageDialog(null, "occupation is Required");
}
            if(seniorcitizen.equals("")){
                JOptionPane.showMessageDialog(null,"seniorcitizen is Required");
            }
            
             if(pan.equals("")){
                JOptionPane.showMessageDialog(null,"pan is Required");
            }
            if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "aadher is Required");
            }
            
            else{
                Conn c = new  Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"')";
            c.s.executeUpdate(query);
            
            
            }
            
            setVisible(false);
            new Signupthree(formno).setVisible(true);
            
        }catch (Exception e){
            System.out.print(e);
        }        
    }
    public static void main(String args[]){
        
        new SignupTwo("");
        
    }
    
}
