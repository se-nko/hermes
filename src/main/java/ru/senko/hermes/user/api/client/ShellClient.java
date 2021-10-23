package ru.senko.hermes.user.api.client;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ShellClient {

    @ShellMethod("Example of shell command")
    public String example() {
        return "Example of shell command";
    }

}
