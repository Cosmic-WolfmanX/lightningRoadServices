/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author jmfio
 */
public class Global {
    public static DataCollection data = new DataCollection();
    public static currentUser user;
    public static URL customerRecordsURL;
    public static URL carsURL;
    public static URL workerRecordsURL;
    public static URL customerReportsURL;
    public static URL workerReportsURL;
    public static URL requestsURL;
    public static URL quotesURL;
    public static URL selectPhotoURL;
    public static int numCustomers;
    public static int numWorkers;
    public static URL stringToURL(String imageLoc){
        imageLoc = "file:///" + imageLoc;
        try{
        URL theUrl = new URL(imageLoc);
        return theUrl;
        }
        catch(MalformedURLException f){
            f.printStackTrace();
            System.out.println("couldn't find image");
            System.out.println(imageLoc);
            return null;
        }
    }
    
}
    
