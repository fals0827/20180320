public class Invoice {
    private String title, address, postcode, tel;
    public Invoice () {
        title = "亞大資工站";
        address = "柳豐路500號 霧峰區 台中市";
        postcode = "41354";
        tel = "23323456";
    }
    public Invoice(String name, String add1, String code1, String t1){
        title=name;
        address=add1;
        postcode=code1;
        tel=t1;
    }
    public void setTitle(String name){
        this.title=name;
    }
    public String getTitle() {
        return title;
    }
    public void setAddress(String add1){
        this.address=add1;
    }
    public String getAddress() {
        return address;
    }
    public void setPostcode(String code1){
        this.postcode=code1;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setTel(String t1){
        this.tel=t1;
    }
    public String getTel() {
        return tel;
    }
    public void showInfo(){
        System.out.println("店名:"+getTitle());
        System.out.println("地址:"+getAddress());
        System.out.println("郵遞區號:"+getPostcode());
        System.out.println("電話:"+getTel());
        System.out.println("=======================================================");
    }
}

