public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts //
        Account Account1 = new Account("1", "Vincent", 3300);
        Account Account2 = new Account("2", "Liam", 7300);

        System.out.println("");
        // Display initial balances //
        System.out.println("Starting Balances:");
        System.out.println("Account 1: $" + Account1.getBalance());
        System.out.println("Account 2: $" + Account2.getBalance());

        // Transfer $1000 from account 1 to account 2 //
        Account2.transferTo(Account1, 2000);

        // Display final balances //
        System.out.println("\nBalances after Transfer:");
        System.out.println("Account 1: $" + Account1.getBalance());
        System.out.println("Account 2: $" + Account2.getBalance());
    }
}