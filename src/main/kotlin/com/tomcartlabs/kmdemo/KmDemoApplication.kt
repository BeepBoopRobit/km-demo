package com.tomcartlabs.kmdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KmDemoApplication

fun main(args: Array<String>) {
	runApplication<KmDemoApplication>(*args)
}
