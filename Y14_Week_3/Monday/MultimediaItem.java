public class MultimediaItem extends Item {
    
    private int length;

    public MultimediaItem(int id, String title, int length) {
        super(id, title);
        this.length = length; 
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}