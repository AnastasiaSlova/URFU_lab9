package Lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try{
        int [][] matrix = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<matrix.length; i++){
            for(int j =0; j<matrix[i].length; j++){
                System.out.print("Input matrix row  " + i + " element no: " + j + " : ");
                matrix[i][j] = sc.nextInt();
                System.out.println("ведите числа");
            }
        }
        System.out.println(("---matrx---"));
        for(int[]  Matrix1: matrix){
            for(int Matrix2: Matrix1){
                System.out.print((Matrix2 + "\t"));
            }
            System.out.println();
        }
        try{
            System.out.println("введите номер столбца и строки");
            int n = sc.nextInt();
            int m = sc.nextInt();
        System.out.println(matrix[n][m]);}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Превышен размер");}}
        catch(InputMismatchException e){
            System.out.println(" Только целые числа на ввод");
        }

    }
}
