package com.how2java.tmall.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.User;
 
public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    //根据产品获取OrderItem的方法
    List<OrderItem> findByProduct(Product product);
    //根据用户获取OrderItem的方法
    List<OrderItem> findByUserAndOrderIsNull(User user);
}