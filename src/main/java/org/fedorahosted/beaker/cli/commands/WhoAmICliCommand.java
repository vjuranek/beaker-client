package org.fedorahosted.beaker.cli.commands;

import org.fedorahosted.beaker.client.Command;
import org.fedorahosted.beaker.model.Identity;

@CliCommand(name="WhoAmI")
public class WhoAmICliCommand extends Command {
    
    public void execute() {
        String output = new Identity(beakerClient).whoAmI();
        System.out.println("Result: " + output);
    }
    
}