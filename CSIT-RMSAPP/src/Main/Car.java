/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Random;

/**
 *
 * @author jmfio
 */
public class Car {
    public String id;
    public String licenseNum;
    public String carMake;
    public String carModel;
    public int modelYear;
    public String[] carMakes = {"Acura","Audi","BMW","Buick","Chevrolet","Dodge","Ford","GMC","Honda","Infiniti","Jaguar","Jeep","Kia","Lexus","Mercedes-Benz"};
    //carMakes size = 15
    
    public int[] modelYears = {1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019};
    //modelYear size = 30
    
    public String[] carModels = {"Hatchback","Sedan","MPV","SUV","Crossover","Coupe","Convertible"};
    //carModels size = 7
    
    Car(){
        
    }
    Car(int id) //function to make a random car
    {
        this.id = String.valueOf(id)+ ".1";
        Random rand = new Random();
        //fill license plate field
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            char ch = (char) (Math.random() * 26 + 'A');
            s.append(ch);
        }
        for (int j = 0; j < 4; j++) {
            char digit1 = (char) (Math.random() * 10 + '0');
            s.append(digit1);
            this.licenseNum = s.toString();
        }
        //fill car make field
        this.carMake = carMakes[rand.nextInt(15)];
        this.carModel = carModels[rand.nextInt(7)];
        this.modelYear = modelYears[rand.nextInt(30)];

    }
}


