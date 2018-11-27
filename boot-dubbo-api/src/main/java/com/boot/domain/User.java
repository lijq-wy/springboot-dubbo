package com.boot.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}