package com.qualcomm.ftcrobotcontroller.opmodes;

/*
 * An example linear op mode where the pushbot
 * will drive in a square pattern using sleep()
 * and a for loop.
 */
public class WallEAutoMtnRight extends WallEAutoMtnLeft {


    @Override
    double redblue() {
        return -1.0;
    }

}