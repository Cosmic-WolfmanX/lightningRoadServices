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
    
    int bankAccountMin = 100000000;
    int bankAccountMax = 999999999;
    int bankAccountRange = bankAccountMax - bankAccountMin +1;

    
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
            record.bankAccountNum = rand.nextInt(bankAccountRange);
            
            
            //fill model year field
            record.car = new Car(i);
           
            
            //fill phone number field
            record.phoneNum = rand.nextInt(phoneRange);
            

            
            record.customerFirstName = firstNames[rand.nextInt(17)];
            
            record.customerLastName = lastNames[rand.nextInt(17)];
            
            record.username = record.customerFirstName.substring(0,3)+ String.valueOf(record.id);
            record.email = record.customerFirstName + "." + record.customerLastName + "@gmail.com";
            record.password = "asdf";
            
            
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
    public void writeToCSV(URL customerRecordsURL,URL carsURL,URL workerRecordsURL) throws java.io.IOException
    {
        
        //write customer records
        String data = "\"ID\",\"firstName\",\"lastName\",\"userName\",\"email\",\"password\",\"phoneNumber\",\"bankAccountNum\"\n";
        for (int i = 0;i<100;i++){
            CustomerRecord record = CustomerRecords[i];
            data += record.id + ",";
            data += record.customerFirstName + ",";
            data += record.customerLastName + ",";
            data += record.username + ",";
            data += record.email + ",";
            data += record.password + ",";
            data += record.phoneNum + ",";
            data += record.bankAccountNum + ",\n";   
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
    
}
