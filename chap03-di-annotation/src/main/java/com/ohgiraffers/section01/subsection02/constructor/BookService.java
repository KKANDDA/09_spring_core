package com.ohgiraffers.section01.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    @Autowired // 주입시점의 차이 생성자에 오토와이어드를 하는 것이 좀 더 안정적이다. 순환참조 오류를 막을 수 있다. 그러나 코드가 복잡해 진다.
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBooke(seq);
    }
}
