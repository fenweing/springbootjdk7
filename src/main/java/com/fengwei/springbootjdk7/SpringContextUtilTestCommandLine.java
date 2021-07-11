package com.fengwei.springbootjdk7;

import com.parrer.annotation.Duration;
import com.parrer.spring.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SpringContextUtilTestCommandLine implements ApplicationRunner {
    @Duration
    public void run(String... args) throws Exception {
        try {
            log.info("+++++++++++++++++begin");
            ApiLogTestController bean = SpringContextUtil.getBean(ApiLogTestController.class);
            log.info("+++++++++++++++++" + bean.toString());
        } catch (Exception e) {
            log.error("error", e);
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        run();
    }
}
