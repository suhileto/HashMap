package hashapp;
import java.math.BigInteger;
import java.util.*;


public class HashMap {
	   
    Scanner scan=new Scanner(System.in);
	private final static int TABLE_SIZE = 20;
	HashEntry[] table;
	  
	      HashMap() {
	            table = new HashEntry[TABLE_SIZE];
	            for (int i = 0; i < TABLE_SIZE; i++)   //hash tablosundaki b�t�n verileri s�f�rl�yoruz
	                  table[i] = null;
	      }
	         private int calculateHashCode(String key) {  //String ifadeyi hash code a ceviriyoruz
	    	 char a=key.charAt(0);
	    	 String b=Character.toString(a);  
	    	  int mod = b.hashCode() % TABLE_SIZE;     
	    	    return mod < 0 ? mod + TABLE_SIZE : mod;  // ilk karakteri hashledik eger mod s�f�rdan kucuk c�karsa pozitif moda ceviriyoruz
	    	}

	    	private int findIndex(String key) {  //eger bulunan deger bossa yerle�tiriyor de�ilse indexin bir fazlas�n� al�p modunu al�yor oyle yerlestiriyor
	    	    int index = calculateHashCode(key);
	    	    while (table[index] != null && !table[index].getKey().equals(key)) {
	    	        index = (index + 1) % TABLE_SIZE;
	    	    }
	    	    return index;
	    	}

	    	public int ara(String key) {  //rehberden kisi ismini arama
	    	    int index = findIndex(key);
	    	    return table[index] == null ? -1 : table[index].getValue(); //eger hash tablosunda o index bossa -1 donduruyor degilse numara degerini aliyor
	    	}

	    	public void ekle(String key, int value) {   //yeni deger ekleme fonksiyonu
	    	    table[findIndex(key)] = new HashEntry(key, value);
	    	}
	    		
	    	public void sil(String key) {  //rehberden kisi silme
	    	    int index = findIndex(key);
	    	    table[index]= null;
	    	    System.out.println(key + "adli kisi silindi");
	    	}
	    	
	    	

}