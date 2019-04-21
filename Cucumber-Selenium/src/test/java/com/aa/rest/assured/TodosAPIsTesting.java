package com.aa.rest.assured;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.aa.pojos.Todos;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TodosAPIsTesting {

	@Test
	public void getTodosListAPITest() {

		// get api response

		Response response = RestAssured.get("https://jsonplaceholder.typicode.com/todos");

		// convert json reponse to java objects using as() method.

		List<Todos> todosList = response.as(List.class);

		// add the assertions to validate response
		System.out.println(todosList);
	}

	@Test
	public void getTodosListAPITest_jsonToJavaConversionUsingJacksonAPI() throws Exception {

		// get api response

		Response response = RestAssured.get("https://jsonplaceholder.typicode.com/todos");

		String jsonResponse = response.asString();

		// convert json response string to java object
		ObjectMapper mapper = new ObjectMapper();
		List<Todos> todosList = mapper.readValue(jsonResponse, List.class);

		// add the assertions to validate response
		Assert.assertEquals(200, todosList.size());
		System.out.println(todosList.size());
	}

	@Test
	public void getTodosListAPITestt_passheaders() throws Exception {

		// get api response

		Response response = RestAssured.given().headers("Accept", ContentType.JSON).when()
				.get("https://jsonplaceholder.typicode.com/todos");

		String jsonResponse = response.asString();

		// convert json response string to java object
		ObjectMapper mapper = new ObjectMapper();
		List<Todos> todosList = mapper.readValue(jsonResponse, List.class);

		// add the assertions to validate response
		System.out.println(todosList);
	}

	@Test
	public void postTodoListAPITest() throws JsonProcessingException {

		Todos todos = new Todos(1000, 1000, "dummy title", false);

		// one way to convert java object to json string
		ObjectMapper mapper = new ObjectMapper();
		String todosJsonString = mapper.writeValueAsString(todos);

		// get api response

		Response response = RestAssured.given().body(todosJsonString)
				.post("https://jsonplaceholder.typicode.com/todos");

		// verify post response status
		Assert.assertEquals(response.getStatusCode(), 201);

	}

}
