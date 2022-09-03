public class Item {
    //atributes
    int price;
    float weight;
    int quantity;
    String description;
    String type;
    boolean canBetraded;

    //constructor
    public Item(int prc, float wgt, int qnt, String des, String weaponType ,boolean cbt){
        price = prc;
        weight = wgt;
        quantity = qnt;
        description = des;
        type = weaponType;
        canBetraded = cbt;
        System.out.println("it's type is " + type + "\n" + "it's price is " + price + "\n" + "it's weight is " + weight + "\n" + "it's quantity is just " + quantity + "\n" + "description: " + description + "\n" + "Tradability " + canBetraded);
    }

    public void type(){
    System.out.println("\nTradability " + canBetraded);

}
