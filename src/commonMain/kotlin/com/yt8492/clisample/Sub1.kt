package com.yt8492.clisample

import kotlinx.cli.ArgType
import kotlinx.cli.ExperimentalCli
import kotlinx.cli.Subcommand

@ExperimentalCli
class Sub1 : Subcommand("sub1", "sub command 1") {

    private val arg by argument(type = ArgType.String, description = "sub command 1 argument")
    private val option by option(type = ArgType.String, description = "sub command 1 option")

    override fun execute() {
        println("[sub1] arg: $arg")
        println("[sub1] option: $option")
    }
}