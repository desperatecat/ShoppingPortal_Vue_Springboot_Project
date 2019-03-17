package com.how2java.tmall.dao;
  
import java.util.List;
 
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;
 
public interface ProductDAO extends JpaRepository<Product,Integer>{
    Page<Product> findByCategory(Category category, Pageable pageable);
    List<Product> findByCategoryOrderById(Category category);
    List<Product> findByNameLike(String keyword, Pageable pageable);
}