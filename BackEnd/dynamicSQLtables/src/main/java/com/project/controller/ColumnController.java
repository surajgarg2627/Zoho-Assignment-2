package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.ColumnEntity;
import com.project.service.ColumnService;

@RestController
@RequestMapping("/api/columns")
public class ColumnController {

	@Autowired
	private ColumnService columnService;
	
	@PostMapping("/create")
	public ColumnEntity addColumn(@RequestBody ColumnEntity columnEntity) {
		return columnService.addColumn(columnEntity);
	}
	
	@PutMapping("/{id}")
	public ColumnEntity renameColumn(@PathVariable Long id, @RequestBody String newName) {
		return columnService.renameColumn(id, newName);
	}
}
