public class BankAccountApp {

    public static void main(String[] args) {
        Checking checkingAcc1 = new Checking("Adam Dominik","123456789",1500);

        Savings savingsAcc1 = new Savings("Dominik Adam","987654321",2500);

        savingsAcc1.showInfo();

        System.out.println("***********");

        checkingAcc1.showInfo();
    }
}
