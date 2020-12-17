import java.sql.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        

      
        Kisi musteri1  =new Kisi(); 

        
        hesapOlustur(musteri1);

      
        

    }

    public static void hesapOlustur(Kisi kisi) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("isim : ");
        String ad = scan.next() ;
        System.out.println("soyisim : ");
        String soyAd = scan.next();
        System.out.println("email : ");
        String email = scan.next(); 

       
    

        String url  ="jdbc:postgresql://localhost:5432/kullanici";
        String user = "postgres"; 
        String password  = "Sd635241"; 

        Connection myConn = null ;
        PreparedStatement myStat = null ; 
 

        try {

            myConn = DriverManager.getConnection(url, user, password);
            System.out.println("baglanti kuruldu  !"); 

            String sql = "insert into restaurantkayit (ad,soyad,email) values (?,?,?) "; 

            myStat = myConn.prepareStatement(sql);

            myStat.setString(1, ad);
            myStat.setString(2, soyAd);
            myStat.setString(3, email);

            myStat.executeUpdate(); 
            System.out.println("basarili sekilde eklendi ! ");
            
        } catch (Exception e) {
           System.out.println(e);
        }
          
    }
}
