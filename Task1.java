import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        while (!(word = reader.readLine()).equals("exit")){
            if (isDouble(word) && word.contains(".")) {
                print(Double.parseDouble(word));
            } else if(isInteger(word)){
                if (Integer.parseInt(word) < 128 && Integer.parseInt(word) > 0)
                    print((short) Integer.parseInt(word));
                else print(Integer.parseInt(word));
            } else print(word);
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
    static boolean isDouble(String word){
        try {
            Double wordDouble = Double.parseDouble(word);
        } catch (Exception e){
            return false;
        }
        return true;
    }
    static boolean isInteger(String word){
        try {
            Integer wordInt = Integer.parseInt(word);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
