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
public class currentUser {
    public int id;
    public Boolean isWorker;
    public String userName;
    public String firstName;
    public String lastName;
    public String password;
    public String email;
    public long creditCardNum;
    public int cvv;
    public String creditCardExpiryDate;
    public int membershipStatus;
    public String nameOnCreditCard;
    public long phoneNum;
    public Car[] cars;
    
    public currentUser(int id,DataCollection data)
    {
        this.id = id;
        if (id >= 500)
        {
            isWorker = true;
        }
        else
        {
            isWorker = false;
        }
        if (isWorker){
            int index = id-500;
            this.userName = data.WorkerRecords[index].username;
            this.firstName = data.WorkerRecords[index].workerFirstName;
            this.lastName = data.WorkerRecords[index].workerLastName;
            this.phoneNum = data.WorkerRecords[index].phoneNum;
            this.password = data.WorkerRecords[index].password;
            this.email = data.WorkerRecords[index].email;
        }
        else{
            this.userName = data.CustomerRecords[id].username;
            this.firstName = data.CustomerRecords[id].customerFirstName;
            this.lastName = data.CustomerRecords[id].customerLastName;
            this.phoneNum = data.CustomerRecords[id].phoneNum;
            this.creditCardNum = data.CustomerRecords[id].creditCardNum;
            this.cvv = data.CustomerRecords[id].cvv;
            this.creditCardExpiryDate = data.CustomerRecords[id].creditCardExpiryDate;
            this.membershipStatus = data.CustomerRecords[id].membershipStatus;
            this.nameOnCreditCard = data.CustomerRecords[id].nameOnCreditCard;
            this.password = data.CustomerRecords[id].password;
            this.cars = data.CustomerRecords[id].cars;
            this.email = data.CustomerRecords[id].email;
        
        }
        
        
    }
    
    
}
