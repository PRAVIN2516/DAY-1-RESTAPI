package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductDetails;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	  @PostMapping("productinsert")
	  public ProductDetails  post(@RequestBody ProductDetails  u) {
			return ps.post(u);
		}
	  @PostMapping("productinsertAll")
	  public List<ProductDetails > postall(@RequestBody List<ProductDetails > u) {
			return (List<ProductDetails >)ps.postall(u);
		}
	  @GetMapping("showallproduct")
	  public List<ProductDetails > get(){
			return ps.get();
		}
	  @GetMapping("showproductid/{id}")
	  public Optional<ProductDetails > getbyid(@PathVariable int id){
			return ps.getbyid(id);
		}
	  @DeleteMapping("deleteproduct")
	  public String delete(@RequestBody ProductDetails  u) {
			 ps.delete(u);
			 return "data deleted";
		}
	  @DeleteMapping("deleteproduct/{id}")
	  public String deletebyid(@PathVariable int id) {
			ps.deletebyid(id);
			return "id deleted";
		}
	  @PutMapping("updateproduct")
	  public ProductDetails  put(@RequestBody ProductDetails  u) {
			return ps.put(u);
		}
	  @PutMapping("updateproduct/{id}")
	  public ProductDetails  putbyid(@PathVariable int id,@RequestBody ProductDetails  u) {
		  return ps.putbyid(id, u);
	  }
}
