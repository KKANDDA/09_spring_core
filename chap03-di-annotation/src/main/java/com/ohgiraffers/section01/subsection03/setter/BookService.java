package com.ohgiraffers.section01.subsection03.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceSetter")
public class BookService {

    private BookDAO bookDAO; // 세터 주입은 객체가 생성된 이후에 이뤄지기 때문에 파이널을 뺀다.

    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBooke(seq);
    }
}
