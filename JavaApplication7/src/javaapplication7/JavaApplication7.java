/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author renas
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        int sched=0;
        String log;
        String log1="logout";
        String ad="admin";
        String pass="admin123";
        String us="user";
        String pass1="user123";
  String out1="1";String out3="1";
  String out2="1";
int day=0;int nm3=0;int nm4=0;int nm6=0;int nm7=0;
int nm1=0; int nm2=0;int nm5=0;int apv=0;
      do{  
          do{
        System.out.print("\nEnter username:");
        String name=input.nextLine();
        System.out.print("Password:");
         String password=input.nextLine();
                
             
              
                ///user//
                
                if(name.equals(us)&&(password.equals(pass1))){
                    System.out.println("Welcome user");
                    if(apv==1){
                    System.out.println("===========================================================================================================================\nYou have been approve!!");
                        System.out.println("Your schedule is");
                        String md="Monday";String teu="Tuesday";String wed="Wednsday";String thur="Thursday";String fri="Friday";String Sat="Saturday";
                   if(day==1){System.out.println("Date choosen:"+md+" "+nm1);                 
                   }else if (day==2){
                       System.out.println("Date choosen:"+teu+" "+nm2);
                   }else if (day==3){
                       System.out.println("Date choosen:"+wed+" "+nm3);
                   }else if (day==4){
                       System.out.println("Date choosen:"+thur+" "+nm4);
                   }else if (day==5){
                       System.out.println("Date choosen:"+fri+" "+nm5);
                   }else if (day==6){
                       System.out.println("Date choosen:"+Sat+" "+nm6);
                   }
                   String t1="(7:30-9:00)";String t2="(9:00-10:30)";  String t3="(10:30-12:00)";String t4="(1:00-2:30)";String t5="(2:30-4:00)";
                   if (nm7==1){
                       System.out.println("Time:"+t1);
                   }else if (nm7==2){
                       System.out.println("Time:"+t2);
                   }else if (nm7==3){
                       System.out.println("Time:"+t3);
                   }else if (nm7==4){
                       System.out.println("Time:"+t4);
                   }else if (nm7==5){
                       System.out.println("Time:"+t5);           
                   }
                        
                 }
                    System.out.println("Do you want to get schedule?\n 1.for YES 2.for NO");
                     sched=input.nextInt();
                     if(sched==1){
                      System.out.println("Okay we notify you as soon as possible");
                      System.out.println("You have been logout!!");
                      out1=input.nextLine();
                 }else if (sched==2){
                         System.out.println("Thankyou for visiting us");
                         System.out.println("You have been Loggout!!");  
                         out2=input.nextLine();
                 }     
              
                }
               
//admin//
                
                if(name.equals(ad)&&(password.equals(pass))){
                    System.out.println("Welcome admin");
                    if(sched==1){
                        System.out.println("Someone wants to get schedule!!");
                        System.out.println("Do you approve?\n1.for yes 2.for NO");
                         apv=input.nextInt();
                    }if (apv==1){
                   System.out.print("\nWhat day you prefer\n1.Monday 2.Tuesday \n3.Wednesday 4.Thursday \n5.Friday 6.Saturday\nSelected:");
                 day=input.nextInt();
                   } if(day==1){
             System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n                         ");
          System.out.print("\n    6                  ");
           System.out.print("\n   13                 ");
           System.out.print("\n   20                 ");
           System.out.print("\n   27                   \n");
           System.out.print("Enter date:");
           nm1=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                    System.out.print("Selected Time:");
             nm7=input.nextInt();
                                 System.out.println("===================================================================================================================================================================================================================================================");

                   }else if (day==2){
            System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n                         ");
          System.out.print("\n        7                 ");
           System.out.print("\n        14                ");
           System.out.print("\n        21          ");
           System.out.print("\n        28          \n");
           System.out.print("Enter date:");
           nm2=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                    System.out.print("Selected Time:");
                     nm7=input.nextInt();
                                         System.out.println("===================================================================================================================================================================================================================================================");

                   }else if (day==3){
             System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n            1       ");
          System.out.print("\n            8       ");
           System.out.print("\n            15  ");
           System.out.print("\n            22  ");
           System.out.print("\n            29     \n");
            System.out.print("Enter date:");
           nm3=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                    System.out.print("Selected Time:");
                     nm7=input.nextInt();
                   }else if (day==4){
             System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n                2   ");
          System.out.print("\n                9   ");
           System.out.print("\n                16  ");
           System.out.print("\n                23  ");
           System.out.print("\n                30      \n");
           System.out.print("Enter date:");
           nm4=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                    System.out.print("Selected Time:");
                     nm7=input.nextInt();
                                         System.out.println("===================================================================================================================================================================================================================================================");

                   }else if (day==5){
              System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n                    3    ");
          System.out.print("\n                    10  ");
           System.out.print("\n                    17  ");
           System.out.print("\n                    24  ");
           System.out.print("\n                    31    \n");
           System.out.print("Enter date:");
           nm5=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                    System.out.print("Selected Time:");
                     nm7=input.nextInt();
                    System.out.println("===================================================================================================================================================================================================================================================");
                   }else if (day==6){
             System.out.print("\nS   M   T   W   T   F   S");
         System.out.print("\n                        4");
          System.out.print("\n                        11");
           System.out.print("\n                        18");
           System.out.print("\n                        25");
           System.out.print("\n                         \n");
           System.out.print("Enter date:");
           nm6=input.nextInt();
             System.out.print("What time do you prefer\n1.(7:30-9:00) 2.(9:00-10:30) \n3.(10:30-12:00) Breaktime \n4.(1:00-2:30) 5.(2:30-4:00)\n");
                   System.out.print("Selected Time:");
                     nm7=input.nextInt();    
                                       System.out.println("===================================================================================================================================================================================================================================================");

                   }
                   String md="Monday";String teu="Tuesday";String wed="Wednsday";String thur="Thursday";String fri="Friday";String Sat="Saturday";
                   if(day==1){System.out.println("Date choosen:"+md+" "+nm1);                 
                   }else if (day==2){
                       System.out.println("Date choosen:"+teu+" "+nm2);
                   }else if (day==3){
                       System.out.println("Date choosen:"+wed+" "+nm3);
                   }else if (day==4){
                       System.out.println("Date choosen:"+thur+" "+nm4);
                   }else if (day==5){
                       System.out.println("Date choosen:"+fri+" "+nm5);
                   }else if (day==6){
                       System.out.println("Date choosen:"+Sat+" "+nm6);
                   }
                   String t1="(7:30-9:00)";String t2="(9:00-10:30)";  String t3="(10:30-12:00)";String t4="(1:00-2:30)";String t5="(2:30-4:00)";
                   if (nm7==1){
                       System.out.println("Time:"+t1);
                   }else if (nm7==2){
                       System.out.println("Time:"+t2);
                   }else if (nm7==3){
                       System.out.println("Time:"+t3);
                   }else if (nm7==4){
                       System.out.println("Time:"+t4);
                   }else if (nm7==5){
                       System.out.println("Time:"+t5);           
                   }
                    System.out.println("You have been logout!"); 
                out3=input.nextLine();
                    }
                
          }while(out3.equals(out3));
                
     }while(out1.equals(out1) && (out2.equals(out2)));  

  } 
}