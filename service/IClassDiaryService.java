package com.g3.spc.service;

import java.time.LocalDate;

import com.g3.spc.entities.ClassDiary;

public interface IClassDiaryService {
	public ClassDiary addClassDiary(ClassDiary classDiary);
	public ClassDiary retrieveClassDiary(LocalDate date);
	
}
