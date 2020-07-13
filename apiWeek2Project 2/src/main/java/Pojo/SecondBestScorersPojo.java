package Pojo;

import java.util.List;
import java.util.Map;

public class SecondBestScorersPojo {

    private int count;
    private Object filters;
    private Competition competition;
    private Season season;
    private List<Scorers> scorers;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getFilters() {
        return filters;
    }

    public void setFilters(Object filters) {
        this.filters = filters;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public List<Scorers> getScorers() {
        return scorers;
    }

    public void setScorers(List<Scorers> scorers) {
        this.scorers = scorers;
    }
}

