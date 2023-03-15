package be.kdg.projectbasis.model.highscore;

public class Highscore implements Comparable<Highscore>{
    private String spelernaam;
    private int score;

    public String getSpelernaam() {
        return spelernaam;
    }

    public void setSpelernaam(String spelernaam) {
        this.spelernaam = spelernaam;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Highscore(String spelernaam, int score) {
        this.spelernaam = spelernaam;
        this.score = score;
    }

    @Override
    public int compareTo(Highscore o) {
        return Integer.compare(o.getScore(), this.score);
    }
}
