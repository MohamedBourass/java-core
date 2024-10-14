package com.mbo.ch02.patterns.classes;

public class Singleton {
	
	//private static final instanciation
	private  final static Singleton instance = new Singleton();
	
	//Private constructor
	private Singleton() {
	}
	
	//public static getInstance
	public static Singleton getInstance() {
		return instance;
	}
}
