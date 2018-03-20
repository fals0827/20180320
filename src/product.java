public class product {
    private String name;
    private float price;
    private int q;
    public product(String name1, float price1, int q1){
        name=name1;
        price=price1;
        q=q1;
    }
    public void showInfo(){
        System.out.println(this.name+"\t\t"+this.price+"\t\t"+this.q+"\t\t"+Math.round(this.price*this.q*100)/100f);
    }
}
