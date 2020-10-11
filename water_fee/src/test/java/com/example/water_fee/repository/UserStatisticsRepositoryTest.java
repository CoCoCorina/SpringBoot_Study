package com.example.water_fee.repository;

import com.example.water_fee.entity.UserStatistics;
import com.example.water_fee.util.KeyUtil;
import com.example.water_fee.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class UserStatisticsRepositoryTest {

    @Autowired
    private UserStatisticsRepository repository;

    @Test
    void findAll() {
        List<UserStatistics> list = repository.findAll();
        System.out.println(list);
    }

    @Test
    void statistics() {
        Random random = new Random();
        for (int i=0;i<=20;i++){
            UserStatistics userStatistics = new UserStatistics();
            userStatistics.setStatisticsId(KeyUtil.createUniqueKey());
            userStatistics.setStatisticsDaily(new BigDecimal(random.nextInt(10)+random.nextDouble()));
            userStatistics.setSupplyNumber("FYCJ0"+ random.nextInt(11));
            repository.save(userStatistics);
        }
    }

    @Test
    void qwe(){
        Random random = new Random();
        System.out.println(random.nextInt(10)+"");
    }

    @Test
    void qqq() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2005-12-09");
        String now = new SimpleDateFormat("M月").format(date);
        System.out.println(now);
    }

    @Test
    void dateSumStatisticsAmount() throws Exception {
        List object= DateUtil.getMonthBetween();
        System.out.println(object);
        ArrayList arrayList = new ArrayList();
        for (Object o : object) {
            arrayList.add(repository.SumStatisticsAmount((String) o));
        }
        System.out.println(arrayList);
    }

    @Test
    void countStatisticsUser() throws Exception {
        List object= DateUtil.getMonthBetween();
        System.out.println(object);
        ArrayList arrayList = new ArrayList();
        for (Object o : object) {
            arrayList.add(repository.CountStatisticsUser((String) o));
        }
        System.out.println(arrayList);
    }
}