// 
// import java.util.Scanner;
// class student{
//     int roll;
//         String name;
//         int marks;
//         void display(String name,int roll,int marks){


//         }
// }
// public class Main{
//     public static void main(String[] args) {
        
//     }
// }
// import java.util.Scanner;
// class student{
//     int roll;
//     String name;
//     int marks;
//     student(int roll,String name,int marks){
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }
//     void display(){
//         System.out.println(roll);
//         System.out.println(name);
//         System.out.println(marks);

//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         student[] arr = new student[n];
//         for(int i =0;i<n;i++){
//             System.out.println("enter roll no.");
//             int roll = sc.nextInt();
//         sc.nextLine();
//     String name = sc.nextLine();
// int marks = sc.nextInt();
// arr[i] = new arr(roll,name,marks);
// for(int i =0;i<n;i++){
//     students[i].display();
// }        }

//     }
// }
// import java.util.Scanner;
// public class Main{
//   static  class employee{
//         int id;
//         String name;
//         int salary;
//         employee(int id,String name,int salary){
//             this.id = id;
//             this.name = name;
//             this.salary = salary;
//         }
//         void display(){
//             System.out.println(id);
//             System.out.println(name);
//             System.out.println(salary);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         employee[] emp = new employee[n];
//         for(int i =0;i<n;i++){
//             int id = sc.nextInt();
//             String name = sc.nextLine();
//             int salary = sc.nextInt();
//             emp[i] = new employee(id,name,salary);
//         }
//         for(int i=0;i<n;i++){
//             emp[i].display();
//         }
//     }
// }
// import java.util.Scanner;
// public class Main{


// static class student{
//     String name;
//     int age;
//     int marks;
//     static String college ="Chitkara";
//     static int count = 0;
// }
// student(String name,int age,int marks){
//     this.name = name;
//     this.age = age;
//     this.marks = marks;
//     count++;
// }
// void display(){
//     System.out.println(name);
//    System.out.println(age); 
//    System.out.println(marks);
// }
// static void displaycollege(){
//     System.out.println(college);
    
// }
// static void displaycount(){
//     System.out.println(count);
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         student[] arr = new student[n];
//         for(int i =0;i<n;i++){
//             String name = sc.nextLine();
//             int age = sc.nextInt();
//             int marks = sc.nextInt();
//             arr[i] = new student(name,age,marks);
//         }
//         for(int i =0;i<n;i++){
//             arr[i].display();
//             student.displaycollege();
//             student.displaycount();
//         }
//     }
// }

// import java.util.Scanner;
// public class Main{
//    static class employee{
//         int id;
//         String name;
//         int salary;
//         static String company = "microsoft";
//         static int count = 0;
//         employee(int id,String name,int salary){
//             this.id = id;
// this.name = name;
// this.salary = salary;
//             count++;
//         }
//         void display(){
//             System.out.println(id);
//             System.out.println(name);
//             System.out.println(salary);


//         }
//         static void stringname(){
//             System.out.println(company);
//         }
//         static void counti(){
//             System.out.println(count);
//         }}
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             employee[] arr = new employee[n];
//              for(int i=0;i<n;i++){
//             int id = sc.nextInt();
//             sc.nextLine();
//             String name = sc.nextLine();
//             int salary = sc.nextInt();
//             arr[i] = new employee(id,name,salary);
//              }
//               for(int i=0;i<n;i++){
//            arr[i].display();
//            employee.stringname();
//            employee.counti();


//         }}

    
// }