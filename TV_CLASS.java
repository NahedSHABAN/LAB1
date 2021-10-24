/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author BOODY
 */
public class TV_CLASS {
    
    int channel = 1; 
  int vol_Level = 1; 
  boolean ON = false; 
  
  public TV_CLASS() 
  {
  }
  
  public void turn_On() 
  {
    ON = true;
  }
  
  public void turn_Off() 
  {
    ON = false;
  }
  
  public void SET_Channel(int newChannel) {
    if (ON && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  }
  
  public void SET_Volume(int newVolumeLevel) {
    if (ON && newVolumeLevel >= 1 && newVolumeLevel <= 7)
      vol_Level = newVolumeLevel;
  }
  public void Channel_Up() {
    if (ON && channel < 120)
      channel++;
  }
  
  public void Channel_Down() {
    if (ON && channel > 1)
      channel--;
  }
  
  public void vol_Up() {
    if (ON && vol_Level < 7)
      vol_Level++;
  }
  
  public void vol_Down() {
    if (ON && vol_Level > 1)
      vol_Level--;
  }
  
}
