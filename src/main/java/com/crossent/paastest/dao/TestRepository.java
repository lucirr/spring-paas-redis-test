package com.crossent.paastest.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crossent.paastest.vo.TestVO;

@Repository
public class TestRepository {
    private SqlSession sqlSession;

    @Autowired
    public TestRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<TestVO> getList() {
        return sqlSession.selectList("database.getList");
    }
}
