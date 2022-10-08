package com.ambersyndrome.qeetility.exsample

import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.math.BlockPos
import net.minecraft.util.text.ITextComponent
import net.minecraft.util.text.TextComponentString
import net.minecraftforge.common.MinecraftForge
//import net.minecraftforge.event.entity.player.PlayerEvent
import net.minecraftforge.fml.common.gameevent.PlayerEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent


class LoginMessage(){
  @SubscribeEvent
  def onPlayerLoggedIn(event: PlayerEvent.PlayerLoggedInEvent): Unit = {
    val player = event.player
    val pos = player.getPosition
//    val classpath = Thread.currentThread.getContextClassLoader.getResource("").getPath
//    System.out.println("classpath : " + classpath)
    val message = s"""
                     |Hello, World
                     |name = [${player.getName}]
                     |pos  = [${pos.getX}. ${pos.getY}, pos.getZ]
    """.stripMargin
    player.sendMessage(new TextComponentString(message))
//    , player.getUniqueID)
  }
}