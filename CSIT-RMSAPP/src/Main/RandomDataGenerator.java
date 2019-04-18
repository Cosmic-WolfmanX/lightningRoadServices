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

public class RandomDataGenerator {
    Random rand = new Random();
    
    int phoneMin = 10000000;
    int phoneMax = 99999999;
    int phoneRange = phoneMax-phoneMin+1;
    
    int bankAccountMin = 100000000;
    int bankAccountMax = 999999999;
    int bankAccountRange = bankAccountMax - bankAccountMin +1;
    
    int ssnMin = 100000000;
    int ssnMax = 999999999;
    int ssnRange = ssnMax-ssnMin +1;
    
    
    int modelYearMin = 0;
    int modelYearMax = 29;
    int modelYearRange = modelYearMax - modelYearMin +1;
    
    
    public int[] randomPhoneNums = new int[100];
    public int[] modelYear = {1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};
    //modelYear size = 30
    
    public CustomerRecord[] CustomerRecords = new CustomerRecord[100];
    
    public String[] firstNames = {"Bob","Stacy","Oliver","Jack","Harry","Jacob","Charlie","Thomas","George","Oscar","James","William","Olivia","Isla","Poppy","Emily","Sophie"};
    //firstNames size = 17
    
    public String[] lastNames = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Lopez","Hill","Cook","Reed","Morgan","Murphy"};
    //lastNames size = 17
    
    public String[] carMakes = {"Acura","Audi","BMW","Buick","Chevrolet","Dodge","Ford","GMC","Honda","Infiniti","Jaguar","Jeep","Kia","Lexus","Mercedes-Benz"};
    //carMakes size = 15
    
    public String[] carModels = {"Hatchback","Sedan","MPV","SUV","Crossover","Coupe","Convertible"};
    //carModels size = 7
    
    RandomDataGenerator()
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
            record.modelYear = modelYear[rand.nextInt(modelYearRange)];
            
            
            //fill license plate field
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < 3; j++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
            }
            for (int j = 0; j < 4; j++) {
            char digit1 = (char) (Math.random() * 10 + '0');
            s.append(digit1);
            record.licenseNum = s.toString();
            }
            
            //fill phone number field
            record.phoneNum = rand.nextInt(phoneRange);
            
            //fill car make field
            record.carMake = carMakes[rand.nextInt(15)];
            
            record.carModel = carModels[rand.nextInt(7)];
            
            record.customerFirstName = firstNames[rand.nextInt(17)];
            
            record.customerLastName = lastNames[rand.nextInt(17)];
            
            record.ssn = rand.nextInt(ssnRange);
            
            CustomerRecords[i] = record;
            
        }
    }
    public void writeToCSV(URL csvFileName) throws java.io.IOException
    {
        String data = "\"ID\",\"firstName\",\"lastName\",\"plateNumber\",\"phoneNumber\",\"carMake\",\"carModel\",\"modelYear\",\"bankAccountNum\"\n";
        for (int i = 0;i<100;i++){
            CustomerRecord record = CustomerRecords[i];
            data += record.id + ",";
            data += record.customerFirstName + ",";
            data += record.customerLastName + ",";
            data += record.licenseNum + ",";
            data += record.phoneNum + ",";
            data += record.carMake + ",";
            data += record.carModel + ",";
            data += record.modelYear + ",";
            data += record.bankAccountNum + ",\n";   
        }
        try{
            String fileString = csvFileName.toString();
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
