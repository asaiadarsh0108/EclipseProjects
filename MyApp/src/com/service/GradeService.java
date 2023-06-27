package com.service;

import Exceptions.GradeExceptions.IllegalMarksException;
import Exceptions.GradeExceptions.NegetiveMarksException;

public class GradeService {

	public String calculateGrade(int marksScored, int totalScore) throws IllegalMarksException,NegetiveMarksException {
		if(marksScored>totalScore) {
			throw new IllegalMarksException("marksScored cannot be greater than total marks");
		}
		if(marksScored<0) {
			throw new NegetiveMarksException("Marks cannot be negetive");
			
		}
		double percent = ((double)marksScored/totalScore)*100;
		
		return percent>75?"A":percent<65?"C":"B";
	} 
}
