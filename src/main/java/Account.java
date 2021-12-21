public abstract class Account implements IBaseRate {

        String name;
        String sSn;
        double balance;
        String accountNumber;
        double rate;

    public Account(String name){
        System.out.println("NAME: " + name);
        System.out.println("NEW ACCOUNT: ");
    }
}
