
import java.util.Scanner;

class  Book_Ratings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String [] books = new String[4];
        int [][] bookRating = new int [4][4];
        
        System.out.println("Enter the books: ");
        for(int i=0; i<4; i++){
    
                books[i]= sc.nextLine();
            
        }
        
        System.out.println("Enter the ratings: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                bookRating[i][j] = sc.nextInt();
            }
        }
        
        float sum = 0;
        float [] avg = new float [4];
        System.out.println("Average for all books is: ");
        System.out.println();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum = sum + bookRating[i][j];
            }
            avg[i] = sum/4.0f;
            sum = 0;
        }
        for(int i=0; i<4; i++){
            System.out.println(avg[i]);
        }
        
        float max = 0;
        int index_of_max=0;
        for(int i=0; i<4; i++){
            if(avg[i] > max){
                max = avg[i];
                index_of_max = i;
            }
            
        }
     
        System.out.println("Book with maximum rating is: ");
        System.out.println(books[index_of_max]);
        
    }
}
