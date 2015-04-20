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
public class CuocGoi {
    private Integer id;
    private String thueBaoDuocGoi;
    private Timestamp thoiGianBatDau;
    private Timestamp thoiGianKetThuc;

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

    public Timestamp getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Timestamp getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }
    
    
}
