package com.digrazia.kafka_sample.business.model.domain;

import com.rapidBuilder.annotation.field.FieldBuilderProperty;

import java.util.Objects;

public class Game {
    private String gameId;
    private String firstTeamName;
    private String secondTeamName;
    private String gameDescription;
    private String gameType;
    private String gameStatus;
    private String gameDate;
    private String gameStartTime;
    private String gameEndTime;

    public Game(){

    }

    public String getGameId() {
        return gameId;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getFirstTeamName() {
        return firstTeamName;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }

    public String getSecondTeamName() {
        return secondTeamName;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setSecondTeamName(String secondTeamName) {
        this.secondTeamName = secondTeamName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameType() {
        return gameType;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameDate() {
        return gameDate;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    public String getGameStartTime() {
        return gameStartTime;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameStartTime(String gameStartTime) {
        this.gameStartTime = gameStartTime;
    }

    public String getGameEndTime() {
        return gameEndTime;
    }

    @FieldBuilderProperty(builder = true, randomize = true)
    public void setGameEndTime(String gameEndTime) {
        this.gameEndTime = gameEndTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(gameId, game.gameId) && Objects.equals(firstTeamName, game.firstTeamName) && Objects.equals(secondTeamName, game.secondTeamName) && Objects.equals(gameDescription, game.gameDescription) && Objects.equals(gameType, game.gameType) && Objects.equals(gameStatus, game.gameStatus) && Objects.equals(gameDate, game.gameDate) && Objects.equals(gameStartTime, game.gameStartTime) && Objects.equals(gameEndTime, game.gameEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, firstTeamName, secondTeamName, gameDescription, gameType, gameStatus, gameDate, gameStartTime, gameEndTime);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId='" + gameId + '\'' +
                ", firstTeamName='" + firstTeamName + '\'' +
                ", secondTeamName='" + secondTeamName + '\'' +
                ", gameDescription='" + gameDescription + '\'' +
                ", gameType='" + gameType + '\'' +
                ", gameStatus='" + gameStatus + '\'' +
                ", gameDate='" + gameDate + '\'' +
                ", gameStartTime='" + gameStartTime + '\'' +
                ", gameEndTime='" + gameEndTime + '\'' +
                '}';
    }
}
