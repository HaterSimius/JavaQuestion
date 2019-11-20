package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14


Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть корректно преобразовано в число типа double.
5. Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть корректно преобразовано в число типа double.
*/

public class Solution {
    public static void main(String[] args) {
        String name_URL = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        List<String> URL_list = new ArrayList<String>();
        String[] wordInIRL = name_URL.split("[?]");
        for (String s : wordInIRL){
            System.out.println(s + " s");
            if (s.contains("&")){
                String[] tempS = s.split("&");
                for (String s1 : tempS){
                    System.out.println(s1+ " s1");
                    if (s1.contains("=")){
                        String[] tempS2 = s1.split("=");
                        URL_list.add(tempS2[0]);
                    } else URL_list.add(s1);
                }
            }
        }
        for (String s : URL_list){
            System.out.println(s);
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
    public static String enterURL(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
