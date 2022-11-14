package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {
    double balance;
    int transactions;
    static double ATM_TRANSACTION_FEE=1;
    static double MANAGEMENT_FEE=5;
    private final int id;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        if(this.id == id){
            transactions++;
            this.balance+=amount;
            System.out.println("Operazione eseguita con successo    Bilancio: "+balance);
        }
        else{
            System.out.println("Id non corrisponde");
        }
    }

    public void withdraw(final int id, final double amount) {
        if(this.id == id){
            if(amount>balance){
                System.out.println("non hai il cash");
            }
            else{
                transactions++;
                this.balance-=amount;
                
                System.out.println("Operazione eseguita con successo    Bilancio: "+balance);
            }
        }
        else{
            System.out.println("Id non corrisponde");
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if(this.id == id){
            transactions++;
            this.balance+=amount;
            this.balance-=ATM_TRANSACTION_FEE;
            System.out.println("Operazione eseguita con successo    Bilancio: "+balance);
        }
        else{
            System.out.println("Id non corrisponde");
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        if(this.id == id){
            if(amount>balance){
                System.out.println("non hai il cash");
            }
            else{
                transactions++;
                this.balance-=amount;
                this.balance-=ATM_TRANSACTION_FEE;
                System.out.println("Operazione eseguita con successo    Bilancio: "+balance);
            }
        }
        else{
            System.out.println("Id non corrisponde");
        }
    }

    public void chargeManagementFees(final int id) {
        if(this.id==id){
            balance-=MANAGEMENT_FEE;
            balance-=(transactions*0.1);
        }
    }

    public void printInfo(){
        System.out.println(id+"     "+balance);
    }
}
