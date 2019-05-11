/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Random;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
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
    
    
    public CustomerRecord[] CustomerRecords = new CustomerRecord[400];
    public WorkerRecord[] WorkerRecords = new WorkerRecord[400];
    
    
    public String[] firstNames = {"Bob","Stacy","Oliver","Jack","Harry","Jacob","Charlie","Thomas","George","Oscar","James","William","Olivia","Isla","Poppy","Emily","Sophie"};
    //firstNames size = 17
    
    public String[] lastNames = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Lopez","Hill","Cook","Reed","Morgan","Murphy"};
    //lastNames size = 17
    
    public String formatURLToString(URL url){

        String fileString = url.toString();
        fileString = fileString.replace("file:/" ,"");
        fileString = fileString.replace("%20", " ");
        return fileString;
    }
    
    DataCollection()
    {
        ClassLoader loader = logInFrame.class.getClassLoader();
        URL url1 = loader.getResource("Main");
        try{
            Global.workerRecordsURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/WorkerRecords.csv", null);
            Global.customerRecordsURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/CustomerRecords.csv", null);
            Global.carsURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/Cars.csv", null);
            Global.customerReportsURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/CustomerReports.csv", null);
            Global.workerReportsURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/WorkerReports.csv", null);
            Global.quotesURL = new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/Quotes.csv", null);
            Global.requestsURL =  new URL(url1.getProtocol(), url1.getHost(), url1.getPort(), url1.getFile() + "/Requests.csv", null);
        }   catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
        String WorkerURLString = formatURLToString(Global.workerRecordsURL);
        String CustomerRecordsURLString = formatURLToString(Global.customerRecordsURL);
        String CarsURLString = formatURLToString(Global.carsURL);
        String CustomerReportsURLString = formatURLToString(Global.customerReportsURL);
        String WorkerReportsURLString = formatURLToString(Global.workerReportsURL);
        String QuotesURLString = formatURLToString(Global.quotesURL);
        String RequestsURLString = formatURLToString(Global.requestsURL);
        
        File workerRecordsFile = new File(WorkerURLString);
        File customerRecordsFile = new File(CustomerRecordsURLString);
        File carsFile = new File(CarsURLString);
        File customerReportsFile = new File(CustomerReportsURLString);
        File quotesFile = new File(QuotesURLString);
        File requestsFile = new File(RequestsURLString);
        
        if (workerRecordsFile.exists() && customerRecordsFile.exists() && carsFile.exists() && customerReportsFile.exists() && quotesFile.exists()&& requestsFile.exists()){
            Global.numCustomers = 0;
            Global.numWorkers = 0;
            try{
                this.readCSV();
            }
            catch(java.io.IOException e){
                e.printStackTrace();
            }
                
        }
        else
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
                record.creditCardExpiryDate =  String.valueOf(month) + "-"   + String.valueOf(year);





                //fill model year field
                Car theCar = new Car(i);
                record.cars[0] = theCar;
                record.numcars = 1;
                
                //reports
                record.numreports = 0;
                
                //requests
                record.numrequests = 0;
                
                //quotes
                record.numquotes = 0;


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
                record.numQuotes = 0;
                


                WorkerRecords[i] = record;
                
            }
            Global.numCustomers = 100;
            Global.numWorkers = 100;
        }
    }
    
    public void readCSV() throws java.io.IOException{
        
        String customerRecordsURLString = formatURLToString(Global.customerRecordsURL);
        String carsURLString = formatURLToString(Global.carsURL);
        String workerRecordsURLString = formatURLToString(Global.workerRecordsURL);
        String customerReportsURLString = formatURLToString(Global.customerReportsURL);
        String workerReportsURLString = formatURLToString(Global.workerReportsURL);
        String quotesURLString = formatURLToString(Global.quotesURL);
        String requestsURLString = formatURLToString(Global.requestsURL);
        
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        //read in Customer CSV
        try{
            br = new BufferedReader(new FileReader(customerRecordsURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                String[] Row = line.split(csvSplitBy);
                CustomerRecord record = new CustomerRecord();
                try{
                    if (!Row[0].equals("\"ID\"") && !Row[0].equals("")){
                        record.id = Integer.valueOf(Row[0]);
                        record.customerFirstName = Row[1];
                        record.customerLastName = Row[2];
                        record.username = Row[3];
                        record.email = Row[4];
                        record.password = Row[5];
                        record.phoneNum = Integer.valueOf(Row[6]);
                        record.creditCardNum = Integer.valueOf(Row[7]);
                        record.cvv = Integer.valueOf(Row[8]);
                        record.nameOnCreditCard = Row[9];
                        record.creditCardExpiryDate = Row[10];
                        record.membershipStatus = Integer.valueOf(Row[11]);
                        record.numcars = 0;
                        this.CustomerRecords[record.id] = record;
                        Global.numCustomers +=1;
                    }
                }finally{
                }
                
            }

            //read in worker csv
            line = "";
            br = new BufferedReader(new FileReader(workerRecordsURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                String[] Row = line.split(csvSplitBy);
                WorkerRecord record = new WorkerRecord();
                try{
                    if (!Row[0].equals("\"ID\"") && !Row[0].equals("")){
                        record.id = Integer.valueOf(Row[0]);
                        record.workerFirstName = Row[1];
                        record.workerLastName = Row[2];
                        record.username = Row[3];
                        record.email = Row[4];
                        record.password = Row[5];
                        record.phoneNum = Integer.valueOf(Row[6]);
                        this.WorkerRecords[record.id-500] = record;
                        Global.numWorkers +=1;
                    }
                }finally{
                }
            }
             //read in worker csv
            line = "";
            br = new BufferedReader(new FileReader(carsURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                String[] Row = line.split(csvSplitBy);
                try{
                    if(!Row[0].equals("\"ID\"") && !Row[0].equals("")){
                        String carID = Row[0];

               
                        String custIDString = Row[0].split("\\.")[0];
                        int custID = Integer.valueOf(custIDString);

                        int numCars = this.CustomerRecords[custID].numcars;
                        Car theCar = new Car();
                        theCar.id = carID;
                        theCar.licenseNum = Row[1];
                        theCar.carMake = Row[2];
                        theCar.carModel = Row[3];
                        theCar.modelYear = Integer.valueOf(Row[4]);

                        this.CustomerRecords[custID].cars[numCars] = theCar;
                        this.CustomerRecords[custID].numcars +=1;
                    }
                }finally{
                }
                
            line = "";
            br = new BufferedReader(new FileReader(customerReportsURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                Row = line.split(csvSplitBy);
                try{
                    if(!Row[0].equals("\"customerID\"") && !Row[0].equals("")){

                        int custID = Integer.valueOf(Row[0]);

                        int numReports = this.CustomerRecords[custID].numreports;
                        CustomerReport report = new CustomerReport();
                        report.customerID = Integer.valueOf(Row[0]);
                        report.workerID = Integer.valueOf(Row[1]);
                        report.dateOccured = Row[2];
                        report.location = Row[3];
                        report.incidentDetails = Row[4];
                        report.repairsGiven = Row[5];
                        report.rating = Integer.valueOf(Row[6]);
                        report.feedback = Row[7];
                        

                        this.CustomerRecords[custID].reports[numReports] = report;
                        this.CustomerRecords[custID].numreports +=1;
                    }
                }finally{
                }
            line = "";
            br = new BufferedReader(new FileReader(requestsURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                Row = line.split(csvSplitBy);
                try{
                    if(!Row[0].equals("\"customerID\"") && !Row[0].equals("")){

                        int custID = Integer.valueOf(Row[0]);

                        int numRequests = this.CustomerRecords[custID].numrequests;
                        Request theRequest = new Request();
                        theRequest.custID = Integer.valueOf(Row[0]);
                        theRequest.location = Row[1];
                        theRequest.VID = Row[2];
                        theRequest.model = Row[3];
                        theRequest.make = Row[4];
                        theRequest.year = Integer.valueOf(Row[5]);
                        theRequest.registration = Row[6];
                        theRequest.faults = Row[7];
                        theRequest.isResolved = Boolean.valueOf(Row[8]);

                        
                       
                        this.CustomerRecords[custID].requests[numRequests] = theRequest;
                        this.CustomerRecords[custID].numrequests +=1;
                    }
                }finally{
                }
                        line = "";
            br = new BufferedReader(new FileReader(quotesURLString));
            while ((line = br.readLine())!= null){
                
                //use comma as separator
                Row = line.split(csvSplitBy);
                try{
                    if(!Row[0].equals("\"customerID\"") && !Row[0].equals("")){

                        int custID = Integer.valueOf(Row[0]);
                        int workerID = Integer.valueOf(Row[1]);

                        int numQuotesCustomer = this.CustomerRecords[custID].numquotes;
                        int numQuotesWorker = this.WorkerRecords[workerID-500].numQuotes;
                        Quote theQuote = new Quote();
                        theQuote.customerID = custID;
                        theQuote.workerID = workerID;
                        theQuote.cost = Float.valueOf(Row[2]);
                        theQuote.estimatedTimeInMins = Integer.valueOf(Row[3]);
                        theQuote.ABN = Row[4];
                        theQuote.Certificates = Row[5];
                        theQuote.isAccepted = Boolean.valueOf(Row[6]);
                        theQuote.isResolved = Boolean.valueOf(Row[7]);
                        
                       
                        this.CustomerRecords[custID].quotes[numQuotesCustomer] = theQuote;
                        this.CustomerRecords[custID].numquotes +=1;
                        this.WorkerRecords[workerID].quotes[numQuotesWorker] = theQuote;
                        this.WorkerRecords[workerID].numQuotes+=1;
                    }
                }finally{
                }
            }
            }
            }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
    public void writeToCSV() throws java.io.IOException
    {
        
        URL customerRecordsURL = Global.customerRecordsURL;
        URL carsURL = Global.carsURL;
        URL workerRecordsURL = Global.workerRecordsURL;
        URL customerReportsURL = Global.customerReportsURL;
        URL requestsURL = Global.requestsURL;
        URL quotesURL = Global.quotesURL;
        //write customer records
        
        String data = "\"ID\",\"firstName\",\"lastName\",\"userName\",\"email\",\"password\",\"phoneNumber\",\"creditCardNum\",\"cvv\",\"nameOnCard\",\"creditCardExpiryDate\",\"membershipStatus\"\n";
        for (int i = 0;i<Global.numCustomers;i++){
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
        for (int i = 0;i<Global.numCustomers;i++){
            int numCars = CustomerRecords[i].numcars;
            for(int j = 0;j<numCars;j++){
                Car car = CustomerRecords[i].cars[j];
                data += car.id + ",";
                data += car.licenseNum + ",";
                data += car.carMake + ",";
                data += car.carModel + ",";
                data += car.modelYear + "\n";
            }
        }
        try{
            String fileString = carsURL.toString();
            fileString = fileString.replace("file:/" ,"");
            fileString = fileString.replace("%20", " ");
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
        for (int i = 0;i<Global.numWorkers;i++){
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
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
        //write requests
        data = "\"customerID\",\"location\",\"VID\",\"Model\",\"Make\",\"year\",\"Registration\",\"faults\",\"isResolved\"\n";
        for (int i = 0;i<Global.numCustomers;i++){
            int numRequests = CustomerRecords[i].numrequests;
            for (int j = 0;j<numRequests;j++){
                Request theRequest = CustomerRecords[i].requests[j];
                data += theRequest.custID + ",";
                data += theRequest.location + ",";
                data += theRequest.VID + ",";
                data += theRequest.model + ",";
                data += theRequest.make + ",";
                data += theRequest.year + ",";
                data += theRequest.registration + ",";
                data += theRequest.faults + ",";
                data += theRequest.isResolved + "\n";

        }
        try{
            String fileString = formatURLToString(requestsURL);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        }
        //write quotes
        data = "\"customerID\",\"workerID\",\"cost\",\"estimatedTimeToArriveInMins\",\"ABN\",\"Certifications\",\"isAccepted\",\"isResolved\"\n";
        for (int i = 0;i<Global.numCustomers;i++){
            int numQuotes = CustomerRecords[i].numquotes;
            for (int j = 0;j<numQuotes;j++){
                Quote theQuote = CustomerRecords[i].quotes[j];
                
                data += theQuote.customerID + ",";
                data += theQuote.workerID + ",";
                data += theQuote.cost + ",";
                data += theQuote.estimatedTimeInMins + ",";
                data += theQuote.ABN + ",";
                data += theQuote.Certificates + ",";
                data += theQuote.isAccepted + ",";
                data += theQuote.isResolved + "\n";


        }
        try{
            String fileString = formatURLToString(quotesURL);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileString)) ;
            writer.append(data);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        }
        //write reports
        data = "\"customerID\",\"workerID\",\"date\",\"location\",\"details\",\"repairsGiven\",\"Rating\",\"feedback\"\n";
        for (int i = 0;i<Global.numCustomers;i++){
            int numReports = CustomerRecords[i].numreports;
            for (int j = 0;j<numReports;j++){
                CustomerReport report = CustomerRecords[i].reports[j];
                data += report.customerID + ",";
                data += report.workerID + ",";
                data += report.dateOccured + ",";
                data += report.location + ",";
                data += report.incidentDetails + ",";
                data += report.repairsGiven + ",";
                data += report.rating + ",";
                data += report.feedback + "\n";


        }
        try{
            String fileString = formatURLToString(customerReportsURL);
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
    public CustomerRecord add_customer(String firstName, String lastName, String password, long mobileNumber, String email, int membershipStatus, long ccNumber,String creditCardName,int creditCardMonth, int creditCardYear, int cvv )
    {
        CustomerRecord newCust = new CustomerRecord();
        newCust.id = Global.numCustomers;
        newCust.customerFirstName = firstName;
        newCust.customerLastName = lastName;
        newCust.username = firstName.substring(0,3)+ String.valueOf(newCust.id);
        newCust.password = password;
        newCust.email = email;
        newCust.phoneNum = mobileNumber;
        newCust.creditCardNum = ccNumber;
        newCust.cvv = cvv;
        newCust.creditCardExpiryDate = String.valueOf(creditCardMonth) + "-" + String.valueOf(creditCardYear);
        newCust.membershipStatus = membershipStatus;
        newCust.nameOnCreditCard = creditCardName;
        newCust.numcars = 0;
        newCust.numrequests = 0;
        newCust.numreports = 0;
        newCust.numquotes = 0;
        CustomerRecords[newCust.id] = newCust;
        Global.numCustomers +=1;
        try
        {
            writeToCSV();
        }
        catch(IOException f)
        {
            f.printStackTrace();
        }
        
        return newCust;
    }
    




}