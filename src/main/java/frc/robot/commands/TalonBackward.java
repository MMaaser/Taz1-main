package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.TalonSubsystem;

@SuppressWarnings("unused")

public class TalonBackward extends Command {

    TalonSubsystem talonSub;    

    public TalonBackward(TalonSubsystem talonSub) {
        this.talonSub = talonSub;
        addRequirements(talonSub);
        }

    @Override
    public void initialize() {
            // pretty obvious what this does
        talonSub.backwards();
    }

    @Override
    public boolean isFinished() {
        return true;
   }

} // end of class
