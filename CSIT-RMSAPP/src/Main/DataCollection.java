/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;



/**
 *
 * @author jmfio
 */

public class DataCollection {
    Random rand = new Random();
    
    
    int phoneMin = 10000000;
    int phoneMax = 99999999;
    int phoneRange = phoneMax-phoneMin+1;
    
    int creditCardMin = 100000000;
    int creditCardMax = 999999999;
    int creditCardRange = creditCardMax - creditCardMin +1;
    
    int cvvMin = 100;
    int cvvMax = 999;
    int cvvRange = cvvMax - cvvMin +1;
    
    
    int monthMin = 1;
    int monthMax = 12;
    int monthRange = monthMax - monthMin +1;
    
    int yearMin = 2019;
    int yearMax = 2028;
    int yearRange = yearMax - yearMin +1;
    
    int membershipMin = 1;
    int membershipMax = 3;
    int membershipRange = membershipMax - membershipMin +1;
    
    

    
    int modelYearMin = 0;
    int modelYearMax = 29;
    int modelYearRange = modelYearMax - modelYearMin +1;
    
    
    public int[] randomPhoneNums = new int[100];
    
    
    public CustomerRecord[] CustomerRecords = new CustomerRecord[100];
    public WorkerRecord[] WorkerRecords = new WorkerRecord[100];
    
    public String[] firstNames = {"Bob","Stacy","Oliver","Jack","Harry","Jacob","Charlie","Thomas","George","Oscar","James","William","Olivia","Isla","Poppy","Emily","Sophie"};
    //firstNames size = 17
    
    public String[] lastNames = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Lopez","Hill","Cook","Reed","Morgan","Murphy"};
    //lastNames size = 17
    

    
    DataCollection()
    {
        
        //create 100 random customers
        for(int i=0;i<100;i++)
        {
            //create new record
            CustomerRecord record = new CustomerRecord();
            
            //fill id field
            record.id = i;
            
            //fill bank account number field
            record.creditCardNum = rand.nextInt(creditCardRange);
            record.cvv = rand.nextInt(cvvRange);
            record.membershipStatus = rand.nextInt(membershipRange);
            int month = rand.nextInt(monthRange);
            int year = rand.nextInt(yearRange);
            record.creditCardExpiryDate =  String.valueOf(month) + "/"   + String.valueOf(year);
            
           
            
            
            
            //fill model year field
            record.car = new Car(i);
           
            
            //fill phone number field
            record.phoneNum = rand.nextInt(phoneRange);
            

            
            record.customerFirstName = firstNames[rand.nextInt(17)];
            
            record.customerLastName = lastNames[rand.nextInt(17)];
            
            record.username = record.customerFirstName.substring(0,3)+ String.valueOf(record.id);
            record.email = record.customerFirstName + "." + record.customerLastName + "@gmail.com";
            record.password = "asdf";
            record.nameOnCreditCard = record.customerFirstName + " " + record.customerLastName;
            
            CustomerRecords[i] = record;
            
        }
        //populate worker records
        for (int i = 0;i<100;i++)
        {
            WorkerRecord record = new WorkerRecord();
            record.id = i+500;
            record.workerFirstName = firstNames[rand.nextInt(17)];
            record.username =  record.workerFirstName.substring(0,3) + String.valueOf(record.id);
            record.password = "asdf";
            record.workerLastName = lastNames[rand.nextInt(17)];
            record.phoneNum = rand.nextInt(phoneRange);
            record.email = record.workerFirstName + "." + record.workerLastName + "@gmail.com";
            

            WorkerRecords[i] = record; 
        }
        
    }
    public void writeToCSV() throws java.io.IOException
    {
        
        URL customerRecordsURL = Global.customerRecordsURL;
        URL carsURL = Global.carsURL;
        URL workerRecordsURL = Global.workerRecordsURL;
        //write customer records
        String data = "\"ID\",\"firstName\",\"lastName\",\"userName\",\"email\",\"password\",\"phoneNumber\",\"creditCardNum\",\"cvv\",\"nameOnCard\",\"creditCardExpiryDate\",\"membershipStatus\"\n";
        for (int i = 0;i<100;i++){
            CustomerRecord record = CustomerRecords[i];
            data += record.id + ",";
            data += record.customerFirstName + ",";
            data += record.customerLastName + ",";
            data += record.username + ",";
            data += record.email + ",";
            data += record.password + ",";
            data += record.phoneNum + ",";
            data += record.creditCardNum  + ",";
            data += record.cvv + ",";
            data += record.nameOnCreditCard + ",";
            data += record.creditCardExpiryDate + ",";
            data += record.membershipStatus + ",\n";
        }
        try{
            String fileString = customerRecordsURL.toString();
            fileString = fileString.replace("file:/" ,"");
            fileString = fileString.replace("%20", " ");
            System.out.println(fileString);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
        //write car records
        data = "\"ID\",\"licenseNum\",\"carMake\",\"carModel\",\"modelYear\"\n";
        for (int i = 0;i<100;i++){
            Car car = CustomerRecords[i].car;
            data += car.id + ",";
            data += car.licenseNum + ",";
            data += car.carMake + ",";
            data += car.carModel + ",";
            data += car.modelYear + "\n";

        }
        try{
            String fileString = carsURL.toString();
            fileString = fileString.replace("file:/" ,"");
            fileString = fileString.replace("%20", " ");
            System.out.println(fileString);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        //write worker records
        data = "\"ID\",\"workerFirstName\",\"workerLastName\",\"username\",\"email\",\"password\",\"phoneNum\"\n";
        for (int i = 0;i<100;i++){
            WorkerRecord record = WorkerRecords[i];
            data += record.id + ",";
            data += record.workerFirstName + ",";
            data += record.workerLastName + ",";
            data += record.username + ",";
            data += record.email + ",";
            data += record.password + ",";
            data += record.phoneNum + "\n";

        }
        try{
            String fileString = workerRecordsURL.toString();
            fileString = fileString.replace("file:/" ,"");
            fileString = fileString.replace("%20", " ");
            System.out.println(fileString);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        
        
        
    }
    
    public void edit_customer_profile(int customerID, String firstName, String lastName, int mobileNumber, String email, int ccNumber, int cvv, int creditCardMonth, int creditCardYear, String creditCardName, int membershipStatus)
    {
        CustomerRecords[customerID].customerFirstName = firstName;
        CustomerRecords[customerID].customerLastName = lastName;
        CustomerRecords[customerID].phoneNum  = mobileNumber;
        CustomerRecords[customerID].email = email;
        CustomerRecords[customerID].creditCardNum = ccNumber;
        CustomerRecords[customerID].cvv = cvv;
        CustomerRecords[customerID].creditCardExpiryDate =  String.valueOf(creditCardMonth) + "/" + String.valueOf(creditCardYear);
        CustomerRecords[customerID].nameOnCreditCard = creditCardName;
        CustomerRecords[customerID].membershipStatus = membershipStatus;
        try
        {
            writeToCSV();
        }
        catch(IOException f)
        {
            f.printStackTrace();
        }


    }
    
}
