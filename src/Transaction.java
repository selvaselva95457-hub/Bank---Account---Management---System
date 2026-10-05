public class Transaction {
    private String type;
    private double amount;
    private String description;

    public Transaction(String type , double amount , String description){
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public void DisplayTransaction(){
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Description: " + description);
    }
}
