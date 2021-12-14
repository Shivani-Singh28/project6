package com.company;

import java.util.Scanner;

class YongerAgeException extends RuntimeException{
      void YoungAgeException(String msg)
      {
          super(msg);

      }
}
class voting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        throw new YongerAgeException("not eligible");
        System.out.println("enter age");
        int age =s.nextInt();
        if(age<18)
        {
        }
        else
            System.out.println("you can vote");
        System.out.println("hello");
    }

}