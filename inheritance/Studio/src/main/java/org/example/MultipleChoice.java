package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question{
    private String answer;

    public MultipleChoice(String question, ArrayList<String> options, String answer){
        super(question, options);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
