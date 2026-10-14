import java.util.*;
class SBI
{
    //Attributes
    private int pin;
    protected double balance; //encapsulation
    Scanner sc = new Scanner(System.in);

    //constructor
    SBI(int pin,double balance)
    {
        System.out.println("hiiiiiii");
        this.pin=pin;
        this.balance=balance;

    }
    
    public int getPin()  //getter function
    {
        return pin;
    }
    public void setChangePin() //setter function
    {
        System.out.println("Enter your Pin");
        int askPin = sc.nextInt();
        if(askPin==pin)
        {
            System.out.println("Enter new pin");
            int newPin = sc.nextInt();
            pin = newPin;
        }
    }
    //method1
    void createPin()
    {
        //enter your pin
        System.out.println("Enter your pin");
        int enterPin = sc.nextInt();
        pin = enterPin;


    }
    //method2
    void checkBalance()
    {
        //enter your pin
        int askPin = sc.nextInt();
        if(askPin==pin)
        {
            System.out.println("Current balance: " + balance);
        }
        else
        {
            System.out.println("Invalid pin");
        }

    } 
    void addBalance()
    {
        int askPin = sc.nextInt();
        if(askPin==pin)
        {
            System.out.println("Enter your amount");
            int amount = sc.nextInt();
            balance = balance + amount;
        }
        else
        {
            System.out.println("Invalid pin");
        }
    }
    void withdrawBalance()
    {
        System.out.println("Enter your pin");
        int askPin = sc.nextInt();
        if(askPin==pin)
        {
            System.out.println("Enter your amount");
            int amount = sc.nextInt();
            if(amount>balance || amount<0)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                balance = balance - amount;
                System.out.println("Withdraw successful. Current balance: " + balance);
            }

        }
    }
}    

public class AtmMachine{
    public static void main(String args[])
    {
        SBI user1 = new SBI(1234,10000);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("enter 1 to change pin");
            System.out.println("enter 2 to check balance");
            System.out.println("enter 3 to add balance");
            System.out.println("enter 4 to withdraw balance");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                //changepin
                user1.setChangePin();
            
            }
            else if(choice == 2)
            {
                //checkbalance
                user1.checkBalance();
            
            }

            else if(choice == 3)
            {
                //add balance
                user1.addBalance();
            }
            else if(choice == 4)
            {
                //withdraw balance
                user1.withdrawBalance();
            }
            
            
    
        }

    }
}