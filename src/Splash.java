import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args) {
        sframe f1=new sframe("Payroll System");
        f1.setVisible(true);
        //frame ko kis speed se kholne hai 
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            f1.setLocation((800-((i+x)/2)),500-(i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class sframe extends JFrame implements Runnable{ //multiple inheritance is not allowed in java so we use implements Runnavle is for multithreading
    Thread t1;
    sframe(String s){
        super(s);//for title of frame
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll_system.jpg"));
        Image i1=c1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        
        JLabel m1 =new JLabel(i2);
        add(m1);//frame pe add ho gyi
        //start the thread
        t1=new Thread(this);
        t1.start();
        
    }
    public void run(){
        try{
            Thread.sleep(5000);
            this.setVisible(false);
            login f1 = new login();//splash screen ke bad ye login screen turant kulega
        }
        catch(Exception e){
            e.printStackTrace();
    }

}
}
