package com.basic_study;

public class TableTennisGame implements TableTennis{
private String homeTeam;
private String visitingTeam;
@Override
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
        System.out.println("【乒乓球】主队选手: " + homeTeam);
        }
        @Override
    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
        System.out.println("【乒乓球】客队选手: " + visitingTeam);
}
   public void serve(String type) {
        System.out.println("🏓 " + homeTeam + " 发球了，是一个 " + type + "！");
}
   public void receive(String quality){
        System.out.println("🏓 " + visitingTeam + " 接球，回了一个 " + quality + "！");
   }
}
