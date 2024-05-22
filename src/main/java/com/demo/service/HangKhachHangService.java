package com.demo.service;

import com.demo.entity.HangKhachHang;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HangKhachHangService {
    public List<HangKhachHang> findAll(){
        return Arrays.asList(
          new HangKhachHang("GOLD","Vang"),
          new HangKhachHang("SILVER","Bac"),
          new HangKhachHang("BRONZE","Dong")
        );
    }
}
