package com.github.felipectrevisol.todo.task.httpresource;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AddTaskCarsHttpResource.class)
class AddTaskCarsHttpResourceTest {

	@Autowired MockMvc mockMvc;

	@Test void postRequest() throws Exception {
		mockMvc.perform(post("/task")
			.contentType("application/json")
			.content("{\"title\":\"A Title.\", \"priority\":1}"))
			.andExpect(status().isCreated());
	}
}