package com.company.extraClasses.src.stack;

import java.util.Scanner;

public class StackClass {

    int st_elements[] = new int[10];
    int top;

    StackClass() {
        top = -1;
    }

    public void push(int item)  //for inserting element into stack in stack order
    {
        if (top == 10) {
            System.out.println("stack is full");
            return;
        } else {
            st_elements[++top] = item;
        }
    }

    public int pop()    //for retriving element from stack
    {
        if (top < 0) {
            System.out.println("stack underflow");
            return 0;
        } else
            return st_elements[top--];
    }

    public int peek()
    {
        if (top!=-1) {
            return st_elements[top];
        }
        else {
            System.exit(-1);
        }

        return -1;
    }


    public boolean empty_stack() //check that stack is empty or not
    {
        if (top == -1)
            return true;
        else return false;
    }

    public void print()
    {
        int temp = 0;

        if (!empty_stack()) {
            temp = pop();
            System.out.println(temp);
            print();
        }
        push(temp);
    }
}

class  Teststack
{
    public static void main(String[] args)
    {
        int type_of_op;
        StackClass obj=new StackClass();

        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter your choice");
            System.out.println("Enter 1 for push a number...");
            System.out.println("Enter 2 for pop a number...");
            System.out.println("Enter 3 for peek of stack...");
            System.out.println("Enter 4 for printing a stack elements");
            System.out.println("Enter 5 for exit");
            type_of_op = s.nextInt();							//reading type value
            switch(type_of_op)
            {
                case 1: System.out.println("Enter your element which you want to push");
                    obj.push(s.nextInt());
                    break;

                case 2: System.out.println("Element  you want to pop is "+ obj.pop());
                    break;

                case 3: System.out.println("Peek of stack is "+ obj.peek());
                    break;

                case 4: System.out.println("stack element is ");
                    obj.print();
                    break;
                default: System.out.println("You have entered the wrong choice");
                    return ;

            }

        }

    }
}

