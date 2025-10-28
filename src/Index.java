import java.util.*;
public class Index{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle");
        int p= sc.nextInt();
        System.out.println("Enter the Rate of Interest");
        float r=sc.nextFloat();
//        System.out.println("Enter the year");
//        int y= sc.nextInt();
        for(int y=1978;y<=2005;y++){
            double sp = (p*r*y)/100;
            System.out.println("The Simple interest of the "+y+" is "+sp);
        }

    }
}