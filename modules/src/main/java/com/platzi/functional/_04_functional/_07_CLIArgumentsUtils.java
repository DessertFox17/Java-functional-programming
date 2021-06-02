package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class _07_CLIArgumentsUtils {
    static void showHelp(_06_CLIArguments cliArguments){
        Consumer<_06_CLIArguments> consumerHelper = cliArguments1 -> {
            if(cliArguments1.isHelp()) System.out.println("User manual requested");
        };

        consumerHelper.accept(cliArguments);
    }

    static _06_CLIArguments generateCLI(){
        Supplier<_06_CLIArguments> generator = () -> new _06_CLIArguments();
        return generator.get();
    }
}
