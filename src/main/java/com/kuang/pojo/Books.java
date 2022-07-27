package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/27 23:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private  int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
