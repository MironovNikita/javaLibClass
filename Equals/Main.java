package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //default или package - доступ в рамках пакета - 4-ый модификатор доступа (public private protected)
        // "\u0055" - вывод символа Юникода
        //Преобразование типов в Java - собеседование (что куда можно переводить)
        //Иерархия исключений - собеседование
        //ctrl+Q - описание в документации, кто что делает в классах и т.п.
        //>> - побитовый сдвиг
        //В switch/case можно использовать со строками! (отличие от С++) + укороченная запись почитать
        //Scanner - посмотреть методы
        //

        /*int a = 6;
        int b = 0;
        System.out.println(Math.max(a,b));

        String str = "car";
        switch (str)
        {
            case "qwerty":
                System.out.println(1);
                break;
            case "car":
                System.out.println(2);
        }*/

        /*int a = 8;
        int b = 1;

        if (a>b)
        {
            int c = a;
            a = b;
            b = c;
        }

        for (int i = a; i<=b; i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String st = scanner.next(); //текст до пробела
        String st1 = scanner.nextLine(); //текст полностью до Enter*/

        /////////////////////////////////////////////////////////////////25.10.22
        /*boolean flag;
        int counter = 0;
        for(int i = 10_000_000; i <= 99_999_999; i++) {
            flag = true;
            for (int j = 0, k = 1; j < 8; j++, k *= 10) {
                int el = (i % (k * 10)) / k;
                for (int s = 0, k2 = 1; s < 8; s++, k2 *= 10) {
                    int el2 = (i % (k2 * 10)) / k2;
                    if (el == el2 && j != s) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag && i % 12345 == 0) counter++;
        }
        System.out.println(counter);*/

        /*Integer num = new Integer(4);
        num.toString();
        System.out.println(num instanceof Number); //проверка что это число
        System.out.println(num.toString() instanceof String); //проверка что это строка
        System.out.println(num);*/

        //Задача №6
        /*int counter = 0;
        boolean flag;
        for(int i = 10_000_000; i <= 99_999_999; i++) {
            flag = true;
            Integer numb = new Integer(i);
            String str = numb.toString();

            for(char s= '0'; s<='9'; s++)
            {
                if(str.indexOf(s)!=str.lastIndexOf(s)){
                    flag = false;
                    break;
                }
            }

            if(flag && i%12345==0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println(counter);*/

        /*String str = "1234567";
        System.out.println(Integer.parseInt(str)/2);

        Integer num =new Integer(45);
        int a = num;
        System.out.println(a);*/

        /*String str = "82930Akk";
        try{
            Integer num = new Integer(Integer.parseInt(str));
            System.out.println(num);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }*/

        //7 задача
        /*int a = 10;
        System.out.print(a%2);
        a=a>>1;
        //System.out.println((a>0)? "OK":"NO");
        System.out.print(a%2);
        a=a>>1;
        //System.out.println((a>0)? "OK":"NO");
        System.out.print(a%2);
        a=a>>1;
        //System.out.println((a>0)? "OK":"NO");
        System.out.print(a%2);
        a=a>>1;
        //System.out.print((a>0)? "OK":"NO");
        //Перевернуть число?)*/

        //стринг иммутабельная вещь, неизвестно, когда он вычистится, поэтому нельзя брать его для паролей
        //хэш код строк
        //string builder
        //equals - метод для сравнения значений объектов

        String str1 = "Karl";
        String str2 = new String("Karl");
        MyObject ob1 = new MyObject(2,3);
        MyObject ob2 = new MyObject(2,3);
        System.out.println(ob1.equals(ob2));
    }



}
