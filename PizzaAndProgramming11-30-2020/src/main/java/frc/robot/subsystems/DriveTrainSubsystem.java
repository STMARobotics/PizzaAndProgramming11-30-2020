package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSubsystem extends SubsystemBase {

    private final WPI_TalonSRX leftFront = new WPI_TalonSRX(0);
    private final WPI_TalonSRX leftBack = new WPI_TalonSRX(1);
    private final WPI_TalonSRX rightFront = new WPI_TalonSRX(2);
    private final WPI_TalonSRX rightBack = new WPI_TalonSRX(3);

    private final MecanumDrive driveTrain = new MecanumDrive(leftFront, leftBack, rightFront, rightBack);

    public void drive(double strafe, double speed, double rotation) {
        driveTrain.driveCartesian(strafe, speed, rotation);
    }

    public void driveForward(double speed) {
        this.drive(0, speed, 0);
    }

    public void driveSideways(double strafe) {
        this.drive(strafe, 0, 0);
    }

    public void rotate(double rotation) {
        this.drive(0, 0, rotation);
    }

}