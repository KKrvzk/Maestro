package doppleren;

import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.opengl.Display;

import doppleren.events.Event;
import doppleren.modules.MyModules;
import doppleren.modules.movement.Fly;
import doppleren.ui.HUD;

public class Maestro {

	public static String name="Snow", version = "1";
	public static CopyOnWriteArrayList<MyModules> modules = new CopyOnWriteArrayList<MyModules>();
	public static HUD hud = new HUD();
	
	public static void startup(){
		System.out.println("Starting " + name + " - v " + version);
		Display.setTitle(name + " v" + version);
		
		modules.add(new Fly());
		
	}
	
	public static void onEvent(Event e){
		for(MyModules m : modules) {
			if(!m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}
	
	public static void keyPress(int key){
		for(MyModules m : modules){
			if(m.getKey() == key){
				m.toggle();
			}
		}
	}
}
