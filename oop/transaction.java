package oop;

public class transaction {

    class Transaction {
        String type;
        String date;
        double amount;
        String remarks;

        // Constructor for Transaction class
        public Transaction(String type, String date, double amount, String remarks) {
            this.type = type;
            this.date = date;
            this.amount = amount;
            this.remarks = remarks;
        }
    }

    class Transfer extends Transaction {
        String sender_id;
        String receiver_id;

        // Constructor for Transfer class
        public Transfer(String type, String date, double amount, String remarks, String sender_id, String receiver_id) {
            super(type, date, amount, remarks); // Call the parent class constructor
            this.sender_id = sender_id;
            this.receiver_id = receiver_id;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class to access the inner classes
        transaction transactionDemo = new transaction();

        // Create an object of the Transfer class with all properties initialized
        Transfer transfer = transactionDemo.new Transfer(
            "Transfer",
            "2024-05-18",
            1000.50,
            "Payment for services",
            "sender123",
            "receiver456"
        );

        // Print the properties of the Transfer object to verify
        System.out.println("Transfer Object:");
        System.out.println("Type: " + transfer.type);
        System.out.println("Date: " + transfer.date);
        System.out.println("Amount: " + transfer.amount);
        System.out.println("Remarks: " + transfer.remarks);
        System.out.println("Sender ID: " + transfer.sender_id);
        System.out.println("Receiver ID: " + transfer.receiver_id);

        // Create an object of the Transaction class with all properties initialized
        Transaction transaction = transactionDemo.new Transaction(
            "Deposit",
            "2024-05-17",
            500.00,
            "Salary deposit"
        );

        // Print the properties of the Transaction object to verify
        System.out.println("\nTransaction Object:");
        System.out.println("Type: " + transaction.type);
        System.out.println("Date: " + transaction.date);
        System.out.println("Amount: " + transaction.amount);
        System.out.println("Remarks: " + transaction.remarks);
    }
}
