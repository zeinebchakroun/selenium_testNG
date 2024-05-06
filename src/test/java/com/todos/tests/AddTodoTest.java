package com.todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todos.page.TodosPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
		}

	TodosPage todoPage;
	
	
	@Test
	public void iCanAddTodo() throws IOException {
		todoPage = new TodosPage();
		todoPage.submitTodo(prop.getProperty("todo1"));
	}
}