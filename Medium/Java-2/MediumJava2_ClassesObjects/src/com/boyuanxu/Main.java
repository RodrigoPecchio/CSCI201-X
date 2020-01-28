package com.boyuanxu;

public class Main {

    public static void main(String[] args) {
        TV headcpTV = new TV();
        TV danielTV = new TV();
        headcpTV.year = 2020;
        headcpTV.make = "Sony";
        headcpTV.model = "XBR85Z9G";
        headcpTV.resolution = "8K";
        headcpTV.HDR = true;
        danielTV.year = 2010;
        danielTV.make = "Toshiba";
        danielTV.model = "UX600";
        danielTV.resolution = "1080P";
        danielTV.HDR = false;

        ToshibaTV ttv = new ToshibaTV();
        ((TV)ttv).HDR = true;
        ttv.HDR = "ssss";

        System.out.println(ttv.HDR);
        System.out.println(((TV)ttv).HDR);
    }
}
