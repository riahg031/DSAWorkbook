package TestQuestions;

public class Pattern {
    public static void main(String[] args) {
//        for(int i=0; i<5; i++){
//            for(int j=0; j<=i; j++)
//                System.out.print("*");
//            for(int j=i+1; j<=4-i; j++)
//                System.out.print(" ");
//
//            for(int j=1; j<=4-i; j++)
//                System.out.print(" ");
//            System.out.println();
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
