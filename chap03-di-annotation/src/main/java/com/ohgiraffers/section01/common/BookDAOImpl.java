package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.*;

@Repository("bookDAO") // 데이터 베이스와 연결을 담당하는 어노테이션, 지금은 그냥 컴포넌트
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1,new BookDTO(1, 123,"짱자바", "서현준", "혀주출판", new Date()));
        bookList.put(2,new BookDTO(2, 456,"구려자바", "응혀주", "혀주출판", new Date()));
    }


    @Override
        public List<BookDTO> selectBookList(){
        return  new ArrayList<>(bookList.values());
    }


    @Override
    public BookDTO selectOneBooke(int seq) {
        return bookList.get(seq);
    }
}
