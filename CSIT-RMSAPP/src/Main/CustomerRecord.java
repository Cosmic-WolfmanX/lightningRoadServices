/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jmfio
 */
public class CustomerRecord {
    
    
    public int id;
    public String customerFirstName;
    public String customerLastName;
    public String username;
    public String password;
    public String email;
    public long phoneNum;
    public long creditCardNum;
    public int cvv;
    public String creditCardExpiryDate;
    public int membershipStatus;
    public String nameOnCreditCard;
    public int numcars;
    public int numreports;
    public int numrequests;
    public int numquotes;
    public Car[] cars = new Car[10];
    public CustomerReport[] reports = new CustomerReport[10];
    public Request[] requests = new Request[10];
    public Quote[] quotes = new Quote[10];
    
 
    
}