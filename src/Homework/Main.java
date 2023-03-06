package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File fileName = new File("input.txt");
        System.out.println(readerIntoString(fileName));
        //___________________________________________________________
        System.out.println(countAverage("number.txt"));

    }
    //Задача 1
    //Написать метод, читающий текстовый файл и возвращающий строку,
    // состояшую из всех прочитанных строчек.
    //Пример: В файле имеется
    //aaa
    //bbbb
    //cc
    //Метод вернет aaa bbbb cc

    public static String readerIntoString (File fileName)  {
        String s = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = br.readLine())!=null){
                s = s+" "+line;
            }

        }catch (IOException e){
            e.getMessage();
        }
            return s;  // output -aaa bbbb cc
    }
    //---------------------------------------------//..........................................................
    //Задача 2
    //Есть не пустой текстовый файл такого вида:
    //1
    //2
    //3
    //4
    //5
    //Написать метод, возвращаюший среднее арифметическое всех этих чисел.

    public static double countAverage (String fileName) {
        int sum =   0;
        int count = 0;
        String nextInt;

        try ( BufferedReader br1= new BufferedReader(new FileReader(fileName))) {
            while ((nextInt = br1.readLine()) != null) {
                sum = sum + Integer.parseInt(nextInt);
                count++;
            }
        }catch (IOException e){
            e.getMessage();
        }
        return sum/count;

    }



}

