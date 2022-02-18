/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aed_assignement_2;
import java.util.*;
import java.io.Serializable;
import java.time.Year;

/**
 *
 * @author gloriasingh
 */
 

public class CarsInfo implements Serializable
{
    private static final long serialVersionUID= -897626244093472561L;
    private String company;
    private String location;
    String manfacturing_year;
    private int seats;
    private String model_no;
    private int serial_no;
    private boolean availability;
    Date service_date;
    long fleet_catalog;

    public CarsInfo(String company, String location,String manfacturing_year, int seats, String model_no, int serial_no, boolean availability,Date service_date,long fleet_catalog) {
        this.company = company;
        this.location = location;
        this.manfacturing_year = manfacturing_year;
        this.seats = seats;
        this.model_no = model_no;
        this.serial_no = serial_no;
        this.availability = availability;
        this.service_date = service_date;
        this.fleet_catalog=fleet_catalog;
    }

    public long getFleet_catalog() {
        return fleet_catalog;
    }

    public void setFleet_catalog(long fleet_catalog) {
        this.fleet_catalog = fleet_catalog;
    }

    public CarsInfo() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManfacturing_year() {
        return manfacturing_year;
    }

    public void setManfacturing_year(String manfacturing_year) {
        this.manfacturing_year = manfacturing_year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public int getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(int serial_no) {
        this.serial_no = serial_no;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getService_date() {
        return service_date;
    }

    public void setService_date(Date service_date) {
        this.service_date = service_date;
    }
    
    public boolean equal(CarsInfo c)
    {
        return(this.company==c.company && this.location==c.location && this.manfacturing_year==c.manfacturing_year && this.seats==c.seats && this.model_no==c.model_no && this.serial_no==c.serial_no && this.availability==c.availability && this.service_date==c.service_date && this.fleet_catalog==c.fleet_catalog);
                
    }
 
    
    
    
}

