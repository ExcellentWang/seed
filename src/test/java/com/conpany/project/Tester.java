package com.conpany.project;


import com.company.Application;
import org.apache.commons.collections.functors.FalsePredicate;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//对测试方法进行回滚
@Transactional
@Rollback
public abstract class Tester {
}



