package Lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        byte [] array = new byte [5];
        System.out.println("Введите 5 чисел");
        byte sum = 0;

try{
        for(int i=0; i<5; i++) {
            array[i] = (byte) Integer.parseInt(reader.readLine());



        }




            for(int i =0; i<array.length; i++){
                sum +=  array[i];


//                if(array[i] < 0){
//
//                    throw new IllegalArgumentException("Только положительные числа");

                }

        }
        catch(NumberFormatException e){
            System.out.println("Вводим только целые числа  в диапазоне -128 по 127");


        }

    }}

