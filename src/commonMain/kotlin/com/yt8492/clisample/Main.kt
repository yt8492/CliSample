package com.yt8492.clisample

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.cli.required

fun main(args: Array<String>) {
    val parser = ArgParser("cli_sample")
    val argument by parser.argument(type = ArgType.String, description = "argument description")
    val option1 by parser.option(type = ArgType.Int, shortName = "op1", description = "option 1")
    val option2 by parser.option(type = ArgType.Boolean, shortName = "op2", description = "option 2").default(false)
    val option3 by parser.option(type = ArgType.Choice(listOf("foo", "bar", "baz")),  shortName = "op3", description = "option 3").required()
    parser.parse(args)
    println("argument: $argument")
    println("option1: $option1")
    println("option2: $option2")
    println("option3: $option3")
}