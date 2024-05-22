package com.demo.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {

    Integer id;

    @NotBlank(message = "hoten khong de trong")
    String hoten;

    @NotBlank(message = "Dien thoai khong de trong")
    String dienthoai;

    @Min(value = 0, message = "Diem phai lon hon 0")
    @NotNull(message = "Diem khong de trong")
    Integer diem;

    @NotBlank(message = "Ma Hang khong duoc de trong")
    String maHang;

    Boolean trangthai;
}
