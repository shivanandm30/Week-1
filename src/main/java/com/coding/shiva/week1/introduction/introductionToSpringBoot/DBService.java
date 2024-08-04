package com.coding.shiva.week1.introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DBService {


    final private DB db;

    public DBService(DB db) {
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}
