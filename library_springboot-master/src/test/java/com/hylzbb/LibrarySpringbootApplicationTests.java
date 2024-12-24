package com.hylzbb;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hylzbb.entity.Reader;
import com.hylzbb.mapper.ReaderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class LibrarySpringbootApplicationTests {
    @Resource
    ReaderMapper readerMapper;

    @Test
    public void login() {
        String id = "r001";
        String password = "r0012";
        QueryWrapper<Reader> wrapper = new QueryWrapper<>();
        Reader reader = readerMapper.selectOne(wrapper.eq("id", id));
        Map<String, String> map = new HashMap<>();
        if (reader == null || !reader.getPassword().equals(password)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

}
