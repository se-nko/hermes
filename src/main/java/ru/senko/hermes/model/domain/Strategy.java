package ru.senko.hermes.model.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.model.algoritm.Algorithm;

import java.util.concurrent.Callable;

@Data
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Strategy implements Callable {

    CryptoPair pair;
    Shedule shedule;
    Algorithm algorithm;

    public Strategy(CryptoPair pair, Algorithm algorithm) {
        this.pair = pair;
        this.algorithm = algorithm;
    }

    @Override
    public Object call() throws Exception {
        while (true) {
            try {
                algorithm.start();
            } catch (InterruptedException ex) {
                log.info("I was interrupted!");
                algorithm.stop();
                break;
            }
        }
        return null;
    }

}
