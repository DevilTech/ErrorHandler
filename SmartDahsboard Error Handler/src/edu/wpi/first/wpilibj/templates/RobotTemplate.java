package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotTemplate extends SimpleRobot 
{
        String err;
        Joystick stick;
        Timer time;
        double diff;
        
    public void robotInit()
    {
        stick = new Joystick(1);
        time = new Timer();
        System.out.println("My Code");
    }
    
    public void disabled()
    {
        System.out.println("Disabled");
    }
    
    public void autonomous() 
    {
    }

    public void operatorControl() 
    {
        System.out.println("Operator Control");
        clear();
        while(isEnabled())
        {
            if(stick.getRawButton(1))
            {
                clear();
                error("you have pushed the trigger");
                if(stick.getRawButton(1))
                {
                    clear();
                    error("STOP PUSHING THE TRIGGER!");
                }
            }

            if(stick.getRawButton(2))
            {
                clear();
                error("you have pushed button 2");
                if(stick.getRawButton(2))
                {
                    clear();
                    error("STOP PUSHING BUTTON 2");
                }
            }

            if(stick.getRawButton(3))
            {
                clear();
                error("you have pressed button 3");
                if(stick.getRawButton(3))
                {
                    clear();
                    error("STOP PUSHING BUTTON 3");
                }
            }

            if(stick.getRawButton(4))
            {
                clear();
                error("you have pressed button 4");
                if(stick.getRawButton(4))
                {
                    clear();
                    error("STOP PUSHING BUTTON 4");
                }
            }

            if(stick.getRawButton(5))
            {
                clear();
                error("you have pressed button 5");
                if(stick.getRawButton(5))
                {
                    clear();
                    error("STOP PUSHING BUTTON 5");
                }
            }

            if(stick.getRawButton(6))
            {
                clear();
                error("you have pressed button 6");
                if(stick.getRawButton(6))
                {
                    clear();
                    error("STOP PUSHING BUTTON 6");
                }
            }

            if(stick.getRawButton(7))
            {
                //nothing
                error("you have pressed button 7");
                if(stick.getRawButton(7))
                {
                    clear();
                    error("STOP PUSHING BUTTON 7");
                }
            }

            if(stick.getRawButton(8))
            {
                clear();
                error("you have pressed button 8");
                if(stick.getRawButton(8))
                {
                    clear();
                    error("STOP PUSHING BUTTON 8");
                }
                
            }

            if(stick.getRawButton(9))
            {
                clear();
                error("you have pressed button 9");
                if(stick.getRawButton(9))
                {
                    clear();
                    error("STOP PUSHING BUTTON 9");
                }
            }

            if(stick.getRawButton(10))
            {
                clear();
                error("you have pressed button 10");
                if(stick.getRawButton(10))
                {
                    clear();
                    error("STOP PUSHING BUTTON 10");
                }
            }

            if(stick.getRawButton(11))
            {
                clear();
                error("you have pressed button 11");
                if(stick.getRawButton(11))
                {
                    clear();
                    error("STOP PUSHING BUTTON 11");
                }
            }
        }
    }
    
    public void test() 
    {
    }
    
    public void error(String err)
    {
        time.reset();
        time.start();
       // diff = time.get();
        SmartDashboard.putString("Error!", err);
        refresh();
        
    }
    
    
    public void clear()
    {
        SmartDashboard.putString("Error!", " ");
    }
    
    public void refresh()
    {
        System.out.println("Got to refresh");
        System.out.println( time.get());
        while(time.get() < .40)        
        {
            System.out.println(time.get());
        }
        System.out.println("Done!");
        clear();
    }
}