package com.yrwan.udc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ArrayList<String> ccString=new ArrayList<String>();//�洢����������
        //�����ַ�
        if (args.length==0){
            ccString.clear();
            Scanner input = new Scanner(System.in);
            System.out.print("������Դ�ĸ�����");
            int count = input.nextInt();
            System.out.print("���������ţ�");
            for(int i = 0; i< count; i++)
            {
                ccString.add(input.next());
            }
            input.close();
            System.out.println("����������ǣ�"+ccString);
        }else {
            Collections.addAll(ccString, args);
        }
        String result= UDC.compare(ccString)?"��Ψһ������":"����Ψһ������";
        System.out.println(ccString+" "+result);
        System.exit(0);
    }
}