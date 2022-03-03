package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.EmpBean;

@Component
public interface EmpBeanDao extends CrudRepository<EmpBean, String>{

}
