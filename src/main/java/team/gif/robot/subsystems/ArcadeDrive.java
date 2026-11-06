// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArcadeDrive extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    public WPI_TalonSRX leftTalon;
    public WPI_TalonSRX rightTalon;
    public DifferentialDrive differentialDrive;

    public ArcadeDrive() {
        leftTalon = new WPI_TalonSRX(1);
        rightTalon = new WPI_TalonSRX(2);
        differentialDrive = new DifferentialDrive(leftTalon, rightTalon);


        leftTalon.configFactoryDefault();
        rightTalon.configFactoryDefault();

        leftTalon.setNeutralMode(NeutralMode.Brake);
        rightTalon.setNeutralMode(NeutralMode.Brake);
    }

    public void arcadeDrive(double speed, double rotation) {
        differentialDrive.arcadeDrive(speed, rotation);
    }

}
