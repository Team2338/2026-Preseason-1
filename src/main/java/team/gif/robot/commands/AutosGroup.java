package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import team.gif.robot.Constants;

public class AutosGroup extends ParallelDeadlineGroup {

    public AutosGroup()
    {
        super(new WaitCommand(Constants.RUN_TIME_SECONDS)); // max amount of time to run
        addCommands(
            new AutoForward(Constants.DRIVETRAIN_FORWARD_POWER, Constants.DRIVETRAIN_ONE_SECOND), //time is in milliseconds, every 50 is 1 seconds
                new WaitCommand(1).andThen(new AutoShoot(Constants.DRIVETRAIN_FORWARD_POWER, Constants.DRIVETRAIN_ONE_SECOND))
        );
    }

}
