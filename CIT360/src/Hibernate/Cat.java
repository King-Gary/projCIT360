/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Set;


import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

 

@Entity

@Table(name="CATEGORIES")
/**
 *
 * @author Gary
 */
public class Cat {
    
	@Id

    @GeneratedValue

    @Column(name="categoryID")

    private Long categoryId;

     

    @Column(name="categoryName")

    private String categoryName;

     

    @OneToMany(mappedBy="categories")

    private Set<Product> Product;



	public Categories(Long categoryId, String categoryName,

			Set<Product> Product) {

		super();

		this.categoryId = categoryId;

		this.categoryName = categoryName;

		this.Product = Product;

	}



	private Long getCategoryId() {

		return categoryId;

	}



	private void setCategoryId(Long categoryId) {

		this.categoryId = categoryId;

	}



	private String getCategoryName() {

		return categoryName;

	}



	private void setCategoryName(String categoryName) {

		this.categoryName = categoryName;

	}



	private Set<Product> getProduct() {

		return Product;

	}



	private void setProduct(Set<Product> Product) {

		this.Product = Product;

	}

    
}
