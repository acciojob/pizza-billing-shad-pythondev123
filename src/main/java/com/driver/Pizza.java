package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int vegprice= 300;
    public static int nonvegprice= 400;
    public static int cheeseprice= 80;
    public static int vegtoppingsprice= 70;
    public static int nonvegtoppingsprice= 120;
    public static int takeawayprice= 20;

    private boolean cheeseadded= false;
    private boolean toppingsadded= false;
    private boolean takeawayadded= false;
    private int mytoppingprice=0;
    private int basePrice=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice= isVeg?vegprice: nonvegprice;
        this.mytoppingprice=0;
        this.price= 0;
        this.bill= "";
    }

    public int getPrice(){
        this.price=basePrice;
        if(cheeseadded) this.price+=cheeseprice;
        if(toppingsadded){
            mytoppingprice=isVeg?vegtoppingsprice:nonvegtoppingsprice;
            this.price+=mytoppingprice;
        }
        if(takeawayadded) this.price+=takeawayprice;

        return this.price;
    }

    public void addExtraCheese(){
      cheeseadded= true;
    }

    public void addExtraToppings(){
        toppingsadded= true;
    }

    public void addTakeaway(){
        takeawayadded= true;
    }

    public String getBill(){
        this.bill+= "Base Price Of The Pizza: " + basePrice+ "\n";
        if(cheeseadded){
          this.bill+="Extra Cheese Added: " + cheeseprice +"\n";
        }
        if(toppingsadded){
            this.bill+="Extra Toppings Added: "+ mytoppingprice +"\n";
        }
        if(takeawayadded){
            this.bill+="Paperbag Added: " + takeawayprice + "\n";
        }
        this.bill+= "Total Price: "+ this.getPrice() + "\n";

        return this.bill;
    }
}
