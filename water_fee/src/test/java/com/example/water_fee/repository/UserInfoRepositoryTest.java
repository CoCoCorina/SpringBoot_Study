package com.example.water_fee.repository;

import com.example.water_fee.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class UserInfoRepositoryTest {

    @Autowired
    private UserInfoRepository repository;

    @Test
    void findAll() {
        List<UserInfo> list = repository.findAll();
        for (UserInfo userInfo : list) {
            System.out.println(userInfo);
        }
    }

    @Test
    void save() {
        UserInfo userInfo = new UserInfo();
        userInfo.setSupplyNumber("FYCJ0010");
        userInfo.setRealName("陈得分");
        userInfo.setUserTel("15612344321");
        userInfo.setUserAddress("中国山东省济南市章丘区花园小区56号");
        userInfo.setMoneyLeft(new BigDecimal(86.021));
        userInfo.setWaterLeft(new BigDecimal(95.02112));
        repository.save(userInfo);

    }

    @Test
    void update() {
        List<UserInfo> userInfoList = repository.findBySupplyNumber("FYCJ002");
        for (UserInfo userInfo : userInfoList) {
            userInfo.setRealName("111");
            repository.save(userInfo);
        }
    }

    @Test
    void count() {
        UserInfo userInfo = new UserInfo();
        BigDecimal qqq = userInfo.getMoneyLeft();
//        BigDecimal bigDecimal = repository.countByMoneyLeft(qqq);
//        String qwe = bigDecimal+"";
//        System.out.println(qwe);
        int i = 0;
    }

    @Test
    void findSumRegister() {
        List<Integer[]> list = repository.findSumRegister();
//        System.out.println(list);
        for (Object[] objs : list) {
            for (int i = 0; i < objs.length; i++) {
                System.out.print(objs[i]);
            }
        }
    }

    @Test
    public void findSumMoneyLeft() {
        List<BigDecimal[]> list = repository.findSumMoneyLeft();
        for (Object[] objs : list) {
            for (int i = 0; i < objs.length; i++) {
                System.out.print(objs[i] + ",");
            }
            System.out.println();
        }
    }

    @Test
    public void findSumWaterLeft() {
        List<BigDecimal[]> list = repository.findSumWaterLeft();
        for (Object[] objs : list) {
            for (int i = 0; i < objs.length; i++) {
                System.out.print(objs[i] + ",");
            }
        }
    }
}