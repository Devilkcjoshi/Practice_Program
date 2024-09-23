package PracticeProgram;
import java.util.Scanner;

public class Practice {
    public static int [][]glo_arr;
    public static int[] solution(int a,int b,int n){
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            a += (int)Math.pow(2,i)*b;
            arr[i] = a;
        }
        return arr;
    }
    public static void show(int [][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        glo_arr = new int[t][];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            glo_arr[i] = solution(a,b,n);
        }
        show(glo_arr);
        sc.close();
    }
}