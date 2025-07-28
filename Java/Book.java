package Activities;

abstract class Book {
	String title;
	
	//abstract method
	abstract void setTitle(String title);
	
	
	//concrete method
	String getTitle() {
		return title;
	}
	
	
}
