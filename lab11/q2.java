import java.util.Scanner;

class Matrix extends Thread {
    int[][] mat;
    int r, c;

    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        this.mat = new int[r][c];
    }

    public void enterDetails() {
        System.out.println("Enter matrix elements:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                this.mat[i][j] = sc.nextInt();
            }
        }
    }

    public synchronized void runThreads(Matrix obj) throws InterruptedException{
        // Thread 1 - Display elements in matrix form
        Thread t1 = new Thread(() -> {
            System.out.println("Matrix:");
            for (int i = 0; i < obj.r; i++) {
                for (int j = 0; j < obj.c; j++) {
                    System.out.print(obj.mat[i][j] + " ");
                }
                System.out.println();
            }
        }, "Thread 1");
        //t1.join(); 
        

        // Thread 2 - Display the transpose of the matrix
        Thread t2 = new Thread(() -> {
            System.out.println("Transpose of Matrix:");
            for (int i = 0; i < obj.c; i++) {
                for (int j = 0; j < obj.r; j++) {
                    System.out.print(obj.mat[j][i] + " ");
                }
                System.out.println();
            }
        }, "Thread 2");

        //t2.join(); 

        // Thread 3 - Display the maximum value in the matrix
        Thread t3 = new Thread(() -> {
            int max = obj.mat[0][0];
            for (int i = 0; i < obj.r; i++) {
                for (int j = 0; j < obj.c; j++) {
                    if (obj.mat[i][j] > max) {
                        max = obj.mat[i][j];
                    }
                }
            }
            System.out.println("Maximum value in Matrix: " + max);
        }, "Thread 3");

        //t3.join(); 

        // Thread 4 - Display the principal diagonal elements
        Thread t4 = new Thread(() -> {
            System.out.println("Principal Diagonal Elements:");
            for (int i = 0; i < Math.min(obj.r, obj.c); i++) {
                System.out.print(obj.mat[i][i] + " ");
            }
            System.out.println();
        }, "Thread 4");



        // Thread 5 - Display non-diagonal elements
        Thread t5 = new Thread(() -> {
            System.out.println("Non-Diagonal Elements:");
            for (int i = 0; i < obj.r; i++) {
                for (int j = 0; j < obj.c; j++) {
                    if (i != j) {
                        System.out.print(obj.mat[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }, "Thread 5");


                // Start all threads
//                 t1.start();
//                 t1.join(); 
        
//                 t2.start();
//                 t2.join(); 
//                 t3.start();
//                 t3.join();
//                 t4.start();
//                 t4.join() ;
try {
    t1.start();
    t1.join();

    t2.start();
    t2.join();

    t3.start();
    t3.join();

    t4.start();
    t4.join();

    t5.start();
    t5.join();
} catch (InterruptedException e) {
    System.out.println("Thread interrupted: " + e.getMessage());
}
}
}
public class labq2 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        Matrix obj = new Matrix(row, col);
        obj.enterDetails();
        try{
        obj.runThreads(obj);
    }catch(Exception e){
        System.out.println(e);
    }
}
}
