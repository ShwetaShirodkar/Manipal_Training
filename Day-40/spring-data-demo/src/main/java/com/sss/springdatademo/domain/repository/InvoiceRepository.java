package com.sss.springdatademo.domain.repository;

import org.springframework.data.repository.CrudRepository;

import  com.sss.springdatademo.domain.*;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
}