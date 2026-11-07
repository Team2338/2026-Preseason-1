package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Robot;

<<<<<<<< HEAD:src/main/java/team/gif/robot/commands/ArcadeDriveTrain.java
public class ArcadeDriveTrain extends Command {
    public ArcadeDriveTrain() {
        super();
        addRequirements(Robot.arcade); // uncomment
========
public class IndexerIndex extends Command {
    public double out;
    public IndexerIndex(double out) {
        super();
        addRequirements(Robot.indexer); // uncomment
        this.out = out;
>>>>>>>> eh-shooter:src/main/java/team/gif/robot/commands/IndexerIndex.java
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
<<<<<<<< HEAD:src/main/java/team/gif/robot/commands/ArcadeDriveTrain.java
        double speed = Robot.oi.driver.getLeftY();
        double rotation = Robot.oi.driver.getRightX();
        Robot.arcade.arcadeDrive(speed, rotation);

========
        Robot.indexer.setPercent(out);
>>>>>>>> eh-shooter:src/main/java/team/gif/robot/commands/IndexerIndex.java
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
<<<<<<<< HEAD:src/main/java/team/gif/robot/commands/ArcadeDriveTrain.java
    public void end(boolean interrupted) {}
========
    public void end(boolean interrupted) {
        Robot.indexer.stop();
    }
>>>>>>>> eh-shooter:src/main/java/team/gif/robot/commands/IndexerIndex.java
}
