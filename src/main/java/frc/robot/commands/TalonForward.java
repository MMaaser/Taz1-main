package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.TalonSubsystem;

@SuppressWarnings("unused")

public class TalonForward extends Command {

    
    TalonSubsystem talonSub;

    private double armPosition;
    
    public TalonForward(TalonSubsystem talonSub) {
        this.talonSub = talonSub;
        addRequirements(talonSub);
        }
    
    @Override
    public void initialize() {
            // Adjust the arm position here
            talonSub.move();

    }

    @Override
    public boolean isFinished() {
        return true;
   }

} // end of class