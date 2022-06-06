package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("1.Enter stack size:");
        int size=in.nextInt();
        Stack numberStack = new Stack(size);//create stack
        System.out.println("2.Create stack");
        System.out.println("3.Input numbers:");

        int i=0;
        while(i<size) {
            int num =in.nextInt();
            numberStack.addElement_Push(num);
            i++;
        }


        int stackArr[]= new int[size];
        i=0;
        System.out.println("4.Output stack: ");
        int max=0;
        while (!numberStack.stackIsEmpty()) {
            int value =numberStack.deleteElement_Pop();

            if(value>max)
                max=value;

            stackArr[i]=value;
            i++;
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("5.Maximum number: "+max);
        System.out.println("6.Delete last element: ");

        System.out.println("7.Fresh stack: ");
        for(i=1; i<size; i++){
            System.out.print(stackArr[i]);
            System.out.print(" ");
        }
    }

}
