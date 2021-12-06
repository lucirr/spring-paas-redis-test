package com.crossent.paastest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crossent.paastest.dao.TestRepository;
import com.crossent.paastest.vo.TestVO;

@Service
public class TestService {
	@Autowired
    private TestRepository testRepository;

    
    public List<TestVO> getList() {
        return this.testRepository.getList();
    }
}
