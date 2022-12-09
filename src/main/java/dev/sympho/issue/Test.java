package dev.sympho.issue;

import java.net.URL;

import dev.sympho.modular_commands.api.command.parameter.parse.InvalidArgumentException;
import dev.sympho.modular_commands.utils.parse.FunctorUrlParser;
import reactor.core.publisher.Mono;

public class Test extends FunctorUrlParser.Choice<String> {

    public Test() {

        super( null );
        
    }

}
