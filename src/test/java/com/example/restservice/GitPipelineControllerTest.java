package com.example.restservice;

import com.example.RestServiceApplication;
import java.io.IOException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestServiceApplication.class)
@WebAppConfiguration
public class GitPipelineControllerTest {
	protected MockMvc mvc;
   @Autowired
   WebApplicationContext webApplicationContext;

   protected void setUp() {
      mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
   }
	@Test
public void getProductsList() throws Exception {
   String uri = "/getPipeline";
   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
      .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
   
   int status = mvcResult.getResponse().getStatus();
   assertEquals(200, status);
   String content = mvcResult.getResponse().getContentAsString();
   Product[] productlist = super.mapFromJson(content, Product[].class);
   assertTrue(productlist.length > 0);
}
}
