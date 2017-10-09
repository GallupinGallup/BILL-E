
package robot;

import edu.wpi.first.wilibj.IterativeRobot;
import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * Documentation. If toy change the name of this class of the package after
 * creating this project, you must also update the manifest file in the resource
 * 
 * @author student
 *
 */

public class Robot extends IterativeRobot {
	RobotDrive chassis = new RobotDrive(1, 2);
	Joystick left = new Joystick(1);
	Joystick right = new Joystick(2);

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any init code.
	 */
	public void robotInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void atonomousPeriodic() {

	}

	/**
	 * this function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		while (isOperatorControl() && isEnabled()) {
			chassis.tankDrive(left, right);
			if (control.getRawButton(10)) {

			}
		}
	}

	/**
	 * This function is called periodically during test mode
	 */

}
