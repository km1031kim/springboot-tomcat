package hello.boot;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan // 컴포넌트 스캔, 적용 패키지부터 하위까지 다 빈 등록
public @interface MySpringbootApplication {

}
