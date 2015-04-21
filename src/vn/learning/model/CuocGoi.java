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
public class CuocGoi {
    private Integer id;
    private String thueBaoDuocGoi;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThueBaoDuocGoi() {
        return thueBaoDuocGoi;
    }

    public void setThueBaoDuocGoi(String thueBaoDuocGoi) {
        this.thueBaoDuocGoi = thueBaoDuocGoi;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }
    
    
}
