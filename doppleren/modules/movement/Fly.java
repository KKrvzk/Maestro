package doppleren.modules.movement;

import org.lwjgl.input.Keyboard;

import doppleren.events.Event;
import doppleren.events.listeners.EventUpdate;
import doppleren.modules.MyModules;

public class Fly extends MyModules {
	
	public Fly() {
		super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
	}
	
	public void onEnable(){ 
		mc.thePlayer.capabilities.isFlying = true;
		mc.thePlayer.capabilities.allowFlying = true;

	}
	
	public void onDisable(){
		mc.thePlayer.capabilities.isFlying = false;
		mc.thePlayer.capabilities.allowFlying = false;
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				
			}
			 
		}
	}

}
