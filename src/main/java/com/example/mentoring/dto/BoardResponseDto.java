package com.example.mentoring.dto;

import com.example.mentoring.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardResponseDto {
    private String titleDto;
    private String contentDto;
    private String writerDto;

    public static BoardResponseDto toDto(Board board){
        return new BoardResponseDto(
                board.getTitle(),
                board.getContent(),
                board.getWriter()
        );
    }
}
