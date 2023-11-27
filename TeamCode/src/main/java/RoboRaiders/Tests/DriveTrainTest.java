package RoboRaiders.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import RoboRaiders.Robots.DrivetrainBot;

@Autonomous
public class DriveTrainTest extends LinearOpMode {

    public DrivetrainBot robot = new DrivetrainBot();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.setDriveMotorPower(1.0, 1.0, 1.0, 1.0);

    }
}
