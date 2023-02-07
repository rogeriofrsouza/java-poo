package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);  // Imprime o status na forma de String conforme o mesmo nome definido na enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");  // Conversão de String para instância de um tipo enum
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
