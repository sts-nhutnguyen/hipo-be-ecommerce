package com.sts.hipo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements HipoService {
    @Override
    public String helloWorld() {
        return "Hello World";
    }
}
