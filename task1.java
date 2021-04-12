package Lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];
        System.out.println("Введите 5 чисел");
        int sum = 0;

        for(int i=0; i<5; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }



        try{
            for(int i =0; i<array.length; i++){
                sum +=  array[i];


                if(array[i] < 0){

            throw new IllegalArgumentException("Только положительные числа");



        }

            }
            int sred = sum/5;
            System.out.println(sred);
        }
        catch(NumberFormatException e){
            System.out.println("Вводим только целые числа");

        }
        catch(IllegalArgumentException e){
            System.out.println(" Вводим только положительные числа");

            }

    }}

