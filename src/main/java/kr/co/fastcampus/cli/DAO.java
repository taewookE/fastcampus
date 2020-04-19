package kr.co.fastcampus.cli;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class DAO {
    public void run(){
        log.info("test !!");

        ApplicationContext context = new ClassPathXmlApplicationContext("");

    }
}
