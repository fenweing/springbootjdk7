package com.fengwei.springbootjdk7;

import com.parrer.spring.SpringContextUtil;
import com.parrer.util.CollectionUtil;
import com.parrer.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiLogTestController {

    @GetMapping("/get")
    public String getTest(HttpServletRequest request,@RequestParam String str1,@RequestParam(required = false) String str2 , HttpServletResponse response) {
        return str1+ "|"+ str2;
    }
    @GetMapping("/restful/{str}")
    public String restfulTest(HttpServletRequest request,@PathVariable String str,  HttpServletResponse response) {
        return str ;
    }

    @PostMapping("/post")
    public String postTest(@RequestBody List<Map> list, HttpServletRequest request, HttpServletResponse response) {
        return JsonUtil.toString(list);
    }

    @RequestMapping(value = "/rm", method = RequestMethod.POST)
    public String rmTest(@RequestBody List<Map> list, HttpServletRequest request, HttpServletResponse response) {
        return JsonUtil.toString(list);
    }
//    @Autowired
//    SpringContextUtilTestCommandLine commandLine;
//    @GetMapping("/testContext")
//    public String testContext(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        SpringContextUtil.getBean(SpringContextUtilTestCommandLine.class).run();
//        return "ret";
//    }
}
