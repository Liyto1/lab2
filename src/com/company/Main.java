package com.company;


import java.util.Scanner;

////////////////////////LAB2/ZADANIE1//////////////////////
/*public class Main {


    public static void main(String[] args) {
      int a=2;
      int m=(int)(Math.random()*10);
      for(int i=1; i<m; i++)
      {
          a = a*2;
      }
      System.out.println ("Степень =" + m);
      System.out.println (a);
    }
}*/
////////////////////////LAB2/ZADANIE2//////////////////////
/*public class Main {


    public static void main(String[] args) {
        int a=1;
        int n=(int)(Math.random()*10);
        for(int i=1; i<=n; i++)
        {
            a= a*i;
        }
        System.out.println(n+"!="+a);
    }
    }*/
////////////////////////LAB2/ZADANIE3//////////////////////
/*public class Main {


    public static void main(String[] args) {
        int a, b, c;
        int n = (int) (Math.random() * 21);
        int m = (int) (Math.random() * 21);
        a = m + n;
        c = m * n;
        if (m < n) {
            b = n - m;
        } else {
            b = m - n;
        }
        System.out.println("Ч1:" + n + " Ч2:" + m + " Сумма:" + a + " Разность:" + b + " Произведение:" + c);
    }
}*/
////////////////////////LAB2/ZADANIE4//////////////////////
/*public class Main {


    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Введите высоту h");
    int h= in.nextInt();
    double a=(h*2)/9.81;
    double t= Math.pow(a,0.5);
    System.out.println("Время падения:" +t+ "с");


    }
    }*/
////////////////////////LAB2/ZADANIE5//////////////////////
/*public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double b=0;
    System.out.println("Введите катет а и гипотенузу с");
    int a=in.nextInt();
    int c=in.nextInt();
    if (c<a){
        return;
    }

    b= Math.pow((c*c)-(a*a),0.5);

    System.out.println("Гипотенуза с: "+c+" Катет а: "+a+" Катет b: "+b);
    }
    }*/