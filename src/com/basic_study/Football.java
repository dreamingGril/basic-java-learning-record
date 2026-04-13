package com.basic_study;

public interface Football extends Sports {
//在 Java 中，子接口会自动继承父接口的所有方法。
//这意味着，你只需要在子接口中定义新增的方法即可，不需要把父接口的方法再写一遍。
    public void homeTeamScored(int points);
    public void visitingTeamScored(int points);
}
