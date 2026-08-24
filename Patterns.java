import java.util.*;
public class Patterns{
    public static  void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
        public static void invert_triangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n*2-(2*i+1);j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
        public static void both(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n*2-(2*i+1);j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    public static void Alphabets(int n) {
        char c='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(c);
                c++;
            }
            c--;
            for(int k=0;k<i;k++){
                c--;
                System.out.print(c);
            }
            System.out.println("");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //triangle(n);
        //invert_triangle(n);
        //both(n);
        Alphabets(n);
    }
}
