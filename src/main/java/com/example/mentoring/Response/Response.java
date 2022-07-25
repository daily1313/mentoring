package com.example.mentoring.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.net.httpserver.Authenticator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)// Null 버림
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter

public class Response {
    private boolean success;
    private int code;
    private Result result;
//    데이터 없이 성공 반환
    public static Response success(){
        return new Response(true,0,null);
    }
//    데이터 포함해서 성공 반환
    public static <T> Response success(T data){
        return new Response(true,0,new Success<>(data));
    }
//    에러 발생시 반환해주는 경우
    public static Response failure(int code, String msg){
        return new Response(false, code, new Failure(msg));
    }

}
