package org.example;
import java.util.Scanner;
//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
public class Main {
    public static String[] Contein(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Введите строку: ");
        String string = reader.next(); // Scans the next token of the input as an int.
        System.out.println("Введите строку1: ");
        String substring = reader.next(); // Scans the next token of the input as an int.
        //once finished
        reader.close();

        String securityAnswer = (string.toLowerCase().contains(substring.toLowerCase())?"Подстрока полностью входит в строку":"Подстрока  не полностью входит в строку или вообще не входит");
        System.out.println(securityAnswer);

        String[]values = new String[2];
        values[0]= string;
        values[1]= substring;

        return values;
    }

    public static void reverse(String []values) {
        StringBuilder builder = new StringBuilder();
        String str = values[0];
        String str1 = values[1];
        if (!(str1 != new StringBuilder(str).reverse().toString())) System.out.println("Является");
        else
        {
            System.out.println("Не является");
        }
    }
    public static StringBuilder Summary(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Введите число: ");
        int number = Integer.parseInt(reader.next()); // Scans the next token of the input as an int.
        System.out.println("Введите второе число: ");
        int number1 = Integer.parseInt(reader.next()); // Scans the next token of the input as an int.
        System.out.println("Введите действие: ");
        char action = reader.next().charAt(0);
        reader.close();
        if (action == '+') {
            StringBuilder builder = new StringBuilder();
            int res = number+number1;
            String result = "=";
            builder.append(number).append(action).append(number1).append(result).append(res);
//            System.out.println(builder);
            return builder;
        } else if (action == '-') {
            StringBuilder builder = new StringBuilder();
            int res = number-number1;
            String result = "=";
            builder.append(number).append(action).append(number1).append(result).append(res);
            System.out.println(builder);
            return builder;

        } else if (action == '*') {
            StringBuilder builder = new StringBuilder();
            int res = number*number1;
            String result = "=";
            builder.append(number).append(action).append(number1).append(result).append(res);
            System.out.println(builder);
            return builder;
        }
        else{
            System.out.println("не верно выбрано действие");
        return null;}


    }

    public static void main(String[] args) {
        Contein();
// Пытался запихнуть в функцию reverse(values) массив возвращаемый из Contein() но не разобрался как это работает
        String[]values = new String[2];//пришлось создать массив по тому что не смог передать его из функции
        values[0]= "string";//
        values[1]= "substring";
       reverse(values);//метод разворачивающий строку.возвращает да или нет
        Summary();//метод который суммирует или умножает по требованию
        String res = String.valueOf(Summary());
        System.out.println(res);
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        sb.insert(sb.indexOf("=")," равно ");
        sb.deleteCharAt(sb.indexOf("="));
        sb.replace(sb.indexOf("="),sb.indexOf("=")+1," равно ");
        System.out.println(sb.toString());






    }
}