package test.com.example.lib

import com.example.lib.Book
import org.junit.Test
import org.junit.Before

class BookTest {
    Book book

    @Before
    void setUp() {
        book = new Book(title: 'Romeo and Juliet')
    }

    @Test
    void testGetter() {
        assert book.getTitle() == 'Romeo and Juliet'
    }

    @Test
    void testSetter() {
        book.setTitle('Hyperion')
        assert book.getTitle() == 'Hyperion'
    }
}
