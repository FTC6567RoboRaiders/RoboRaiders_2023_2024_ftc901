package RoboRaiders.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import RoboRaiders.Robots.Pirsus;



@TeleOp(name = "Put The Lift Down Teleop",group="Teleop")

/**
 * Created by Steeeve Kocik for RoboRaiders Testing
 *
 * Change Id      Person          Date          Comments
 * SMK1           Steeeve Kocik   231130        Initial version
 */
public class PutTheLiftDownTeleop extends LinearOpMode {

    public Pirsus robot = new Pirsus();

    @Override
    public void runOpMode() {

        double leftStickY = gamepad2.left_stick_y;

        if (leftStickY > 0.0)      robot.liftUp();
        else if (leftStickY < 0.0) robot.liftDown();
        else                       robot.liftStop();
    }

}