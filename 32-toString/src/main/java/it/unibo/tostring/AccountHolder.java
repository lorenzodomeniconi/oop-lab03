package it.unibo.tostring;

public class AccountHolder {

    private final String name;
    private final String surname;
    private final int userID;

    public AccountHolder(final String name, final String surname, final int accountID) {
        this.name = name;
        this.surname = surname;
        this.userID = accountID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getUserID() {
        return this.userID;
    }

    public String toString() {
        // Should print name, surname, and account id.
        return ("Nome: "+this.name+
        "    Cognome:"+this.surname+
        "    Id: "+this.userID);
    }

    public static void main(final String[] args) {
        AccountHolder x = new AccountHolder("lorenzo", "domeniconi", 1);
        System.out.println(x.toString());
    }
}
