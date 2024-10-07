public class BankAccount {
    public static void main(String[] args) {
        
        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance/3;
        boolean canPurchaseTicket = amountForEachFriend >= 250;

        // Outputting the account balance after a withdrawal
        System.out.println("Updated balance: "+updatedBalance);
  
        // Outputting how much each friend can have after the withdrawal
        System.out.println("I gave each friend "+amountForEachFriend);

        // Outputting whether each friend has enough to purchase a tikcet
        System.out.println("Can you purchase a ticket: "+canPurchaseTicket);
    } 
}
