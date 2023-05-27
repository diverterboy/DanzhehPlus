package com.utotech.danzhehplus.util

import com.utotech.danzhehplus.model.Unit
import com.utotech.danzhehplus.R

class ModelData {

    public fun getUnits(): MutableList<Unit> {

        val list1: MutableList<String> = mutableListOf()
        val listWord1: MutableList<String> = mutableListOf()
        val listSound1: MutableList<String> = mutableListOf()
        val listSoundOffline1: MutableList<Int> = mutableListOf()
        list1.add("https://s26.picofile.com/file/8457729342/01_01.png")
        list1.add("https://s26.picofile.com/file/8457729350/01_02.png")
        list1.add("https://s27.picofile.com/file/8457729368/01_03.png")
        list1.add("https://s27.picofile.com/file/8457729376/01_04.png")
        list1.add("https://s26.picofile.com/file/8457729392/01_05.png")
        list1.add("https://s27.picofile.com/file/8457729426/01_06.png")
        list1.add("https://s26.picofile.com/file/8457729442/01_07.png")
        list1.add("https://s26.picofile.com/file/8457729468/01_08.png")
        list1.add("https://s27.picofile.com/file/8457729492/01_09.png")

        listWord1.add("Pen")
        listWord1.add("Rubber")
        listWord1.add("Pencil")
        listWord1.add("Book")
        listWord1.add("Notebook")
        listWord1.add("Bag")
        listWord1.add("Desk")
        listWord1.add("Ruler")
        listWord1.add("Pencil case")

        listSound1.add("https://s26.picofile.com/d/8457802450/05ca36f0-35f4-4614-b453-75cb6f9d0f00/01_01.mp3")
        listSound1.add("https://s27.picofile.com/d/8457802492/c2328d12-a600-4f60-bb2e-d8556d5b6378/01_02.mp3")
        listSound1.add("https://s27.picofile.com/d/8457802500/00c80ad1-fc20-41d9-b4e2-8d5abaacb892/01_03.mp3")
        listSound1.add("https://s26.picofile.com/d/8457802534/28134642-52bc-4c1d-a6a0-46f017a8beba/01_04.mp3")
        listSound1.add("https://s26.picofile.com/d/8457802550/f97f85fa-625d-4e31-98a7-2d7e996542c0/01_05.mp3")
        listSound1.add("https://s27.picofile.com/d/8457802576/6c38da78-7eeb-4b56-9958-6c4cd682ade0/01_06.mp3")
        listSound1.add("https://s26.picofile.com/d/8457802592/e581cb9e-a833-4ad6-968d-7163e56f7d22/01_07.mp3")
        listSound1.add("https://s26.picofile.com/d/8457802618/f0960a1a-d254-4c77-941a-984acce5979f/01_08.mp3")
        listSound1.add("https://s27.picofile.com/d/8457802626/d6cc3ae6-1b52-4303-80e8-767baf82638a/01_09.mp3")

        listSoundOffline1.add(R.raw.one)
        listSoundOffline1.add(R.raw.two)
        listSoundOffline1.add(R.raw.three)
        listSoundOffline1.add(R.raw.four)
        listSoundOffline1.add(R.raw.five)
        listSoundOffline1.add(R.raw.six)
        listSoundOffline1.add(R.raw.seven)
        listSoundOffline1.add(R.raw.eight)
        listSoundOffline1.add(R.raw.nine)

        val unit1: Unit = Unit("At School", "1", list1, listWord1, listSound1, listSoundOffline1)

        val list2: MutableList<String> = mutableListOf()
        val listWord2: MutableList<String> = mutableListOf()
        val listSound2: MutableList<String> = mutableListOf()

        listWord2.add("Kite")
        listWord2.add("Doll")
        listWord2.add("Monster")
        listWord2.add("Plane")
        listWord2.add("Funny")
        listWord2.add("Train")
        listWord2.add("Car")
        listWord2.add("Ball")
        listWord2.add("Bicycle")
        listWord2.add("Go car")
        val unit2: Unit = Unit("Let`s Play", "2", list2, listWord2, listSound2, listSoundOffline1)


        val list3: MutableList<String> = mutableListOf()
        val listWord3: MutableList<String> = mutableListOf()
        val listSound3: MutableList<String> = mutableListOf()

        list3.add("https://s26.picofile.com/file/8457740318/03_01.png")
        list3.add("https://s27.picofile.com/file/8457740326/03_02.png")
        list3.add("https://s26.picofile.com/file/8457740334/03_03.png")
        list3.add("https://s26.picofile.com/file/8457740342/03_04.png")
        list3.add("https://s26.picofile.com/file/8457740350/03_05.png")
        list3.add("https://s27.picofile.com/file/8457740368/03_06.png")
        list3.add("https://s27.picofile.com/file/8457740376/03_07.png")
        list3.add("https://s27.picofile.com/file/8457740384/03_08.png")

        listWord3.add("Elephant")
        listWord3.add("Mouse")
        listWord3.add("Lizard")
        listWord3.add("Frog")
        listWord3.add("Spider")
        listWord3.add("Duck")
        listWord3.add("Dog")
        listWord3.add("Cat")

        val unit3: Unit = Unit("Pet show", "3", list3, listWord3, listSound1, listSoundOffline1)


        val lists: MutableList<Unit> = mutableListOf()
        lists.add(unit1)
        lists.add(unit2)
        lists.add(unit3)
        return lists
    }



}