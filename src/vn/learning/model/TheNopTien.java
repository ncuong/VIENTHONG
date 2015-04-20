/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vn.learning.model;

import java.sql.Date;






/**
 *
 * @author Admin
 */
public class TheNopTien {
    
    private Integer id;
    private String soSeri;
    private Integer menhGia;
    private Date thoiGianNop;
    private Boolean trangThai;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoSeri() {
        return soSeri;
    }

    public void setSoSeri(String soSeri) {
        this.soSeri = soSeri;
    }

    public Integer getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(Integer menhGia) {
        this.menhGia = menhGia;
    }

    public Date getThoiGianNop() {
        return thoiGianNop;
    }

    public void setThoiGianNop(Date thoiGianNop) {
        this.thoiGianNop = thoiGianNop;
    }

    public Boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
