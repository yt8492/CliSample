package com.yt8492.clisample

import kotlinx.cli.ArgType
import kotlinx.cli.ExperimentalCli
import kotlinx.cli.Subcommand

@ExperimentalCli
class Sub2 : Subcommand("sub2", "sub command 2") {

    private val arg by argument(type = ArgType.String, description = "sub command 2 argument")
    private val option by option(type = ArgType.String, description = "sub command 2 option")

    override fun execute() {
        println("[sub2] arg: $arg")
        println("[sub2] option: $option")
    }
}