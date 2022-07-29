package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/27 23:14
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //通过id查询一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryAllBook();
    //通过书籍名字查询一本书
    Books queryBookByName(String name);
}
