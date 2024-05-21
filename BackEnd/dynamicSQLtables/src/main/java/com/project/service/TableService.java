package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.TableEntity;
import com.project.repository.TableRepository;

@Service
public class TableService {

	@Autowired
	private TableRepository tableRepository;
	
	public TableEntity createTable(TableEntity tableEntity) {
		return tableRepository.save(tableEntity);
	}
	
	public List<TableEntity> getAllTables(){
		return tableRepository.findAll();
	}
	
	public TableEntity renameTable(Long id, String newName) {
		TableEntity table = tableRepository.findById(id).orElseThrow();
		table.setName(newName);
		return tableRepository.save(table);
	}
}
