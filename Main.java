package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int balanceAmount=7350;
        int amount2000=3;
        int amount500=2;
        int amount200=1;
        int amount100=1;
        int amount50=1;
        int amount1=0;
        for(int i=0;i<9999;i++){
        System.out.println("ATM started successfully");System.out.println("Choose an option");System.out.println("    1) User");System.out.println("    2) Admin");System.out.println("    3) Exit");
        System.out.println();
        Scanner sc=new Scanner(System.in);

            System.out.print("Enter a choice: ");
            int n= sc.nextInt();
            if(n==1){
                i=9999;
                System.out.println("Entered User");
                for(int j=1;j<4;j++){
                    System.out.print("Enter your username: "); String username=sc.next();
                    if(!username.equals("per1") && !username.equals("per2") && !username.equals("per3")){
                        System.out.println("Invalid username");
                        System.out.println("Attempt "+j+" of 3" );
                    }else{
                        System.out.print("Enter your password: "); String password=sc.next();
                        String[] us=username.split("");
                        if(password.equals("pass"+us[3])){
                            j=4;
                            System.out.println();
                            System.out.println("Welcome "+username);
                            System.out.println("Enter a choice");
                            System.out.println("    1) Withdraw");
                            System.out.println("    2) Get Mini Statement");
                            System.out.println("    3) Exit");
                            System.out.println();
                            for(int k=0;k<9999;k++){
                                System.out.print("Enter a choice: ");
                                int a= sc.nextInt();
                                if(a==1){
                                    k=9999;
                                    for(int u=0;u<3;u++){
                                        System.out.print("Please enter a amount to withdraw: ");
                                        int withdrawAmount=sc.nextInt();
                                        if(withdrawAmount>balanceAmount){
                                            System.out.println("Entered amount is larger than the amount in your account");

                                        }
                                        else{
                                            u=3;
                                            System.out.println("₹"+withdrawAmount+" has been withdrawn successfully");
                                            balanceAmount=balanceAmount-withdrawAmount;
                                        }
                                    }



                                }
                                else if(a==2){
                                    System.out.println("Here is your mini statement");
                                    System.out.println("You have a balance of ₹"+balanceAmount);
                                    System.out.println("No of ₹2000: "+amount2000);
                                    System.out.println("No of ₹500: "+amount500);
                                    System.out.println("No of ₹200: "+amount200);
                                    System.out.println("No of ₹100: "+amount100);
                                    System.out.println("No of ₹50: "+amount50);
                                    System.out.println("No of ₹1: "+amount1);
                                    k=9999;
                                }
                                else if(a==3){
                                    System.out.println("Exiting...");
                                    break;
                                }
                            }

                        }
                        else {
                            System.out.println("Invalid password");
                            System.out.println("Attempt "+j+" of 3" );

                            if(j==3){
                                System.out.println("Attempt locked");
                            }
                            System.out.println();
                        }
                    }
                }



            }
            else if(n==2){
                i=9999;
                System.out.print("Enter username: ");
                String adminUsername=sc.next();
                if(!adminUsername.equals("nithish")){
                    System.out.println("Invalid username");
                    System.out.println("Exiting...");
                }
                else{
                    System.out.print("Enter password: ");
                    String adminPassword=sc.next();
                    if(!adminPassword.equals("helloworld")){
                        System.out.println("Invalid password");
                        System.out.println("Exiting...");
                    }
                    else{

                        for(int c=0;c<999;c++){
                            System.out.println();
                            System.out.println("    HELLO ADMIN");
                            System.out.println("Choose an option");
                            System.out.println("    1) Load");
                            System.out.println("    2) Show");
                            System.out.println("    3) Exit");
                            System.out.println();
                            System.out.print("Enter a choice: ");
                            int b= sc.nextInt();
                            if(b==1){
                                System.out.print("Enter the amount to load: ");
                                int load=sc.nextInt();
                                int cal=0;
                                System.out.print("Enter the number of denomination of ₹2000: ");
                                int load2000=sc.nextInt();
                                cal+=load2000*2000;
                                System.out.print("Enter the number of denomination of ₹500: ");
                                int load500=sc.nextInt();
                                cal+=load500*500;
                                System.out.print("Enter the number of denomination of ₹200: ");
                                int load200=sc.nextInt();
                                cal+=load200*200;
                                System.out.print("Enter the number of denomination of ₹100: ");
                                int load100=sc.nextInt();
                                cal+=load100*100;
                                System.out.print("Enter the number of denomination of ₹50: ");
                                int load50=sc.nextInt();
                                cal+=load50*50;
                                System.out.print("Enter the number of denomination of ₹1: ");
                                int load1=sc.nextInt();
                                cal+=load1;

                                if(cal>load){
                                    System.out.println("Enter amount exceeded the load amount");
                                    continue;

                                }
                                else{
                                    System.out.println("Amount loaded successfully");
                                    c=999;
                                }
                            }
                            else if(b==2){
                                System.out.println("You have a balance of ₹"+balanceAmount);
                                System.out.println("No of ₹2000: "+amount2000);
                                System.out.println("No of ₹500: "+amount500);
                                System.out.println("No of ₹200: "+amount200);
                                System.out.println("No of ₹100: "+amount100);
                                System.out.println("No of ₹50: "+amount50);
                                System.out.println("No of ₹1: "+amount1);

                            }
                            else if(b==3){
                                System.out.println("Exiting");
                                break;
                            }
                        }



                    }
                }
            }
            else if(n==3){
                System.out.println("Exiting...");
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice");
                System.out.println();
            }
        }
    }
}
