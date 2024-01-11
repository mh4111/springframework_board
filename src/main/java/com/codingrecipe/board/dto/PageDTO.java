package com.codingrecipe.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {

    private int page;
    private int maxPage;    //필요한 페이지 갯수
    private int startPage;
    private int endPage;
}
