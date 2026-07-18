// public class constructors {
//     constructors(){

//     }
//     constructors(int a,int b){

//     }
//     constructors(int a ,String b){

//     }
//     constructors(double a ,double b){

//     }
//      constructors(String a ,int b){
        
//     }
//     constructors(double a ,int b){

//     }

//     constructors(boolean name,boolean age){

//     }

    
// }
//signature of this is void getinfo(int age) getinfo(int);
//return types are not included in the signature;
//constructors are also functions,special types of functions
//class and function ka name will be same;
//constructorrs can be as many until the name is differnent;
class Book{
    int bookid;
    String title;
    String author;
    double price;

    static int bookcount=0;
    static String libraryname;
    Book(int bookid,String title,String author,double price){
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
        bookcount++;
    }

    void displayBook(){
        System.out.println(bookid);
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

    static void displayLibraryName(String libraryname) {
        System.out.println(libraryname);
    }

    static void displayBookCount() {
        System.out.println(bookcount);
    }
}
public class constructors{
    public static void main(String[] args) {
        Book.displayLibraryName("Chitkara");        
        Book b1 = new Book(101, "Java", "James", 499.0);
        Book b2 = new Book(102, "Python", "Guido van Rossum", 599.0);
        Book b3 = new Book(103, "Dsa", "Mark Allen", 699.0);

        
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
        b1.displayBookCount();
    }
}
