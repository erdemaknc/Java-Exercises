package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int emailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String companySuffix = "company.com";

    //Constructor to receive first name and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        //Call a method asking for department -return the department
        this.department = setDepartment();


        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is" + this.password);

        //Combine elements to set Email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none \nEnter department code ");
        Scanner kb = new Scanner(System.in);
        int depChoice = Integer.parseInt(kb.nextLine());
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    //Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDFGHIJKLMNOPQRSTUVXYZ1234567890*&^%$";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setEmailBoxCapacity(int capacity) {
        this.emailBoxCapacity = capacity;
    }

    //Set alternative email
    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    //Change to password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoXCapacity() {
        return emailBoxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME:" + firstName + " " + lastName +
                "\nCOMPANY EMAIL" + email +
                "\nMAILBOX CAPAcITY" + emailBoxCapacity + "mb";
    }

}