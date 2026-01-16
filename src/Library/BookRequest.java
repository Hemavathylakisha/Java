package Library;

import java.time.LocalDateTime;

public class BookRequest {
	private int userId;
	private int bookId;
	private LocalDateTime requestTime;
	
	BookRequest(int userId, int BookId){
		 this.userId = userId;
	     this.bookId = bookId;
	     this.requestTime = LocalDateTime.now();
	}

	public int getUserId() {
		return userId;
	}

	public int getBookId() {
		return bookId;
	}

	public LocalDateTime getRequestTime() {
		return requestTime;
	}

	@Override
	public String toString() {
		return "BookRequest [userId=" + userId + ", bookId=" + bookId + ", requestTime=" + requestTime + "]";
	}
	
}
