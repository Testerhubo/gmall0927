package com.atguigu.gmall.service.Impl;

import com.atguigu.gmall.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public String getString(String str) {
        return str;
    }
}
