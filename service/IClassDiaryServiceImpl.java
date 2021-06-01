package com.g3.spc.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.spc.entities.ClassDiary;
import com.g3.spc.repository.IClassDiaryRepository;

@Service
public class IClassDiaryServiceImpl implements IClassDiaryService{
	
	@Autowired
	private IClassDiaryRepository classDiaryRepo;

	@Override
	@Transactional
	public ClassDiary addClassDiary(ClassDiary classDiary) {
		classDiaryRepo.save(classDiary);
		return classDiary;
	}

	@Override
	public ClassDiary retrieveClassDiary(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
