package com.basic_study;

public interface TableTennis extends Sports{
    public void serve(String type);//发球了是 球
    public void receive(String quality);//接球了是 球
}
//子接口会自动继承父类接口里的所有方法，所以只需要写出新的方法就行