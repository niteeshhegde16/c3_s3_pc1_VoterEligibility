package com.election;

import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        System.out.println("voter.name ="+voter.getName);
        //voter.setName("john");
        System.out.println("voter.age ="+Voter.getAge());
        //   voter.setAge(30);
 getAgeCriteria();
    }

    public static void getAgeCriteria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print(""+name );
            System.out.println("Eligible to vote");
        }else {
            System.out.print(""+name );
            System.out.println("Not eligible to vote");
        }


    }
}


