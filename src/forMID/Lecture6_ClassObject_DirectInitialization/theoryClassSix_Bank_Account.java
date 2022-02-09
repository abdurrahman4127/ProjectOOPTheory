package forMID.Lecture6_ClassObject_DirectInitialization;

class bankAccount
{
    String accountHolder;
    String accountNo;
    int currentBalance;


    void deposit(int amount)
    {
        currentBalance += amount;
    }

    void withdraw(int amount)
    {
        if (currentBalance >= amount )
        {
            currentBalance -= amount;
        }
    }
}

public class theoryClassSix_Bank_Account
{
    public static void main(String[] args)
    {
        bankAccount a = new bankAccount();
        a.accountHolder = "abdurRahman";
        a.accountNo = "011202260";

        a.currentBalance = 1000;
        a.deposit(2000);
        System.out.println(a.currentBalance);

        a.withdraw(100);
        System.out.println(a.currentBalance);
    }
}
