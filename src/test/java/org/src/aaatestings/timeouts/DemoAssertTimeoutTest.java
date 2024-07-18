package org.src.aaatestings.timeouts;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DemoAssertTimeoutTest {

    @Test
    void sortArrayTimeOut() {
        int[] unsorted = {4, 8, 6, 2};
        assertTimeout(Duration.ofMillis(20), () -> DemoAssertTimeout.sortArray(unsorted));
    }
}