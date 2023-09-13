package com.android.gym_app

val listOfGyms = listOf<Gym>(
    Gym(
        1, "Sporting Gym",
        "20 Al Khasos Public Street, Al-Khasos, Qalyubia Governorate 32168496, Egypt"
    ),
    Gym(
        2, "Golden Gym",
        "32 Al Khasos Public Street, Al-Khasos, Qalyubia Governorate 66498798, Egypt"
    ),
    Gym(
        3, "Falcon Gym",
        "85 Al Khasos Public Street, Al-Khasos, Qalyubia Governorate 54544858, Egypt"
    ),
    Gym(
        4, "Active Gym",
        "100 Al Khasos Public Street, Al-Khasos, Qalyubia Governorate 7487478, Egypt"
    )

)

data class Gym(val id: Int, val name: String, val place: String, var isFavourite: Boolean = false)
