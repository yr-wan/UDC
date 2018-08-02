package com.yrwan.udc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ArrayList<String> ccString=new ArrayList<String>();//存储输入的码符号
        //输入字符
        if (args.length==0){
            ccString.clear();
            Scanner input = new Scanner(System.in);
            System.out.print("输入信源的个数：");
            int count = input.nextInt();
            System.out.print("输入编码符号：");
            for(int i = 0; i< count; i++)
            {
                ccString.add(input.next());
            }
            input.close();
            System.out.println("输入的码字是："+ccString);
        }else {
            Collections.addAll(ccString, args);
        }
        String result= UDC.compare(ccString)?"是唯一可译码":"不是唯一可译码";
        System.out.println(ccString+" "+result);
        System.exit(0);
    }
}