package dev.charlesbadger.adventofcode2022.exception

class FileNotFoundException(fileName: String) : RuntimeException("file: $fileName not found")