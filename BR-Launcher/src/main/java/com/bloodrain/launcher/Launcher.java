package com.bloodrain.launcher;

import com.bloodrain.display.configuration.Display;

/** A launcher class.
 *
 *  Controls the execution of the animation display.
 *
 * @author Shane Creedon
 * @author www.skybreak.cf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Launcher {
	public static void main(String[] args) {
		Display display = Display.createDisplay();
		display.showDisplay();
	}
}
