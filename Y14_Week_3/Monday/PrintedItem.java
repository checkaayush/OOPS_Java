public class PrintedItem extends Item {
    
    private int numPages;

    public PrintedItem(int id, String title, int numPages) {
        super(id, title);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}