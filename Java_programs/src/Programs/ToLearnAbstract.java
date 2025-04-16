package Programs;

abstract class ToLearnAbstract {
	
	double price;
	int pages;
	String author;
	
	abstract void book();
	
	

}


class Book extends ToLearnAbstract
{
	Book(double price, int pages, String author)
	{
		this.price = price;
		this.pages = pages;
		this.author = author;
	}
	
	void book()
	{
		System.out.println("NEw book");
	}
}
