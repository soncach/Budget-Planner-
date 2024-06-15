
public enum PurchaseType {
    Utilties ("Utilties"),
    StreamingSubscriptions("streaming"),
    Rent ("Rent", "Morgage Payment"),
    MonthlyPayments("extra");

    private String name;
    private String altName;

    private PurchaseType(String name){
        this.name = name;
    }
    private PurchaseType(String name, String other){
        this.name = name;
        this.altName= other;
    }
    /**
     * if the name matches a purchace tyep to return that purchase type 
     * @param name
     * @return
     */

    public PurchaseType getPurchaseType(String name){
        
    }


    /**
     * create a function that checks if the purchaseType exist 
     */

}
