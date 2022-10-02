package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

public class Turbina {
    public static void run(Gamepad gamepad) {
        if (gamepad.a) {
            Hardware.servo1.setPower(0.60);
            Hardware.servo2.setPower(1);
            Hardware.servo3.setPower(1);
        } else {
            Hardware.servo1.setPower(0);
            Hardware.servo2.setPower(0);
            Hardware.servo3.setPower(0);
        }
        if (gamepad.y) {
            Hardware.servo1.setPower(-0.60);
            Hardware.servo2.setPower(-1);
            Hardware.servo3.setPower(-1);
        } else {
            Hardware.servo1.setPower(0);
            Hardware.servo2.setPower(0);
            Hardware.servo3.setPower(0);


        }
    }
}