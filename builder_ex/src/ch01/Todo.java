package ch01;

// this 활용 -> 빌더패턴
public class Todo {
	
	private String content;
	private int complete; // 1 = 완료, 0 = 미완료
	
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getComplete() {
		return complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
	}

	// 기본생성자 재정의 private으로
	private Todo() {}
	
	public static class MyBuilder {
		
		private String content;
		private int complete; // 1 = 완료, 0 = 미완료
		
		public MyBuilder setContent(String content) {
			this.content = content;
			return this;
		}
		
		public MyBuilder setComplete(int complete) {
			this.complete = complete;
			return this;
		}
		
		// 핵심
		public Todo build() {
			Todo todo = new Todo();
			todo.content = content;
			todo.complete = complete;
			return todo;
		}
		
	} // end of mybuilder
	
	public static void main(String[] args) {
		Todo todo1 = new MyBuilder().setComplete(1).build();
		Todo todo2 = new MyBuilder().setContent("잠자기").build();
		Todo todo3 = new MyBuilder().setComplete(0).setContent("청소").build();
		
		System.out.println(todo1.complete);
		System.out.println(todo2.content);
		System.out.println(todo3.complete + " " + todo3.content);
	}

}
