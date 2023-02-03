package com.javarush.quest.likhter.models;

import com.javarush.quest.likhter.models.models.AnswerOptions;
import com.javarush.quest.likhter.models.models.Choose;
import com.javarush.quest.likhter.models.models.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AnswerOptionsTest {
    private AnswerOptions answerOptions;

    @BeforeEach
    void init() {
        answerOptions = new AnswerOptions();
    }

    @Test
    void whenCallGetAnswersForCurrentStep_ThenReturnList() {
        List<String> actual = answerOptions.getAnswersForCurrentStep(Step.FIRST);
        assertNotNull(actual);
    }

    @Test
    void whenCallGetAllAnswersFromMap_ThenReturnMap() {
        Map<Step, Map<Choose, String>> actual = answerOptions.getAllAnswersFromMap();
        assertNotNull(actual);
    }

    @AfterEach
    void destroy() {
        answerOptions = null;
    }
}