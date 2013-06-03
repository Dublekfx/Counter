package com.github.dublekfx.Counter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class Counter extends JavaPlugin {
	
	private BukkitTask task;
	private int playerLevel;
	
	@Override
	public void onEnable()	{
		
	}
	@Override
	public void onDisable()	{
		
	}
	
	public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args)	{
		
		
		return false;		
	}
	
	public void startCounter(Player p, int tStart)	{
		playerLevel = p.getLevel();
		p.setLevel(tStart);
		task = new CounterClock(this, p, playerLevel).runTaskTimer(this, 20, 20);
		
	}
	public void endCounter(Player p, int l)	{
		
	}

}
