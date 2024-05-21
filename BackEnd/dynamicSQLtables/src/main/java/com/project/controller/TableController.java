package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.TableEntity;
import com.project.service.TableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/tables")
public class TableController {
	
	@Autowired
	private TableService tableService;
	
	@PostMapping("/create")
	public TableEntity createTable(@RequestBody TableEntity tableEntity) {
		return tableService.createTable(tableEntity);
	}
	
	@GetMapping
	public List<TableEntity> getAllTables(){
		return tableService.getAllTables();
	}
	
	@PutMapping("/{id}")
	public TableEntity renameTable(@PathVariable Long id, @RequestBody String newName) {
		return tableService.renameTable(id, newName);
	}
	
}
