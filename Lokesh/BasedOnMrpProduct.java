package Sir.Lokesh;

import java.util.Arrays;

class AmazonProduct implements Comparable<AmazonProduct>{
    String product;
    int price;
    AmazonProduct(String product, int price){
        this.product=product;
        this.price=price;
    }

    public int compareTo(AmazonProduct ap){
        return this.price-ap.price;
    }

    @Override
    public String toString() {
        return "Product : "+product+" Price : "+price;
    }
}
public class BasedOnMrpProduct {
    public static void main(String[] args) {
        AmazonProduct []arr={new AmazonProduct("Bat",560),
                new AmazonProduct("GirlFriend",2000),
                new AmazonProduct("Bag",599),
                new AmazonProduct("Cloth",299),};
        Arrays.sort(arr);
        for (Object  ar:arr){
            System.out.println(" "+ar);
        }
    }
}