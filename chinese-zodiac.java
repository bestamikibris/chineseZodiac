import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int yearOfbirt;
		
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Doğduğunuz Yılı Giriniz: ");
        yearOfbirt = input.nextInt();
        
        
        if (yearOfbirt % 12 == 0){
           System.out.println("Çin Zodyağı Burcunuz : Maymun ");    
        }
        else if (yearOfbirt % 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz "); 
        }
        else if (yearOfbirt % 12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek "); 
        }
        else if (yearOfbirt % 12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz"); 
        }
        else if (yearOfbirt % 12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare "); 
        }
        else if (yearOfbirt % 12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz "); 
        }
        else if (yearOfbirt % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan "); 
        }
        else if (yearOfbirt % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan "); 
        }
        else if (yearOfbirt % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha "); 
        }
        else if (yearOfbirt % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan "); 
        }
        else if (yearOfbirt % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At "); 
        }
        else if (yearOfbirt % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun "); 
        }
        
    }
	
}
