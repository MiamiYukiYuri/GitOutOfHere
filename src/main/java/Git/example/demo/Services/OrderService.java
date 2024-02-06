package Git.example.demo.Services;

import Git.example.demo.Models.Order;
import Git.example.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    //Create an order.
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    //Get all orders.
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}