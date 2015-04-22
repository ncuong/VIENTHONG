/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.model;

import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class Sim {
    private Integer id;
    private String soThueBao;
    private Timestamp ngayDangKy;
    private Integer taiKhoanChinh;
    private Integer taiKhoanKhuyenMai;
    private Integer khachHangID;
    private Integer cuocGoiID;
    private Integer goiCuocID;

    public Integer getKhachHangID() {
        return khachHangID;
    }

    public void setKhachHangID(Integer khachHangID) {
        this.khachHangID = khachHangID;
    }

    public Integer getCuocGoiID() {
        return cuocGoiID;
    }

    public void setCuocGoiID(Integer cuocGoiID) {
        this.cuocGoiID = cuocGoiID;
    }

    public Integer getGoiCuocID() {
        return goiCuocID;
    }

    public void setGoiCuocID(Integer goiCuocID) {
        this.goiCuocID = goiCuocID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoThueBao() {
        return soThueBao;
    }

    public void setSoThueBao(String soThueBao) {
        this.soThueBao = soThueBao;
    }

    public Timestamp getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Timestamp ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public Integer getTaiKhoanChinh() {
        return taiKhoanChinh;
    }

    public void setTaiKhoanChinh(Integer taiKhoanChinh) {
        this.taiKhoanChinh = taiKhoanChinh;
    }

    public Integer getTaiKhoanKhuyenMai() {
        return taiKhoanKhuyenMai;
    }

    public void setTaiKhoanKhuyenMai(Integer taiKhoanKhuyenMai) {
        this.taiKhoanKhuyenMai = taiKhoanKhuyenMai;
    }
    
    
}
