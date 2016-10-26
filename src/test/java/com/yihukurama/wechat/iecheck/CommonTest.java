package com.yihukurama.wechat.iecheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yihukurama.wechat.iecheck.common.Constant;
import com.yihukurama.wechat.iecheck.common.utils.HttpUtils;
import com.yihukurama.wechat.iecheck.common.utils.JsonUtil;
import com.yihukurama.wechat.iecheck.framework.service.YingjlService;
import com.yihukurama.wechat.iecheck.framework.transfer.model.YizhiRequest;


/**
 * 功能描述: redis  SIT测试
 * @Author:denghsuai
 * @Date:2016年9月29日 下午6:42:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class CommonTest {

	
	@Autowired
	YingjlService ys;
	@Autowired
	HttpUtils httpUtils;
	
	@Before
	public void setUp() throws Exception {
		
	}


	@Test
	public void testRedisExprie() throws Exception {

	}
   
}
