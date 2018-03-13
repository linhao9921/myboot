package org.myboot.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月9日 下午3:19:54
 * 说明：
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    String welcome(){
        return "Webcome to SpringBoot.";
    }
}
