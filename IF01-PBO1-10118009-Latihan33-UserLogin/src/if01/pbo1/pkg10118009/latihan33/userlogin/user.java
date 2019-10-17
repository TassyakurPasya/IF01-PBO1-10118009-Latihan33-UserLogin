/*
OGRAM :   
 */

package if01.pbo1.pkg10118009.latihan33.userlogin;

/**
 *
 * @author Fatahillah Seno
 */
public class user {
    
    private final String username = "Rizki Adam";
    private final String password = "terbaikselalu";
    private boolean statusUser;
    
    private boolean cekUser(String perUserName, String perpassword){
        if((perUserName.equals(this.username))&& (perpassword.equals(this.password))){
            this.statusUser = true;
        }else{
            this.statusUser = false;
        }
        return this.statusUser;
    }
    private void hasilUser(boolean status, String perUserName){
        if (status == true ){
            System.out.println("***** Hallo "+ perUserName + "*****");
        }else{
            System.out.println("Ooopps, Username dan Password anda salah ");
        }
        status = this.statusUser;
            
    }
    public void pengecekanLogin(String perUserName, String perPassword){
        cekUser(perUserName, perPassword);
        hasilUser(statusUser, perUserName);
    }
}
