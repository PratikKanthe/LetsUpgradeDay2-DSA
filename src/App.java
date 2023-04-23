// Assigmnet for dsa : Write a Java program to implement binary search algorithm for finding a target value in a sorted array.


// import java.util.*;

public class App {
    
    /**
     * @param args
     */

     public static class BinarySearch {
        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            return -1;
        }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 7, 9, 10, 13, 17 };
        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }



















        // int[] arr1 = {-2,5,7,9,1};
        
        
        // int flag = 0;
        // int x = 9;
        // int si=0;
        // int ei=arr1.length-1;
        
        // while(si<=ei){
        //     int mid = (si+ei)/2;
        //     if(arr[mid]==x){
        //         flag=1;
        //         break;
        //     } else if(arr[mid]>x){
        //         ei=mid-1;
        //     } else{
        //         si=mid+1;
        //     }
        // }
        
        // if(flag==1){
        //     System.out.println("Element found");
        // } else{
        //     System.out.println("Eelement not found");
        // }
        
        // int flag = 0;
        // int x = 8;
        
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==x){
        //         flag=1;
        //         break;
        //     }
        // }
        
        // if(flag==0){
        //     System.out.println("-1");
        // } else{
        //     System.out.println("Eelement found");
        // }
        // int si = 0;
        // int ei = arr.length-1;
        
        // while(si<ei){
        //     int temp = arr[si];
        //     arr[si]=arr[ei];
        //     arr[ei]=temp;
            
        //     si=si+1;
        //     ei=ei-1;
        // }
        
        // for(int i=0; i<arr.length; i++){
        //         System.out.println(arr[i] + " ");
        //     }
        
        // int max = Integer.MIN_VALUE;
        // int count = 0;
        
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]>max){
        //         max= arr[i];
        //     }
        // }
        
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] !=max){
        //         count= count + 1;
        //     }
        // }
        // System.out.println(count);

        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.print("Enter 1 to Deposite || Enter 2 for Withdraw : ");
        //     int option = sc.nextInt();
            
        //     int bankBalance = 3000;

        //     if(option==1){
        //         int amount;
        //         System.out.print("Enter Amount to Deposite : ");
        //         amount = sc.nextInt();
        //         bankBalance = amount + bankBalance;
        //     }else if(option==2){
        //         int amount;
        //         System.out.print("Enter Amount to Withdraw : ");
        //         amount = sc.nextInt();
        //             if(amount>bankBalance){
        //                 System.out.println("Insuficient Fund");
        //             }else{
        //                 bankBalance = bankBalance - amount; 
        //             }
        //     }else{
        //         System.out.println("Invalid Input");
        //     }
        //     System.out.print("Current Amount : Rs " +bankBalance);
        // }
        // catch (Exception e) {
        //     System.out.println("something went wrong");
        // }

        // int[] arr = {7,5,-2,9,1};
        // int si = 0;
        // int ei = arr.length-1;
        
        // while(si<ei){
        //     int temp = arr[si];
        //     arr[si]=arr[ei];
        //     arr[ei]=temp;
            
        //     si=si+1;
        //     ei=ei-1;
        // }
        
        // for(int i=0; i<arr.length; i++){
        //         System.out.println(arr[i] + " ");
        //     }

    }
}
}

//ATM Machine
// import java.util.Scanner;

// class HelloWorld {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         //double d = 1.23456789;
//         // float f = 1.23456789101112f;
//         // System.out.println("the value of : " + f);
        
//         // int num = 8;
//         // if(num%2==0){
//         //     System.out.println("Even");
//         // }else {
//         //     System.out.println("odd");
//         // }
        
        
//         try (//ATM Machine Example:
//         Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter 1 to Deposit || Enter 2 to Withdraw: ");
            
//             int bankBalance= 3000;
//             int option = sc.nextInt();
            
//             switch(option){
//                 case 1: System.out.print("Enter amount of deposit: RS ");
//                    int diposit = sc.nextInt();
//                    int currentBalance= bankBalance + diposit;
//                     if(option==1){
//                        System.out.println("Deposited RS " +diposit);
//                        System.out.println("available balance is: RS " + currentBalance);
//                        System.exit(0);
//                     } else{
//                         System.out.println("invalid");
//                     }
//                     System.out.println(""); 
//                     break;
                
//                 case 2: System.out.print("Enter amount to Withdraw RS:");
//                     int withdraw = sc.nextInt();
//                     int avlBalance= bankBalance - withdraw;
//                     if(option==2 && withdraw<bankBalance){
//                        System.out.println("Withdrawn RS " +withdraw);
//                        System.out.println("");
//                        System.out.println("available balance is: RS " +avlBalance);
//                        System.exit(0);
//                     } else{
//                         System.out.println("invalid");
//                     }
//                     System.out.println(""); 
//                 break;
//             }
//         }
//         catch (Exception e) {
//             System.out.println("something went wrong");
//         }
// }
// }