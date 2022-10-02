package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware {
    public static CRServo servo1;
    public static CRServo servo2;
    public static CRServo servo3;
    public static void init(HardwareMap hardwareMap){
        servo1=hardwareMap.get(CRServo.class,"servo1");
        servo2=hardwareMap.get(CRServo.class,"servo2");
        servo3=hardwareMap.get(CRServo.class,"servo3");

    }
}