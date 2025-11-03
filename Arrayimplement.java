import java.util.Scanner;

public class Arrayimplement {
    public static void main(String[] args) {
//        start
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
//        n<- store array of size
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input from user
        System.out.println("enter input form user" );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = arr.length;
//        num<- length of array
        int count=0;
//        count<- value
        while(true){
        System.out.println("Array operation Menu");
        System.out.println("press[1] for traversal");
        System.out.println("press[2] for insertion");
        System.out.println("press[3] for deletion");
        System.out.println("press[4] for Searching");
        System.out.println("press[5] for Exit");

        System.out.println("enter your choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("display array value=" + arr[i]);
                }
                break;
            case 2:
                System.out.println("enter [1] for at biginning");
                System.out.println("enter [2] for at at any position");
                System.out.println("enter [3] for at end");
                System.out.println("enter your choice");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("enter element to insert at beginnig");
                        int ele = sc.nextInt();
                        for (int i = num - 1; i >= 0; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[0] = ele;
                        break;
                    case 2:
                        System.out.println("enter element to insert in array");
                        int el = sc.nextInt();
                        System.out.println("enter position to add element");
                        int pos = sc.nextInt();
                        for (int i = num - 1; i >= pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos - 1] = el;
                        break;
                    case 3:
                        System.out.println("enter element to insert at end");
                        int e = sc.nextInt();
                        if (arr[num] == 0) {
                            arr[num - 1] = e;
                        } else
                            System.out.println("overflow");
                        break;
                }
                break;
            case 3:
                System.out.println("enter [1] for at biginnin deletion");
                System.out.println("enter [2] for at at any position deletion");
                System.out.println("enter [3] for at end deletion");
                System.out.println("enter your choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < num; i++) {
                            arr[i] = arr[i + 1];
                        }
                        num--;
                        break;
                    case 2:
                        System.out.println("enter position to delete element");
                        int p = sc.nextInt();
                        for (int i = p; i < num; i++) {
                            arr[i - 1] = arr[i];
                        }
                        if (p <= num) {
                            num--;
                        }
                        break;
                    case 3:
                        System.out.println("delete element in end");
                        if (arr[num] != 0)
                            arr[num] = 0;
                        break;
                }
                break;
            case 4:
                System.out.println("enter element to search in array");
                int search = sc.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == search) {
                        System.out.println("element is found" + arr[i]);
                        break;
                    }
                    else
                        System.out.println("not found");
                }
                break;
            case 5:
                System.out.println("exit");
                break;
        }
        if(count!=0)
            break;
    }
}}