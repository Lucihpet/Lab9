public class QuizScore implements Cloneable{
    private int score;

    public QuizScore (QuizScore other) {
        this.score = other.getScore();
    }

    public QuizScore (int s) {
        this.score = s;
    }

    public void setScore(int s) {
        this.score = s;
    }

    public int getScore() {
        return this.score;
    }

    public QuizScore clone () {
        return new QuizScore(this.score);
    }
}
