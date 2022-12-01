package dev.charlesbadger.adventofcode2022.util

import dev.charlesbadger.adventofcode2022.exception.FileNotFoundException
import java.io.InputStream
import java.net.URL

fun getResource(fileName: String): URL = object {}.javaClass.getResource(fileName)
    ?: throw FileNotFoundException(fileName)

fun getResourcesStream(fileName: String): InputStream = object {}.javaClass.getResourceAsStream(fileName)
    ?: throw FileNotFoundException(fileName)
