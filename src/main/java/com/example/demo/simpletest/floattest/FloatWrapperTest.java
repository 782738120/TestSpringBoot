package com.example.demo.simpletest.floattest;/** * ProjectName * <BR><B>FileDescription：</B><BR><BR> * DescriptionDetail * * @author ：ZhangHanYuan zhang.hanyuan@qq.com * @date : 2019-06-17 12:48 * @since 1.8 */public class FloatWrapperTest {    public static void main(String[] args) {        Float a = Float.valueOf(1.0f - 0.9f);        Float b = Float.valueOf(0.9f - 0.8f);        if (a.equals(b)) {            System.out.println("true");        } else {            System.out.println("false");        }    }}