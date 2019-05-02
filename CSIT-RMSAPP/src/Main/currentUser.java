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
    public int bankAccountNum;
    public int phoneNum;
    public Car car;
    
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
            this.bankAccountNum = data.CustomerRecords[id].bankAccountNum;
            this.password = data.CustomerRecords[id].password;
            this.car = data.CustomerRecords[id].car;
            this.email = data.CustomerRecords[id].email;
        
        }
        
        
    }
    
    
}
