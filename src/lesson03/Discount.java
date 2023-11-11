package lesson03;

public class Discount {
    public int price1;
    public int price2;
    public int discount;

    public void printSum(){
        int result = price1 + price2 - discount;
        System.out.println("Сумма покупки с учетом скидки = " + result);
        System.out.println("Сумма скидки = " + discount);

    }

}
