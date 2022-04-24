package xin.jiangqiang.iterator;

/**
 * 书架类
 */
public class BookShelf implements Aggregate<Book> {
    private Book[] books;//使用数组存储书架中的书
    private int last = 0;//实际存储的书本数

    /**
     * @param maxSize 书架容量
     */
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
