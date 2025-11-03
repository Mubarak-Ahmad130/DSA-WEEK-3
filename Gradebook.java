import java.util.Scanner;

public class Gradebook {
    static int count = 0;
    static int[] roll = new int[50];
    static String[] name = new String[50];
    static int[] marks = new int[50];

    public static void addStudent(int r, String n, int m) {
        if (count < 50) {
            roll[count] = r;
            name[count] = n;
            marks[count] = m;
            count++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Not added");
        }
    }

    public static void display() {
        System.out.println("Roll Name Marks ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%10d%10s%d10d",roll,name,marks);
            System.out.println();
        }
    }

    public static void search(int a) {
        int found = 0;
        for (int i = 0; i < count; i++) {
            if (a == roll[i]) {
                System.out.println("Found: Roll " + roll[i] + ", Name: " + name[i] + ", Marks: " + marks[i]);
                found++;
                break;
            }
        }
        if (found==0) {
            System.out.println("Student not found!");
        }
    }

    public static void average(){
        int sum=0;
        int topper=0;
        for(int i=0;i<count;i++){
            sum+=marks[i];
            if(topper<marks[i])
                topper=marks[i];
        }
        int average=sum/count;
        System.out.println("average all class is "+average);
        System.out.println("topper marks is "+topper);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Add Student");
            System.out.println("2) Display All");
            System.out.println("3) Search by Roll");
            System.out.println("4) class average and topper");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int m = sc.nextInt();
                    addStudent(r, n, m);
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.print("Enter Roll to Search: ");
                    int sr = sc.nextInt();
                    search(sr);
                    break;
                case 4:
                    average();
                case 5:
                    System.out.println("Exit");
                    c++;
                    break;
            }
            if(c!=0)
                break;
        }
    }
}
