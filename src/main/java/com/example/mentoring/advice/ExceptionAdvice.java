package com.example.mentoring.advice;

import com.example.mentoring.Response.Response;
import com.example.mentoring.exception.BoardNotFoundException;
import com.example.mentoring.exception.WriterNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // @RestController + @Advice
//ExceptionAdvice == Exception을 관리하기 위한 통제소 == 실패할 경우 실패 메세지를 보내기 위한 RestController
public class ExceptionAdvice {
    //404 NotFound Error

    @ExceptionHandler(BoardNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response boardNotFoundException(){
        return Response.failure(404,"게시글을 찾을 수 없습니다.");
    }

    // 404 NotFound
    @ExceptionHandler(WriterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response writerNotFoundException(){
        return Response.failure(404, "작성자를 입력해주세요.");
    }
}
