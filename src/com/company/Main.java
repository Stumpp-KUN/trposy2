package com.company;


import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file=new File("C:\\Users\\Useer\\Desktop\\qwe.txt");
        Scanner scanner=new Scanner(file);
        Scanner main=new Scanner(System.in);
        List<String> list1 = new LinkedList<>();
        while(scanner.hasNextLine()){
            list1.add(scanner.nextLine());
        }

        String lone= String.join(" ",list1);
        char[] g=lone.toCharArray();

        System.out.println("Введите после какого символа вставить подстроку");
        int k=main.nextInt();

        int[] ogran=new int[2];
        System.out.println("Введите ограничения для подстроки beginIndex,endIndex");
        ogran[0]=main.nextInt();
        ogran[1]=main.nextInt();

        String temp=lone.substring(ogran[0],ogran[1]);
        String str = "";
        for(int i=0;i<g.length;i++) {
            str += g[i];
            if(i==k) {
                str += temp;
            }
        }

        try(FileWriter writer = new FileWriter("C:\\Users\\Useer\\Desktop\\zxc.txt"))
        {
            writer.write(str);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        scanner.close();
    }
}