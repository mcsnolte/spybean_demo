package com.example.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(DemoController.class)
public class DemoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @SpyBean
    private DemoObject demoObject;

    @Test
    public void info_get() throws Exception {

        when(demoObject.getName()).thenReturn("foo");

        mockMvc.perform(get("/now").accept(MediaType.APPLICATION_JSON_UTF8)
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                // debug
                .andDo(print())
                // assert
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("foo")));

    }

}