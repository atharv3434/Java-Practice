import java.util.*;
public class Array1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Using For Each Loop");

        for(int element:arr){
            if(element % 2==0){
                System.out.println(element);
            }
        }

        System.out.println("Using For Loop");

        for(int i=0;i< arr.length;i++){
            if(arr[i]% 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }

}
