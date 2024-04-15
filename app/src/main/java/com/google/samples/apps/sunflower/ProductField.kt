package com.google.samples.apps.sunflower

import org.json.JSONObject

class ProductField {

    var product_code: String? = null
    var product_name: String? = null
    var description: String? = null
    var guaranty_code = JSONObject()
   // val guaranty_code = arrayOf<String>()
    /*var auto_id: String? = null
    var guaranty_name: String? = null
    var guaranty_type: String? = null
    var guaranty_calc: String? = null
    var guaranty_limit: String? = null
    var guaranty_option: String? = null
    var description1: String? = null
    var description2: String? = null
    var description3: String? = null
    var description4: String? = null
    var guaranty_calc_field_string_value: String? = null

    fun guarantyCalcStringValueExtractor (guaranty_calc: String) : String? {

        val lastString = "0.01*{C1700004}"
        val lastStringPosition: Int = guaranty_calc.indexOf("}")
        var firstStringPosition: Int = guaranty_calc.indexOf("{")
        firstStringPosition += 1
        val subSequence = lastString.subSequence(firstStringPosition, lastStringPosition )

        return subSequence.toString()

    }*/

}

/*operator fun CharSequence.contains(
    other: CharSequence,
    ignoreCase: Boolean = false
): Boolean*/

/*fun CharSequence.lastIndexOf(
    char: Char,
    startIndex: Int = lastIndex,
    ignoreCase: Boolean = false
): Int*/
/*fun CharSequence.indexOf(
    chars: CharArray,
    startIndex: Int = 0,
    ignoreCase: Boolean = false
): Int*/