// class stud{
         
// }
//     public class arrays {
//     public static void main(String[] args) {
//         stud[] arr = new stud[5];
//     }
    
// }
//reference are generally 8 types;
// random access in arrys refers to calculating the random address or like taking the random variable and calculating its address doing like taking the base address and the index and multiplying it by the data type for eg it is int so its data type is 4 so we'll do like [base+(i*4)];
//for eg its char so we'll do like [base+(i*2)];and it also decreases the time complexity as it takes same time for all;
// public class arrays{
//     public static void main(String[] args) {

//         int[] arr = {1,5,3,4,5};
        

//         for(int ele:arr){
//             System.out.println(ele);
//         }
        
//     }
// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[4];
        
        
//         int[] brr = new int[arr.length];
//         for(int m=0;m<arr.length;m++){
//         arr[m] = sc.nextInt();
//         }
//         int i =arr.length-1;
//         int j = 0;
//         while(i>=0){
        
            
//             brr[j] = arr[i];
//             i--;
//             j++;
//         }
//         for(int k = 0; k < brr.length; k++){
//             System.out.print(brr[k] + " ");
//         }

//         sc.close();

//     }
// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[6];
//         for(int i=0;i<arr.length;i++){
//             arr[i]= sc.nextInt();
//         }
//         int max = -99999;
//         int min =100000;
//         for(int i =0;i<arr.length;i++){
//             if(max<arr[i]){
//                 max = arr[i];
                
//             }
//             if(min>arr[i]){
//                 min = arr[i];
            
//         }
        
        

        
//     }
//     System.out.println(max);
//         System.out.println(min);
// }
// }

// public class Arrays {
//     public static void main(String[] args) {

//         int[] arr = {16, 17, 4, 3, 5, 2};

//         for (int i = 0; i < arr.length; i++) {

//             boolean leader = true;

//             for (int j = i + 1; j < arr.length; j++) {

//                 if (arr[j] > arr[i]) {
//                     leader = false;
//                     break;
//                 }
//             }

//             if (leader) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }
// public class arrays {
//     public static void main(String[] args) {
// int[] arr = {16, 17, 4, 3, 5, 2};
// for (int i = 0; i < arr.length; i++) {
// boolean leader = true;
// for (int j = i + 1; j < arr.length; j++) {
//  if (arr[j]>arr[i]) {
//                     leader = false;
//                     break;
//                 }
//             }
// if(leader){
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }
// public class arrays{
//     public static void main(String[] args) {
//         int[] arr= {87,20,3,4,5,67,98};
//         for(int i =arr.length-1;i>=0;i--){
// if(arr[i]>arr.length-1){
//     System.out.println(arr[i]);
// }
//         }
//     }
// }
// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays{
//     public  static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for(int i =0;i<arr.length;i++){
//             arr[i] = sc.nextInt();

            
//         }
//         System.out.println(Arrays.toString((arr)));
//     sc.close();
// }

// }
// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] str = new String[4];
//         for(int i =0;i<str.length;i++){
//             str[i] = sc.next();
//         }
//         System.out.println(Arrays.toString(str));
//     }
// }
// import java.util.Arrays;
// import java.util.Scanner;
// public class  arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int arr[][] = new int[rows][cols];
//         for(int i =0;i<rows;i++){
//             for(int j =0;j<cols;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//                  }
                 
//            for(int[] a :arr){
//               System.out.println(a);
//            }
//            }sc.close();
//             }
//     }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i =0;
//         int j  =0;
//         int[][] arr=new int[i][j];
//         for( i = 0;i<arr.length;i++){
//             for(j = 0;i<arr[i].length;j++){
//                 arr[i][j] = sc.nextInt();

//             }
//             for( i = 0;i<arr.length;i++){
//             for(j = 0;i<arr[i].length;j++){
//                 System.out.print(arr[i][j]);

//             }
            
//         }
//         sc.close();
//     }
// }

// }
// import java.util.ArrayList;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i =0;i<n;i++){
//             list.add(sc.nextInt());

//         }
//         System.out.println(list);
//         sc.close();
//     }
// }
// import java.util.Scanner;
// import java.util.ArrayList;
// public class arrays{
//     public static void main(String[] args) {
//         ArrayList<Integer>list = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i =0;i<n;i++){
//             list.add(sc.nextInt());
//         }
//         sc.close();
//     }
// }
// import java.util.ArrayList;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum =0;
//         int[] arr = new int[6];
//         for(int i =0;i<6;i++){
//             arr[i]= sc.nextInt();

//         }
//         for(int i =0;i<6;i++){
//             sum += arr[i];
//            System.out.println(sum);

//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[6];
//         for(int i =0;i<6;i++){
//             arr[i] = sc.nextInt();

//         }
//         for(int i :arr){
//             System.out.println(i);
//         }
//     }
// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[6];
//         int[] brr = new int[arr.length];
//         for(int i =0;i<arr.length;i++){
//             arr[i]= sc .nextInt();
//         }
//         for(int i =0;i<arr.length;i++){
//             brr[i] = arr[i];}
//             for(int i :brr){
//                 System.out.println(i);
//             }
//     }
// }

// import java.util.Scanner;

// public class arrays{

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[6];
        

//         for(int i =0;i<arr.length;i++){

//             arr[i]= sc .nextInt();
            

//         }
//         int x = sc.nextInt();
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]==x){
//                 System.out.println("x found at index" + i+1);
//             }
//         }

//     }

// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Boolean flag = false;
//         int[] arr = new int[6];
//         for(int i =0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int x = sc.nextInt();
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]==x){
//                 flag = true;
//                 break;
//             }
//     }
//     if(flag){
//         System.out.println("found");
//     }
//     else{
//         System.out.println("not found");
//     }
// }
// }
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[6];
//         for(int i =0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int largest = arr[0];
//         int second = arr[0];
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>largest){
//             second = largest;
//             largest = arr[i];
//             }
//             else if(arr[i]>second && arr[i]!= largest){
//                 second = arr[i];
//             }
            
//     }
//     System.out.print(second);

// }
// }
