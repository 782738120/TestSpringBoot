package com.example.demo.simpletest.date;/** * ProjectName * <BR><B>FileDescription：</B><BR><BR> * DescriptionDetail * * @author ：ZhangHanYuan zhang.hanyuan@qq.com * @date : 2019-05-15 22:45 * @since 1.8 */public class TestTime {    public static void main(String[] args) {        long time1 = System.currentTimeMillis();        try {            Thread.sleep(3000);        } catch (InterruptedException e) {            e.printStackTrace();        }        long time2 = System.currentTimeMillis();        long TimeDifference = time2 - time1;        System.out.println(time2 - time1);        System.out.println("外呼人员点击'发送验证码'按钮到广发页面'点击发送按钮'时间差:"+((time2 - time1)/1000)+"秒");    }}