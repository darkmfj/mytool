package com.darkmfj.mytools.extensions


/**
 * String to Bool
 * Y => bool True
 * N => bool False
 */
fun String.convertStringToBool(): Boolean {
    var result = false
    if (this != null && this == "Y") {
        result = true
    }

    return result
}


/**
 * Bool to String
 * True => "Y"
 * False => "N"
 */
fun Boolean.convertBoolToString(): String {
    var result = "N"
    if (this) {
        result = "Y"
    }
    return result
}
