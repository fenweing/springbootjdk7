package com.fengwei.springbootjdk7;

import com.parrer.annotation.Duration;
import com.parrer.spring.SpringContextUtil;
import com.parrer.util.CollectionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class DurationAnnoTestCommandline implements ApplicationRunner {
    @Override
    @Duration
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("++++++method begin+++++++++++");
        Thread.sleep(2000l);

        SpringContextUtil.getBean(DurationAnnoTestCommandline.class).printParam(
                CollectionUtil.ofList(1, "4"), new HashMap() {{
                    put("x", "xx");
                    put("y", 6);
                }}
        );
        log.info("++++++method end+++++++++++");
    }

    @Duration(printParam = true)
    public void printParam(List list, Map map) throws InterruptedException {
        log.info("++++++printParam method begin+++++++++++");
        Thread.sleep(3000l);
        log.info("++++++printParam method end+++++++++++");
    }
}
