public class DemoLibrary {
    
    private static int count = 0;

    static int getNextId() {
        return ++count;
    }

    public static void main(String args[]) {
        
        PrintedItem pi = new PrintedItem(getNextId(), "Test PrintedItem", 10);
        MultimediaItem mi = new MultimediaItem(getNextId(), "Test MultimediaItem", 100);
        
        System.out.println(pi.getId());
        System.out.println(mi.getId());
    }
    
}