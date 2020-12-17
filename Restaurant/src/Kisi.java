import java.sql.*;

import java.util.Scanner;

public class Kisi {
    
    private String ad ; 
    private String soyAd; 
    private String email ;

    Scanner scan = new Scanner(System.in);

    public Kisi() {
        
    }

    public Kisi(String ad, String soyAd, String email) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.email = email;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kisi [ad=" + ad + ", email=" + email + ", soyAd=" + soyAd + "]";
    }

   
    



    

}
