package item03;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    // 필드가 변경되어도 직렬화 역직렬화를 지원한다.
    private static final long serialVersionUID = 1L;
    public static int unSerializedField = 0; //직렬화되지 않음
    private String isbn;
    private String title;
    private String author;
    private LocalDate published;
    transient private int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published, int numberOfSold) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
        this.numberOfSold = numberOfSold;
    }
}
