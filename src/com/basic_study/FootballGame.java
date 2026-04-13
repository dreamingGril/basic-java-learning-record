package com.basic_study;

public class FootballGame implements Football {
    private String homeTeam;
    private String visitingTeam;
    @Override
    public void setHomeTeam(String team) {
        this.homeTeam = team;
        System.out.println("Home team is " + team);
    }
    @Override
    public void setVisitingTeam(String team) {
        this.visitingTeam = team;
        System.out.println("Visiting team is " + team);
    }
    @Override
    public void visitingTeamScored(int points) {
        System.out.println("⚽ 进球！" + visitingTeam + " 获得 " + points + " 分。");
    }
    @Override
    public void homeTeamScored(int points) {
        System.out.println("⚽ 进球！" + homeTeam + " 获得 " + points + " 分。");
    }
}
