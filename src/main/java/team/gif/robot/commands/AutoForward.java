package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

public class AutoForward extends Command {
    private double counter;
    double output;
    int time;

    public AutoForward(double output, int time) {
        super();
        addRequirements(Robot.arcade); // uncomment
        this.output = output;
        this.time = time;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        counter = 0;
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        counter++;
        Robot.arcade.arcadeDrive(output, 0);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return counter == time;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.arcade.arcadeDrive(0, 0);

    }
}
