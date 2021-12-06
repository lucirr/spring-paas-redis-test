package com.crossent.paastest.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crossent.paastest.service.TestService;
import com.crossent.paastest.vo.TestVO;

@RestController	
public class ApiController {

	@Autowired
	private TestService testService;
	
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<TestVO> restTest() {
        return testService.getList();
    }
}
