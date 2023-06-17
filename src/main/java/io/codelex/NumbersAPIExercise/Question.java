package io.codelex.NumbersAPIExercise;

import java.util.Objects;

public class Question {

    private Request request;
    private String lineGotFromAPI;

    public Question() {
        this.request = new Request();
        this.lineGotFromAPI = request.createARequest();
    }

    public String getLineGotFromAPI() {
        return lineGotFromAPI;
    }

    public Request getRequest() {
        return request;
    }

    public String generateQuestion() {
        String regex = "\\b(\\w+)\\sis\\b";
        String question = lineGotFromAPI.replaceFirst(regex, "What is");
        question = question.replaceFirst("\\.", "?");
        return question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question question)) return false;
        return Objects.equals(request, question.request) && Objects.equals(lineGotFromAPI, question.lineGotFromAPI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, lineGotFromAPI);
    }

    @Override
    public String toString() {
        return generateQuestion();
    }
}
