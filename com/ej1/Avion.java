package com.ej1;

import java.util.Scanner;

public class Avion {

	Scanner sc = new Scanner(System.in);
	
	private String idAvion;
	
	private int capacidad;
	
	private int numVuelos = 0;
	
	private double kmVolados = 0;
	
	private String companyia; 
	
	public Avion() {}

	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}
	
	public Avion(String idAvion,int capacidad,String companyia) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.companyia = companyia;
	}
	

	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public double getKmVolados() {
		return kmVolados;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
	}
	
	public double getTotalKm() {
		return kmVolados;
	}
	
	public double getMediaKm() {
		return kmVolados/numVuelos;
	}
	
	public int getNumeroVuelos() {
		return numVuelos;
	}
	
	public boolean asignarVuelo(int capacidad, double kilometros) {
		if(capacidad <= this.capacidad && kilometros > 0) {
			this.numVuelos ++;
			this.kmVolados += kilometros;
		}
		return (capacidad <= this.capacidad && kilometros > 0);
	}

}