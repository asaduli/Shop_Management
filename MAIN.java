
import java.io.File;
import java.util.Scanner;


public class MAIN{
    public static void main(String[] args) {
        boolean flag=false,flag1=false;
        try {
            File file = new File("managerinfo.txt");
            Scanner read = new Scanner(file);
            flag =true;
        }
        catch(Exception e){
            
        }
        try{
            File file = new File("save_product.txt");
            Scanner read = new Scanner(file);
            flag1 = true;
        }
        catch(Exception e){
            
        }
        if(flag==true||flag1==true){
            login l = new login();                             
            l.setVisible(true);
        }
        else{
            managerpage info = new managerpage();
            info.setVisible(true);
            
    }
}
}
