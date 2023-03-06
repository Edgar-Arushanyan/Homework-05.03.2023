package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{


        System.out.println(reader("input.txt"));

        //___________________________________________________________
        System.out.println(number("number.txt"));

    }
    //Задача 1
    //Написать метод, читающий текстовый файл и возвращающий строку,
    // состояшую из всех прочитанных строчек.
    //Пример: В файле имеется
    //aaa
    //bbbb
    //cc
    //Метод вернет aaa bbbb cc

    public static String reader (String fileIn)  throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(fileIn));

        String line = "";
        line = br.readLine();
        String  line1= br.readLine();
        String  line2= br.readLine();

        return line +" "+ line1 +" "+ line2;




    }
    //Задача 2
    //Есть не пустой текстовый файл такого вида:
    //1
    //2
    //3
    //4
    //5
    //Написать метод, возвращаюший среднее арифметическое всех этих чисел.

    public static int number (String fileIn) throws IOException{

        BufferedReader br1= new BufferedReader(new FileReader(fileIn));


        int a =Integer.parseInt(br1.readLine());
        int b =Integer.parseInt(br1.readLine());
        int c= Integer.parseInt(br1.readLine());
        int d =Integer.parseInt(br1.readLine());
        int e= Integer.parseInt(br1.readLine());
        int sum = a+b+c+d+e;

        return sum/5;
    }

}

