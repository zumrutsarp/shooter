/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
 


  private  final WPI_VictorSPX shootmot=new WPI_VictorSPX(Constants.kshooterMotorPort);
  public Shooter() {







  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run


public void runshooter( double speed ){



shootmot.set(speed);


}
public void  dur(){

  shootmot.set(0);
}



}
