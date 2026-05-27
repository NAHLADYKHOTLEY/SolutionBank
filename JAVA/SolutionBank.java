package solutionbank;

import java.util.Scanner;

public class SolutionBank {
    
    static String Customerfullname;
    static int Customernumber;
    static String Customeremail;
    static int customerphone;

   
    
    
    //static String fullnames;
    static int option;
    
    //Customer menu method
    public static void customermenu(){
        Scanner s = new Scanner(System.in);
        System.out.println("****SOLUTIONS BANKING****");
        System.out.println("****CUSTOMER MANAGEMENT****");
        System.out.println("1. Register Customer");
        System.out.println("2. View Customer");
        System.out.println("3. Update Customer details");
        
        //Ask user for option
        System.out.println("Choose option:");
        switch(option){
        case 1:
             customermenu();
             break;
        case 2:
            Registercustomer();
            break;
        case 3:
            Registercustomer();
            break;
        case 4:
            Addcustomer();
        default:
            System.out.println("Invalid choice option");
        }
        
        }
            
           static public void Registercustomer(){
               Scanner S= new Scanner(System.in);
               System.out.println("Enter customer fullname");
               String Customerfullname = S.nextLine();
               System.out.println("Enter customer phone number");
               int Customerphone = S.nextInt();
               System.out.println("Enter customer email");
               String Customeremail = S.nextLine();   
           }
            static public void Addcustomer(){
                Scanner S= new Scanner(System.in);
                System.out.println("Add customer name:");
                String Customerfullname = S.nextLine();
                System.out.println("Add customer phone number:");
                int Customernumber = S.nextInt();
                System.out.println("Add customer email:");
                String Customeremail = S.nextLine();
                
                
            }
        
         static public void Viewcustomer(){
             System.out.println("***CUSTOMER LIST***");
             System.out.println("Customer full name:" +Customerfullname);
             System.out.println("Customer phone number:" +customerphone);
             System.out.println("Customer email:" +Customeremail);
              
             
    }
    static String AccType;
    static int AccNum;
    
    public static void accountMenu(){
        Scanner S= new Scanner(System.in);
        int option;
        System.out.println("***SOLUTIONS BANKING***");
        System.out.println("***ACCOUNT MANAGEMENT***");
        System.out.println("1. Create Account");
        System.out.println("2. View Accounts");
        
        System.out.println("Choose option");
        option = S.nextInt();
        switch(option){
            case 1:
                createaccount();
                break;
            case 2:
                viewaccounts();
            default:
                System.out.println("Invalid choice option");
            
        }
        }
        public static void createaccount(){
            Scanner S= new Scanner(System.in);
            System.out.println("Enter Account number");
            AccNum = S.nextInt();
            System.out.println("Enter Account type");
            AccType = S.nextLine();
        } 
        public static void viewaccounts(){
            System.out.println("***ACCOUNT LIST***");
            System.out.println("Account number:" +AccNum);
            System.out.println("Account type:");
            System.out.println("");
        }
        static String stafffullname;
 static int staffId;
 static String position;
 static String email;
 static int phone;
 
 //Staff menu method
 static void staffmenu(){
     //Scanner object
     Scanner S = new Scanner(System.in);
     int option;
     //Staff Menu
     System.out.println("***SOLUTIONS BANKING***");
     System.out.println("***STAFF MANAGEMENT***");
     System.out.println("1. Add staff");
     System.out.println("2. View staff");
     System.out.println("3. Update satff");
      
     System.out.println("Choose option");
     option = S.nextInt();
     
     switch(option){
         case 1:
             addstaff();
             break;
         case 2:
             Viewcustomer();
             break;
         case 3:
             updatestaff();
         default:
             System.out.println("Invalid choice option!");
     }    
     }
        //addstaff method
     static void addstaff(){
         Scanner S= new Scanner(System.in);
         //Ask staff details
         System.out.println("Enter staff full name");
         stafffullname = S.nextLine();
         System.out.println("Enter staff Id number");
         staffId = S.nextInt();
         System.out.println("Enter staff position");
         position = S.nextLine();
         System.out.println("Enter staff phone number");
         phone = S.nextInt();
         System.out.println("Enter staff email");
         email = S.nextLine();
         
         
     }
     //view staff
     public static void ViewStaff(){
         Scanner S = new Scanner (System.in);
         //display staff list
         System.out.println("***STAFF LIST***");  
         System.out.println("Staff full name:" +stafffullname);
         System.out.println("Staff ID:" +staffId);
         System.out.println("Staff position" +position);
         System.out.println("Staff phone number" +phone);
         System.out.println("Staff email:" +email);
     
     }
        //Update staff method
     static  public void updatestaff(){
         Scanner S=new Scanner(System.in); 
         System.out.println("Enter staff ID to update:");
         staffId = S.nextInt();
         System.out.println("Enter staff full name to update:");
         stafffullname = S.nextLine();
         System.out.println("Enter staff position to update:");
         position = S.nextLine();
         System.out.println("Enter staff phone numbers to update:");
         phone = S.nextInt();
         System.out.println("Enter staff email to update:");
         email = S.nextLine();
     }
     
    static String TransType;
    static double Amount;
    static int senderAcc;
    static int receiverAcc;
    static double transAmount;
    
    
    public static void transactionMenu(){
        Scanner S = new Scanner(System.in);
        System.out.println("***SOLUTIONS BANKING***");
        System.out.println("***TRANSACTION PROCESSING***");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. View Transaction");
        
        System.out.println("Choose Option:");
        option = S.nextInt();
        switch(option){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                transfer();
                break;
            case 4:
                viewTransaction();
            default:
                System.out.println("Invalid choice option");
        }
    }
        
        
        
        public static void deposit(){
            Scanner S =new Scanner(System.in);
            System.out.println("Enter account number");
            AccNum = S.nextInt();
            System.out.println("Enter deposit amount");
            Amount = S.nextDouble();
            System.out.println("Enter transaction type");
            TransType = S.nextLine();
            
        }
        public static void withdraw(){
           Scanner S =new Scanner(System.in);
            System.out.println("Enter account number");
            AccNum = S.nextInt();
            System.out.println("Enter withdrawal amount");
            Amount = S.nextDouble();
            System.out.println("Enter transaction type");
            TransType = S.nextLine();
            System.out.println("Money withdrawal successfully");
           }
        public static void transfer(){
         Scanner S= new Scanner(System.in);
            System.out.println("Enter sender account number:");
            senderAcc = S.nextInt();
            System.out.println("Enter receiver account number:");
            receiverAcc = S.nextInt();
            System.out.println("Enter transfer amount:");
            transAmount = S.nextDouble();
            
        }
        public static void viewTransaction(){
            System.out.println("***TRANSACTION LIST***");
            System.out.println("Account Number:" + AccNum);
            System.out.println("Transaction Type:" + TransType);
            System.out.println("Amount: R" + Amount);
        }
        
        static void Bankenquiry(){
            System.out.println("***BANK ENQUIRY***");
            System.out.println("Check balance");
            
        }
        
        static void Exit(){
            System.out.println("Thank you!");  
        }
        
        static void menu(){
    
    Scanner S= new Scanner(System.in);
    int option;
    System.out.println("*****SOLUTIONS BANKING***");
    System.out.println("***MENU***");
    System.out.println("1. Customer Menu");
    System.out.println("2. Account Menu");
    System.out.println("3. Staff Menu");
    System.out.println("4. Transaction Menu");
    System.out.println("5. Balance Enquiry");
    System.out.println("6. Exit");
    
    //Ask user for choice
    System.out.println("Enter choice");
    option = S.nextInt();
    
    //Switch statement for menu options
    switch(option){
        case 1:
            customermenu();
             break;
        case 2:
            accountMenu();
            break;
        case 3:
            transactionMenu();
            break;
        case 4:
            Bankenquiry();
            break;
        case 5:
            Exit();
        default:
            System.out.println("Invalid choice option");
            
            
    }
    }
        
        public static void main(String[] args) {
            menu();
    
}
}