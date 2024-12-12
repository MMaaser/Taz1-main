package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.TalonSubsystem;

@SuppressWarnings("unused")

<<<<<<< HEAD
public class TalonBackward extends Command {
=======
public class TalonStop extends Command {
>>>>>>> aa1fed536c07bd45a873dcef99259197a03b6691

    
    TalonSubsystem talonSub;

    private double armPosition;
    
<<<<<<< HEAD
    public TalonBackward(TalonSubsystem talonSub) {
=======
    public TalonStop(TalonSubsystem talonSub) {
>>>>>>> aa1fed536c07bd45a873dcef99259197a03b6691
        this.talonSub = talonSub;
        addRequirements(talonSub);
        }

    @Override
    public void initialize() {
            // Adjust the arm position here
<<<<<<< HEAD
        talonSub.backwards();
=======
        talonSub.stop();
>>>>>>> aa1fed536c07bd45a873dcef99259197a03b6691
    }
//filler comment 
    @Override
    public boolean isFinished() {
        return true;
   }

} // end of class