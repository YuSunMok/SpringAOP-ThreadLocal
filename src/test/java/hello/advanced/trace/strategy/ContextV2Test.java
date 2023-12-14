package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.strategy.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV1() {
        ContextV2 contextV1 = new ContextV2();
        contextV1.excute(() -> log.info("비즈니스 로직1 실행"));

        ContextV2 contextV2 = new ContextV2();
        contextV2.excute(() -> log.info("비즈니스 로직2 실행"));
    }

    
}
