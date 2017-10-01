package lab4;

import java.util.Random;
import java.util.Scanner;

public class Arrays_Task_Two extends Greeter{
    public Arrays_Task_Two() {
        name = "The class that does the second array task";
    }

    public void Calculate(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        int size = 1;
        System.out.println("Введите N, размер матрицы ");
        try {
            size = in.nextInt();
        } catch (Exception e) {
            System.out.print("Неправилиный ввод.");
            System.exit(0);
        }

        int[][] baseMatrix = new int[size][size];
        for(int j = 0; j < size; j++)
            for(int i = 0; i < size; i++) baseMatrix[i][j] = rand.nextInt()%100;

        int[][] bMatrix = new int[size][];
        boolean isNegative = false;
        for(int i = 0; i < size; i++) {
            for(int k = size-1; k >= 0; k--){
                if (baseMatrix[i][k] <0 ) {
                    isNegative = true;
                    bMatrix[i] = new int[size-k-1];
                    for(int j = 0; j < bMatrix[i].length; j++) {
                        bMatrix[i][j] = baseMatrix[i][j+k+1];
                    }
                    break;
                }
            }
            if (!isNegative) {
                bMatrix[i] = new int[1];
                bMatrix[i][0] = 100;
            }
            isNegative = false;
        }
        System.out.println("Основна матриця");
        showMatrix(baseMatrix);
        System.out.println("Додатні числа в кінці масиву");
        showMatrix(bMatrix);
        System.out.println("Їх суми по рядам");
        showMatrix1d(sumMatrix(bMatrix));

        bMatrix = new int[size][];
        isNegative = false;
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++){
                if (baseMatrix[i][k] <0 ) {
                    isNegative = true;
                    bMatrix[i] = new int[k];
                    for(int j = 0; j < k; j++) {
                        bMatrix[i][j] = baseMatrix[i][j];
                    }
                    break;
                }
            }
            if (!isNegative) {
                bMatrix[i] = new int[1];
                bMatrix[i][0] = 100;
            }
            isNegative = false;
        }
        System.out.println("Додатні числа в початку масиву");
        showMatrix(bMatrix);
        System.out.println("Їх суми по рядам");
        showMatrix1d(sumMatrix(bMatrix));
    }

    public static void  showMatrix(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void showMatrix1d(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public static int[]  sumMatrix(int[][] array){
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            result[i] = 0;
            for(int k = 0; k < array[i].length; k++) {
                result[i]+=array[i][k];
            }
        }
        return result;
    }
}