import java.util.*;

public class Main{
    public static void main(String args[]){
        for(int i=4;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=6;i>=4;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}