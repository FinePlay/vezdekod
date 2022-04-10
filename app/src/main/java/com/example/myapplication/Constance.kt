package com.example.myapplication

object Constance {
    var adresses : Array<String> = arrayOf(
        "лупеново, 58",
        "Лесопарковая 5",
        "Сони кривой 10",
        "Косарево 63",
        "Доваторо 42",
        "Бейвеля 6")

    val shops : Array<String> = arrayOf(
        "заЕДУ",
        "ШашлыкоFF",
        "Слон",
        "Брусника",
        "Чайхан",
        "Вилка-Ложка"
    )

    var LastArrOrdersDec = mutableListOf<String>()
    var LastArrOrdersAcc = mutableListOf<String>()

    var LastArrAdress = mutableListOf<String>()

    var lastAddress : String? = null
    var lastOrder : String? = null
}