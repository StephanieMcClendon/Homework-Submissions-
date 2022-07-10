public class Account{
    //initiating private variables
    private String id;
    private String name;

    private double balance;

    //Setting methods
    public Account(String id, String name)
    {
        this.id = id;
        this.name =name;
    }

    public Account(String id, String name, double balance)
    {
        this.id = id;
        this.name = name;
        this.balance =  balance;
    }
//setting my getter info that needs a return because it is a void

    public String getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void credit(double amount)
    {
        this.balance = this.balance + amount;
    }

    public boolean debit(double amount)
    {
        if(this.balance - amount > 0)
        {
            this.balance = this.balance - amount;
            return true;
        }
        else
        {
            System.out.println("Amount Exceeded");
            return false;
        }
    }

    public void transferTo(Account another, double amount)
    {
        if(this.balance - amount > 0)
        {
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
            System.out.println("Transfer completed");

        }
        else
        {
            System.out.println("Amount Exceeded");
        }
    }

    public String accountDetails()
    {
        return this.name + ", the current balance in your account " + this.id +" is $" + this.balance;
    }

}