package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

public class AutoShoot extends Command {
    private double counter;
    double output;
    int time;
    public AutoShoot(double output, int time) {
        super();
        addRequirements(Robot.driveTrain); // uncomment
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
        Robot.shooter.setPercent(output);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return counter == time;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.shooter.stop();
    }
}
