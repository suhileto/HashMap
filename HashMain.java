package hashapp;
import java.util.HashMap;
import java.util.Scanner;


public class HashMain  {

   
    public static void main(String[] args) {
       
        while(true){
        System.out.println("1->Ekle  " + "2->Ara  " + "3->Çıkar "); 
        Scanner  scan=new Scanner(System.in);
        int secim=scan.nextInt();
        scan.nextLine();
        HashMap hash=new HashMap();
      
        switch (secim) {
            case 1 :
        
           System.out.print("Ad Soyad:");
           String key=scan.nextLine(); 

           System.out.print("Telefon no: ");
           int val=scan.nextInt();
           
           hash.ekle(key,val);
           
           break;
          
           case 2 :
            
            System.out.print("aranacak kişiyi girin ");
            String key=scan.nextLine();
            hash.ara(key);
            
            break;
            
        
        case 3:
           
            System.out.print("silinecek kişiyi girin ");
            String key=scan.nextLine();
            hash.sil(key);
       
        
        default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            
            break;
    }
        
    
    }
    
    }}
