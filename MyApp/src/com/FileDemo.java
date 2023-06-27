package com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import Exceptions.ResourceNotFoundException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("MyFile.txt");
		if(file.createNewFile()) {
			System.out.println("File created");
		}
		PrintWriter pw = new PrintWriter(file);
		pw.println("Hi...! This is Sai Adarsh");
		pw.println("This is new file");
		pw.close();
		System.out.println("Thanx");
	}
}
