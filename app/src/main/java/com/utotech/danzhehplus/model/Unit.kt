package com.utotech.danzhehplus.model

data class Unit(var unitName: String, var unitNum: String, var vocabFlashCardList: MutableList<String> ,
var wordList:MutableList<String> , var wordSound:MutableList<String>, var wordSoundOffline:MutableList<Int>)
