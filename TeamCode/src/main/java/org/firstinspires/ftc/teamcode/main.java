package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
@TeleOp
public class main extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        Hardware.init(hardwareMap);
        waitForStart();
        while(opModeIsActive()&&!isStopRequested()) {
            Turbina.run(gamepad1);
        }

    }
}