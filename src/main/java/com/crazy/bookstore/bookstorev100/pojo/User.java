package com.crazy.bookstore.bookstorev100.pojo;

import lombok.Data;

/**
 * @author crazy402
 * @version 1.0
 * @date 2022/6/27 16:36
 * @description //
 **/
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
