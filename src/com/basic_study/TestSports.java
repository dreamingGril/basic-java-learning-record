package com.basic_study;

public class TestSports {
    public static void main(String[] args) {
        //足球
        System.out.println("足球============");
        Football football = new FootballGame();
        football.setVisitingTeam("泾川文汇");
        football.setHomeTeam("北京国安");
        football.homeTeamScored(2);
        football.visitingTeamScored(3);
        //乒乓球
        System.out.println("乒乓球============");
        TableTennis tableTennis = new TableTennisGame();
        tableTennis.setHomeTeam("马龙");
        tableTennis.setVisitingTeam("莫雷加德");
        tableTennis.serve("下旋球");
        tableTennis.receive("正手拉球");
    }
}
