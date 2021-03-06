package doppleren.modules;

import doppleren.events.Event;
import net.minecraft.client.Minecraft;

public class MyModules {

	public String name;
	public boolean toggled;
	public int keyCode;
	public Category category; 
	public Minecraft mc = Minecraft.getMinecraft();
	
	public MyModules(String name, int key, Category c) {
		this.name = name; 
		this.keyCode = key;
		this.category = c;
	}
	
	public boolean isEnabled(){
		return toggled;
	}
	
	public int getKey(){
		return keyCode;
	}
	
	public void onEvent(Event e){
		
	}
	
	public void toggle() {
		toggled = !toggled;
		if(toggled) {
			onEnable();
		}else {
			onDisable();
		}
	}
	
	public void onEnable(){ 
		
	}
	
	public void onDisable(){
		
	}
	
	public enum Category { 
		COMBAT, 
		MOVEMENT,
		PLAYER, 
		RENDER;
	}
	
}
