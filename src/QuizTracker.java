import java.util.ArrayList;

public class QuizTracker implements Cloneable{
    protected ArrayList<QuizScore> quizScoreList;

    public void add(QuizScore other) {
        quizScoreList.add(new QuizScore(other));
    }

    @Override
    public QuizTracker clone() {
        QuizTracker returnTracker = new QuizTracker();
        for (int i = 0; i < this.quizScoreList.size(); i++) {
            returnTracker.add(this.quizScoreList.get(i).clone());
        }
        return returnTracker;
    }
}
