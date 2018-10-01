package com.zrb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/30
 */
@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping(value = "/testLoad")
    public Object testRobbin(){
        String url =  "http://TEST/ribbon";
        ResponseEntity<Object> forEntity = restTemplate.getForEntity(url, Object.class);
        Object body = forEntity.getBody();
        System.out.println(body.toString());
        return null;
    }
}
