package ex05photonpeñaranda;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    earnings = 0;
    
    itemList = new ArrayList<>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if(index >= 0 && index <= this.itemList.size()) {
        this.earnings += itemList.get(index).getCost();
        System.out.println("\n" + itemList.get(index).getName() + " has been sold for " + itemList.get(index).getCost() + ".");
    } else {
        System.out.println("There are only " + itemList.size() + " items in the store.");
    }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    boolean found = false;
      
    for (Item i : itemList) {
        if(i.getName().equalsIgnoreCase(name)) {
            found = true;
            this.earnings += i.getCost();
            System.out.println("\n" + i.getName() + " has been sold for " + i.getCost() + ".");
        }
    }
    
    if(found == false) {
        System.out.println("The store does not sell " + name);
    }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if(itemList.contains(i)) {
          this.earnings += i.getCost();
          System.out.println("\n" + i.getName() + " has been sold for " + i.getCost() + ".");
      } else {
          System.out.println("The store does not sell " + i.getName());
      }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
  }
  public void filterType(String type){
    System.out.println("Items of " + type + " type:");
    for (Item i : itemList) {
        if(i.getType().equalsIgnoreCase(type)) {
            System.out.println(i.getName());
        }
    }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    System.out.println("\nCheap items:");
    for (Item i : itemList) {
        if(i.getCost() <= maxCost) {
            System.out.println(i.getName());
        }
    }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    System.out.println("\nExpensive items:");
    for (Item i : itemList) {
        if(i.getCost() >= minCost) {
            System.out.println(i.getName());
        }
    }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    System.out.print("\n");
    for (Store i : storeList) {
        System.out.println(i.getName() + ": " + i.getEarnings());
    }
    // loop over storeList and print the name and the earnings'Store.java'
  }
}
