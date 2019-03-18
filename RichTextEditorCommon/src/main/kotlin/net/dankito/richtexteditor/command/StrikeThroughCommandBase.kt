package net.dankito.richtexteditor.command

import net.dankito.utils.image.ImageReference
import net.dankito.richtexteditor.JavaScriptExecutorBase


abstract class StrikeThroughCommandBase(icon: ImageReference) : ActiveStateToolbarCommand(CommandName.STRIKETHROUGH, icon) {

    override fun executeCommand(executor: JavaScriptExecutorBase) {
        executor.setStrikeThrough()
    }

}