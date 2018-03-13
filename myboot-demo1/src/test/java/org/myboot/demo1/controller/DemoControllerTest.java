package org.myboot.demo1.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myboot.demo1.controller.DemoController;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author 林浩<hao.lin@w-oasis.com>
 * @version 创建时间：2018年3月9日 下午3:45:08
 * 说明：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class DemoControllerTest {
    private MockMvc mock;
    
    @Before
    public void setUp() throws Exception {
        mock = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }
 
    @Test
    public void testHome() throws Exception {
        System.out.println(mock);
//        mock.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//            .andExpect(status().isOk())
//            .andExpect(content().string(equalTo("Hello World!")));
    }
    
    
}
