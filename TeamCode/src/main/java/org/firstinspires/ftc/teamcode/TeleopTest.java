package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "TeleopTest")
public class TeleopTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

       while (opModeIsActive())
       {
           teleopMovement();
       }

    }

    public void teleopMovement()
    {
        
    }
}
