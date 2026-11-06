package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;

public class Collector extends SubsystemBase {

    private final TalonSRX cimMotor;

    public Collector(int canID) {
        cimMotor = new TalonSRX(canID);
    }

    public void setPercent(double percent) {
        cimMotor.set(ControlMode.PercentOutput, percent);
    }

    public void stop(){
        cimMotor.set(ControlMode.PercentOutput, 0.0);
    }

}
