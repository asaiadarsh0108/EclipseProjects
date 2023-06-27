package com.controller;

import com.service.GradeService;

import Exceptions.GradeExceptions.IllegalMarksException;
import Exceptions.GradeExceptions.NegetiveMarksException;

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeService();
		final int totalScore =300;
		int marksScored=289;
		try {
			String grade= service.calculateGrade(marksScored, totalScore);
			System.out.println("The grade is :"+grade);
		}
		catch(IllegalMarksException|NegetiveMarksException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
