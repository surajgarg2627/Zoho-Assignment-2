package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.TableEntity;

@Repository
public interface TableRepository extends JpaRepository<TableEntity, Long> {

}
