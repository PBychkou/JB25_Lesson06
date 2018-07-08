public class Task_16_1 {
    private String title;
    private String author;
    private int yearPublished;

    public Task_16_1() {
        this("", "", 0);
    }

    public Task_16_1(String _title, String _author, int _yearPublished) {
        title = _title;
        author = _author;
        yearPublished = _yearPublished;
    }

    public String getBook() {
        return title + " " + author + " " + yearPublished;
    }
}