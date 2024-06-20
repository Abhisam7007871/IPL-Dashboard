package com.avproject.ipl_dashboard.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Match {

    @Id
    private long id;
    
    private String city;
    private LocalDate date;
   
    private String playerOfMatch;

    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;

    private String umpire1;
    private String umpire2;


    
    public void setVenue(String venue2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVenue'");
    }
    public void setPlayerOfMatch(String player_of_match) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPlayerOfMatch'");
    }
    public void setDate(LocalDate localDate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDate'");
    }
    public void setCity(String city2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCity'");
    }
    public void setId(long long1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
    public void setTeam1(String firstInningsTeam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTeam1'");
    }
    public void setTeam2(String secondInningsTeam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTeam2'");
    }
    public void setToss_winner(String toss_winner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setToss_winner'");
    }
    public void setToss_decision(String toss_decision) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setToss_decision'");
    }
    public void setResult_margin(String result_margin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResult_margin'");
    }
    public void setResult(String result2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResult'");
    }
    public void setUmpire2(String umpire22) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUmpire2'");
    }
    public void setUmpire1(String umpire12) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUmpire1'");
    }

    

}
