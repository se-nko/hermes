package ru.senko.hermes.model.algoritm;

public interface Algorithm {

    String SCALPING = "scalping";
    String AVERAGING  = "averaging";

    void start() throws Exception;

    void stop();

}
