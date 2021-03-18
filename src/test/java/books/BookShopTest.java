package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;



public class BookShopTest {
	
	@DisplayName("BookShopTest")
	public void bookShopTest() {
        	BookShop bookShop = new BookShop("testname");
     		int testNumber=5;
     		bookShop.cost(int[testNumber] books);
     }
     

    @Test
    public void myFirstTest(){
        assertTrue(false);
    }
}