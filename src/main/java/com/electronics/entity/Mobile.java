package com.electronics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mobile_details")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	private String model;
	private float rating;
	private int ram;
	private int rom;
	private int noOfsimSlot;
	private int noOfCamera;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public int getNoOfsimSlot() {
		return noOfsimSlot;
	}

	public void setNoOfsimSlot(int noOfsimSlot) {
		this.noOfsimSlot = noOfsimSlot;
	}

	public int getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

}
