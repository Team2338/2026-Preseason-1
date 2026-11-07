package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class AutosGroup extends ParallelDeadlineGroup {

    public AutosGroup()
    {
        super(new WaitCommand(4.0)); // max amount of time to run
        addCommands(
            new AutoForward(0.5, 50), //time is in milliseconds, every 50 is 1 seconds
                new WaitCommand(1).andThen(new AutoShoot(0.5, 50))
        );
    }

}
