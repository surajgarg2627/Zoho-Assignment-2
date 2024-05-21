package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.ColumnEntity;
import com.project.repository.ColumnRepository;

@Service
public class ColumnService {

	@Autowired
	private ColumnRepository columnRepository;
	
	public ColumnEntity addColumn(ColumnEntity columnEntity) {
		return columnRepository.save(columnEntity);
	}
	
	public ColumnEntity renameColumn(Long id, String newName) {
		ColumnEntity column = columnRepository.findById(id).orElseThrow();
		column.setName(newName);
		return columnRepository.save(column);
	}
}
