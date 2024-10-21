package com.ohgiraffers.section01.subsection01.field;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceFiled") // 빈으로 등록
public class BookService {

    @Autowired // 인터페이스인지 확인하고 구현된 것을 찾아감.
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook(){
        return bookDAO.selectBookList();
    }

    public BookDTO selectOneBook(int seq){
        return bookDAO.selectOneBooke(seq);
    }
}
