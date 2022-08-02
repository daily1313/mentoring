package com.example.mentoring.dto;

import com.example.mentoring.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequestDto {
    @NotBlank(message = "게시글 제목을 입력해주세요.")
    private String title;

    @NotBlank(message = "게시글 내용을 입력해주세요")
    private String content;

    @NotBlank(message = "게시글 작성자를 입력해주세요")
    private String writer;


    public Board toDto(BoardRequestDto boardReq){
        return new Board(boardReq.getTitle(),boardReq.getContent(),boardReq.getWriter());
    }

}
