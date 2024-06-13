package com.ohgiraffers.childprotectproject.test.model.dto;

public class LocationData {
    private int rn;
    private long lcSn;
    private String bsshNm;
    private String telno;
    private String adres;
    private String etcAdres;
    private String zip;
    private double lcinfoLa;
    private double lcinfoLo;
    private String cl;
    private String clNm;
    private String scopeCd;
    private String scope;
    private String hmpg;


    public LocationData() {
    }

    public LocationData(int rn, long lcSn, String bsshNm, String telno, String adres, String etcAdres, String zip, double lcinfoLa, double lcinfoLo, String cl, String clNm, String scopeCd, String scope, String hmpg) {
        this.rn = rn;
        this.lcSn = lcSn;
        this.bsshNm = bsshNm;
        this.telno = telno;
        this.adres = adres;
        this.etcAdres = etcAdres;
        this.zip = zip;
        this.lcinfoLa = lcinfoLa;
        this.lcinfoLo = lcinfoLo;
        this.cl = cl;
        this.clNm = clNm;
        this.scopeCd = scopeCd;
        this.scope = scope;
        this.hmpg = hmpg;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public long getLcSn() {
        return lcSn;
    }

    public void setLcSn(long lcSn) {
        this.lcSn = lcSn;
    }

    public String getBsshNm() {
        return bsshNm;
    }

    public void setBsshNm(String bsshNm) {
        this.bsshNm = bsshNm;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEtcAdres() {
        return etcAdres;
    }

    public void setEtcAdres(String etcAdres) {
        this.etcAdres = etcAdres;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLcinfoLa() {
        return lcinfoLa;
    }

    public void setLcinfoLa(double lcinfoLa) {
        this.lcinfoLa = lcinfoLa;
    }

    public double getLcinfoLo() {
        return lcinfoLo;
    }

    public void setLcinfoLo(double lcinfoLo) {
        this.lcinfoLo = lcinfoLo;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public String getClNm() {
        return clNm;
    }

    public void setClNm(String clNm) {
        this.clNm = clNm;
    }

    public String getScopeCd() {
        return scopeCd;
    }

    public void setScopeCd(String scopeCd) {
        this.scopeCd = scopeCd;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getHmpg() {
        return hmpg;
    }

    public void setHmpg(String hmpg) {
        this.hmpg = hmpg;
    }
}

