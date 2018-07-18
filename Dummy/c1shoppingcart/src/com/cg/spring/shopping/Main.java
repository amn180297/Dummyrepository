package com.cg.spring.shopping;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	int diskcount = 0;
	int batterycount = 0;
	
	
	private List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public void displayOrderedProducts() {

		System.out.println("AVAILABLE PRODUCT:");
	
		for (Product p : product) {
			System.out.println(p.getId() + " " + p.getPname() + " " + p.getPrice());
		}

	}

	void menu() {
		while (true) {
			list();
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addProduct();
				break;
			case 2:
				bestSeller();
				break;

			default:
				break;
			}
		}

	}

	private void bestSeller() {
		// TODO Auto-generated method stub
		if (diskcount > batterycount) {
			System.out.println("BEST SELLER: Disk  ");
			System.out.println("Number of Unit sold is   "+diskcount);
		} else {
			System.out.println("BEST SELLER: Battery");
			System.out.println("Number of Unit sold is  "+batterycount);
		}
	}

	private void list() {
		// TODO Auto-generated method stub
		System.out.println("Enter choice:");
		System.out.println("1. Buy a product\n2. Show Best seller");
		System.out.println("------------------------------");

	}

	public void addProduct()

	{
		displayOrderedProducts();
		System.out.println("----------------------------");
		System.out.println("Select Product ID:");
		Scanner sc = new Scanner(System.in);
		int cartItem = sc.nextInt();
		if (cartItem == 100) {
			System.out.println("Enter Number of Disk You Want To Buy");
			int quant = sc.nextInt();
			diskcount = diskcount + quant;
		} else if (cartItem == 101) {
			System.out.println("Enter Number of Battery You Want To Buy");
			int quant = sc.nextInt();
			batterycount = batterycount + quant;
		} else {
			System.out.println("No product found");
		}

	}

}
