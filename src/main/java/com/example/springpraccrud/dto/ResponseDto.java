package com.example.springpraccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor(staticName = "set")
public class ResponseDto<D> {
    private boolean success;
    private D data;

    public static <D> ResponseDto setSuccess (D data) {
        return ResponseDto.set(true, data);
    }
}
