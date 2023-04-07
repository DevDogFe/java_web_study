package com.tenco.todo.dto;

import java.util.ArrayList;

import com.tenco.todo.repository.CategoryDAO;

public class TodoDTO {
	private int id;
	private String title;
	private String description;
	private int priority;
	private int completed;
	private String createdAt;
	private CategoryDTO categoryDTO;
	
	public TodoDTO(String title, String description, int categoryId) {
		super();
		this.title = title;
		this.description = description;
		categoryDTO = new CategoryDAO().select(categoryId);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	@Override
	public String toString() {
		return "TodoDTO [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", completed=" + completed + ", createdAt=" + createdAt;
	}
	
	
	
}
