package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n= scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0 ;i<n; i++){
            System.out.println((i+1)+"번째 주문을 입력하세요. ");

            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);

        }
        printOrder(orders);
        int totalCount = getTotalCount(orders);
        System.out.println("총 금액 : "+totalCount);


    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : "+order.productName+", 가격 : "+order.price+", 수량 : "+order.quantity);
        }
    }

    static int getTotalCount(ProductOrder[] orders){
        int total =0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }


}
