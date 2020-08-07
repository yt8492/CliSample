package com.yt8492.clisample

import kotlinx.cli.*

@OptIn(ExperimentalCli::class)
fun main(args: Array<String>) {
    val parser = ArgParser("cli_sample")
    val sub1 = Sub1()
    val sub2 = Sub2()
    parser.subcommands(sub1, sub2)
    parser.parse(args)
}
