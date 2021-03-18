package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        double cost = 8*books.length;
        int diffBooks = 1;

    for(int i=0 ; i<books.length-1 ; i++) {
        for(int j=i+1 ; j<books.length ; j++) {
            if(!(books.get(i).getName().equals(books.get(j).getName()))) {
                diffBooks++;
            }
        }
    }

    if(differentBooks==2) {
        cost=(diffBooks*8*0.93);
    }

    if(differentBooks==3) {
        cost=(diffBooks*8*0.86);
    }

    if(differentBooks==4) {
        cost=(diffBooks*8*0.72);
    }

    if(differentBooks==5) {
        cost=(diffBooks*8*0.65);
    }


        return cost;
    }
}
