package ru.senko.hermes.model.base;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import ru.senko.hermes.model.algoritm.Algoritm;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Strategy implements Runnable {

    CryptoPair pair;
    Shedule shedule;
    Algoritm algoritm;

    @Override
    public void run() {

    }

}
