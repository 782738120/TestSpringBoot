package com.example.demo.simpletest.floattest;import java.util.concurrent.locks.Lock;import java.util.concurrent.locks.ReentrantLock;/** * ProjectName * <BR><B>FileDescription：</B><BR><BR> * DescriptionDetail * * @author ：ZhangHanYuan zhang.hanyuan@qq.com * @date : 2019-06-17 12:50 * @since 1.8 */public class LockTest {    private final static Lock lock = new ReentrantLock();    public static void main(String[] args) {        try {            lock.tryLock();        } catch (Exception e) {            e.printStackTrace();        } finally {            lock.unlock();        }    }}