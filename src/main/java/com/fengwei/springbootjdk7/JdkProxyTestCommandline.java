package com.fengwei.springbootjdk7;

import com.parrer.annotation.Duration;
import com.parrer.spring.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
/**
 * set @EnableAspectJAutoProxy(proxyTargetClass = false)
 */
public class JdkProxyTestCommandline implements ApplicationRunner {
    @Override
    @Duration
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("++++++method begin+++++++++++");
        Thread.sleep(2000l);

        Object bean = SpringContextUtil.getBean("jdkProxyTestCommandline");
        log.info("jdk proxy bean-{}", bean.getClass());
        Object bean2 = SpringContextUtil.getBean(ApiLogTestController.class);
        log.info("cglib proxy bean-{}", bean2.getClass());
        log.info("++++++method end+++++++++++");
    }

    @Duration(printParam = true)
    public void printParam(List list, Map map) throws InterruptedException {
        log.info("++++++printParam method begin+++++++++++");
        Thread.sleep(3000l);
        log.info("++++++printParam method end+++++++++++");
    }

}
