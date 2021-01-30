/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class shootercommand extends CommandBase {
  /**
   * Creates a new shootercommand.
   */

private  final  double m_speed;
private final   Shooter  m_shooter;
public shootercommand(    Shooter shooter       ,double speed     ){


m_shooter=shooter;
m_speed=speed;
addRequirements(m_shooter);








}



  public shootercommand() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }
  m_shooter.runshotter(m_speed);//tuşa bastığımda çalışsın :)
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    m_shooter.runshooter(0);//bittiğinde gücü kesmek
    // Returns true when the command should end.
   
  }
 
  @Override
  public boolean isFinished() {
    return false;
  }
}
