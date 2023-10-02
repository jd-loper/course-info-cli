package com.pluralsight.courseinfo.domain;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    void RejectNullComponents() {
        assertThrows(IllegalArgumentException.class, () ->
                new Course(null, null, 1, null, Optional.empty()));
    }

    @Test
    void RejectBlankNotes() {
        assertThrows(IllegalArgumentException.class, () ->
                new Course("1", "title", 1, "url", Optional.of("")));
    }
}