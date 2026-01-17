package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book {
	private int id;
	private String title;
	private String author;
	private String category;
	private String year;
	private boolean issued;
	
	Book(int id, String title, String author, String category, String year){
		this.id=id;
		this.title=title;
		this.author=author;
		this.category=category;
		this.year=year;
		this.issued=false;
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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getYear() {
		return year;
	}
	
	public boolean isIssued() {
		return issued;
	}

	public void issueBook() {
		this.issued=true;
	}
	
	public void returnBook() {
		this.issued=false;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + ", year="
				+ year + "]";
	}	
	
	
}

