package com.webApp.WebApp.services;

import com.webApp.WebApp.model.Product;
import com.webApp.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone", 100000),
//            new Product(102,"Camera", 80000)));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
       // return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        //products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod){
//        for(Product p : products){
//            if(p.getProdId() == prod.getProdId()){
//                p.setProdName(prod.getProdName());
//                p.setPrice(prod.getPrice());
//            }
//        }
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
//        int idx = 0;
//        for(int i=0; i<products.size(); i++){
//            if(products.get(i).getProdId() == prodId){
//                idx = i;
//                break;
//            }
//        }
//        products.remove(idx);
        repo.deleteById(prodId);
    }
}
