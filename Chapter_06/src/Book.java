
public class Book {
    private String title;
    private String author;
    private int Pagenumber;
    private int Age;
    private String genre;
    
    
    
    public void Book(String title, int Age, String author, int Pagenumber,String genre ){
    	this.title = title;
    	this.Age = Age;
    	this.author = author;
    	this.genre = genre;
    	this.Pagenumber = Pagenumber;
    	
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


	public int getPagenumber() {
		return Pagenumber;
	}


	public void setPagenumber(int pagenumber) {
		Pagenumber = pagenumber;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book b = new Book();
       b.title();
	}

}
