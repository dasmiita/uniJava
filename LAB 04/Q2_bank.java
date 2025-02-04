public class Q2_bank {
    public static class BankAccount {
        String name;
        int accNum;
        double balance;
        String accType;

        BankAccount(String name, int accNum, double balance, String accType) {
            this.name = name;
            this.accNum = accNum;
            this.balance = balance;
            this.accType = accType;}

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited in account");
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Invalid deposit");}}

        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn. Balance left: " + balance);
            } else {
                System.out.println("Insufficient balance");}}

        void transfer(BankAccount recipient, double amount) {
            if (amount > 0 && amount <= balance) {
                this.withdraw(amount);
                recipient.deposit(amount);
                System.out.println("Transferred " + amount + " to " + recipient.name);
            } else {
                System.out.println("Invalid transfer amount or insufficient balance");}}

        public void display() {
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accNum);
            System.out.println("Balance: " + balance);
            System.out.println("Account Type: " + accType);}}

    public static void main(String[] args) {
        // Creating bank accounts
        BankAccount acc1 = new BankAccount("smi", 123456, 5000, "Savings");
        BankAccount acc2 = new BankAccount("kunj", 789012, 3000, "Checking");

        // Performing transactions
        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.transfer(acc2, 1500);

        // Displaying account details
        System.out.println("\nAccount Details:");
        acc1.display();
        acc2.display();}}

