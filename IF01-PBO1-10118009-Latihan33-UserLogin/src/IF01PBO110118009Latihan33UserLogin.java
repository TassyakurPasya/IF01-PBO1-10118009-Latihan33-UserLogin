
import if01.pbo1.pkg10118009.latihan33.userlogin.user;
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : User Login
 */

public class IF01PBO110118009Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        System.out.print(" Masukkan Username = ");
        usName = input.nextLine();
        System.out.print(" Masukkan Password = ");
        passWord = input.nextLine();
        
        user User = new user();
        User.pengecekanLogin(usName, passWord);
    }
}
    
