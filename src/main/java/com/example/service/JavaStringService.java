package com.example.service;

import org.springframework.stereotype.Service;

/**
 * Created by jinyong on 11/4/15.
 * email: jinyong1112@126.com
 */
@Service
public class JavaStringService {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().forEach(c -> sb.append((char)c));
        return sb.reverse().toString();
    }
}
