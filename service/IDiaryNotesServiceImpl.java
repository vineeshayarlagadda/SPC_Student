package com.g3.spc.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.spc.entities.DiaryNotes;
import com.g3.spc.entities.Subject;
import com.g3.spc.repository.IDiaryNotesRepository;

@Service
public class IDiaryNotesServiceImpl implements IDiaryNotesService{
	
	@Autowired
	private IDiaryNotesRepository diaryNotesRepo;

	
	@Override
	@Transactional
	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes) {
		diaryNotesRepo.save(diaryNotes);
		return diaryNotes;
	}

	@Override
	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DiaryNotes deleteDiaryNotes(DiaryNotes diaryNotes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
