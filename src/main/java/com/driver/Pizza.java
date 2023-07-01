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

    private boolean cheeseadded;
    private boolean toppingsadded;
    private boolean takeawayadded;
    private int mytoppingprice=0;
    private int basePrice=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice= isVeg?vegprice: nonvegprice;
        this.mytoppingprice=isVeg?vegtoppingsprice:nonvegtoppingsprice;
        this.price= basePrice;
        this.bill= "";
        this.cheeseadded=false;
        this.takeawayadded=false;
        this.toppingsadded=false;
    }

    public int getPrice(){
        this.price=basePrice;
        if(cheeseadded) this.price+=cheeseprice;
        if(toppingsadded){

            this.price+=this.mytoppingprice;
        }
        if(takeawayadded) this.price+=takeawayprice;

        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseadded)
      cheeseadded= true;
    }

    public void addExtraToppings(){
        if(!toppingsadded)
        toppingsadded= true;
    }

    public void addTakeaway(){
        if(!takeawayadded)
        takeawayadded= true;
    }

    public String getBill(){
        String bill = "Base Price Of The Pizza: " + this.basePrice+ "\n";
        if(cheeseadded){
          bill+="Extra Cheese Added: " + cheeseprice +"\n";
        }
        if(toppingsadded){
            bill+="Extra Toppings Added: "+ mytoppingprice +"\n";
        }
        if(takeawayadded){
            bill+="Paperbag Added: " + takeawayprice + "\n";
        }
        bill+= "Total Price: "+ this.getPrice() + "\n";

        return bill;
    }
}
