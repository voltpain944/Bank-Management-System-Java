package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    
    JButton next;
    long random;
    JTextField  nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
        JLabel formno = new JLabel("APPLIACATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel bob = new JLabel("Date of Birth:");
        bob.setFont(new Font("raleway",Font.BOLD,20));
        bob.setBounds(100,240,200,30);
        add(bob);
        
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male  = new JRadioButton("MALE");
        male.setBounds(300, 290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        
        female  = new JRadioButton("FEMALE");
        female.setBounds(450, 290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        unmarried = new JRadioButton("NOTMARRIED");
        unmarried.setBounds(300, 390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        married = new JRadioButton("MARRIED");
        married.setBounds(450, 390,120,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        other = new JRadioButton("OTHER");
        other.setBounds(650, 390,120,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(unmarried);
        maritalgroup.add(married);
        maritalgroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state= new JLabel("State:");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
       
        
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
        String formno = "" + random;
        String name = nameTextField.getText();
        String Fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =  null;
        
        if (male.isSelected()){
            gender = "Male";
        }else if (female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        
        String marital = null;
        if (married.isSelected()){
            marital = "MARRIED";
        }else if (unmarried.isSelected()){
            marital = "NOTMARRIED";
        }else if (other.isSelected()){
            marital = "Other";
        }
        
        String adderss = addressTextField.getText();
       
        String state = stateTextField.getText();
        String city = cityTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            
        
            if(adderss.equals("")){
                JOptionPane.showMessageDialog(null,"Adderss is Required");
            }
            
            if(state.equals("")){
                JOptionPane.showMessageDialog(null,"State is Required");
            }
            
            if(city.equals("")){
                JOptionPane.showMessageDialog(null,"City is Required");
            }
            
            if (gender.equals("")) {
    JOptionPane.showMessageDialog(null, "Gender is Required");
}
            if(email.equals("")){
                JOptionPane.showMessageDialog(null,"Email is Required");
            }
            
             if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date of  birth is Required");
            }
            if(Fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father Name is Required");
            }
            
            else{
                Conn c = new  Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+adderss+"','"+city+"','"+state+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
            }
            
        }catch (Exception e){
            System.out.print(e);
        }        
    }
    public static void main(String args[]){
        
        new SignupOne();
        
    }
    
}
