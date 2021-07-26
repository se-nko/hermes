package ru.senko.hermes.model.signal;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;

@Slf4j
public class SignalsObserver {

    //использовать барьер
    // когда делаем fire устанавливаем время актуальности текущего сигнала
    // если оно меньше нынешнего, ждем остальные сигналы, если время истекло, то сбрасываем барьер
    // если время не прошло и все сигналы прошли, то выполняем действие и сбрпсываем барьер
    private CyclicBarrier barrier;
    private Set<Signal> signals;

    public SignalsObserver() {
        signals = new HashSet<>();
        barrier = new CyclicBarrier(5);
    }

    public void addSignal(Signal signal) {
        signal.setListener(this);
        signals.add(signal);
    }

    public void removeSignal(Signal signal) {
        signal.setListener(null);
        signals.remove(signal);
    }

    public void trigger(Signal signal) {
      log.info(signal.toString() + " fired");
    }

//    public void onTrigger(Function<Object, Object> function) {
//        function.apply();
//    }

}
