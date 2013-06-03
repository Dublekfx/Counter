package com.github.dublekfx.Counter;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class CounterClock extends BukkitRunnable	{

	private JavaPlugin plugin;
	private Player p;
	public BukkitTask task;
	private int pLevel;
	
	public CounterClock(JavaPlugin pl, Player play, int level)	{
		plugin = pl;
		p = play;
		pLevel = level;
	}
	
	@Override
	public void run() {
		if (p.getLevel() >= 1) {
			p.setLevel(p.getLevel() - 1);
		}
		else	{
			p.setLevel(pLevel);
			task.cancel();
		}
			
		
	}

}
