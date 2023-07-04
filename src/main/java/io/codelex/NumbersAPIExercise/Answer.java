package io.codelex.NumbersAPIExercise;

import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Answer {

    String answer;
    boolean answerIsTrue;
    Question question;

    public Answer(Question question) {
        this.answer = null;
        this.answerIsTrue = false;
        this.question = question;
    }

    public String getAnswer() {
        String pattern = "(\\d+) is";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(question.getLineGotFromAPI());
        String answerFromQuestion;
        if (matcher.find()) {
            answerFromQuestion = matcher.group(1);
        } else answerFromQuestion = "Sorry I Have no answer...";
        return answerFromQuestion;
    }

    public String getVariationForAnswer() {
        int answerAsANUmber = Integer.parseInt(getAnswer());
        int range = answerAsANUmber / 2;
        int min = answerAsANUmber - range;
        int max = answerAsANUmber + range;
        Random random = new Random();
        int result = random.nextInt(max - min + 1) + min;
        if (result == answerAsANUmber) {
            result += min;
        }
        return String.valueOf(result);
    }


    public boolean isAnswerTrue(String suggestion) {
        if (suggestion.equals(getAnswer())) {
            answerIsTrue = true;
        }
        return answerIsTrue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answer answer1)) return false;
        return answerIsTrue == answer1.answerIsTrue && Objects.equals(answer, answer1.answer) && Objects.equals(question, answer1.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, answerIsTrue, question);
    }

    @Override
    public String toString() {
        return "Answer for question : " + question + " is " + getAnswer();
    }
}
