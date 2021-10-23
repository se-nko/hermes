package ru.senko.hermes.model.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import ru.senko.hermes.model.algoritm.Algoritm;

import java.util.concurrent.Callable;

@Data
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Strategy implements Callable {

    CryptoPair pair;
    Shedule shedule;
    Algoritm algoritm;

    public Strategy(CryptoPair pair, Algoritm algoritm) {
        this.pair = pair;
        this.algoritm = algoritm;
    }

    @Override
    public Object call() throws Exception {
        while (true) {
            try {
                algoritm.start();
            } catch (InterruptedException ex) {
                log.info("I was interrupted!");
                algoritm.stop();
                break;
            }
        }
        return null;
    }

}
