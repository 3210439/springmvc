package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController를 사용하면 http body에 리턴 값을 넣는다.
 */
@Slf4j
@RestController
public class LogTestController {
    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // "trace log={}", name 과 같이 사용하는 이유는 메소드를 단순 호출하기 때문이다.
        // +를 사용하면 문자열을 합치게 연산이 발생하여 좋지 않다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
