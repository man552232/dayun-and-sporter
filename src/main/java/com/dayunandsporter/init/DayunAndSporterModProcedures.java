
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.dayunandsporter.init;

import com.dayunandsporter.procedures.SporterdamageProcedure;
import com.dayunandsporter.procedures.KillplayerProcedure;
import com.dayunandsporter.procedures.BreakblocksProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class DayunAndSporterModProcedures {
	public static void load() {
		new SporterdamageProcedure();
		new BreakblocksProcedure();
		new KillplayerProcedure();
	}
}
