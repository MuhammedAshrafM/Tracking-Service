package com.example.trackingservice

import android.location.Location
import kotlinx.coroutines.flow.Flow
import java.lang.Exception

interface LocationClient {

    fun getLocationUpdates(interval: Long): Flow<Location>

    class LocationException(message: String): Exception()
}