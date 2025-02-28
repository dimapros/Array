package org.example.Groovy

static def countElements(List array) {
    if (array == null) {
        throw new IllegalArgumentException("Array cannot be null")
    }

    def elementCountMap = [:]

    array.each { element ->
        elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
    }

    return elementCountMap
}

def array = [-1, 0, 7, 7, 3, 1, 3, 4, 5, 1, 5, 4]
println(countElements(array))