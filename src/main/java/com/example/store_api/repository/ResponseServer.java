package com.example.store_api.repository;

import lombok.*;
import org.springframework.http.HttpStatusCode;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseServer {
    public boolean isSuccess;
    public HttpStatusCode statusCode;
    public List<String> errorMessages;
    public Object result;
}
