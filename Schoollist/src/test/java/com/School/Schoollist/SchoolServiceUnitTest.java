package com.School.Schoollist;
import java.util.List;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolServiceUnitTest {
    @Autowired
    private SchoolServices schoolService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<SchoolEntity> school = schoolService.list();

        Assert.assertEquals(school.size(), 5);
    }
}
