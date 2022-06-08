package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
       // this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle==null||bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }


}
