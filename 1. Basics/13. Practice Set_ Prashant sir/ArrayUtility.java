import java.util.Scanner;

public class ArrayUtility {
    // Create a 1-D input array:---->
    public static int[] inputArray() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=input.nextInt();
        while(size<=0) {
            System.out.println("Sorry, You have entered wrong size.");
            System.out.print("Please, enter the right size: ");       
            size=input.nextInt();     
        }
        int[] arr=new int[size];
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<size;i++) {
            System.out.print("Please enter element no "+(i+1)+" : ");
            arr[i]=input.nextInt();
        }
        input.close();
        return arr;
    }
    // Display 1-D array:---->
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // Create a input 2-D array:----->
    public static int[][] input2DArray() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the outer array: ");
        int outSize=input.nextInt();
        System.out.print("Enter the size of the inner array: ");
        int inSize=input.nextInt();
        while(outSize<=0 || inSize<=0) {
            if(outSize<=0) {
                System.out.println("Sorry, You have entered wrong outer size.");
                System.out.print("Please, enter the right outer size: ");       
                outSize=input.nextInt();
            } 
            if(inSize<=0) {
                System.out.println("Sorry, You have entered wrong inner size.");
                System.out.print("Please, enter the right inner size: ");
                inSize=input.nextInt();     
            }
        }
        int[][] arr=new int[outSize][inSize];
        System.out.println("Enter the "+outSize*inSize+" elements: ");
        for(int i=0;i<outSize;i++) {
            for(int j=0;j<inSize;j++) {
                System.out.print("Please enter row no "+(i+1)+" , column "+(j+1)+" : ");
                arr[i][j]=input.nextInt();
            }
        }
        input.close();
        return arr;
    }
    // Display 2-D array:---->
    public static void display2D(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
