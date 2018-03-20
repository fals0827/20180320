public class Main {

    public static void main(String[] args) {
        Invoice inv = new Invoice();
        product prods [] = new product[4];
        prods[0] = new product("乾坤帶", 100.20f,3);
        prods[1] = new product("雷神斧", 1112.30f,2);
        prods[2] = new product("惡魔槌", 93.50f,1);
        prods[3] = new product("破魔劍", 130.40f,5);
        inv.showInfo();
        System.out.println("說明\t\t"+"單價\t\t"+"數量\t\t"+"小計\t\t");
        for (int i = 0 ; i < 4 ; i ++){
            prods[i].showInfo();
        }
        System.out.println("總金額");
        float sum = 0;

    }

}
