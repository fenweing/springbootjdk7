package com.fengwei.springbootjdk7;

import com.parrer.annotation.Duration;
import com.parrer.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ComponentTest {
    @Duration
    public void test(List list, Map map) {
        log.info(JsonUtil.toString(list + "|" + JsonUtil.toString(map)));
    }
}
