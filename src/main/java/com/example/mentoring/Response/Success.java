package com.example.mentoring.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
//null값을 가지는 필드는 JSON응답에 포함되지 않음
@Getter
@AllArgsConstructor
public class Success<T> implements Result {
    private T data;
}
