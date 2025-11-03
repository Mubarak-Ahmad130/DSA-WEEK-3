import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int min=arr[0];
        int max=arr[0];
        int even=0;
        int odd=0;
        for(int i=0;i<5;i++){
           sum=sum+arr[i];
           if(min<arr[i])
               min=arr[i];
           else
               max=arr[i];

           if(arr[i]%2==0)
               even++;
           else
               odd++;

        }
        int average=sum/5;
        for(int i=4;i>=0;i--){
            System.out.println(arr[i]);
        }


    }
}
